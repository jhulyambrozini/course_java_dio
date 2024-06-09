package Arvores.model;

public class Obj extends ObjArvore<Obj>{

    Integer meuInteger;
    

    public Obj(Integer meuInteger) {
        this.meuInteger = meuInteger;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((meuInteger == null) ? 0 : meuInteger.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Obj other = (Obj) obj;
        if (meuInteger == null) {
            if (other.meuInteger != null)
                return false;
        } else if (!meuInteger.equals(other.meuInteger))
            return false;
        return true;
    }



    @Override
    public int compareTo(Obj outro) {
       int i = 0;

       if(meuInteger > outro.meuInteger){
         i = 1;

       } else if(meuInteger < outro.meuInteger){
         i = -1;
       } 

       return i;
    }

    @Override
    public String toString() {
        return meuInteger.toString();
    }
    
}
