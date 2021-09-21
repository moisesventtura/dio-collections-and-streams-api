package com.dio.collection.set.desafios;

import java.util.*;

public class DesafioArcoIris {
    public static void main(String[] args) {

        List<String> meuArcoIris = new ArrayList<>();
        meuArcoIris.add("Vermelho");
        meuArcoIris.add("Laranja");
        meuArcoIris.add("Amarelo");
        meuArcoIris.add("Verde");
        meuArcoIris.add("Azul");
        meuArcoIris.add("Anil");
        meuArcoIris.add("Violeta");

        System.out.println("--\tMostre todas as cores do Arco-Íris\t--");
        System.out.println(meuArcoIris);

        System.out.println("\n-------------------------------------\n");
        System.out.println("--\tMostre a quantidade de cores que o Arco-Íris tem: " + meuArcoIris.size() + " cores!\t--");

        System.out.println("\n-------------------------------------\n");
        System.out.println("--\tExiba as cores em ordem alfabética\t--");
        Set<String> meuArcoIris2 = new TreeSet<>(meuArcoIris);
        for (String arcoIris: meuArcoIris2) System.out.println(arcoIris);

        System.out.println("\n-------------------------------------\n");
        System.out.println("--\tExiba as cores na ordem inversa a que foi informada\t--");
        List<String> meuArcoIris3 = new ArrayList<>(meuArcoIris2);
         Collections.reverse(meuArcoIris3);
        for (String arcoIris: meuArcoIris3) System.out.println(arcoIris);

        System.out.println("\n-------------------------------------\n");
        System.out.println("--\tExiba as cores que começam com a letra V\t--");
        Iterator iterator = meuArcoIris2.iterator();

        while(iterator.hasNext()){
            String cor = (String)iterator.next();
            if(cor.startsWith("V")) System.out.println(cor);
        }

        System.out.println("\n-------------------------------------\n");
        System.out.println("--\tRemova as cores que não começam com a letra V\t--");

        iterator = meuArcoIris2.iterator();

        while(iterator.hasNext()){
            if(!((String)iterator.next()).startsWith("V")){
                iterator.remove();
            }
        }

        System.out.println(meuArcoIris2);

        System.out.println("\n-------------------------------------\n");
        System.out.println("--\tLimpe o conjunto: \t--");
        meuArcoIris2.clear();
        System.out.println("O conjunto está vazio? " + meuArcoIris2.isEmpty());


    }
}

