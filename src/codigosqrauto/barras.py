import os
import sys
import subprocess

# Intentar importar las librerías necesarias. Si no están instaladas, se instalan automáticamente.
try:
    import barcode
    from barcode.writer import ImageWriter
except ImportError:
    print("La librería 'python-barcode' no está instalada. Instalando python-barcode y pillow...")
    subprocess.check_call([sys.executable, "-m", "pip", "install", "python-barcode", "pillow"])
    import barcode
    from barcode.writer import ImageWriter

# Lista de 50 productos de electrónica reales y variados con características adicionales
# Precios adaptados a pesos mexicanos reales (MXN)
PRODUCTOS = [
    {"nombre": "iPhone 15 Pro Max", "marca": "Apple", "precio": 25999.00, "stock": 45, "gramos": 221, "memoria": "256GB", "altura": 15.9, "proveedor": "Apple Store MX"},
    {"nombre": "Galaxy S24 Ultra", "marca": "Samsung", "precio": 26999.00, "stock": 30, "gramos": 232, "memoria": "512GB", "altura": 16.2, "proveedor": "Samsung Retail"},
    {"nombre": "PlayStation 5 Slim", "marca": "Sony", "precio": 9999.00, "stock": 60, "gramos": 3200, "memoria": "1TB SSD", "altura": 35.8, "proveedor": "Sony Latam"},
    {"nombre": "Nintendo Switch OLED", "marca": "Nintendo", "precio": 5999.00, "stock": 80, "gramos": 420, "memoria": "64GB", "altura": 10.2, "proveedor": "Nintendo Latam"},
    {"nombre": "iPad Pro M4", "marca": "Apple", "precio": 21999.00, "stock": 25, "gramos": 579, "memoria": "256GB", "altura": 28.1, "proveedor": "Apple Store MX"},
    {"nombre": "MacBook Air M3", "marca": "Apple", "precio": 22999.00, "stock": 20, "gramos": 1240, "memoria": "8GB RAM / 256GB SSD", "altura": 30.4, "proveedor": "Apple Store MX"},
    {"nombre": "Audífonos WH-1000XM5", "marca": "Sony", "precio": 6499.00, "stock": 50, "gramos": 250, "memoria": "N/A", "altura": 22.5, "proveedor": "Sony Latam"},
    {"nombre": "Kindle Paperwhite", "marca": "Amazon", "precio": 3499.00, "stock": 100, "gramos": 205, "memoria": "16GB", "altura": 17.4, "proveedor": "Amazon México"},
    {"nombre": "Meta Quest 3", "marca": "Meta", "precio": 10499.00, "stock": 35, "gramos": 515, "memoria": "128GB", "altura": 16.0, "proveedor": "Meta Portal"},
    {"nombre": "ROG Ally", "marca": "ASUS", "precio": 13999.00, "stock": 40, "gramos": 608, "memoria": "512GB SSD", "altura": 11.1, "proveedor": "Asus Store"},
    {"nombre": "Chromecast con Google TV", "marca": "Google", "precio": 999.00, "stock": 150, "gramos": 55, "memoria": "8GB", "altura": 16.2, "proveedor": "Google Store"},
    {"nombre": "Apple Watch Series 9", "marca": "Apple", "precio": 8999.00, "stock": 75, "gramos": 39, "memoria": "64GB", "altura": 4.5, "proveedor": "Apple Store MX"},
    {"nombre": "Galaxy Watch 6", "marca": "Samsung", "precio": 5499.00, "stock": 65, "gramos": 33, "memoria": "16GB", "altura": 4.4, "proveedor": "Samsung Retail"},
    {"nombre": "Cámara HERO12 Black", "marca": "GoPro", "precio": 7999.00, "stock": 55, "gramos": 154, "memoria": "Expandible", "altura": 5.0, "proveedor": "GoPro Store"},
    {"nombre": "Teclado Mecánico K2 V2", "marca": "Keychron", "precio": 1899.00, "stock": 90, "gramos": 794, "memoria": "N/A", "altura": 3.8, "proveedor": "Keychron MX"},
    {"nombre": "Mouse MX Master 3S", "marca": "Logitech", "precio": 2199.00, "stock": 120, "gramos": 141, "memoria": "N/A", "altura": 5.1, "proveedor": "Logitech MX"},
    {"nombre": "Stream Deck MK.2", "marca": "Elgato", "precio": 3199.00, "stock": 45, "gramos": 145, "memoria": "N/A", "altura": 8.4, "proveedor": "Elgato LATAM"},
    {"nombre": "Bocina Era 100", "marca": "Sonos", "precio": 4999.00, "stock": 30, "gramos": 2020, "memoria": "N/A", "altura": 18.2, "proveedor": "Sonos México"},
    {"nombre": "Echo Dot 5ta Generación", "marca": "Amazon", "precio": 999.00, "stock": 200, "gramos": 340, "memoria": "N/A", "altura": 8.9, "proveedor": "Amazon México"},
    {"nombre": "Shield TV Pro", "marca": "NVIDIA", "precio": 4299.00, "stock": 40, "gramos": 250, "memoria": "16GB", "altura": 9.8, "proveedor": "NVIDIA MX"},
    {"nombre": "Fire TV Stick 4K", "marca": "Amazon", "precio": 1199.00, "stock": 300, "gramos": 43, "memoria": "8GB", "altura": 10.8, "proveedor": "Amazon México"},
    {"nombre": "Galaxy Tab S9", "marca": "Samsung", "precio": 15999.00, "stock": 30, "gramos": 498, "memoria": "128GB", "altura": 25.4, "proveedor": "Samsung Retail"},
    {"nombre": "Televisor OLED C3 55\"", "marca": "LG", "precio": 24999.00, "stock": 15, "gramos": 16600, "memoria": "N/A", "altura": 70.3, "proveedor": "LG Electronics"},
    {"nombre": "Audífonos QuietComfort Ultra", "marca": "Bose", "precio": 8999.00, "stock": 40, "gramos": 250, "memoria": "N/A", "altura": 19.5, "proveedor": "Bose México"},
    {"nombre": "AirPods Pro 2", "marca": "Apple", "precio": 4999.00, "stock": 110, "gramos": 50, "memoria": "N/A", "altura": 4.5, "proveedor": "Apple Store MX"},
    {"nombre": "Audífonos Arctis Nova Pro", "marca": "SteelSeries", "precio": 6999.00, "stock": 25, "gramos": 340, "memoria": "N/A", "altura": 20.0, "proveedor": "SteelSeries MX"},
    {"nombre": "Mouse DeathAdder V3 Pro", "marca": "Razer", "precio": 3099.00, "stock": 80, "gramos": 63, "memoria": "N/A", "altura": 4.3, "proveedor": "Razer Latam"},
    {"nombre": "Control DualSense Edge", "marca": "Sony", "precio": 4799.00, "stock": 50, "gramos": 325, "memoria": "N/A", "altura": 10.6, "proveedor": "Sony Latam"},
    {"nombre": "Xbox Series X", "marca": "Microsoft", "precio": 11599.00, "stock": 40, "gramos": 4445, "memoria": "1TB SSD", "altura": 30.1, "proveedor": "Microsoft Store"},
    {"nombre": "Steam Deck OLED", "marca": "Valve", "precio": 12999.00, "stock": 35, "gramos": 640, "memoria": "512GB SSD", "altura": 11.7, "proveedor": "Valve Corp"},
    {"nombre": "Teclado K70 RGB PRO", "marca": "Corsair", "precio": 3399.00, "stock": 60, "gramos": 1120, "memoria": "8MB integrada", "altura": 4.0, "proveedor": "Corsair MX"},
    {"nombre": "Micrófono Blue Yeti USB", "marca": "Logitech", "precio": 2499.00, "stock": 75, "gramos": 550, "memoria": "N/A", "altura": 29.5, "proveedor": "Logitech MX"},
    {"nombre": "SSD M.2 SN850X 2TB", "marca": "WD Black", "precio": 3599.00, "stock": 90, "gramos": 7, "memoria": "2TB", "altura": 0.2, "proveedor": "Western Digital MX"},
    {"nombre": "SSD Portátil Extreme 1TB", "marca": "SanDisk", "precio": 2199.00, "stock": 110, "gramos": 52, "memoria": "1TB", "altura": 10.0, "proveedor": "SanDisk MX"},
    {"nombre": "Dron Mini 4 Pro", "marca": "DJI", "precio": 16999.00, "stock": 20, "gramos": 249, "memoria": "N/A", "altura": 6.4, "proveedor": "DJI Store"},
    {"nombre": "Timbre Inteligente Ring", "marca": "Ring", "precio": 1999.00, "stock": 85, "gramos": 205, "memoria": "N/A", "altura": 12.8, "proveedor": "Ring MX"},
    {"nombre": "Kit Inicio Hue", "marca": "Philips", "precio": 3999.00, "stock": 45, "gramos": 450, "memoria": "N/A", "altura": 11.0, "proveedor": "Philips Lighting"},
    {"nombre": "Cámara Instax Mini 12", "marca": "Fujifilm", "precio": 1799.00, "stock": 70, "gramos": 306, "memoria": "N/A", "altura": 12.2, "proveedor": "Fujifilm MX"},
    {"nombre": "Monitor UltraSharp U2723QE", "marca": "Dell", "precio": 11999.00, "stock": 25, "gramos": 6600, "memoria": "N/A", "altura": 38.5, "proveedor": "Dell México"},
    {"nombre": "Monitor Gaming VG27AQ", "marca": "ASUS", "precio": 6499.00, "stock": 50, "gramos": 5800, "memoria": "N/A", "altura": 37.7, "proveedor": "ASUS MX"},
    {"nombre": "Micrófono QuadCast S", "marca": "HyperX", "precio": 3199.00, "stock": 65, "gramos": 370, "memoria": "N/A", "altura": 25.0, "proveedor": "HyperX Latam"},
    {"nombre": "SSD Portátil T7 Shield 2TB", "marca": "Samsung", "precio": 3499.00, "stock": 80, "gramos": 98, "memoria": "2TB", "altura": 1.3, "proveedor": "Samsung Retail"},
    {"nombre": "Sistema Wifi Velop Pro 6E", "marca": "Linksys", "precio": 6299.00, "stock": 30, "gramos": 680, "memoria": "N/A", "altura": 18.5, "proveedor": "Linksys México"},
    {"nombre": "Termostato Nest", "marca": "Google", "precio": 4999.00, "stock": 40, "gramos": 244, "memoria": "N/A", "altura": 8.4, "proveedor": "Google Store"},
    {"nombre": "Reloj Forerunner 265", "marca": "Garmin", "precio": 8999.00, "stock": 35, "gramos": 47, "memoria": "8GB", "altura": 4.6, "proveedor": "Garmin México"},
    {"nombre": "Micrófono SM7B", "marca": "Shure", "precio": 8499.00, "stock": 20, "gramos": 765, "memoria": "N/A", "altura": 19.8, "proveedor": "Shure México"},
    {"nombre": "Interfaz de Audio Scarlett 2i2", "marca": "Focusrite", "precio": 3999.00, "stock": 55, "gramos": 570, "memoria": "N/A", "altura": 4.7, "proveedor": "Focusrite LATAM"},
    {"nombre": "Micrófono Wave:3", "marca": "Elgato", "precio": 3099.00, "stock": 50, "gramos": 585, "memoria": "N/A", "altura": 15.3, "proveedor": "Elgato LATAM"},
    {"nombre": "SSD M.2 T500 2TB", "marca": "Crucial", "precio": 3299.00, "stock": 70, "gramos": 10, "memoria": "2TB", "altura": 0.2, "proveedor": "Crucial México"},
    {"nombre": "Batería Portátil 737", "marca": "Anker", "precio": 2999.00, "stock": 100, "gramos": 630, "memoria": "24000mAh", "altura": 15.6, "proveedor": "Anker MX"}
]

