package br.com.rafael.screenmatch.Principal;

import br.com.rafael.screenmatch.modelos.Filme;
import br.com.rafael.screenmatch.modelos.Serie;
import br.com.rafael.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme("Senhor dos Anéis", 2000);
        primeiroFilme.avalia(10);
        Filme segundoFilme = new Filme("Dragon ball", 2024);
        segundoFilme.avalia(10);
        Filme terceiroFilme = new Filme("John Wick", 2023);
        terceiroFilme.avalia(9);
        Serie primeiraSerie = new Serie("Vikings", 2000);
        primeiraSerie.avalia(8);

        ArrayList<Titulo> listaAssistidos = new ArrayList<>();
        listaAssistidos.add(primeiroFilme);
        listaAssistidos.add(segundoFilme);
        listaAssistidos.add(terceiroFilme);
        listaAssistidos.add(primeiraSerie);

       for(Titulo item:listaAssistidos) {
           System.out.println(item.getNome());
           if(item instanceof Filme filme && filme.getClassifique() > 2){
               System.out.println("Classificação " + filme.getClassifique());
           }

       }

       List<String> buscaPorArtista = new LinkedList<>();
       buscaPorArtista.add("Adam Sandler");
       buscaPorArtista.add("Hermione");
       buscaPorArtista.add("Divina");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação " + buscaPorArtista);

        Collections.sort(listaAssistidos);
        System.out.println("Lista de filmes assistidos ordenados: " + listaAssistidos);

        listaAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano de lançamento: " + listaAssistidos);
    }
}
