package ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {
   private NoDuplo<T> primeiroNo;
   private NoDuplo<T> ultimoNo;

   private int tamanhoLista = 0;

   public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return tamanhoLista;
    }

    public T get(int index){
      return  getNo(index).conteudo;
    }

    public void add(T conteudo){
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);

        novoNo.noProximo = null;
        novoNo.noAnteriro = ultimoNo;

        if(primeiroNo == null){
            primeiroNo = novoNo;
        }

        if(ultimoNo !=  null){
            ultimoNo.noProximo = novoNo;
        }

        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxliar = getNo(index);

        NoDuplo<T> novoNo = new NoDuplo<>(elemento);

        novoNo.noProximo = noAuxliar;

        if(novoNo.noProximo != null){
            novoNo.noAnteriro = noAuxliar.noAnteriro;
            novoNo.noProximo.noAnteriro = novoNo;
        } else {
            novoNo.noAnteriro = ultimoNo;
            ultimoNo = novoNo;
        }

        if(index == 0){
            primeiroNo = novoNo;
        } else {
            novoNo.noAnteriro.noProximo = novoNo;

        }

        tamanhoLista++;
    }

    public void remove(int index ){
        if(index == 0){
            primeiroNo = primeiroNo.noProximo;
            if(primeiroNo != null){
                primeiroNo.noAnteriro = null;
            }
        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.noAnteriro.noProximo = noAuxiliar.noProximo;

            if(noAuxiliar != ultimoNo){
                noAuxiliar.noProximo.noAnteriro = noAuxiliar.noAnteriro;
            } else {
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;

    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.noProximo;
        }

        return noAuxiliar;
    }

    @Override
    public String toString() {
        String str = "";

        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; i < size(); i++){
            str += "No [conteudo=" + noAuxiliar.conteudo + "] ==> ";
            noAuxiliar = noAuxiliar.noProximo;
        }
        str += "null";
        return str;
    }
}
