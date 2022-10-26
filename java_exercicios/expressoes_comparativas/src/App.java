
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

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double conta = 50.0;

        if(minutos > 100){
            conta = conta + (minutos - 100) * 2.0;
        }

        System.out.println("Valor da conta = R$ %.2f%n"+ conta);
        sc.close();

    }
}
