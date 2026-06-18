package tiendajava;

public class almacenista {
    String nombre;
    String idEmpleado;

    public void registrarProducto(Inventario inventario, String codigo, String nombreProd, String categoria,
            String proveedor, double precio, int cantidad) {
        Producto nuevo = new Producto();
        nuevo.codigoBarras = codigo;
        nuevo.nombre = nombreProd;
        nuevo.categoria = categoria;
        nuevo.proveedor = proveedor;
        nuevo.precioVenta = precio;
        nuevo.cantidad = cantidad;
        inventario.agregarProducto(nuevo);
    }

    public void consultarInventario(Inventario inventario) {
        inventario.mostrarInventario();
    }

    public void solicitarProductos(Inventario inventario) {
        inventario.mostrarBajoInventario();
    }

    public void registrarEntradaProductos(Inventario inventario, String codigo, int cantidadEntrada) {
        Producto productoEncontrado = inventario.buscarProducto(codigo);
        if (productoEncontrado != null) {
            if (cantidadEntrada > 0) {
                productoEncontrado.aumentarStock(cantidadEntrada);
            }
        }
    }
}