package tiendajava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Caja caja = new Caja();
        
        // Creamos los empleados
        supervisor elSupervisor = new supervisor("Eugenia", "SUP001");
        almacenista pancho = new almacenista("Pancho", "ALM002");
        Cajero pedro = new Cajero("Pedro", "CAJ003", caja, inventario);
        
        // Cargar productos al inventario
        cargarInventario(inventario);
        
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
        System.out.println("==============================================");
        System.out.println("   SISTEMA DE VENTAS DE TIENDA - JAVA         ");
        System.out.println("==============================================");
        
        while (!salir) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("Seleccione el rol con el que desea interactuar:");
            System.out.println("1. Eugenia (Supervisor)");
            System.out.println("2. Pedro (Cajero) - Simular Caja de Cobro");
            System.out.println("3. Pancho (Almacenista) - Gestionar Almacen");
            System.out.println("4. Mostrar Inventario Actual");
            System.out.println("5. Salir del Sistema");
            System.out.print("Opción: ");
            
            int opcion = 0;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // consumir el salto de línea
            } else {
                scanner.nextLine();
                System.out.println("Opción no válida. Intente de nuevo.");
                continue;
            }
            
            switch (opcion) {
                case 1:
                    // Menu de Eugenia
                    eugenia menuEugenia = new eugenia();
                    menuEugenia.iniciarMenu(inventario, caja, elSupervisor, pancho, pedro);
                    break;
                case 2:
                    // Menu de Cajero
                    iniciarMenuCajero(pedro, caja, inventario, scanner);
                    break;
                case 3:
                    // Menu de Almacenista
                    iniciarMenuAlmacenista(pancho, inventario, scanner);
                    break;
                case 4:
                    inventario.mostrarInventario();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del sistema de tienda. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

    private static void cargarInventario(Inventario inventario) {
        File archivo = new File("src/codigosqrauto/codigos_barra/codigos.txt");
        if (archivo.exists()) {
            System.out.println("Cargando catálogo de productos desde el archivo generado...");
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                int contador = 0;
                while ((linea = br.readLine()) != null) {
                    linea = linea.trim();
                    if (linea.isEmpty()) continue;
                    String[] parts = linea.split(",");
                    if (parts.length >= 9) {
                        try {
                            String codigo = parts[0];
                            String nombre = parts[1];
                            String categoria = parts[2];
                            double precio = Double.parseDouble(parts[3]);
                            int cantidad = Integer.parseInt(parts[4]);
                            String proveedor = parts[8];
                            
                            Producto prod = new Producto(codigo, nombre, categoria, proveedor, precio, cantidad);
                            inventario.agregarProducto(prod);
                            contador++;
                        } catch (NumberFormatException e) {
                            // Ignorar lineas mal formateadas
                        }
                    }
                }
                System.out.println("Se cargaron " + contador + " productos exitosamente.");
                return;
            } catch (IOException e) {
                System.out.println("Error al leer codigos.txt, cargando productos predeterminados...");
            }
        } else {
            System.out.println("No se encontró 'codigos.txt'. Cargando catálogo de productos predeterminados...");
        }
        
        // Productos fallback
        inventario.agregarProducto(new Producto("7509900000019", "iPhone 15 Pro Max", "Apple", "Apple Store MX", 25999.0, 45));
        inventario.agregarProducto(new Producto("7509900000026", "Galaxy S24 Ultra", "Samsung", "Samsung Retail", 26999.0, 30));
        inventario.agregarProducto(new Producto("7509900000033", "PlayStation 5 Slim", "Sony", "Sony Latam", 9999.0, 60));
        inventario.agregarProducto(new Producto("7509900000040", "Nintendo Switch OLED", "Nintendo", "Nintendo Latam", 5999.0, 80));
        inventario.agregarProducto(new Producto("7509900000057", "iPad Pro M4", "Apple", "Apple Store MX", 21999.0, 25));
    }

    private static void iniciarMenuCajero(Cajero cajero, Caja caja, Inventario inventario, Scanner scanner) {
        boolean enCaja = true;
        while (enCaja) {
            System.out.println("\n--- MÓDULO DE CAJA (Cajero: " + cajero.nombre + ") ---");
            System.out.println("1. Escanear / Agregar Producto para Venta");
            System.out.println("2. Ver carrito actual y subtotal");
            System.out.println("3. Cobrar Venta (Pagar)");
            System.out.println("4. Limpiar / Cancelar Carrito");
            System.out.println("5. Regresar al Menú Principal");
            System.out.print("Opción: ");
            
            int opcion = 0;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                System.out.println("Opción no válida.");
                continue;
            }
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el código de barras del producto: ");
                    String codigo = scanner.nextLine().trim();
                    Producto p = cajero.escanearProducto(codigo);
                    if (p == null) {
                        System.out.println("Producto no encontrado en el inventario.");
                    } else {
                        System.out.println("Producto '" + p.nombre + "' agregado al carrito.");
                    }
                    break;
                case 2:
                    System.out.println("\n--- CARRITO DE COMPRAS ---");
                    double subtotal = 0;
                    if (caja.getProductosEnVenta().isEmpty()) {
                        System.out.println("[Carrito vacío]");
                    } else {
                        for (Producto prod : caja.getProductosEnVenta()) {
                            System.out.printf("- %-25s : $%.2f%n", prod.nombre, prod.precioVenta);
                            subtotal += prod.precioVenta;
                        }
                    }
                    System.out.printf("Subtotal actual: $%.2f%n", subtotal);
                    break;
                case 3:
                    if (caja.getProductosEnVenta().isEmpty()) {
                        System.out.println("No hay productos en el carrito para cobrar.");
                        break;
                    }
                    double total = caja.calcularTotal();
                    System.out.printf("Total a cobrar: $%.2f%n", total);
                    System.out.print("Ingrese dinero recibido: $");
                    double dinero = 0;
                    if (scanner.hasNextDouble()) {
                        dinero = scanner.nextDouble();
                        scanner.nextLine();
                    } else {
                        scanner.nextLine();
                        System.out.println("Monto inválido.");
                        break;
                    }
                    
                    double cambio = cajero.cobrarVenta(dinero);
                    if (cambio >= 0) {
                        cajero.registrarVenta();
                        System.out.println("¡Pago exitoso! Transacción finalizada.");
                    } else {
                        System.out.println("No se pudo completar el cobro por pago insuficiente.");
                    }
                    break;
                case 4:
                    caja.limpiarVenta();
                    System.out.println("Carrito de compras vaciado.");
                    break;
                case 5:
                    enCaja = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void iniciarMenuAlmacenista(almacenista alm, Inventario inventario, Scanner scanner) {
        boolean enAlmacen = true;
        while (enAlmacen) {
            System.out.println("\n--- MÓDULO DE ALMACÉN (Almacenista: " + alm.nombre + ") ---");
            System.out.println("1. Registrar Entrada de Productos (Aumentar Stock)");
            System.out.println("2. Consultar Inventario Completo");
            System.out.println("3. Solicitar Productos con Bajo Stock");
            System.out.println("4. Registrar Nuevo Producto al Catálogo");
            System.out.println("5. Regresar al Menú Principal");
            System.out.print("Opción: ");
            
            int opcion = 0;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                System.out.println("Opción no válida.");
                continue;
            }
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el código de barras del producto: ");
                    String codigo = scanner.nextLine().trim();
                    Producto prod = inventario.buscarProducto(codigo);
                    if (prod == null) {
                        System.out.println("El producto con ese código no existe en el catálogo.");
                    } else {
                        System.out.print("Cantidad de entrada: ");
                        int cant = 0;
                        if (scanner.hasNextInt()) {
                            cant = scanner.nextInt();
                            scanner.nextLine();
                        } else {
                            scanner.nextLine();
                            System.out.println("Cantidad inválida.");
                            break;
                        }
                        alm.registrarEntradaProductos(inventario, codigo, cant);
                        System.out.println("Stock de " + prod.nombre + " actualizado a " + prod.cantidad + " unidades.");
                    }
                    break;
                case 2:
                    alm.consultarInventario(inventario);
                    break;
                case 3:
                    System.out.println("\nBuscando productos que requieran abastecimiento...");
                    alm.solicitarProductos(inventario);
                    break;
                case 4:
                    System.out.print("Código de barras: ");
                    String nCodigo = scanner.nextLine().trim();
                    if (inventario.buscarProducto(nCodigo) != null) {
                        System.out.println("Error: Un producto con ese código ya existe.");
                        break;
                    }
                    System.out.print("Nombre del producto: ");
                    String nNombre = scanner.nextLine().trim();
                    System.out.print("Categoría / Marca: ");
                    String nCategoria = scanner.nextLine().trim();
                    System.out.print("Proveedor: ");
                    String nProveedor = scanner.nextLine().trim();
                    System.out.print("Precio de venta: ");
                    double nPrecio = 0;
                    if (scanner.hasNextDouble()) {
                        nPrecio = scanner.nextDouble();
                        scanner.nextLine();
                    } else {
                        scanner.nextLine();
                        System.out.println("Precio inválido.");
                        break;
                    }
                    System.out.print("Cantidad inicial: ");
                    int nCantidad = 0;
                    if (scanner.hasNextInt()) {
                        nCantidad = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        scanner.nextLine();
                        System.out.println("Cantidad inválida.");
                        break;
                    }
                    alm.registrarProducto(inventario, nCodigo, nNombre, nCategoria, nProveedor, nPrecio, nCantidad);
                    break;
                case 5:
                    enAlmacen = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}