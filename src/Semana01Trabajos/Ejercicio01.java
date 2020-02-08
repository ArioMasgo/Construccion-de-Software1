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
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de obreros: ");
        int obreros=sc.nextInt();
        int salario=0;
        do {            
            System.out.println("Ingresa cantidad de hora trabajadas ");
            int horas=sc.nextInt();
            if (horas<=40) {
                salario=horas*20;
                System.out.println("Gana :"+ salario + " soles  semanales");
            }if (horas>=40) {
                salario=40*20+(horas-40)*25;
                System.out.println("Gana :"+ salario + " soles  semanales");
            }
     
            obreros--;
        } while (obreros!=0);
    }
}
