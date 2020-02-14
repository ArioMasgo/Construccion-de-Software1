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
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Clase de Amimal: ");
        String animal = sc.nextLine();
        System.out.println("Ingrese edad:");
        int categoria1=0,categoria2=0,categoria3=0;
        double  porcentaje1=0, porcentaje2=0,porcentaje3=0;
        double por=0;
        if (animal.equalsIgnoreCase("elefante")) {
            for (int i = 0; i < 20; i++) {
                int edad = sc.nextInt();
                if (edad>=0&&edad<2) {
                    categoria1++;
                }
                if (edad>=1&&edad<4) {
                    categoria2++;
                }
                if (edad>=3&&edad>2) {
                    categoria3++;
                }
            }
             por=categoria1+categoria2+categoria3;
            porcentaje1=categoria1*100/por;
            porcentaje2=categoria2*100/por;
            porcentaje3=categoria3*100/por;
            System.out.println("---ELEFANTES--");
            System.out.println("Categoria 1: "+porcentaje1+" %");
            System.out.println("Categoria 2: "+porcentaje2+" %");
            System.out.println("Categoria 3: "+porcentaje3+" %");
        }
        if (animal.equalsIgnoreCase("jirafas")) {
            for (int i = 0; i < 15; i++) {
                int edad = sc.nextInt();
                if (edad>=0&&edad<2) {
                    categoria1++;
                }
                if (edad>=1&&edad<4) {
                    categoria2++;
                }
                if (edad>=3&&edad>3) {
                    categoria3++;
                }
            }
        
            por=categoria1+categoria2+categoria3;
            porcentaje1=categoria1*100/por;
            porcentaje2=categoria2*100/por;
            porcentaje3=categoria3*100/por;
            System.out.println("---JIRFAS--");
            System.out.println("Categoria 1: "+porcentaje1+" %");
            System.out.println("Categoria 2: "+porcentaje2+" %");
            System.out.println("Categoria 3: "+porcentaje3+" %");
            
           
        }
          if (animal.equalsIgnoreCase("Chimpace")) {
            for (int i = 0; i < 40; i++) {
                int edad = sc.nextInt();
                if (edad>=0&&edad<2) {
                    categoria1++;
                }
                if (edad>=1&&edad<4) {
                    categoria2++;
                }
                if (edad>=3&&edad>3) {
                    categoria3++;
                }
            }
            por=categoria1+categoria2+categoria3;
            porcentaje1=categoria1*100/por;
            porcentaje2=categoria2*100/por;
            porcentaje3=categoria3*100/por;
            System.out.println("---CHIMPACES--");
            System.out.println("Categoria 1: "+porcentaje1+" %");
            System.out.println("Categoria 2: "+porcentaje2+" %");
            System.out.println("Categoria 3: "+porcentaje3+" %");
        }
    }
}
