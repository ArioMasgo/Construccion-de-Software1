/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana01.practico;
 
import java.util.Scanner;


public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Imgrese grados Fahrenheit: ");
        double f =sc.nextDouble();
        double c=0;
        c=((f-32)*5)/9;
        f=(c*9/5)+32;
        
        System.out.println("Grados Celsios: "+c);
        System.out.println("Gardos Fahrenheit: "+f);
    }
}