# Intentar cargar los productos desde el archivo codigos.txt si ya existe
directorio_script = os.path.dirname(os.path.abspath(__file__))
ruta_txt_default = os.path.join(directorio_script, "codigos_barra", "codigos.txt")
if os.path.exists(ruta_txt_default):
    productos_cargados = []
    try:
        with open(ruta_txt_default, "r", encoding="utf-8") as f:
            for line in f:
                line = line.strip()
                if not line:
                    continue
                parts = line.split(",")
                if len(parts) >= 9:
                    productos_cargados.append({
                        "codigo": parts[0],
                        "nombre": parts[1],
                        "marca": parts[2],
                        "precio": float(parts[3]),
                        "stock": int(parts[4]),
                        "gramos": int(parts[5]),
                        "memoria": parts[6],
                        "altura": float(parts[7]),
                        "proveedor": parts[8]
                    })
        if productos_cargados:
            PRODUCTOS = productos_cargados
            print(f"Cargados {len(PRODUCTOS)} productos desde {ruta_txt_default}")
    except Exception as e:
        print(f"Error al leer codigos.txt: {e}. Se usará la lista predefinida.")

def generar_codigos(carpeta_barras="codigos_barra"):
    # Crear la carpeta de destino si no existe
    if not os.path.exists(carpeta_barras):
        os.makedirs(carpeta_barras)
        print(f"Carpeta '{carpeta_barras}' creada con éxito.")
    
    print(f"Iniciando la generación de {len(PRODUCTOS)} códigos de barra (EAN-13)...")
    
    ean = barcode.get_barcode_class('ean13')
    ruta_txt_barras = os.path.join(carpeta_barras, "codigos.txt")
    
    with open(ruta_txt_barras, "w", encoding="utf-8") as f_barras:
        for i, prod in enumerate(PRODUCTOS, start=1):
            # Formato EAN-13: pasamos 12 dígitos y la librería calculará el 13º (dígito de control)
            datos_12 = prod.get('codigo', f"750990000{i:03d}")[:12]
            
            # --- Generar Código de Barras ---
            codigo_b = ean(datos_12, writer=ImageWriter())
            nombre_barras = f"barcode_{i:02d}"
            ruta_barras = os.path.join(carpeta_barras, nombre_barras)
            
            # Opciones para optimizar la lectura con lector láser (pistola)
            opciones_barcode = {
                'dpi': 300,
                'module_height': 15.0,  # Altura de la barra en mm (altura suficiente)
                'module_width': 0.35,   # Ancho de cada barra en mm
                'quiet_zone': 6.5,      # Margen lateral de seguridad (mayor a 5 mm)
                'font_size': 8,        # Tamaño de fuente legible
                'text_distance': 4.0,   # Distancia entre el texto y las barras
                'write_text': True      # Mostrar los números debajo
            }
            codigo_b.save(ruta_barras, options=opciones_barcode)
            
            # El código de barras final con sus 13 dígitos
            codigo_completo = codigo_b.get_fullcode()
            
            # Formato simple CSV para fácil lectura en Java (codigo,nombre,marca,precio,stock,gramos,memoria,altura,proveedor)
            linea = f"{codigo_completo},{prod['nombre']},{prod['marca']},{prod['precio']},{prod['stock']},{prod['gramos']},{prod['memoria']},{prod['altura']},{prod['proveedor']}\n"
            f_barras.write(linea)
            
    print(f"Se han generado y guardado con éxito {len(PRODUCTOS)} imágenes de códigos de barra en '{carpeta_barras}' y el listado de productos en '{ruta_txt_barras}'.")

if __name__ == "__main__":
    # Obtener la ruta absoluta de la carpeta donde se encuentra este script
    directorio_script = os.path.dirname(os.path.abspath(__file__))
    
    # Crear la carpeta "codigos_barra" dentro de esa misma ruta
    ruta_barras = os.path.join(directorio_script, "codigos_barra")
    
    generar_codigos(ruta_barras)


