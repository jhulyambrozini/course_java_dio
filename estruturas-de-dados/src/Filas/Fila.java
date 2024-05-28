package Filas;

public class Fila<T> {
  private No<T> refNoEntradaFila;

  public Fila() {
    refNoEntradaFila = null;
  }

  public boolean isEmpty() {
    return refNoEntradaFila == null ? true : false;
  }

  public void enqueue(T obj) {
    No<T> novoNo = new No<T>(obj);
    novoNo.refNo = refNoEntradaFila;
    refNoEntradaFila = novoNo;
  }

  public Object firts() {
    if (!isEmpty()) {
      No<T> primeiroNo = refNoEntradaFila;

      while (true) {
        if (primeiroNo.refNo != null) {
          primeiroNo = primeiroNo.refNo;
        } else {
          break;
        }
      }
      return primeiroNo.object;
    }
    return null;
  }

  public Object dequeue() {
    if (!isEmpty()) {
      No<T> primeiroNo = refNoEntradaFila;
      No<T> noAuxiliar = refNoEntradaFila;

      while (true) {
        if (primeiroNo.refNo != null) {
          noAuxiliar = primeiroNo;
          primeiroNo = primeiroNo.refNo;
        } else {
          noAuxiliar.refNo = null;
          break;
        }
      }
      return primeiroNo.object;
    }
    return null;
  }

  @Override
  public String toString() {
    String stringRetorno = "===========\n";
    stringRetorno += "   Fila\n";
    stringRetorno += "===========\n";

    No<T> noAuxiliar = refNoEntradaFila;

    if (refNoEntradaFila != null) {

      while (true) {
        stringRetorno += "[No{object=" + noAuxiliar.object + "}]--->";

        if (noAuxiliar.refNo != null) {
          noAuxiliar = noAuxiliar.refNo;

        } else {
          stringRetorno += "null";
          break;
        }
      }

    } else {
      stringRetorno += "null";
    }
    stringRetorno += "\n== final ==\n";
    return stringRetorno;
  }
}
