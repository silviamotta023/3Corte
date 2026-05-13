package Ejercicio_5;

public class PilaEstaciones {

     private Estacion tope;


    public PilaEstaciones() {
        tope = null;
    }

    // Método push
    public void push(String nombrePunto,int profundidad, double nivelOxigeno) {

        Estacion nueva =new Estacion(nombrePunto, profundidad, nivelOxigeno);

        nueva.siguiente = tope;
        tope = nueva;

        System.out.println("Estación agregada correctamente.");
    }


    public Estacion pop() {

        if (tope == null) {
            return null;
        }

        Estacion aux = tope;
        tope = tope.siguiente;

        return aux;
    }

   
    public void mostrarPila() {

        if (tope == null) {

            System.out.println("No hay estaciones registradas");
            return;
        }

        Estacion aux = tope;

        System.out.println("\nEstaciones");

        while (aux != null) {

            System.out.println("Punto: " + aux.nombrePunto);
            System.out.println("Profundidad: " + aux.profundidad + " metros");
            System.out.println("Nivel de oxígeno: " + aux.nivelOxigeno + "%");

            System.out.println("------");

            aux = aux.siguiente;
        }
    }

   
    public void retrocederASuperficie() {

        if (tope == null) {

            System.out.println("No hay estaciones en la pila");
            return;
        }

        System.out.println("\nRetroceso hacia la superficie");

        while (tope != null) {

            Estacion actual = pop();

            System.out.println("\nPasando por estación: "+ actual.nombrePunto);

            System.out.println("Profundidad: "+ actual.profundidad + " metros");

            System.out.println("Nivel de oxígeno: "+ actual.nivelOxigeno + "%");

            if (actual.nivelOxigeno < 18) {

                System.out.println( "ALERTA: Uso de Tanque de Emergencia Requerido");
            }
        }

        System.out.println("\nEl equipo ha llegado a la superficie");
    }

}
