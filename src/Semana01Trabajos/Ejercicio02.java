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
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero para la tabla de multiplicar: ");
        int n=sc.nextInt();
        for (int i = 0; i < 13; i++) {
            System.out.println(i+" * "+n+" = "+i*n);
        }
    }
}
