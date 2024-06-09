public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.add("1");
        listaEncadeada.add("2");
        listaEncadeada.add("3");
        listaEncadeada.add("4");

        System.out.println(listaEncadeada.get(0));

        System.out.println(listaEncadeada);
        System.out.println("conteudo removido: " + listaEncadeada.remove(3));

        System.out.println("======================");
        System.out.println(listaEncadeada);


    }
}
