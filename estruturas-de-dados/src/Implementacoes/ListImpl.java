package Implementacoes;

import java.util.ArrayList;
import java.util.List;


public class ListImpl {
    public static void main(String[] args) {
        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add( new Carro("8"));
        listaCarro.add( new Carro("1"));
        listaCarro.add( new Carro("2"));
        listaCarro.add( new Carro("3"));

        System.out.println(listaCarro);

        System.out.println(listaCarro.get(0));



    }
}
