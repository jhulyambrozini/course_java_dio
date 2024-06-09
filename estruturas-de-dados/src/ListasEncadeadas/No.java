public class No<T> {

    public T conteudo;
    public No<T> nexNo;

    public No(T conteudo, No<T> nexNo) {
        this.conteudo = conteudo;
        this.nexNo = nexNo;
    }

    public No() {
        this.nexNo = null;
    }

    public No(T conteudo) {
        this.nexNo = null;
        this.conteudo = conteudo;
    }

       
@Override
public String toString() {
    return "No [conteudo=" + conteudo + "]";
}

public String toStringEncadeado() {
    String str = "No [conteudo=" + conteudo + "]";
    if(nexNo != null){
        str += "--> " + nexNo.toString();
    } else {
        str += "--> null";
    }

    return str;
}
}