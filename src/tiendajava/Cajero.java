package tiendajava;

public class Cajero {
    String nombre;
    String idEmpleado;
    private Caja      caja;
    private Inventario inventario;

    public Cajero(String nombre, String idEmpleado, Caja caja, Inventario inventario) {
        this.nombre      = nombre;
        this.idEmpleado  = idEmpleado;
        this.caja        = caja;
        this.inventario  = inventario;
    }

    public Producto escanearProducto(String codigoBarras) {
        System.out.println("\n[Cajero " + nombre + "] Escaneando codigo: " + codigoBarras);
        Producto p = inventario.buscarProducto(codigoBarras);
        if (p != null) {
            p.mostrarInformacion();
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
