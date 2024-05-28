package No;

public class Main {
    public static void main(String[] args) throws Exception {
        No<String> no1 = new No<String>("conteudo no1");
        No<String> no2 = new No<String>("conteudo no2");

        no1.proximoNo = no2;

        No<String> no3 = new No<String>("conteudo no3");

        no2.proximoNo = no3;

        No<String> no4 = new No<String>("conteudo no4");

        no3.proximoNo = no4;

        // no1->no2->no3->no4->null
        System.out.println("================");
        System.out.println(no1);
        System.out.println("proximo nó: " + no1.proximoNo);
        System.out.println("================");
        System.out.println(no2);
        System.out.println("proximo nó: " + no2.proximoNo);
        System.out.println("================");
        System.out.println(no3);
        System.out.println("proximo nó: " + no3.proximoNo);
        System.out.println("================");
        System.out.println(no4);
        System.out.println("proximo nó: " + no4.proximoNo);

    }
}
