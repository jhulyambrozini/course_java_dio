package ListaDuplamenteEncadeada;

public class NoDuplo<T> {
    public T conteudo;
    public NoDuplo<T> noProximo;
    public NoDuplo<T> noAnteriro;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "NoDuplo [conteudo=" + conteudo + "]";
    }
    

}
