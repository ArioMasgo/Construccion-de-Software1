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
public class Ejercicio32 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int prim=0,secu=0,tec=0,prof=0,pos=0,num=0,i=0;
         double porpri=0,porsecu=0,portec=0,porprof=0,porpos=0;
         System.out.println("Ingrese numero de Poblacion: ");
         int nIntegrantes=sc.nextInt();
         do {            
             System.out.println("Seleccione una opcion: ");
             System.out.println("1.Premaria, 2.Secuandaria, 3.Carrera tecnica, 4.Estudios profesionales, 5.Estudios de posgrado");
             num=sc.nextInt();
             if (num==1) {
                 prim++;
             }if (num==2) {
                 secu++;
             }if (num==3) {
                 tec++;
             }if (num==4) {
                 prof++;
             }if (num==5) {
                 pos++;
             }
             nIntegrantes--;
             i++;
        } while (nIntegrantes!=0);
         porpri=prim*100/i;
         porsecu=secu*100/i;
         portec=tec*100/i;
         porprof=prof*100/i;
         porpos=pos*100/i;
         System.out.println("Porcentaje Primria: "+porpri+"%");
         System.out.println("Porcentaje Secundaria: "+porsecu+"%");
         System.out.println("Porcentaje Tecnica: "+portec+"%");
         System.out.println("Porcentaje Profesional: "+porprof+"%");
         System.out.println("Porcentaje Posgrado: "+porpos+"%");
    }
}
