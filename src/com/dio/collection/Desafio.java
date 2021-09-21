package com.dio.collection;

import java.util.*;

public class Desafio {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println( notas);



        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(0.0);
        notas2.add(3.6);

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        notas3.add(1.1);
        System.out.println(notas3);

    }
}
