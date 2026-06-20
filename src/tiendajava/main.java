package tiendajava;

import java.util.Scanner;

public class main { // Se recomienda Main con Mayúscula
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;
        boolean iniciada = false;
        Inventario inventario = new Inventario();
        CargaInicialInventario.cargarProductos(inventario);
        System.out.println("Productos cargados: " + inventario.getListaProductos().size());
        boolean salirMenu = false;
        String codigoProducto;

        Caja caja = new Caja();
        almacenista pancho = new almacenista();
        Cajero pedro = new Cajero("Pedro", "1", caja, inventario);
        eugenia eugeniaObj = new eugenia();

        do {
            System.out.println("\n=== INICIAR SESIÓN ===");
            System.out.print("Ingresa el id: ");
            int id = 0;
            if (sc.hasNextInt()) {
                id = sc.nextInt();
                sc.nextLine();
            } else {
                sc.nextLine();
                System.out.println("Id inválido. Debe ser un número.");
                continue;
            }
            
            System.out.print("Ingresa tu contraseña: ");
            String contraseña = sc.nextLine(); // Ahora sí leerá el texto real

            if (id == 1 && contraseña.equals("pedro")) {
                eleccion = 1;
                iniciada = true; 
            } 
            else if (id == 2 && contraseña.equals("pancho")) {
                eleccion = 2; 
                iniciada = true;
            } 
            else if (id == 3 && contraseña.equals("eugenia")) {
                eleccion = 3;
                iniciada = true;
            } 
            else {
                System.out.println("Id o contraseña incorrectos. Intenta de nuevo.");
            }
            
        } while (!iniciada); 
        
