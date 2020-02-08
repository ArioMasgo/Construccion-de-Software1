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
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  mm,m=0,dm=0,cm=0;
        System.out.println("Ingrese milimetros:");
        mm=sc.nextInt();
                
            m=mm/1000;
            dm=(mm%1000)/10;
            cm=(mm%1000)%10;
            mm=mm%10;
        
        System.out.println("metros:" +m +" decimetros: "+ dm + "centimetros: "+ cm);
    }
}
