package br.com.rafael.screenmatch.modelos;

import br.com.rafael.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {
   private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

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

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}


