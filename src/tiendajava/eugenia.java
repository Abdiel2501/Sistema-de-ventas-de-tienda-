package tiendajava;

import java.util.Scanner;

public class eugenia {
    public void iniciarMenu(Inventario inventario, Caja caja, supervisor elSupervisor, almacenista pancho, Cajero pedro) {
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
                    elSupervisor.registrarNuevoProducto(inventario, codigo, nombre, categoria, proveedor, precio, cantidad);
                    break;
                case 2:
                    elSupervisor.consultarBajoStock(inventario);
                    break;
                case 3:
                    elSupervisor.consultarCantidadTotal(inventario);
                    break;
                case 4:
                    elSupervisor.supervisarEmpleados(pancho, pedro);
                    break;
                case 5:
                    elSupervisor.registrarGanancias(caja);
                    break;
                case 6:
                    System.out.print("Codigo del producto: ");
                    String codPerdida = scanner.nextLine();
                    System.out.print("Cantidad perdida: ");
                    int cantPerdida = scanner.nextInt();
                    scanner.nextLine();
                    elSupervisor.reportarPerdidas(inventario, codPerdida, cantPerdida);
                    break;
                case 7:
                    elSupervisor.generarReporte(inventario, caja);
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
