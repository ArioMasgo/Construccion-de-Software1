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
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1,temp= 0;
        int suma=0;
        System.out.println("Dgite el numero del termino que desea encontrar ");
        int x=sc.nextInt();
        do {            
            temp = 102 - n * 2;
            suma+=temp;
            System.out.print(temp+"+");
            n++;
            x--;
            
        } while (x!=0);
        System.out.println("La suma es :"+suma);
    }
}
