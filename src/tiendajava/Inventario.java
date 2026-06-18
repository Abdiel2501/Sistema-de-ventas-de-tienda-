package tiendajava;

import java.util.ArrayList;

class Inventario {
    private ArrayList<Producto> listaProductos;

    public Inventario() {
        this.listaProductos = new ArrayList<>(); // Inicializamos la lista vacía
    }

    public void agregarProducto(Producto nuevoProducto) {
        this.listaProductos.add(nuevoProducto);
        System.out.println("Se agregó " + nuevoProducto.nombre + " al inventario.");
    }

    public void mostrarInventario() {
        System.out.println("\n=== INVENTARIO DE LA TIENDA ===");
        for (Producto prod : listaProductos) {
            prod.mostrarInformacion(); // Reutilizamos el método que ya hiciste

        }
    }
}