package com.dio.collection.map;

/*
Dadas as seguintes informações sobre meus livros favoritos e seus autores, crie um dicionário e ordene este dicionário:
exibindo (nome - autor- nome livro)

Autor = Hawking, Stephen - Livro = nome: Uma Breve História do Tempo. paginas: 256
Autor = Duhingm, Charles - Livro = nome: O poder do hábito. paginas: 408
Autor = Hararim Yuval Naah - Livro = nome: Lições para o seculo 21m  paginas: 432

 */

import java.util.*;

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {


        System.out.println("--\tOrdem Aleatoria\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhingm, Charles", new Livro("O poder do hábito", 408));
            put("Hararim, Yuval Naah", new Livro("21 Lições para o seculo 21", 432));
        }};
        Set<Map.Entry<String, Livro>> entries = meusLivros.entrySet();

        for (Map.Entry<String, Livro> livros: entries)
            System.out.println(livros.getKey()+ " - " + livros.getValue().getNome());


        System.out.println("\n"+"--\tOrdem inserção\t--");

        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(meusLivros);
        for (Map.Entry<String, Livro> livros: meusLivros1.entrySet())
            System.out.println(livros.getKey()+ " - " + livros.getValue().getNome());


        System.out.println("\n"+"--\tOrdem alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livro> livros: meusLivros2.entrySet())
            System.out.println(livros.getKey()+ " - " + livros.getValue().getNome());

        System.out.println("\n"+"--\tOrdem alfabética dos nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livro> livros: meusLivros3)
            System.out.println(livros.getValue().getNome());


        System.out.println("\n"+"--\tOrdem pelo número de páginas\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livros: meusLivros4)
            System.out.println(livros.getKey() + " - " +
                    livros.getValue().getNome() + " - " +
                    livros.getValue().getPaginas());




    }
}

class Livro{
    private  String nome;
    private  Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return  nome + " - " + paginas;

    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPaginas implements  Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return  l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}

