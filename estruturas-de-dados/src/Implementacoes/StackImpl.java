package Implementacoes;

import java.util.Stack;


public class StackImpl {
    public static void main(String[] args) {
        Stack<Carro> pilhaCarro = new Stack<>();

        pilhaCarro.push(new Carro("A"));
        pilhaCarro.push(new Carro("D"));
        pilhaCarro.push(new Carro("B"));
        pilhaCarro.push(new Carro("C"));

        System.out.println(pilhaCarro);
        pilhaCarro.pop();
        System.out.println(pilhaCarro);

        System.out.println(pilhaCarro.peek());



    }
    
}