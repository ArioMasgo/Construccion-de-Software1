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
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de vendedores: ");
        int nvendedores=sc.nextInt();
        double sueldoTotal=0, i=1,comision=0;
        do {            
            System.out.println("sueldo base del vendedor: "+i+"=");
            int sueldo=sc.nextInt();
            System.out.println("MOnto x las 3 ventas realiadas:");
            int ventas=sc.nextInt();
            comision=sueldo*0.10;
            sueldoTotal=ventas+sueldo+comision;
            i++;
            System.out.println("La Dinero por comision por las 3 ventas: "+comision);
            System.out.println("Total con el sueldo base mas su comicion x las 3ventas: "+sueldoTotal);
            nvendedores--;
        } while (nvendedores!=0);
    }
}
