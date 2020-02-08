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
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese valor para a");
        int a =sc.nextInt();
        System.out.println("Ingrese valor para b");
        int b =sc.nextInt();
        double c=0,d=0;
        c=((4*Math.pow(a, 2))+(3*b*a)+(Math.pow(b, 2))) / (Math.pow(a, 2))-(Math.pow(b, 2));
        d=(3*Math.pow(c, 2)+a+b)/4;
        
        System.out.println("Valor de c:"+ c);
        System.out.println("Valor de d:"+ d);
    }
}
