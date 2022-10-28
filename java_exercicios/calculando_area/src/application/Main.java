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

import entities.Triangle;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measure of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double pOne = ((x.a + x.b + x.c) / 2.0);
        double areaX = Math.sqrt( pOne * ( pOne - x.a) * (pOne - x.b) * (pOne - x.c));

        double pTwo = ((y.a + y.b + y.c) / 2.0);
        double areaY = Math.sqrt(pTwo * (pTwo - y.a) * (pTwo - y.b) * (pTwo - y.c));

        System.out.println("Triangle X area:" + areaX);
        System.out.println("Triangle Y area:" + areaY);
    
        if (areaX > areaY){
            System.out.println("Larger area: X");
        }
        else{
            System.out.println("Larger area: Y");
        }


        sc.close();



    }
}
