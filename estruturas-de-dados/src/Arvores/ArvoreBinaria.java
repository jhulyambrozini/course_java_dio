package Arvores;

public class ArvoreBinaria<T extends Comparable<T>> {
    private BiNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BiNo<T> novoNo = new BiNo<T>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BiNo<T> inserir(BiNo<T> atual, BiNo<T> novoNo){
        if(atual == null){
            return novoNo;
        } else if(novoNo.conteudo.compareTo(atual.conteudo) < 0){
            atual.noEsquerda = inserir(atual.noEsquerda, novoNo);
        } else {
            atual.noDireita = inserir(atual.noDireita, novoNo); 
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\n Exibindo em ordem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BiNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.noEsquerda);
            System.out.print(atual.conteudo + ", ");
            exibirInOrdem(atual.noDireita);
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo pos ordem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BiNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.noEsquerda);
            exibirPosOrdem(atual.noDireita);
            System.out.print(atual.conteudo + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo pre ordem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BiNo<T> atual){
        if(atual != null){
            System.out.print(atual.conteudo + " ,");
            exibirPreOrdem(atual.noEsquerda);
            exibirPreOrdem(atual.noDireita);
        }
    }

    public void remove(T conteudo){
        try {
            BiNo<T> atual = raiz;
            BiNo<T> pai = null;
            BiNo<T> filho = null;
            BiNo<T> temp = null;

            while (atual != null && atual.conteudo.equals(conteudo)) {
                pai = atual;
                if(conteudo.compareTo(atual.conteudo) < 0){
                    atual = atual.noEsquerda;
                } else {
                    atual = atual.noDireita;
                }
            }

            if(atual == null){
                System.out.println("Conteudo nao encontardo: bloco try.");
            }

            // quando esta na raiz
            if(pai == null){
                if(atual.noDireita == null){
                    this.raiz = atual.noEsquerda;
                } else if(atual.noEsquerda == null){
                    this.raiz = atual.noDireita;

                } else {
                    for(
                        temp = atual, filho = atual.noEsquerda;
                        filho.noDireita != null;
                        temp = filho, filho = filho.noEsquerda
                    ){
                        if(filho != atual.noEsquerda){
                            temp.noDireita = filho.noEsquerda;
                            filho.noEsquerda = raiz.noEsquerda;
                        }
                    }

                    filho.noDireita = raiz.noDireita;
                    raiz = filho;
                }
            } else if(atual.noDireita == null){ // refrenecia a direita ser null
                if(pai.noEsquerda == atual){
                    pai.noEsquerda = atual.noEsquerda;
                } else {
                    pai.noDireita = atual.noEsquerda;
                }
            } else if(atual.noEsquerda == null){ // ref esquerda ser null
                if(pai.noEsquerda == atual){
                    pai.noEsquerda = atual.noDireita;
                } else {
                    pai.noDireita = atual.noDireita;
                }
            } else {
                for(
                    temp = atual, filho = atual.noEsquerda;
                    filho.noDireita != null;
                    temp = filho,
                    filho = filho.noDireita
                ){
                    if(filho != atual.noEsquerda){
                        temp.noDireita = filho.noEsquerda;
                        filho.noEsquerda = atual.noEsquerda;
                    }
                    filho.noDireita = atual.noDireita;

                    if(pai.noEsquerda == atual){
                        pai.noEsquerda = filho;
                    } else {
                        pai.noDireita = filho;
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Conteudo nao encontardo: bloco catch.");
        }
    }
    
}
