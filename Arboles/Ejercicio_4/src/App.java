import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArbolJ arbol = new ArbolJ();

        int opcion;

        do {

            System.out.println("\nTorneo de Ajedrez");
            System.out.println("1. Registrar jugador");
            System.out.println("2. Listar jugadores por rango ELO");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese ELO: ");
                    int elo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese nombre de usuario: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese pais: ");
                    String pais = scanner.nextLine();

                    System.out.print("Ingrese partidas jugadas: ");
                    int partidas = scanner.nextInt();

                    arbol.insertar(elo, nombre, pais, partidas);

                    System.out.println("Jugador registrado.");

                    break;

                case 2:

                    System.out.print("Ingrese ELO minimo: ");
                    int min = scanner.nextInt();

                    System.out.print("Ingrese ELO maximo: ");
                    int max = scanner.nextInt();

                    arbol.listarEnRango(min, max);

                    break;

                case 3:

                    System.out.println("Saliendo del sistema");

                    break;

                default:

                    System.out.println("Opcion invalida");
            }

        } while (opcion != 3);

        scanner.close();
    }
}
