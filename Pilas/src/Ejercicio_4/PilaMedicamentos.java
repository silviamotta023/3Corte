package Ejercicio_4;

public class PilaMedicamentos {

    private Medicamento tope;

    public PilaMedicamentos() {
        tope = null;
    }


    public void push(String nombre, String lote, int diasParaVencer) {

        Medicamento nuevo =
                new Medicamento(nombre, lote, diasParaVencer);

        nuevo.siguiente = tope;
        tope = nuevo;

        System.out.println("Medicamento agregado correctamente");
    }

    public Medicamento pop() {

        if (tope == null) {
            return null;
        }

        Medicamento aux = tope;
        tope = tope.siguiente;

        return aux;
    }


    public void mostrarPila() {

        if (tope == null) {
            System.out.println("La pila está vacía");
            return;
        }

        Medicamento aux = tope;

        System.out.println("\nMedicamentos");

        while (aux != null) {

            System.out.println("Nombre: " + aux.nombre);
            System.out.println("Lote: " + aux.lote);
            System.out.println("Días para vencer: "+ aux.diasParaVencer);

            System.out.println("-----");

            aux = aux.siguiente;
        }
    }


    public void validarDespacho() {

        if (tope == null) {

            System.out.println("No hay medicamentos");
            return;
        }


        while (tope != null && tope.diasParaVencer < 10) {

            Medicamento eliminado = pop();

            System.out.println("\nMedicamento retirado:");
            System.out.println("Nombre: " + eliminado.nombre);
            System.out.println("Lote: " + eliminado.lote);
            System.out.println("Motivo: Próximo a vencer");
        }

    
        if (tope == null) {

            System.out.println("\nNo quedan medicamentos seguros.");
        } else {

            System.out.println("\nMedicamento seguro para despacho:");
            System.out.println("Nombre: " + tope.nombre);
            System.out.println("Lote: " + tope.lote);
            System.out.println("Días para vencer: " + tope.diasParaVencer);
        }
    }

}
