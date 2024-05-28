package No;

public class No<T> {
  public T conteudo;
  public No<T> proximoNo;

  public No(T conteudo) {
    this.proximoNo = null;
    this.conteudo = conteudo;
  }

  @Override
  public String toString() {
    return "No [conteudo=" + conteudo + "]";
  }
}
