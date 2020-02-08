/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana01.practico;

import java.util.Scanner;

/**
 *
 * @author Ario1
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese num1");
        double num1=sc.nextDouble();
        System.out.println("Ingrese num2");
        double num2=sc.nextDouble();
        System.out.println("Ingrese num3");
        double num3=sc.nextDouble();
        System.out.println("Ingrese num4");
         double num4=sc.nextDouble();
        double suma=0;
        suma=num1+num2+num3+num4;
        double porcentaje_a = num1*100/suma;
        double porcentaje_b = num2*100/suma;
        double porcentaje_c = num3*100/suma;
        double porcentaje_d = num4*100/suma;
        System.out.println(porcentaje_a+" %");
        System.out.println(porcentaje_b+" %");
        System.out.println(porcentaje_c+" %");
        System.out.println(porcentaje_d+" %");
        
//        System.out.println("El pocentaje de los numeros "+"numero1"+num1 +"numero2"+ num2 + "numero3"+ num3 + "numero4" +num4 );
    }
}
