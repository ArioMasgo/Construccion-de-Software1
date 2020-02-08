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
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el pago por hora: ");
        int pagoPorHora = sc.nextInt();
        System.out.println("ingrese cantidad de obreros: ");
        int Nobreros = sc.nextInt();
        int horas, horasExtras, HorasExtras2;
        float pago, pago1, pago2;
        int i = 0;
        while (Nobreros > 0) {
            System.out.println("ingrese horas del obrero: " + (i + 1));
            horas = sc.nextInt();
            if (horas <= 40) {
                pago = (float) horas * pagoPorHora;
                System.out.println("Ustede gano " + pago);
            } else if (horas > 40 && horas <= 48) {
                horasExtras = horas - 40;
                pago1 = (float) (40 * pagoPorHora) + (horasExtras * (pagoPorHora * 2));
                System.out.println("usted gano: " + pago1);
            } else if (horas > 48) {
                HorasExtras2 = horas - 48;
                pago2 = (float) (40 * pagoPorHora) + (8 * (pagoPorHora * 2) + (HorasExtras2 * (pagoPorHora * 3)));
                System.out.println("usted gano : " + pago2);
            }
            i++;
            Nobreros--;
        }
    }

}
