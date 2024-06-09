package Arvores;

import Arvores.model.Obj;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Obj> minhBinaria = new ArvoreBinaria<>();
        minhBinaria.inserir(new Obj(13));
        minhBinaria.inserir(new Obj(10));
        minhBinaria.inserir(new Obj(25));
        minhBinaria.inserir(new Obj(2));
        minhBinaria.inserir(new Obj(12));
        minhBinaria.inserir(new Obj(20));
        minhBinaria.inserir(new Obj(31));
        minhBinaria.inserir(new Obj(29));

        minhBinaria.exibirInOrdem();
        minhBinaria.exibirPreOrdem();
        minhBinaria.exibirPosOrdem();

    }
}
