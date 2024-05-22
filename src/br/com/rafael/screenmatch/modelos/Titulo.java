package br.com.rafael.screenmatch.modelos;

import br.com.rafael.screenmatch.excecao.ErrorDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double SomaDasAvaliacos;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4) {
            throw new ErrorDeConversaoDeAnoException("Não consegui converter o ano porque tem mais de 4 caracteres");

        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    // depois de deixar privado as avaliações, devemos fazer um método abaixo.
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    // agora vamos criar um método que nao precisa de retorno, no caso um void

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme " + nome);
        System.out.println("Ano do lançamento " + anoDeLancamento);
    }

    public void avalia(double nota){
        SomaDasAvaliacos += nota;
        totalDeAvaliacoes++;
    }


    // agora vamos fazer um método que retorna algo
    public double pegaMediaNotas(){
        return SomaDasAvaliacos/totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(nome ='" + nome +
                ", anoDeLancamento = " + anoDeLancamento + "," +
                "Duração = "+ duracaoEmMinutos + ")";
    }
}
