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
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese monto");
        double dinero =sc.nextDouble();
        int mes = 1;
        while (mes <= 12) {
            dinero = dinero+(dinero * 0.02);
            mes++;
        }
        System.out.println(dinero);
    }
}
