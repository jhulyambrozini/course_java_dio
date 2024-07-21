package Implementacoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {
    public static void main(String[] args) {
        Set<Carro> collSet = new HashSet<>();

        collSet.add(new Carro("1"));
        collSet.add(new Carro("2"));
        collSet.add(new Carro("31"));
        collSet.add(new Carro("7"));

        System.out.println(collSet);

        Set<Carro> treeCarro = new TreeSet<>();

        treeCarro.add(new Carro("ford"));
        treeCarro.add(new Carro("fiate"));
        treeCarro.add(new Carro("wasvager"));
        treeCarro.add(new Carro("a"));


        System.out.println(treeCarro);


    }
}
