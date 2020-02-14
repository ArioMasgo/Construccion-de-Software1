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
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingres n alumanos a evaluar:");
        int nAlu= sc.nextInt();
        double nota=0,porcentaje=0,suma=0;
        int reprobados=0,i=1;
        do {            
            System.out.println("Alumno: "+i);
            nota=sc.nextDouble();
            if (nota<70) {
                reprobados++;
            }
            nAlu--;
            i++;
            suma++;
        } while (nAlu!=0);
        porcentaje=(reprobados*100)/suma;
        System.out.println("Porcentaje de reprobados : "+porcentaje+" %");
    }
   
}
