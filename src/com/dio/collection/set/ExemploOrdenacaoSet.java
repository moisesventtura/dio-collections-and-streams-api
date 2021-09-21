package com.dio.collection.set;

/*
Dadas as seguintes informações sobre inhas series favoritas,
crie um conunto e ordene esete conjunto exibindo:
(nome - genero - tempo de episódio);

Serie 1 - Nome: got, genero: fantasia, tempoEpisodio: 60
Serie 2 - Nome: dark, genero: drama, tempoEpisodio: 60
Serie 3 - Nome: that '70s fhow, genero: comédia, tempoEpisodio: 25
 */

import java.util.*;

public class ExemploOrdenacaoSet {

    public static void main(String[] args)  {



        System.out.println("--\tMostre na ordem aleatoria\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
           add(new Serie("got", "fantasia", 60));
           add(new Serie("dark", "drama", 60));
           add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
            + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("-------------------------------------");

        System.out.println("--\tMostre pela ordem de inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("-------------------------------------");
        System.out.println("--\tMOstre na ordem natural\t--");

        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("-------------------------------------");
        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);

        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("-------------------------------------");
        System.out.println("--\tOrdem por Gênero\t--");

        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie: minhasSeries4) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("-------------------------------------");
        System.out.println("--\tOrdem por Tempo de Episodio\t--");

        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries5.addAll(minhasSeries);

        for (Serie serie: minhasSeries4) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
}

