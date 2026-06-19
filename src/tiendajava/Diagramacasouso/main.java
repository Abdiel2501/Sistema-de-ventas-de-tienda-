package Tienda;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;
        boolean iniciada = false;

        do {
            System.out.println("\ninniciar la sesion");
            System.out.print("Ingresa el id: ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("Ingresa tu contraseña: ");
            String contraseña = sc.nextLine();

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
                System.out.println("Id o contraseña incorrectos");
            }

        } while (!iniciada);

        System.out.println("\nSesión iniciada con éxit,bienenvenido usuario número: " + eleccion);
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