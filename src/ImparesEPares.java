import java.util.Scanner;

public class ImparesEPares {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int totalPar = 0;
        int totalImpar = 0;
        int totalPositivo = 0;
        int totalNegativo = 0;


//continue a solução
        for (var cont = 0; cont < 5; cont++) {
            int num = leitor.nextInt();

            if (num % 2 == 0) {
                totalPar++;
            }else{
                totalImpar++;
            }
            if(num > 0){
                totalPositivo++;
            }
            if(num < 0){
                totalNegativo++;
            }
        }
//insira suas variaveis corretamente
        System.out.println(totalPar + " valor(es) par(es)");
        System.out.println(totalImpar + " valor(es) impar(es)");
        System.out.println(totalPositivo + " valor(es) positivo(s)");
        System.out.println(totalNegativo + " valor(es) negativo(s)");
    }
}
