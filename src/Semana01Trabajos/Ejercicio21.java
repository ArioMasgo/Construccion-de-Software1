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
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese n numero de sucecion");
        int n=sc.nextInt();
        int temp=1;
        double suma=0;        
        double div = 0;
        for(int i=1;i<=n;i++){                            
            temp*=i;            
            div=1/(double)temp;  
            suma+=div;                       
        }                        
        System.out.println("Rpta: "+temp);                
        System.out.println("La suma es: " + suma);
    
    }

         
}
