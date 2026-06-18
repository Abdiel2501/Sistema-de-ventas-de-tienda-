import os
import sys
import subprocess

# Intentar importar reportlab, si no está se instala
try:
    from reportlab.lib.pagesizes import letter
    from reportlab.platypus import SimpleDocTemplate, Table, TableStyle, Paragraph, Image, Spacer
    from reportlab.lib.styles import getSampleStyleSheet, ParagraphStyle
    from reportlab.lib import colors
except ImportError:
    print("La librería 'reportlab' no está instalada. Instalando reportlab...")
    subprocess.check_call([sys.executable, "-m", "pip", "install", "reportlab"])
    from reportlab.lib.pagesizes import letter
    from reportlab.platypus import SimpleDocTemplate, Table, TableStyle, Paragraph, Image, Spacer
    from reportlab.lib import colors

# Importar los productos desde barras.py
try:
    from barras import PRODUCTOS
except ImportError:
    # Si por alguna razón no se puede importar, definimos una lista vacía o la buscamos
    PRODUCTOS = []

def generar_pdf():
    # Directorio actual y carpetas
    directorio_script = os.path.dirname(os.path.abspath(__file__))
    carpeta_barras = os.path.join(directorio_script, "codigos_barra")
    ruta_pdf = os.path.join(directorio_script, "productos_codigos_barra.pdf")
    
    if not PRODUCTOS:
        print("No se encontraron productos en barras.py.")
        return
        
    print(f"Generando PDF con {len(PRODUCTOS)} códigos de barras...")
    
    # Configurar el documento (Carta con márgenes pequeños para maximizar espacio)
    # Ancho de carta: 612. Con márgenes de 30pt izquierda/derecha, el ancho disponible es 552pt.
    # Alto de carta: 792. Con márgenes de 36pt arriba/abajo, el alto disponible es 720pt.
    doc = SimpleDocTemplate(
        ruta_pdf,
        pagesize=letter,
        leftMargin=30,
        rightMargin=30,
        topMargin=36,
        bottomMargin=36
    )
    
    # Usamos 3 columnas. Cada columna medirá 180 puntos (180 * 3 = 540 puntos, menor a 552).
    # Cabrán 18 etiquetas por página (3 columnas x 6 filas), por lo que 50 etiquetas ocuparán 3 páginas.
    col_width = 180
    
    styles = getSampleStyleSheet()
    
    # Crear estilos personalizados para las etiquetas
    style_title = ParagraphStyle(
        'LabelTitle',
        parent=styles['Normal'],
        fontName='Helvetica-Bold',
        fontSize=8,
        leading=9,
        textColor=colors.HexColor('#1a1a1a'),
        alignment=1, # Centrado
        spaceAfter=1
    )
    
    style_info = ParagraphStyle(
        'LabelInfo',
        parent=styles['Normal'],
        fontName='Helvetica',
        fontSize=7,
        leading=8,
        textColor=colors.HexColor('#555555'),
        alignment=1, # Centrado
        spaceAfter=3
    )
    
    # Construir las celdas
    celdas = []
    for i, prod in enumerate(PRODUCTOS, start=1):
        nombre_imagen = f"barcode_{i:02d}.png"
        ruta_imagen = os.path.join(carpeta_barras, nombre_imagen)
        
        elementos_celda = []
        
        # 1. Nombre del producto (truncado si es muy largo)
        nombre_prod = prod['nombre']
        if len(nombre_prod) > 28:
            nombre_prod = nombre_prod[:25] + "..."
            
        elementos_celda.append(Paragraph(nombre_prod, style_title))
        
        # 2. Marca y precio
        info_texto = f"{prod['marca']}  |  ${prod['precio']:.2f}"
        elementos_celda.append(Paragraph(info_texto, style_info))
        
        # 3. Imagen del código de barras
        if os.path.exists(ruta_imagen):
            # Imagen del código de barras redimensionada para caber perfectamente
            img = Image(ruta_imagen, width=150, height=48)
            elementos_celda.append(img)
        else:
            elementos_celda.append(Paragraph("[Imagen no encontrada]", style_info))
            
        # Agregamos la lista de flowables directamente para la celda de la tabla
        celdas.append(elementos_celda)
        
    # Organizar las celdas en una cuadrícula de 3 columnas
    filas = []
    for i in range(0, len(celdas), 3):
        fila = celdas[i:i+3]
        while len(fila) < 3:
            fila.append("")
        filas.append(fila)
        
    # Crear la tabla
    tabla = Table(filas, colWidths=[col_width, col_width, col_width])
    
    # Estilo de la tabla
    tabla.setStyle(TableStyle([
        ('ALIGN', (0,0), (-1,-1), 'CENTER'),
        ('VALIGN', (0,0), (-1,-1), 'MIDDLE'),
        ('PADDING', (0,0), (-1,-1), 8),
        ('BOTTOMPADDING', (0,0), (-1,-1), 10),
        ('TOPPADDING', (0,0), (-1,-1), 10),
        ('GRID', (0,0), (-1,-1), 0.5, colors.HexColor('#cccccc')),
    ]))
    
    # Construir el PDF
    story = [tabla]
    doc.build(story)
    
    print(f"¡PDF creado con éxito! Guardado en: {ruta_pdf}")

if __name__ == "__main__":
    generar_pdf()
