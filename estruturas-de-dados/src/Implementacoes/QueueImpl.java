package Implementacoes;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        // retorna um erro se não consegui adicionar o elemento
        queueCarros.add(new Carro("A"));
        queueCarros.add(new Carro("D"));
        queueCarros.add(new Carro("E"));
        queueCarros.add(new Carro("C"));

        System.out.println(queueCarros);

        // retorna um bool se o elemento foi adicioando 
        System.out.println(queueCarros.offer(new Carro("m")));

        System.out.println(queueCarros.poll());
    }
}
