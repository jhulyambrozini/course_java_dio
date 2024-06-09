public class ListaEncadeada<T> {
    No<T> refEntrada;

    ListaEncadeada(){
        this.refEntrada = null;
    }

    public boolean isEmpty(){
        return refEntrada == null ? true : false;
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> refAux = refEntrada;

        while (true) {
            if(refAux != null){
                tamanhoLista++;
                if(refAux.nexNo != null){
                    refAux = refAux.nexNo;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        // se  alista estiver vazia a entrada recebe o
        // novo no criado e para
        if(this.isEmpty()){
            refEntrada = novoNo;
            return;
        }

        // se não salvo a refEntrada rm um nó auxilar
        No<T> noAux = refEntrada;

        // o no aux vai recebendo o proximo no loop
        for(int i = 0; i < this.size()-1; i++){
            noAux = noAux.nexNo;
        }

        // por fim o proximo no do no auxiliar
        // recebe o novo no
        noAux.nexNo = novoNo;
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);

        if(index == 0){
            // a referencia de entrada é
            // apontada para o segundo no da lista
            // assim o primeiro item da lista é removido
            refEntrada = noPivor.nexNo;
            return noPivor.conteudo;
        } 
        No<T> noAnterior = getNo(index - 1);
        // referencia do no anterior exem: 2, é setada para o
        // o proximo no do indice passado, logo a referencia para
        // esse indice deixa de exitir e ele é removido da lista
        noAnterior.nexNo = noPivor.nexNo;

        return noPivor.conteudo;
    }

    public T get(int index){
        return getNo(index).conteudo;
    }

    private No<T> getNo(int index){

        valiadIndice(index);
       
        No<T> noAux = refEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i <= index ; i++){
            noRetorno = noAux;
            noAux = noAux.nexNo;
        }

        return noRetorno;

    }

    private void valiadIndice(int index){
        if(index >= this.size()){
            int ultimoIndice = this.size()- 1;
            throw new IndexOutOfBoundsException("não existe conteudo no indice " + index + " nesta lista. Esta lista só vai até o indice " + ultimoIndice);
        }
    }

    @Override
    public String toString() {
        String str = "";

        No<T> noAuxiliar = refEntrada;

        for(int i = 0; i < this.size(); i++){
            str += "No [conteudo = " + noAuxiliar.conteudo + "] ==> ";
            noAuxiliar = noAuxiliar.nexNo;
        }
         str += "null";

        return str;
    }

    
}
