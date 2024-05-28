package Pilhas;

public class Pilha {
  private No refNoEntradaPilha = null;

  public boolean isEmpty() {
    if (refNoEntradaPilha == null) {
      return true;
    }
    return false;
  }

  public No top() {
    return refNoEntradaPilha;
  }

  public void push(No novoNo) {
    No refAuxiliar = refNoEntradaPilha;
    refNoEntradaPilha = novoNo;
    refNoEntradaPilha.refNo = refAuxiliar;
  }

  public No pop() {
    if (!isEmpty()) {
      No noPoped = refNoEntradaPilha;
      refNoEntradaPilha = refNoEntradaPilha.refNo;
      return noPoped;
    }
    return null;
  }

  @Override
  public String toString() {
    String stringRetorno = "===========\n";
    stringRetorno += "   Pilha\n";
    stringRetorno += "===========\n";

    No noAuxiliar = refNoEntradaPilha;

    while (true) {
      if (noAuxiliar != null) {
        stringRetorno += "[No{dado=" + noAuxiliar.dado + "}]\n";
        noAuxiliar = noAuxiliar.refNo;
      } else {
        break;
      }
    }
    stringRetorno += "== final ==\n";
    return stringRetorno;
  }

}
