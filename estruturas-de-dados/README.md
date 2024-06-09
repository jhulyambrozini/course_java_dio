# Estrutura de dados com Java

### Atribuição e referência

- Em java quando se atribui uma variavel (A) outra variavel (B) que tem tipo primitivo (integer, string, float...)
  é feita uma cópia do valor em bytes do valor de A para B, logo se o valor de A mudar a váriavel B não muda.

- Quando essa atribuição é feita utilizando objetos, por exemplo, o objeto B recebe por atribuição o objeto A,
  em java é feita uma atribuição do endereço de memória do objeto A para o objeto B, logo se um valor do objeto A mudar o objeto B muda junto, pois ambas possuem a mesma referência de memória.

### Conceito de Nó

- Nó é um espaço em memória que aramzena o dado e uma referência para um próximo nó na memória

#### Encadeamneto de nó

![Encadeamneto de nó](estrutura-de-dados/assets/encadeamento-no.png)

### Pilhas

- O último elemento a entrar é o primerio a sair (LIFO - Last In, First Out)
- Nesse caso a referencia de proximo no é de o de cima (ultimo adicionado) apontando para o de baixo (no que ja estava na pilha)
- Metodos: Top, Pop (remove o elemento do topo), Push (adiciona um elemento no topo), IsEmpty

### Filas

- First in, Fisrt out (FIFO): O primeiro a entrar é o primeiro a sair
- Metodos: enqueue (enfilerar), dequeue (desenfilerar), isEmty

### Listas encadeadas
- Metodos: add (adição aleatória), remove (remoção de qualquer item da lista), get (pega uma referencai do nó sem excluir)