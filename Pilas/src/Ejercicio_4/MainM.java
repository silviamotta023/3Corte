package Ejercicio_4;

import java.util.Scanner;

public class MainM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaMedicamentos pila =
                new PilaMedicamentos();

        int opcion;

        do {

            System.out.println("\nMenu");
            System.out.println("1. Agregar medicamento");
            System.out.println("2. Mostrar medicamentos");
            System.out.println("3. Validar despacho");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Lote: ");
                    String lote = scanner.nextLine();

                    System.out.print("Días para vencer: ");
                    int dias = scanner.nextInt();

                    pila.push(nombre, lote, dias);

                    break;

                case 2:

                    pila.mostrarPila();

                    break;

                case 3:

                    pila.validarDespacho();

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
