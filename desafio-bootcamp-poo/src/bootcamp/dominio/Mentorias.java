package bootcamp.dominio;

import java.time.LocalDate;

public class Mentorias extends Conteudo {
    public LocalDate data;

    @Override
    public double calcularXp() {
      return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentorias [data=" + data + ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao() + "]";
    }
}
