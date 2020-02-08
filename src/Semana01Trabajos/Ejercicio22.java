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
public class Ejercicio22 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese cantidad de vendedores: ");
        int Nvendedores=sc.nextInt();
        
        int sueldo[]=new int[Nvendedores];
        for (int i = 0; i < Nvendedores; i++) {
            System.out.println("ingrese sueldo de vendedor: "+(i+1));
            sueldo[i]=sc.nextInt();
            System.out.println("ingrese valor de las 3 ventas por semana: "+(i+1));
            int venta1=sc.nextInt();
            int venta2=sc.nextInt();
            int venta3=sc.nextInt();
            
            float extra=(venta1*0.1f)+(venta2*0.1f)+(venta3*0.1f);
            System.out.println("por concepto de comisiones tiene: "+extra);
            float sueldoTotal=sueldo[i]+extra;
            System.out.println("su sueldo total es: "+ sueldoTotal);
        }
    }

}
