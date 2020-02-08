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
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clientes = 15;
        double precioTotal = 0;
        int con=0;
        do {
            System.out.println("Ingresa monto a pagar de la computadora ");
            int monto = sc.nextInt();
            System.out.println("pagara: " + monto);
            precioTotal += monto;
            clientes--;
            con++;
        } while (clientes != 0);
        System.out.println("El precio total es: " + precioTotal+
        "y Atendio a "+con+" clientes"
        );

    }
}
