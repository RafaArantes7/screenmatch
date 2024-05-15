package br.com.rafael.screenmatch.calculos;

public class Recomendacao {


    public void filtra(Classificacao classificavel) {
        if (classificavel.getClassifique() >=4) {
            System.out.println("Esta entre os preferidos do momento");
        } else if (classificavel.getClassifique() >=2) {
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
