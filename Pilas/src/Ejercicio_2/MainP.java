package Ejercicio_2;

import java.util.Scanner;

public class MainP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pila pila = new Pila();

        int opcion;

        do {

            System.out.println("\nMenu");
            System.out.println("1. Agregar pieza");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Limpiar hasta defecto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre de la pieza: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Número de serie: ");
                    String serie = scanner.nextLine();

                    System.out.print("Es defectuosa? (true o false): ");
                    boolean defectuosa = scanner.nextBoolean();

                    pila.push(nombre, serie, defectuosa);

                    break;

                case 2:

                    pila.mostrarPila();

                    break;

                case 3:

                    pila.limpiarHastaDefecto();

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
