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

        do {
            System.out.println("\n=== INICIAR SESIÓN ===");
            System.out.print("Ingresa el id: ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("Ingresa tu contraseña: ");
            String contraseña = sc.nextLine(); // Ahora sí leerá el texto real

            if (id == 1 && contraseña.equals("pedro")) {
                eleccion = 1;
                iniciada = true;
            } else if (id == 2 && contraseña.equals("pancho")) {
                eleccion = 2;
                iniciada = true;
            } else if (id == 3 && contraseña.equals("eugenia")) {
                eleccion = 3;
                iniciada = true;
            } else {
                System.out.println("Id o contraseña incorrectos. Intenta de nuevo.");
            }

        } while (!iniciada);

        System.out.println("\nSesión iniciada con éxito. Bienvenido usuario número: " + eleccion);
        switch (eleccion) {
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }

    }
}