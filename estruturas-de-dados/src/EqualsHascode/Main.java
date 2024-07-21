package EqualsHascode;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("a"));
        listaCarro.add(new Carro("B"));
        listaCarro.add(new Carro("C"));
        listaCarro.add(new Carro("D"));

        System.out.println(listaCarro.contains(new Carro("a")));
        System.out.println(new Carro("B").hashCode());

    }
}
