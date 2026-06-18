package tiendajava;

public class supervisor {
    String nombre;
    String idEmpleado;

    public void consultarGanancias(Caja caja) {
        System.out.println("ganancias en caja " + caja.totalVenta);
    }

    public void generarReporte(Inventario inventario, Caja caja) {
        System.out.println("reporte de la tienda");
        inventario.mostrarInventario();
        System.out.println("ventas totales " + caja.totalVenta);
    }

    public void registrarPerdida(Inventario inventario, String codigo, int cantidadPerdida) {
        Producto productoEncontrado = inventario.buscarProducto(codigo);
        if (productoEncontrado != null) {
            if (cantidadPerdida > 0) {
                if (productoEncontrado.cantidad >= cantidadPerdida) {
                    productoEncontrado.disminuirStock(cantidadPerdida);
                    System.out.println("perdida registrada " + productoEncontrado.nombre);
                }
            }
        }
    }

    public void supervisarEmpleados(almacenista elAlmacenista, Cajero elCajero) {
        System.out.println("supervisor " + nombre);
        System.out.println("almacenista " + elAlmacenista.nombre);
        System.out.println("cajero " + elCajero.nombre);
    }
}