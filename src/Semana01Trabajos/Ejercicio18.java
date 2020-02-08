/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana01Trabajos;

import java.util.Scanner;

/**
 *
 * @author Ario1
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese cantidad de productos:");
        int cant = sc.nextInt();
        double total = 0;
        do {            
            System.out.println("ingrese precio del producto " );
            double precio = sc.nextDouble();
            System.out.println("ingrese cantidad del producto " );
            int can = sc.nextInt();
            total += (double) can * precio;
            cant--;
        } while (cant!=0);
        System.out.println("el total a pagar es :" + total);
    }

}
