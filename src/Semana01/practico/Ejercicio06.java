/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana01.practico;

import java.util.Scanner;

/**
 *
 * @author Ario1
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese hora");
        int hora =sc.nextInt();
        double minutos=0,segundos=0;
        minutos=(hora*60);
        segundos=(minutos)*60;
        
        System.out.println("minutos: "+ minutos +" Segundos: " +segundos);
    }
}
