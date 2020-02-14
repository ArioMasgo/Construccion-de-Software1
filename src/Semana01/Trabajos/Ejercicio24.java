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
public class Ejercicio24 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int favor=0,contra=0,nulo=0,num=0,i=0;
         double porFavor=0,porContra=0,porNuo=0;
         System.out.println("Ingrese numero de integrantes: ");
         int nIntegrantes=sc.nextInt();
         do {            
             System.out.println("Seleccione una opcion: ");
             System.out.println("1.favor, 2.contra, 3.Sin comentarios");
             num=sc.nextInt();
             if (num==1) {
                 favor++;
             }if (num==2) {
                 contra++;
             }if (num==3) {
                 nulo++;
             }
             nIntegrantes--;
             i++;
        } while (nIntegrantes!=0);
         porFavor=favor*100/i;
         porContra=contra*100/i;
         porNuo=nulo*100/i;
         System.out.println("Estan a favor: "+porFavor+"%");
         System.out.println("Estan a contra: "+porContra+"%");
         System.out.println("Se abstienen de opinar: "+porNuo+"%");
    }
}
