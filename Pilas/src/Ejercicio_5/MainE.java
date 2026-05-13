package Ejercicio_5;

import java.util.Scanner;

public class MainE {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaEstaciones pila =
                new PilaEstaciones();

        int opcion;

        do {

            System.out.println("\nMenu");
            System.out.println("1. Agregar estación");
            System.out.println("2. Mostrar estaciones");
            System.out.println("3. Retroceder a superficie");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre del punto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Profundidad (m): ");
                    int profundidad = scanner.nextInt();

                    System.out.print("Nivel de oxígeno (%): ");
                    double oxigeno = scanner.nextDouble();

                    pila.push(nombre,profundidad,oxigeno);

                    break;

                case 2:

                    pila.mostrarPila();

                    break;

                case 3:

                    pila.retrocederASuperficie();

                    break;

                case 4:

                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }

}
