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
public class Ejercicio2 { 
    public static void main(String[] args) {
        int aux=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese n digitos de un numero");
        int num=sc.nextInt();
        int suma=num;
        while (num>0) {            
            aux=aux+num%10;
            num=num/10;
        }
                    
        
        System.out.println("La suma es:"+aux );
        
        
        
        
    }
    
    
    
}
