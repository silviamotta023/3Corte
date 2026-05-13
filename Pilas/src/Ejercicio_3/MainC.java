package Ejercicio_3;

import java.util.Scanner;

public class MainC {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaCamiones pila = new PilaCamiones();

        int opcion;

        do {

            System.out.println("\nMenu");
            System.out.println("1. Agregar camión");
            System.out.println("2. Mostrar camiones");
            System.out.println("3. Calcular carga total");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Placa del camión: ");
                    String placa = scanner.nextLine();

                    System.out.print("Nombre del conductor: ");
                    String conductor = scanner.nextLine();

                    System.out.print("Carga en toneladas: ");
                    double carga = scanner.nextDouble();

                    pila.push(placa, conductor, carga);

                    break;

                case 2:

                    pila.mostrarPila();

                    break;

                case 3:

                    double total = pila.calcularCargaTotal();

                    System.out.println("\nCarga total en el callejón: "+ total + " toneladas");

                    break;

                case 4:

                    System.out.println("Programa finalizado");

                    break;

                default:

                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        scanner.close();
    }

}
