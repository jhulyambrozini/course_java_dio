package ListasCirculares;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();

        listaCircular.add("c0");

        System.out.println(listaCircular);

        listaCircular.remove(0);

        System.out.println(listaCircular);

        listaCircular.add("c1");
        listaCircular.add("c2");

        System.out.println(listaCircular);

        
        for(int i = 0; i < 5; i++){
        System.out.println(listaCircular.get(i));

        }



    }
}
