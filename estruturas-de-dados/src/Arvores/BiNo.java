package Arvores;

public class BiNo<T extends Comparable<T>> {
    public T conteudo;
    public BiNo<T> noEsquerda;
    public BiNo<T> noDireita;

    public BiNo(T conteudo){
        this.conteudo = conteudo;
        this.noEsquerda = this.noDireita = null;
    }

    @Override
    public String toString() {
        return "BiNo [conteudo=" + conteudo + "]";
    }
}
