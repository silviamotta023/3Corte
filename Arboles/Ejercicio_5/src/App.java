import java.util.Scanner;

public class App {

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArbolR arbol = new ArbolR();

        int opcion;

        do {

            System.out.println("\nInventario Taller");
            System.out.println("1. Registrar repuesto");
            System.out.println("2. Backup en PreOrden");
            System.out.println("3. Reporte repuestos unicos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese codigo de referencia: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese descripcion: ");
                    String descripcion = scanner.nextLine();

                    System.out.print("Ingrese marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Ingrese stock: ");
                    int stock = scanner.nextInt();

                    arbol.insertar(codigo, descripcion, marca, stock);

                    System.out.println("Repuesto registrado");

                    break;

                case 2:

                    arbol.backupPreOrden();

                    break;

                case 3:

                    arbol.reporteRepuestosUnicos();

                    break;

                case 4:

                    System.out.println("Saliendo del sistema");

                    break;

                default:

                    System.out.println("Opcion invalida");
            }

        } while (opcion != 4);

        scanner.close();
    }
  
}
