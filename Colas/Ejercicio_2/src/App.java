import java.util.Scanner;

public class App {
    public static void menu() {

        System.out.println("\nUrgencias Hospitalarias");

        System.out.println("1. Registrar paciente");

        System.out.println("2. Mostrar pacientes");

        System.out.println("3. Atender todos");

        System.out.println("4. Salir");

        System.out.print("Seleccione: ");
    }

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        Cpacientes cola =new Cpacientes();

        int opcion;

        do {

            menu();

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){

                case 1:

                    System.out.print( "Cedula: ");

                    String cedula = scanner.nextLine();

                    System.out.print( "Nombre completo: ");

                    String nombre =scanner.nextLine();

                    System.out.print( "Edad: ");

                    int edad = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Sintoma principal: ");

                    String sintoma =scanner.nextLine();

                    cola.registrarPaciente(cedula,nombre,edad,sintoma);

                    break;

                case 2:

                    cola.mostrarPacientes();

                    break;

                case 3:

                    cola.atenderTodos();

                    break;

                case 4:

                    System.out.println("\nFin del programa");

                    break;

                default:

                    System.out.println( "\nOpcion invalida");
            }

        } while(opcion != 4);

        scanner.close();
    }
    
}
