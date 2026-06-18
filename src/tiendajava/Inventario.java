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

    public Producto buscarProducto(String codigo) {
        for (Producto prod : listaProductos) {
            if (prod.codigoBarras.equals(codigo)) {
                return prod;
            }
        }
        return null;
    }

    public void mostrarBajoInventario() {
        System.out.println("Productos con bajo stock:");
        boolean hayBajoStock = false;
        for (Producto prod : listaProductos) {
            if (prod.cantidad < 5) {
                prod.mostrarInformacion();
                hayBajoStock = true;
            }
        }
        if (!hayBajoStock) {
            System.out.println("Ninguno");
        }
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void mostrarInventario() {
        System.out.println("\n=== INVENTARIO DE LA TIENDA ===");
        for (Producto prod : listaProductos) {
            prod.mostrarInformacion(); // Reutilizamos el método que ya hiciste

        }
    }
}