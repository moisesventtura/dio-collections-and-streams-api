package com.dio.collection.set.desafios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DesaFioLinguagemFavorita {
    public static void main(String[] args) {

        System.out.println("--\tMostre pela ordem de inserção\t--");
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
            add(new LinguagemFavorita("PHP", 1994, "VsCode"));
            add(new LinguagemFavorita("HTML5", 2008, "VsCode"));
        }};

        for (LinguagemFavorita linguagemFavorita: linguagens)
            System.out.println(linguagemFavorita.getNome() + " - "
                    + linguagemFavorita.getAnoDeCriacao() + " - "
                    + linguagemFavorita.getIDE());

        System.out.println("-------------------------------------");

        System.out.println("--\tMOstre na ordem natural\t--");
        Set<LinguagemFavorita> linguagem1 = new TreeSet<>(linguagens);

        for (LinguagemFavorita linguagemFavorita: linguagem1)
            System.out.println(linguagemFavorita.getNome() + " - "
                    + linguagemFavorita.getAnoDeCriacao() + " - "
                    + linguagemFavorita.getIDE());

        System.out.println("-------------------------------------");

        System.out.println("--\tOrdem por IDE\t--");
        Set<LinguagemFavorita> linguagem2 = new TreeSet<>(new ComparatorIDE());
        linguagem2.addAll(linguagens);

        for (LinguagemFavorita linguagemFavorita: linguagem2)
            System.out.println(linguagemFavorita.getNome() + " - "
                    + linguagemFavorita.getAnoDeCriacao() + " - "
                    + linguagemFavorita.getIDE());

        System.out.println("-------------------------------------");

        System.out.println("--\tOrdem por Ano de Criação e Nome\t--");
        Set<LinguagemFavorita> linguagem3 = new TreeSet<>(new ComparatorAnoCriacaoENome());
        linguagem3.addAll(linguagens);
        for (LinguagemFavorita linguagemFavorita: linguagem3)
            System.out.println(linguagemFavorita.getAnoDeCriacao() + " - "
                    + linguagemFavorita.getNome());

        System.out.println("-------------------------------------");

        System.out.println("--\tOrdem por Nome, Ano de Criação e IDE\t--");
        Set<LinguagemFavorita> linguagem4 = new TreeSet<>(new ComparatorNomeAnoIDE());
        linguagem4.addAll(linguagens);

        for(LinguagemFavorita linguagemFavorita: linguagem4)
            System.out.println(linguagemFavorita.getNome() + " - "
                    + linguagemFavorita.getAnoDeCriacao() + " - "
                    + linguagemFavorita.getIDE());

        System.out.println("-------------------------------------");

        System.out.println("--\tApenas as Linguagens\t--");
        Set<LinguagemFavorita> lFavoritas = new TreeSet<>(linguagens);
        for (LinguagemFavorita linguagemFavorita: lFavoritas)
            System.out.println(linguagemFavorita.getNome());


    }
}

