package ListasCirculares;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public boolean isEmpty(){
        return tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return tamanhoLista;
    }

    public T get(int index){
        return getNo(index).conteudo;
    }

    public void remove(int index){
        if(index >= tamanhoLista){
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista.");
        }
        No<T> noAuxiliar = this.cauda;
        if(index == 0){
            this.cauda = this.cauda.noProximo;
            this.cabeca.noProximo = this.cauda;
        } else if(index == 1){
            this.cauda.noProximo = this.cauda.noProximo.noProximo;
        } else {
            for(int i = 0; i < index - 1; i++){
                noAuxiliar = noAuxiliar.noProximo;
            }

            noAuxiliar.noProximo = noAuxiliar.noProximo.noProximo;
        }
        tamanhoLista--;  
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        if(tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.noProximo = cauda;
        } else {
            novoNo.noProximo = this.cauda;
            this.cabeca.noProximo = novoNo;
            this.cauda = novoNo;
        }

        this.tamanhoLista++;
    }

    private No<T> getNo(int index){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("A lista esta vazia");
        }

        if(index == 0) return cauda;

        No<T> noAuxiliar = cauda;

        for(int i = 0; i < index; i++){
            noAuxiliar = noAuxiliar.noProximo;
        }

        return noAuxiliar;
    }

    @Override
    public String toString() {
        String str = "";
        No<T> noAuxiliar = this.cauda;

        for(int i = 0; i < size(); i++){
            str += "No [conteudo = " + noAuxiliar.conteudo + "]-->";
            noAuxiliar = noAuxiliar.noProximo;
        }

        str += this.size() != 0 ? "(retorna ao inicio)" : "[]";
        return str;
       
    }

    
}
