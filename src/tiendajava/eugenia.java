package tiendajava;

import java.util.Scanner;

public class eugenia {
    String nombre;
    String idEmpleado;

    public eugenia() {
        this.nombre = "Eugenia";
        this.idEmpleado = "3";
    }

    public eugenia(String nombre, String idEmpleado) {
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

    public void iniciarMenu(Inventario inventario, Caja caja, almacenista pancho, Cajero pedro) {
        Scanner scanner = new Scanner(System.in);
        boolean activo = true;
        while (activo) {
            System.out.println("\nMenu supervisor de Eugenia");
            System.out.println("1. Registrar nuevo producto");
            System.out.println("2. Consultar bajo stock");
            System.out.println("3. Consultar cantidad total");
            System.out.println("4. Monitorear empleados");
            System.out.println("5. Registrar ganancias");
            System.out.println("6. Reportar perdidas");
            System.out.println("7. Generar reporte general");
            System.out.println("8. Salir");
            System.out.print("Seleccione opcion: ");
            
            int opcion = 0;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                System.out.println("Opcion no valida");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Codigo de barras: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Proveedor: ");
                    String proveedor = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();
                    registrarNuevoProducto(inventario, codigo, nombre, categoria, proveedor, precio, cantidad);
                    break;
                case 2:
                    consultarBajoStock(inventario);
                    break;
                case 3:
                    consultarCantidadTotal(inventario);
                    break;
                case 4:
                    supervisarEmpleados(pancho, pedro);
                    break;
                case 5:
                    registrarGanancias(caja);
                    break;
                case 6:
                    System.out.print("Codigo del producto: ");
                    String codPerdida = scanner.nextLine();
                    System.out.print("Cantidad perdida: ");
                    int cantPerdida = scanner.nextInt();
                    scanner.nextLine();
                    reportarPerdidas(inventario, codPerdida, cantPerdida);
                    break;
                case 7:
                    generarReporte(inventario, caja);
                    break;
                case 8:
                    activo = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
