package tiendajava;

public class Cajero extends Trabajador {
    private Caja      caja;
    private Inventario inventario;

    public Cajero(String nombre, String idEmpleado, String contraseña, Caja caja, Inventario inventario) {
        super(nombre, idEmpleado, contraseña);
        this.caja        = caja;
        this.inventario  = inventario;
    }

    public void realizarVentaCompleta(java.util.Scanner sc) {
        System.out.println("\n--- INICIANDO FLUJO DE VENTA ---");
        caja.limpiarVenta();
        while (true) {
            System.out.print("Escanea un producto (Ingresa el codigo de barras o escribe 'FIN' para cobrar, 'CANCELAR' para anular): ");
            String entrada = sc.nextLine().trim();
            if (entrada.equalsIgnoreCase("FIN")) {
                break;
            }
            if (entrada.equalsIgnoreCase("CANCELAR")) {
                caja.limpiarVenta();
                System.out.println("Venta cancelada y limpiada.");
                return;
            }
            if (entrada.isEmpty()) {
                continue;
            }
            escanearProducto(entrada);
        }

        if (caja.getProductosEnVenta().isEmpty()) {
            System.out.println("No hay productos en la venta actual.");
            return;
        }

        double total = caja.calcularTotal();
        while (true) {
            System.out.print("Ingresa el dinero recibido: ");
            double dineroRecibido = 0;
            if (sc.hasNextDouble()) {
                dineroRecibido = sc.nextDouble();
                sc.nextLine();
            } else {
                sc.nextLine();
                System.out.println("Monto invalido. Debe ser un numero.");
                continue;
            }
            if (dineroRecibido < 0) {
                System.out.println("ERROR: El dinero recibido no puede ser negativo.");
                continue;
            }
            if (dineroRecibido < total) {
                System.out.printf("ERROR: Pago insuficiente. Faltan: $%.2f. Intente de nuevo.%n", (total - dineroRecibido));
                continue;
            }
            cobrarVenta(dineroRecibido);
            registrarVenta();
            break;
        }
    }

    public Producto escanearProducto(String codigoBarras) {
        System.out.println("\n[Cajero " + nombre + "] Escaneando codigo: " + codigoBarras);
        Producto p = inventario.buscarProducto(codigoBarras);
        if (p != null) {
            int countInSale = 0;
            for (Producto prod : caja.getProductosEnVenta()) {
                if (prod.codigoBarras.equals(p.codigoBarras)) {
                    countInSale++;
                }
            }
            if (countInSale >= p.cantidad) {
                System.out.println("ERROR: No hay suficiente stock disponible para agregar este producto. Stock actual: " + p.cantidad);
                return null;
            }
            System.out.println("Producto: " + p.nombre + " - Precio: $" + p.precioVenta);
            caja.agregarProductoVenta(p);
        }
        return p;
    }

    public double cobrarVenta(double dineroRecibido) {
        System.out.println("\n[Cajero " + nombre + "] Cobrando venta...");
        caja.calcularTotal();
        caja.dineroRecibido = dineroRecibido;
        return caja.calcularCambio();
    }

    public void registrarVenta() {
        if (caja.getProductosEnVenta().isEmpty()) {
            System.out.println("No hay productos en la venta actual.");
            return;
        }
        caja.calcularTotal();
        if (caja.dineroRecibido < caja.totalVenta) {
            System.out.printf("ERROR: Pago insuficiente. Faltan: $%.2f. Registre el cobro con dinero suficiente.%n", (caja.totalVenta - caja.dineroRecibido));
            return;
        }
        System.out.println("\n========================================");
        System.out.println("          TICKET DE VENTA");
        System.out.println("========================================");
        System.out.printf("%-20s %-10s %-10s\n", "Producto", "Cant.", "Precio");
        System.out.println("----------------------------------------");
        
        java.util.Map<String, Integer> cantidades = new java.util.LinkedHashMap<>();
        java.util.Map<String, Double> precios = new java.util.HashMap<>();
        for (Producto p : caja.getProductosEnVenta()) {
            cantidades.put(p.nombre, cantidades.getOrDefault(p.nombre, 0) + 1);
            precios.put(p.nombre, p.precioVenta);
        }
        
        for (String nombreProd : cantidades.keySet()) {
            int qty = cantidades.get(nombreProd);
            double precio = precios.get(nombreProd);
            System.out.printf("%-20s %-10d $%-10.2f\n", 
                nombreProd.length() > 18 ? nombreProd.substring(0, 18) : nombreProd, 
                qty, 
                precio * qty);
        }
        
        System.out.println("----------------------------------------");
        System.out.printf("TOTAL A PAGAR:                  $%.2f\n", caja.totalVenta);
        System.out.printf("EFECTIVO RECIBIDO:              $%.2f\n", caja.dineroRecibido);
        System.out.printf("CAMBIO:                         $%.2f\n", (caja.dineroRecibido - caja.totalVenta));
        System.out.println("========================================");
        System.out.println("      ¡Gracias por su compra!");
        System.out.println("========================================\n");

        System.out.println("[Cajero " + nombre + "] Registrando venta...");
        for (Producto p : caja.getProductosEnVenta()) {
            p.disminuirStock(1);
        }
        caja.limpiarVenta();
    }
}
