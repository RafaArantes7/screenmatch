package br.com.rafael.screenmatch.Principal;

import br.com.rafael.screenmatch.calculos.CalculadoraDeTempo;
import br.com.rafael.screenmatch.calculos.Recomendacao;
import br.com.rafael.screenmatch.modelos.Episodio;
import br.com.rafael.screenmatch.modelos.Filme;
import br.com.rafael.screenmatch.modelos.Serie;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme("Senhor dos Anéis", 2000);
        primeiroFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + primeiroFilme.getDuracaoEmMinutos());




        primeiroFilme.exibeFichaTecnica();
        primeiroFilme.avalia(8);
        primeiroFilme.avalia(7);
        primeiroFilme.avalia(10);

        System.out.println("Total de avaliações: " + primeiroFilme.getTotalDeAvaliacoes());

        System.out.println(primeiroFilme.pegaMediaNotas());

        Serie primeiraSerie = new Serie("Vikings", 2000);
        primeiraSerie.exibeFichaTecnica();
        primeiraSerie.setTemporadas(6);
        primeiraSerie.setEpisodiosPorTemporadas(8);
        primeiraSerie.setMinutosPorEpisodios(50);
        System.out.println("Duração da série " + primeiraSerie.getDuracaoEmMinutos() + " minutos");

        Filme segundoFilme = new Filme("Dragon ball", 2024);
        segundoFilme.setDuracaoEmMinutos(300);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(primeiroFilme);
        calculadora.inclui(segundoFilme);
        calculadora.inclui(primeiraSerie);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(primeiroFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(primeiraSerie);
        episodio.setTotalVisualizacoes(300);


        filtro.filtra(episodio);

        Filme terceiroFilme = new Filme("John Wick", 2023);
        terceiroFilme.setDuracaoEmMinutos(180);
        terceiroFilme.avalia(10);

        ArrayList<Filme> ListaDeFilmes = new ArrayList<>();
        ListaDeFilmes.add(primeiroFilme);
        ListaDeFilmes.add(segundoFilme);
        ListaDeFilmes.add(terceiroFilme);
        System.out.println("Tamanho da lista de filmes " + ListaDeFilmes.size());
        System.out.println("Primeiro filme " + ListaDeFilmes.get(0).getNome());
        System.out.println(ListaDeFilmes);
        System.out.println("toString do filme " + ListaDeFilmes.get(0).toString());





    }
}
