package bootcamp.dominio;

public class Curso extends Conteudo {
   public int cargaHoraria;

    

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }



    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + ", getTitulo()=" + getTitulo() + ", getDescricao()="
                + getDescricao() + "]";
    }
}