        System.out.println("\nSesión iniciada con éxito. Bienvenido usuario número: " + eleccion);
        switch (eleccion) {
            case 1:
                do {
                    System.out.println("\nQue tal Pedro. ¿Que haremos hoy?");
                    System.out.println("1- Escanear producto.");
                    System.out.println("2- Cobrar venta.");
                    System.out.println("3- Registrar venta.");
                    System.out.println("4- Limpiar venta.");
                    System.out.println("Ingresa el numero a eleccion o (67) para salir:");
                    if (sc.hasNextInt()) {
                        eleccion = sc.nextInt();
                        sc.nextLine();
                    } else {
                        sc.nextLine();
                        System.out.println("Opción no válida.");
                        continue;
                    }
                    if (eleccion == 67) {
                        salirMenu = true;
                        break;
                    }
                    switch (eleccion) {
                        case 1:
                            System.out.println("Ingresa el codigo de barras del producto: ");
                            codigoProducto = sc.nextLine();
                            pedro.escanearProducto(codigoProducto);
                            break;
                        case 2:
                            System.out.println("Ingresa el dinero recibido: ");
                            double dineroRecibido = 0;
                            if (sc.hasNextDouble()) {
                                dineroRecibido = sc.nextDouble();
                                sc.nextLine();
                            } else {
                                sc.nextLine();
                                System.out.println("Monto inválido.");
                                break;
                            }
                            pedro.cobrarVenta(dineroRecibido);
                            break;
                        case 3:
                            pedro.registrarVenta();
                            break;
                        case 4:
                            caja.limpiarVenta();
                            System.out.println("Venta limpia.");
                            break;
                        default:
                            break;
                    }
                } while (!salirMenu);
                break;
            case 2:
                do {
                    System.out.println("\nQue tal Pancho. ¿Que haremos hoy?");
                    System.out.println("1- Mostrar productos bajos  .");
                    System.out.println("2- Solicitar pedido a proveedor.");
                    System.out.println("3- Registrar Reabastecimiento: ");
                    System.out.println("Ingresa el numero a eleccion o (67) para salir:");
                    if (sc.hasNextInt()) {
                        eleccion = sc.nextInt();
                        sc.nextLine();
                    } else {
                        sc.nextLine();
                        System.out.println("Opción no válida.");
                        continue;
                    }
                    if (eleccion == 67) {
                        salirMenu = true;
                        break;
                    }
                    switch (eleccion) {
                        case 1:
                            inventario.mostrarBajoInventario();
                            break;
                        case 2:
                            System.out.println("Hola pancho, Nuestros proveedores son: ");
                            System.out.println("1- Distribuidora La Cosecha S.A. de C.V.");
                            System.out.println("2- Grupo La Costeña / Conservas del Centro");
                            System.out.println("3- Coca-Cola FEMSA");
                            System.out.println("4- Distribuidora de Vinos y Licores del Valle");
                            System.out.println("5- Comercializadora Cuidado Personal SA de CV");
                            System.out.println("6- Dulces y Golosinas Mexicanas S.A.");
                            System.out.println("7- Grupo Lala / Lacteos del Bajío");
                            System.out.println("8- TecnoImport de México");
                            System.out.println("9- Pastas y Harinas del Centro");
                            System.out.println("10-PepsiCo México (Sabritas)");
                            System.out.println("11- Distribuidora de Limpieza del Hogar SA de CV");
                            System.out.println("Ingresa el numero de el proveedor a hacer reabastecimiento o (67) para salir:");
                            if (sc.hasNextInt()) {
                                eleccion = sc.nextInt();
                                sc.nextLine();
                            } else {
                                sc.nextLine();
                                System.out.println("Opción no válida.");
                                break;
                            }
                            if (eleccion == 67) {
                                break;
                            }
                            switch (eleccion) {
                                case 1:
                                    hacerPedidoConProveedor(sc, inventario, "Distribuidora La Cosecha S.A. de C.V.");
                                    break;
                                case 2:
                                    hacerPedidoConProveedor(sc, inventario, "Grupo La Costeña / Conservas del Centro");
                                    break;
                                case 3:
                                    hacerPedidoConProveedor(sc, inventario, "Coca-Cola FEMSA");
                                    break;
                                case 4:
                                    hacerPedidoConProveedor(sc, inventario, "Distribuidora de Vinos y Licores del Valle");
                                    break;
                                case 5:
                                    hacerPedidoConProveedor(sc, inventario, "Comercializadora Cuidado Personal SA de CV");
                                    break;
                                case 6:
                                    hacerPedidoConProveedor(sc, inventario, "Dulces y Golosinas Mexicanas S.A.");
                                    break;
                                case 7:
                                    hacerPedidoConProveedor(sc, inventario, "Grupo Lala / Lacteos del Bajío");
                                    break;
                                case 8:
                                    hacerPedidoConProveedor(sc, inventario, "TecnoImport de México");
                                    break;
                                case 9:
                                    hacerPedidoConProveedor(sc, inventario, "Pastas y Harinas del Centro");
                                    break;
                                case 10:
                                    hacerPedidoConProveedor(sc, inventario, "PepsiCo México (Sabritas)");
                                    break;
                                case 11:
                                    hacerPedidoConProveedor(sc, inventario, "Distribuidora de Limpieza del Hogar SA de CV");
                                    break;
                                default:
                                    System.out.println("Proveedor invalido.");
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Ingresa el codigo del producto: ");
                            codigoProducto = sc.nextLine();
                            Producto productoEncontrado = inventario.buscarProducto(codigoProducto);
                            if (productoEncontrado != null) {
                                productoEncontrado.mostrarInformacion();
                                System.out.println("Ingrese las cantidades recibidas de ese producto: ");
                                int cantidadRecibida = 0;
                                if (sc.hasNextInt()) {
                                    cantidadRecibida = sc.nextInt();
                                    sc.nextLine();
                                } else {
                                    sc.nextLine();
                                    System.out.println("Cantidad inválida.");
                                    break;
                                }
                                productoEncontrado.aumentarStock(cantidadRecibida);
                                System.out.println("Si no es lo que pidio, no lo reciba y llame a su programador.");
                            } else {
                                System.out.println("No se encontro un producto con ese codigo.");
                            }
                            break;
                        default:
                            break;
                    }
                } while (!salirMenu);
                break;
            case 3:
                eugeniaObj.iniciarMenu(inventario, caja, pancho, pedro);
                break;
            default:
                break;
        }
    }

    private static void hacerPedidoConProveedor(Scanner sc, Inventario inventario, String proveedorEsperado) {
        System.out.println("Ingresa el codigo del producto que su proveedor le brindo: ");
        String codigoProducto = sc.nextLine();
        System.out.println("Ingresa la cantidad a agregar: ");
        int cantidadEntrada = 0;
        if (sc.hasNextInt()) {
            cantidadEntrada = sc.nextInt();
            sc.nextLine();
        } else {
            sc.nextLine();
            System.out.println("Cantidad inválida.");
            return;
        }

        Producto productoEncontrado = inventario.buscarProducto(codigoProducto);
        if (productoEncontrado == null) {
            System.out.println("Codigo incorrecto, reintentar");
            return;
        }

        if (!proveedorEsperado.equals(productoEncontrado.proveedor)) {
            System.out.println("El producto no pertenece a ese proveedor.");
            return;
        }

        productoEncontrado.aumentarStock(cantidadEntrada);
        double ganancia = (productoEncontrado.precioVenta - productoEncontrado.precioCompra) * cantidadEntrada;
        double gastoProducto = productoEncontrado.precioCompra * cantidadEntrada;

        System.out.println("El pedido se ha completado con exito.");
        System.out.println("El total a pagar al proveedor sera: " + gastoProducto);
        System.out.println("La ganancia estimada sera: " + ganancia);
    }
}