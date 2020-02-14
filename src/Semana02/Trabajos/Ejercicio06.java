/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana02.Trabajos;

import java.util.Scanner;

/**
 *
 * @author Ario1
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0.0;
        int i, n, impar;
        System.out.println("ingresa valor de N");
        n = sc.nextInt();
        System.out.println("ingresa valor de X");
        int x = sc.nextInt();
        for (i = 1; i <= n; i++) {
            impar = 2 * i - 1;
            System.out.print(impar+" - ");
            suma = suma + Math.pow(x, impar);
        }
        System.out.println(suma);
    }
}
