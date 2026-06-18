package tiendajava;

import tiendajava.Diagramacasouso.Trabajador;

public class Cajero extends Trabajador {
    private Caja      caja;
    private Inventario inventario;

    public Cajero(String nombre, String idEmpleado, Caja caja, Inventario inventario) {
        super(nombre, idEmpleado);
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
        System.out.println("[Cajero " + nombre + "] Registrando venta...");
        for (Producto p : caja.getProductosEnVenta()) {
            p.disminuirStock(1);
        }
        System.out.println("Venta registrada. Productos vendidos: "
                           + caja.getProductosEnVenta().size());
        caja.limpiarVenta();
    }
}
