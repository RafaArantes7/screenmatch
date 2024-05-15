package br.com.rafael.screenmatch.modelos;

import br.com.rafael.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {
   private String diretor;

    public String getDIretor() {
        return diretor;
    }

    public void setDIretor(String DIretor) {
        this.diretor = DIretor;
    }

    @Override
    public int getClassifique() {
        return (int)pegaMediaNotas() / 2;
    }
}
