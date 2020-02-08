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
public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa cantidad de clientes que pasaron durante el dia: ");
        int NClientes = sc.nextInt();
        float monto, des, des1, pago1, pago2;
        float montoTotal = 0;
        do {            
            System.out.println("ingrese monto de compra: ");
            monto = sc.nextFloat();
            int descuento = (int) ((Math.random() * (3 - 1)) + 1);
            if (descuento == 1) {
                System.out.println("le toco bola AMARILLA 25% de descuento");
                des = monto * (0.25f);
                pago1 = monto - des;
                montoTotal += pago1;
                System.out.println("debe pagar: " + pago1 );
            } else if (descuento == 2) {
                System.out.println("le toco bola ROJA 50% de descuento");
                des1 = monto * (0.5f);
                pago2 = monto - des1;
                montoTotal += pago2;
                System.out.println("debe pagar: " + pago2 + "$");
            }

            NClientes--;
        } while (NClientes!=0);
            
        System.out.println("el total de ingresos es: " + montoTotal + "$");

    }

}
