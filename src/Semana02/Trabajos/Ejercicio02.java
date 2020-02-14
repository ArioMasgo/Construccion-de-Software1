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
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("ingresa primera nota:");
        n1=sc.nextInt();
        System.out.println("ingresa segunda nota:");
        n2=sc.nextInt();
        System.out.println("ingresa tercera nota:");
        n3=sc.nextInt();
        int promedio=(n1+n2+n3)/3;
        Ejercicio02 obj = new Ejercicio02();
        obj.mensaje(promedio);
        
    }
     public void mensaje(int promedio){
        if (promedio>=13) {
            System.out.println("Promocionado");
        }else{
            if (promedio>=11) {
                System.out.println("Regular");
            }else{
                System.out.println("Reprobado");
            }
        }
        
    }
}
