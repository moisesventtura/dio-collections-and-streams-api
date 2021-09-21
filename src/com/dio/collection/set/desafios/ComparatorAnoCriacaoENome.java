package com.dio.collection.set.desafios;

import java.util.Comparator;

public class ComparatorAnoCriacaoENome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoCriacao = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if(anoCriacao != 0) return anoCriacao;

        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if(nome != 0) return nome;


        return l1.getIDE().compareToIgnoreCase(l2.getIDE());
    }
}
