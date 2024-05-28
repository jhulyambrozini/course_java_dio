package Pilhas;

public class Main {
  public static void main(String[] args) {
    Pilha pilha = new Pilha();

    pilha.push(new No(1));
    pilha.push(new No(2));
    pilha.push(new No(3));
    pilha.push(new No(4));
    pilha.push(new No(5));

    // dado1 <- dado2 <- dado3 <- dado4 <- dado5
    System.out.println(pilha);

    pilha.pop();

    // dado1 <- dado2 <- dado3 <- dado4
    System.out.println(pilha);

  }
}
