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
public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero:");
        int num = sc.nextInt();
        int num2 = num - 1;

        while ((num % num2) != 0) {
            num2--;
        }
        if (num2 == 1) {
            System.out.println("es primo");
        } else {
            System.out.println("no es primo");
        }

    }
}
