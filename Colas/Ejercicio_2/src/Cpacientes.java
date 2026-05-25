public class Cpacientes {
    private Paciente frente;
    private Paciente fin;

    public Cpacientes() {
        frente = null;
        fin = null;
    }


    public void registrarPaciente(String cedula,String nombre,int edad,String sintoma) {

        Paciente nuevo = new Paciente(cedula,nombre,edad,sintoma);

        if (frente == null) {

            frente = nuevo;
            fin = nuevo;

        } else {

            fin.siguiente = nuevo;
            fin = nuevo;
        }

        System.out.println("\nPaciente agregado");
    }


    public Paciente atenderPaciente() {

        if (frente == null) {
            return null;
        }

        Paciente aux = frente;

        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return aux;
    }

    public void mostrarPacientes() {

        if (frente == null) {

            System.out.println("\nNo hay pacientes");
            return;
        }

        Paciente aux = frente;

        System.out.println("\nLista de espera");

        while (aux != null) {

            System.out.println("---");

            System.out.println("Cedula: "+ aux.cedula);

            System.out.println( "Nombre: "+ aux.nombreCompleto);

            System.out.println("Edad: "+ aux.edad);

            System.out.println("Sintoma: "+ aux.sintomaPrincipal);

            aux = aux.siguiente;
        }
    }

    public void atenderTodos() {

        int total = 0;

        if (frente == null) {

            System.out.println("\nNo hay pacientes.");
            return;
        }

        System.out.println(
            "\nAtencion de pacientes");

        while (frente != null) {

            Paciente p =atenderPaciente();

            System.out.println("\nPaciente atendido");

            System.out.println("Cedula: "+ p.cedula);

            System.out.println("Nombre: " + p.nombreCompleto);

            System.out.println("Edad: "+ p.edad);

            System.out.println("Sintoma: " + p.sintomaPrincipal);

            total++;
        }

        System.out.println("\nTotal atendidos: " + total);
    }

}
