package Filas;

public class No<T> {
  public T object;
  public No<T> refNo;

  public No(T object) {
    this.refNo = null;
    this.object = object;
  }

  @Override
  public String toString() {
    return "No [object=" + object + "]";
  }
}
