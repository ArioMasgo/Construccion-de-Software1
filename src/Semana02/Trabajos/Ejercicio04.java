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
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese n clientes :");
        int nclientes = sc.nextInt();
        double preciototal = 0, precioA = 0, precioB = 0, precioC = 0, precioD = 0;
        do {
            System.out.println("ingrese horas de estacionamiento:");
            int horas = sc.nextInt();

            if (horas <= 2 && horas > 0) {
                precioA = horas * 5.00;
                System.out.println("EL monto a pagar es :" + precioA+ " soles");
                preciototal += precioA;
            } else if (horas >= 3 && horas <= 5) {
                precioB = 2 * 5.00 + (horas - 2) * 4.00;

                System.out.println("EL monto a pagar es :" + precioB+ " soles");
                preciototal += precioB;
            } else if (horas > 5 && horas <= 10) {
                precioC = 2 * 5 + 3 * 4.00 + (horas - 5) * 3.00;
                System.out.println("EL monto a pagar es :" + precioC+ " soles");
                preciototal += precioC;
            } else if (horas > 10) {
                precioD = 2 * 5 + 3 * 4.00 + 5 * 3.00 + (horas - 10) * 2.00;
                System.out.println("EL monto a pagar es :" + precioD+ " soles");
                preciototal += precioD;
            }

            nclientes--;
        } while (nclientes != 0);
        System.out.println("El precio total del estacionamiento es :" + preciototal+ " soles ");
    }
}
