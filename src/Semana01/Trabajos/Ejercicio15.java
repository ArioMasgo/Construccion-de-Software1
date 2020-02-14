/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana01.Trabajos;

import java.util.Scanner;

/**
 *
 * @author Ario1
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,promedio=0,suma=0;
        int aux=0;
        do {            
            System.out.println("ingrese numero");
            num=sc.nextInt();
            suma=suma+num;
            aux++;
        } while (num!=-1);
        promedio=suma/aux-1;
        
        System.out.println("El promedio es :"+promedio);
    }
}
