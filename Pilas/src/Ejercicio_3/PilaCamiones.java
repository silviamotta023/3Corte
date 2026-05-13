package Ejercicio_3;

public class PilaCamiones {

    private Camion tope;


    public PilaCamiones() {
        tope = null;
    }


    public void push(String placa, String conductor, double cargaToneladas) {

        Camion nuevo = new Camion(placa, conductor, cargaToneladas);

        nuevo.siguiente = tope;
        tope = nuevo;

        System.out.println("Camión agregado correctamente");
    }


    public Camion pop() {

        if (tope == null) {
            return null;
        }

        Camion aux = tope;
        tope = tope.siguiente;

        return aux;
    }

    public void mostrarPila() {

        if (tope == null) {
            System.out.println("No hay camiones en el callejón");
            return;
        }

        Camion aux = tope;

        System.out.println("\nCamiones en el callejón");

        while (aux != null) {

            System.out.println("Placa: " + aux.placa);
            System.out.println("Conductor: " + aux.conductor);
            System.out.println("Carga: " + aux.cargaToneladas + " toneladas");
            System.out.println("------");

            aux = aux.siguiente;
        }
    }


    public double calcularCargaTotal() {

        if (tope == null) {
            return 0;
        }

        double suma = 0;


        PilaCamiones auxiliar = new PilaCamiones();

        while (tope != null) {

            Camion actual = pop();

            suma += actual.cargaToneladas;

            auxiliar.push(
                actual.placa,
                actual.conductor,
                actual.cargaToneladas
            );
        }

        while (auxiliar.tope != null) {

            Camion actual = auxiliar.pop();

            push(
                actual.placa,
                actual.conductor,
                actual.cargaToneladas
            );
        }

        return suma;
    }

}
