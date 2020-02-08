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
public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Autos[] = new int[25];
        int suma = 0;
        int menor, mayor;
        for (int i = 0; i < Autos.length; i++) {
            System.out.println("ingrese puntos de contaminacion de vehiculo " + (i + 1));
            Autos[i] = sc.nextInt();
            suma += Autos[i];
        }
        mayor = menor = Autos[0];
        for (int i = 0; i < Autos.length; i++) {
            if (Autos[i] > mayor) {
                mayor = Autos[i];
            }
            if (Autos[i] < menor) {

                menor = Autos[i];
            }
        }
        System.out.println("el promedio de contaminacion es " + suma / 25);
        System.out.println("el que más contamino es: " + mayor);
        System.out.println("el que menos contamino es: " + menor);
    }

}
