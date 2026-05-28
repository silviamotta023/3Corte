import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArbolE arbol = new ArbolE();

        int opcion;

        do {

            System.out.println("\nMenú  Nomina Recursos Humanos ");
            System.out.println("1. Insertar empleado");
            System.out.println("2. Buscar empleado con menor cedula");
            System.out.println("3. Buscar empleado con mayor cedula");
            System.out.println("4. Reporte de eficiencia");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese cedula: ");
                    long cedula = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Ingrese nombre completo: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese cargo: ");
                    String cargo = scanner.nextLine();

                    System.out.print("Ingrese salario: ");
                    double salario = scanner.nextDouble();

                    arbol.insertar(cedula, nombre, cargo, salario);

                    System.out.println("Empleado registrado");

                    break;

                case 2:

                    arbol.buscarMinimo();

                    break;

                case 3:

                    arbol.buscarMaximo();

                    break;

                case 4:

                    arbol.reporteEficiencia();

                    break;

                case 5:

                    System.out.println("Saliendo del sistema");

                    break;

                default:

                    System.out.println("Opcion invalida");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
