package com.dio.collection.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

//        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        numerosAleatorios
//                .forEach(System.out::println);

//        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um SET: ");
//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

//        System.out.println("Transforme essa lista de String em uma lista de numeros inteiros");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

//                .forEach(System.out::println);

//        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
//        numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> i %2 == 0 && i > 2 )
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        System.out.println("Mostre a media dos números");
//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(System.out::println);

        System.out.println("Remova os numeros impares");
        numerosAleatoriosInteger.removeIf(i -> i % 2 != 0);
        System.out.println(numerosAleatoriosInteger);


    }
}
