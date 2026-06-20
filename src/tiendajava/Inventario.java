package tiendajava;

import java.util.ArrayList;

class Inventario {
    public ArrayList<Producto> listaProductos;
    public boolean silencioso = false;

    public Inventario() {
        this.listaProductos = new ArrayList<>(); // Inicializamos la lista vacía
    }

    public void agregarProducto(Producto nuevoProducto) {
        this.listaProductos.add(nuevoProducto);
        if (!silencioso) {
            System.out.println("Se agregó " + nuevoProducto.nombre + " al inventario.");
        }
    }

    public void mostrarInventario() {
        System.out.println("\n=== INVENTARIO DE LA TIENDA ===");
        for (Producto prod : listaProductos) {
            prod.mostrarInformacion(); // Reutilizamos el método que ya hiciste
        }
    }

    public Producto buscarProducto(String codigo) {
        for (Producto producto : listaProductos) {
            if (producto.codigoBarras != null && producto.codigoBarras.equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public void mostrarBajoInventario() {
        System.out.println("\n=== PRODUCTOS CON STOCK BAJO ===");
        boolean encontrado = false;
        for (Producto producto : listaProductos) {
            if (producto.cantidad <= 5) {
                producto.mostrarInformacion();
                System.out.println();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay productos con stock bajo.");
        }
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public String buscarProveedor(String codigo) {
        for (Producto producto : listaProductos) {
            if (producto.codigoBarras != null && producto.codigoBarras.equals(codigo)) {
                return producto.proveedor;
            }
        }
        return null;
    }

    public double buscarPrecioProducto(String codigo) {
        for (Producto producto : listaProductos) {
            if (producto.codigoBarras != null && producto.codigoBarras.equals(codigo)) {
                return producto.precioVenta;
            }
        }
        return 0;
    }
}