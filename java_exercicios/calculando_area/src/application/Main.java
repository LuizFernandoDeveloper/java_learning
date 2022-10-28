/*
 *  Problema exemplo:
 *  
 *  Fazer um programa para ler as medidas dos lados de dois triângulos X eY (Suponha medidas
 *  válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois 
 *  triângulos possui a maior área.
 *   
 *  A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é
 *  a seguinte(Frómula de Heron)
 *           ________________________              a+b+c
 *  area = \/ p(p - a)(p - b)(p - c)    onde  p = --------- 
 *                                                   2
 * 
 *  Exemplos de interação com o usuarios ;
 *  
 * Enter the measure of triangle x:
 * 3.00
 * 4.00
 * 5.00
 * Enter the measures of triangle Y:
 * 7.50
 * 4.50
 * 4.02
 * Triangle X area: 6.0000
 * Triangle Y area: 7.5638
 * Larger area: Y
 * 
 */
package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;  

        System.out.println("Enter the measures of triangle X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measure of triangle Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double pOne = ((xA + xB + xC) / 2.0);
        double areaX = Math.sqrt( pOne * ( pOne - xA) * (pOne - xB) * (pOne - xC));

        double pTwo = ((yA + yB + yC) / 2.0);
        double areaY = Math.sqrt(pTwo * (pTwo - yA) * (pTwo - yB) * (pTwo - yC));

        System.out.println("Triangle X area:" + areaX);
        System.out.println("Triangle Y area:" + areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X" + areaX);
        }
        else{
            System.out.println("Larger area: Y" + areaY);
        }


        sc.close();



    }
}
