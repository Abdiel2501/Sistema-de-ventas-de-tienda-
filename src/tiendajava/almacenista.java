package tiendajava;

public class almacenista extends Trabajador {
    public almacenista() {
        super("Pancho", "2", "pancho");
    }

    public almacenista(String nombre, String idEmpleado, String contraseña) {
        super(nombre, idEmpleado, contraseña);
    }

    public void registrarProducto(Inventario inventario, String codigo, String nombreProd, String categoria,
            String proveedor, double precio, int cantidad) {
        Producto nuevo = new Producto(codigo, nombreProd, categoria, proveedor, precio, cantidad);
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