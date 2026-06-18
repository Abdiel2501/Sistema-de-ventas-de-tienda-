package tiendajava;

import java.util.ArrayList;

public class Caja {
    double totalVenta;
    double dineroRecibido;
    private ArrayList<Producto> productosEnVenta;

    public Caja() {
        this.totalVenta      = 0.0;
        this.dineroRecibido  = 0.0;
        this.productosEnVenta = new ArrayList<>();
    }

    public void agregarProductoVenta(Producto p) {
        productosEnVenta.add(p);
    }

    public double calcularTotal() {
        totalVenta = 0.0;
        for (Producto p : productosEnVenta) {
            totalVenta += p.precioVenta;
        }
        System.out.printf("Total de la venta: $%.2f%n", totalVenta);
        return totalVenta;
    }

    public double calcularCambio() {
        double cambio = dineroRecibido - totalVenta;
        if (cambio < 0) {
            System.out.printf("Pago insuficiente. Faltan: $%.2f%n", Math.abs(cambio));
        } else {
            System.out.printf("Cambio a devolver: $%.2f%n", cambio);
        }
        return cambio;
    }

    public ArrayList<Producto> getProductosEnVenta() {
        return productosEnVenta;
    }

    public void limpiarVenta() {
        productosEnVenta.clear();
        totalVenta     = 0.0;
        dineroRecibido = 0.0;
    }
}
