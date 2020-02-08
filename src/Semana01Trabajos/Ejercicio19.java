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
public class Ejercicio19 {

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese cantidad de autos:");
        int nAutos=sc.nextInt();
        int autos[]=new int[nAutos];
        for (int i = 0; i < autos.length; i++) {
            System.out.println("ingrese el utilo digito de la placa: ");
            int digito=sc.nextInt();
            if(digito==1 || digito==2){
                System.out.println("calcomania AMARILLO");
            }else if(digito==3 || digito==4){
                System.out.println("calcomania ROSA");
            }else if(digito==5 || digito==6){
                System.out.println("calcomania ROJA");
            }else if(digito==7 || digito==8){
                System.out.println("calcomania VERDE");
            }else if(digito==9 || digito==0){
                System.out.println("calcomania AZUL");
            }
        }
    }

}
