
/*
 *  No java temos alguns operadores para elabora expreçoes , como por exemplo:
 *  maior >
 *  menor <
 *  maior ou igual >=
 *  menor ou igual <=
 *  Igual == 
 *  diferente != 
 * 
 *  tais operadores são identicos a linguagens como C, C++, Java e C# 
 * 
 *  Estuturas condicionais:
 *  if else if else
 *  switch
 *   
 * 
 *  Operadores de atribuição acumulativa:
 *  
 */

import java.util.Locale;
import java.util.Scanner;

import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;

public class App {
    public static void main(String[] args) throws Exception {

        /*Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double conta = 50.0;

        if(minutos > 100){
            conta = conta + (minutos - 100) * 2.0;
        }

        System.out.println("Valor da conta = R$" + conta);
        sc.close(); */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int diaDaSemana = 0 ;

        diaDaSemana = sc.nextInt();

        switch(diaDaSemana){
            case 1:
                System.out.println("Hoje é domingo");
                break;
            case 2:
                System.out.println("Hoje é Segunda-Feira");
                break;
            case 3:
                System.out.println("Hoje é terça feira");
                break;
            case 4:
                System.out.println("Hoje é quarta-feira");
                break;
            case 5:
                System.out.println("Hoje é quinta feira");
                break;
            case 6:
                System.out.println("Hoje é sexta-feira");
                break;
            case 7:
                System.out.println("Hoje é sabado");
                break;
            
        }
        



    }
}
