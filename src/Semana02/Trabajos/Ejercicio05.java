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
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int suma ,f,valor,promedio,i=10;
        suma=0;

        do {            
            System.out.println("Ingrese valor :");
            valor=sc.nextInt();
            suma=suma+valor;
            i--;
        } while (i!=0);
        System.out.println("La suma es :");
        System.out.println(suma);
        promedio=suma/10;
        System.out.println("El promedioes :"+ promedio);
    }
}
