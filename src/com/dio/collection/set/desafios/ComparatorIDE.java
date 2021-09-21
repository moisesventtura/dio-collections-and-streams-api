package com.dio.collection.set.desafios;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int Ide = l1.getIDE().compareToIgnoreCase(l2.getIDE());
        if(Ide != 0) return Ide;

        return Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());

    }
}
