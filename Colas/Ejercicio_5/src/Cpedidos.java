public class Cpedidos {

    private Pedido frente,fin;

    public Cpedidos(){
        frente=null;
        fin=null;
    }

    public void agregarPedido(String numero,String cliente,double total,boolean cancelado){
        Pedido nuevo=new Pedido(numero,cliente,total,cancelado);

        if(frente==null){
            frente=nuevo;
            fin=nuevo;
        }else{
            fin.siguiente=nuevo;
            fin=nuevo;
        }

        System.out.println("Pedido agregado");
    }

    public Pedido extraerPedido(){
        if(frente==null)
            return null;

        Pedido aux=frente;
        frente=frente.siguiente;

        if(frente==null)
            fin=null;

        return aux;
    }

    public void mostrarPedidos(){
        if(frente==null){
            System.out.println("No hay pedidos");
            return;
        }

        Pedido aux=frente;

        while(aux!=null){
            System.out.println("Pedido: "+aux.numeroPedido);
            System.out.println("Cliente: "+aux.cliente);
            System.out.println("Total: "+aux.totalPagar);
            System.out.println("Cancelado: "+aux.cancelado);
            System.out.println("----");

            aux=aux.siguiente;
        }
    }

    public void procesarPedidos(){
        int despachados=0,cancelados=0;

        while(frente!=null){

            Pedido p=extraerPedido();

            if(p.cancelado){
                System.out.println("Pedido cancelado: "+p.numeroPedido);
                cancelados++;
            }else{
                System.out.println("Pedido despachado");
                System.out.println("Numero: "+p.numeroPedido);
                System.out.println("Cliente: "+p.cliente);
                System.out.println("Total: "+p.totalPagar);

                despachados++;
            }
        }

        System.out.println("Total despachados: "+despachados);
        System.out.println("Total cancelados: "+cancelados);
    }

}
