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
public class Ejercicio36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Mayor = -999;
        int cont = 0;
        System.out.println("Ingresa los numeros de Alumnos a evaluar: ");
        int nAlum = sc.nextInt();
        double control1 = 0, control2 = 0, control3 = 0, control4 = 0, control5 = 0;
        do {
            System.out.println("ingrese el promedio del control 1: ");
            control1 = sc.nextDouble();
            System.out.println("ingrese el promedio del control 2: ");
            control2 = sc.nextDouble();
            System.out.println("ingrese el promedio del control 3: ");
            control3 = sc.nextDouble();
            System.out.println("ingrese el promedio del control 4: ");
            control4 = sc.nextDouble();
            System.out.println("ingrese el promedio del control 5: ");
            control5 = sc.nextDouble();

            if (control1 > Mayor) {
                Mayor = (int) control1;
                control1 = Mayor;
            }

            if (control2 > Mayor) {
                Mayor = (int) control2;
                control2 = Mayor;
            }

            if (control3 > Mayor) {
                Mayor = (int) control3;
                control3 = Mayor;
            }

            if (control4 > Mayor) {
                Mayor = (int) control4;
                control4 = Mayor;
            }

            if (control5 > Mayor) {
                Mayor = (int) control5;
                control5 = Mayor;
            }
            nAlum--;

        } while (nAlum != 0);

        System.out.println("la nota del alumno que obtuvo mayor promedio fue un " + Mayor);

    }
}
