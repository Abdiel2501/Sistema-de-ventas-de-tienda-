package tiendajava;

public class supervisor {
    String nombre;
    String idEmpleado;

    public supervisor() {
    }

    public supervisor(String nombre, String idEmpleado) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
    }

    public void consultarGanancias(Caja caja) {
        System.out.println("ganancias en caja " + caja.totalVenta);
    }

    public void registrarGanancias(Caja caja) {
        System.out.println("Registrando ganancias de caja: $" + caja.totalVenta);
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

    public void reportarPerdidas(Inventario inventario, String codigo, int cantidadPerdida) {
        System.out.println("Reportando perdida del producto con codigo: " + codigo);
        registrarPerdida(inventario, codigo, cantidadPerdida);
    }

    public void supervisarEmpleados(almacenista elAlmacenista, Cajero elCajero) {
        System.out.println("supervisor " + nombre);
        System.out.println("almacenista " + elAlmacenista.nombre);
        System.out.println("cajero " + elCajero.nombre);
    }

    public void consultarBajoStock(Inventario inventario) {
        System.out.println("Consultando bajo stock...");
        inventario.mostrarBajoInventario();
        for (Producto prod : inventario.getListaProductos()) {
            if (prod.cantidad < 5) {
                solicitarPedidoProveedor(prod);
            }
        }
    }

    public void solicitarPedidoProveedor(Producto prod) {
        System.out.println("Solicitando pedido de reabastecimiento al proveedor " + prod.proveedor + " para el producto " + prod.nombre);
    }

    public void registrarNuevoProducto(Inventario inventario, String codigo, String nombreProd, String categoria,
            String proveedor, double precio, int cantidad) {
        Producto nuevo = new Producto(codigo, nombreProd, categoria, proveedor, precio, cantidad);
        inventario.agregarProducto(nuevo);
        System.out.println("Se ha registrado el nuevo producto: " + nombreProd);
    }

    public void consultarCantidadTotal(Inventario inventario) {
        int total = 0;
        for (Producto prod : inventario.getListaProductos()) {
            total += prod.cantidad;
        }
        System.out.println("Cantidad total de productos en inventario: " + total);
    }
}