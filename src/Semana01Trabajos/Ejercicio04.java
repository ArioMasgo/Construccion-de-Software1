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
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clientes = 15;
        double precioTotal = 0, precioTotal1 = 0;
        double precio = 0, suma = 0;
        do {
            System.out.println("Numero de kilos a comprar: ");
            int numkilos = sc.nextInt();
            if (numkilos > 10) {
                precio = (numkilos * 1.30) * 0.85;
                precioTotal += precio;
            }
            if (numkilos <= 10) {
                precio = numkilos * 1.30;
                precioTotal1 += precio;
            }
            System.out.println("pagara: " + precio);
            clientes--;
            suma = precioTotal + precioTotal1;
        } while (clientes != 0);
        {
            System.out.println("El precio total es: " + suma);
        }
    }
}
