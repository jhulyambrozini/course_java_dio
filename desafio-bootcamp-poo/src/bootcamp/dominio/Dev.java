package bootcamp.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
   public String nome;
   public Set<Conteudo> conteudosIncritos= new LinkedHashSet<>();
   public Set<Conteudo> conteudosConcluidos =  new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosIncritos.addAll(bootcamp.conteudos);
        bootcamp.devsInscritos.add(this);
    }

    public void progredir(){
      Optional<Conteudo> conteudo =  this.conteudosIncritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncritos.remove(conteudo.get());

        } else {
            System.out.println("Voce ão esta matriculado em nenhum conteudo");
        }
    }

    public double calcularTotalXP(){
      return  conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosIncritos == null) ? 0 : conteudosIncritos.hashCode());
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
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
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudosIncritos == null) {
            if (other.conteudosIncritos != null)
                return false;
        } else if (!conteudosIncritos.equals(other.conteudosIncritos))
            return false;
        if (conteudosConcluidos == null) {
            if (other.conteudosConcluidos != null)
                return false;
        } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
            return false;
        return true;
    }
}
