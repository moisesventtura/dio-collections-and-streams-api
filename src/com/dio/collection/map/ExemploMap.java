package com.dio.collection.map;

import java.util.*;

/*
Dados os modelos dos carros e seus respectivos consumos na estrada, faça;
modelo = gol  - consumo = 14,4 km/l
modelo = uno  - consumo = 15,6 km/l
modelo = mobi - consumo = 16,1 km/l
modelo = hb20 - consumo = 14,5 km/l
modelo = kwid - consumo = 15,6 km/l
 */
public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos gastos");

        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol",  14.4);
            put("uno",  15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares + "\n");

        System.out.println("Substitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares + "\n");

        System.out.println("Confira se o modelo Tucson está no dicionario: " + carrosPopulares.containsKey("Tucson" + "\n"));

        System.out.println("Exiba o consumo do uni: " + carrosPopulares.get("uno") + "\n");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos + "\n");

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos + "\n");

        System.out.println("Qual o modelo mais economico: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente ="";

        for (Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente + "\n");
            }
        }

        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEficiente="";

        for (Map.Entry<String, Double> entry: entries1) {
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente " + modeloMenosEficiente + " - " + consumoMenosEficiente + "\n");
            }
        }

        System.out.println("Exiba a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();

        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma dos consumos é: " + soma + "\n");

        System.out.println("Exiba a média de consumo deste dicionário de carros: " + (soma/carrosPopulares.size()) + "\n");


        System.out.println("Remova os modelos com o consumo igual a 15,6: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

//        while(iterator1.hasNext()){
//            if(iterator1.next().equals(15.6)) iterator1.remove();
//        }

        carrosPopulares.values().removeIf(aDouble -> aDouble.equals(15.6));

        System.out.println(carrosPopulares + "\n");

        System.out.println("Exiba os modelos na ordem que foram informados");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol",  14.4);
            put("uno",  15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1 + "\n");

        System.out.println("Exiba o dicionario ordenado pelo modelo");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2 + "\n");

    }

}
