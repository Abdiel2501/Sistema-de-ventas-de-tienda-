package tiendajava;

class Producto {
    String codigoBarras;
    String nombre;
    String categoria;
    String proveedor;
    double precioVenta;
    int cantidad;

    public Producto(String codigoBarras, String nombre, String categoria, String proveedor, double precioVenta,
            int cantidad) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;

    }

    public Producto() {
    }

    public void mostrarInformacion() {
        System.out.println("Codigo de Barras -> " + codigoBarras);
        System.out.println("Nombre           -> " + nombre);
        System.out.println("Categoria        -> " + categoria);
        System.out.println("Proveedor        -> " + proveedor);
        System.out.println("Precio Venta     -> " + precioVenta);
        System.out.println("Cantidad Almacen -> " + cantidad);
    }

    public void disminuirStock(String codigoProducto) {
        if (!this.codigoBarras.equals(codigoProducto)) {
            System.err.println("NO HAY UN PRODUCTO CON ESE CODIGO.");
            return;
        }
        if (cantidad > 0) {
            cantidad = cantidad - 1;
            if (cantidad <= 5) {
                System.out.println("SOLO QUEDAN " + cantidad + " PRODUCTOS LLAMADOS: " + nombre);
            }
            return;
        } else {
            System.out.println("EL STOCK DE " + nombre + " SE ENCUENTRA EN 0.");
        }
    }

    public void disminuirStock(int cantidadADisminuir) {
        if (cantidad > 0 && cantidadADisminuir > 0) {
            cantidad = cantidad - cantidadADisminuir;
            if (cantidad <= 5) {
                System.out.println("SOLO QUEDAN " + cantidad + " PRODUCTOS LLAMADOS: " + nombre);
            }
        } else if (cantidad <= 0) {
            System.out.println("EL STOCK DE " + nombre + " SE ENCUENTRA EN 0.");
        }
    }

    public void aumentarStock(int numeroAumento) {
        if (numeroAumento > 0) {
            cantidad = numeroAumento + cantidad;
        } else {
            System.out.println("NO SE PUEDE AGREGAR ESA CANTIDAD.");
        }
    }
    /*
     * Atributos:
     * 
     * codigoBarras
     * nombre
     * categoria
     * proveedor
     * precioVenta
     * cantidad
     * 
     * Métodos:
     * 
     * mostrarInformacion()
     * aumentarStock()
     * disminuirStock()
     */

}