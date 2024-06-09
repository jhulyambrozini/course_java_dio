# Estrutura de dados com Java

### Atribuição e referência

- Em java quando se atribui uma variavel (A) outra variavel (B) que tem tipo primitivo (integer, string, float...)
  é feita uma cópia do valor em bytes do valor de A para B, logo se o valor de A mudar a váriavel B não muda.

- Quando essa atribuição é feita utilizando objetos, por exemplo, o objeto B recebe por atribuição o objeto A,
  em java é feita uma atribuição do endereço de memória do objeto A para o objeto B, logo se um valor do objeto A mudar o objeto B muda junto, pois ambas possuem a mesma referência de memória.

### Conceito de Nó

- Nó é um espaço em memória que aramzena o dado e uma referência para um próximo nó na memória

#### Encadeamneto de nó

![Encadeamneto de nó](estrutura-de-dados/assets/encadeamento-Nó.png)

### Pilhas

- O último elemento a entrar é o primerio a sair (LIFO - Last In, First Out)
- Nesse caso a referencia de proximo Nó é de o de cima (ultimo adicionado) apontando para o de baixo (Nó que ja estava na pilha)
- Metodos: Top, Pop (remove o elemento do topo), Push (adiciona um elemento Nó topo), IsEmpty

### Filas

- First in, Fisrt out (FIFO): O primeiro a entrar é o primeiro a sair
- Metodos: enqueue (enfilerar), dequeue (desenfilerar), isEmty

### Listas encadeadas
- Metodos: add (adição Nó fim da lista), remove (remoção de qualquer item da lista), get (pega uma referencai do nó sem excluir)

### Listas duplamente encadeadas
- Nesse caso cada Nó tem duas referencias: uma para o proximo  Nó e a referencia para o Nó anterior
- Tembem tem uma referencia para entrada da lista e uma referencia para o fim da fila
- Metodos: add(el), remove(index), get(index), add(index, ele)

### Listas circulares
- A refrencia de proximo Nó do ultimo elemento da lista aponta para o primeiro Nó.
- possui uma cauda(primeiro Nó ==> refeEntrada), cabeça (ultimo Nó)
- Metodos: remove(), get(index), add(el), isEmpty()


### Arvores
- Estrutura de dados bidimensionais não lineares
- Nós que arazenam os dados com base em relações de dependencias.
- Utilização: sistemas de arquivos, banco de dados, interfaces graficas e paginas web
- Cateristicas de Arvore hierarquia: Nó, raiz, pai, irmão, nivel de um Nó, altura ou profundidade, folha, Nó interno, grau de um nó...
- Arvores binarias: nó menor a esquerda, nó maior a direita
- Exclusão: pega o maior elemento a esquerda do nó que quer excluir e o substitui.
- Exibição: Algoritmos recursivos.
- Atravessamneto in-ordem: visiat o nó a esquerda => imprime ele => visita o nó a direita
- Atravessamento em pre-ordem: Primeiro mostra araiz, vai pra esquerda e depois a direita em loop e vai exibindo
- Atravessamneto em pos-ordem: visita primeiro para depois exibir.