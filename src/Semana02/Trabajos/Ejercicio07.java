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
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese n obreros");
        int nobreros =sc.nextInt();
        System.out.println("Ingrese el pago por hora:");
        int pagoHora = sc.nextInt();
        int i=1,horas,pago=0,pagoTotal=0;
        do {      
            System.out.println("Ingrese horas trabajadas del obrero "+i);
            horas=sc.nextInt();
            if (horas<0) {
                System.err.println("Invalido ... ingrese nuevamente");
            }else if (horas<=40) {
                pago=pagoHora*horas;
                System.out.println("Usted gano: "+pago +" soles semanal");
                pagoTotal=+pago;
            }else if (horas>40&&horas<=48) {
                pago=pagoHora*40+(pagoHora*(horas-40))*2;
                System.out.println(pagoHora);
                System.out.println(pago);
                System.out.println("Usted gano: "+pago +" soles semanal");
                pagoTotal=+pago;
            }else if (horas>48) {
                pago=pagoHora*40+((pagoHora*8)*2)+((pagoHora*(horas-48))*3);
                System.out.println(pagoHora);
                System.out.println("Usted gano: "+pago +" soles semanal");
                pagoTotal=+pago;
            }
            nobreros--;
            i++;
        } while (nobreros!=0);
        System.out.println("El los pagos realizados a todos los trabajadores es :"+pagoTotal);
    }
}
