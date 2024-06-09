package ListasCirculares;

public class No<T> {
    public T conteudo;
    public No<T> noProximo;

    public No(T conteudo) {
        this.noProximo = null;
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }
    
}
