import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** Dadas as saeguinte informações sobre meus gatos, crie uma lista e ordene esta lista exibindo:
* (nome - idade - cor)
*
* Gato 1 = nome: Jon, idade: 18, cor: preto
* Gato 2 = nome: Simba, idade: 6, cor: tigrado
* Gato 3 = nome: Jon, idade: 12, cor: amarelo

*/

public class OrganizandoLists {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18,"preto"));
            add(new Gato("Simba", 6,"tigrado"));
            add(new Gato("Jon", 12,"amarelo"));
        }};

//        System.out.println(meusGatos);

        System.out.println("--\tMostre pela ordem de inserção\t--");
        System.out.println(meusGatos);

        System.out.println("--\tMOstre na ordem aleatoria\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tMOstre na ordem natural\t--");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tMOstre na ordem idade\t--");
//        Collections.sort(meusGatos, new Gato.ComparatorIdade());
        meusGatos.sort(new Gato.ComparatorIdade());
        System.out.println(meusGatos);


        System.out.println("--\tMOstre na ordem da cor\t--");
        meusGatos.sort(new Gato.ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tMOstre na ordem da nome/cor/idade\t--");
        meusGatos.sort(new Gato.ComparatorNomeCorIdade());
        System.out.println(meusGatos);


    }

}



class Gato implements Comparable<Gato> {

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareTo(gato.getNome()); //Só podem haver 3 tipode de retorno:
                                                        // 0,1 e -1
                                                        //0 = são iguais, 1 - o elemento que está comparando tem que ficar depois(maior), se for -1 fica antes

    }

    static class ComparatorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }

    static class ComparatorCor implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            return g1.getCor().compareToIgnoreCase(g2.getCor());
        }
    }

    static class ComparatorNomeCorIdade implements  Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if(nome != 0) return nome;

            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            if(cor != 0) return cor;


            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }
}