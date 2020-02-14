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
public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N clientes que pasaran por caja");
        int clientes = sc.nextInt();
        double precioTotal = 0;
        do {
            System.out.println("Cuantos articulos va a llevar?");
            int numArti=sc.nextInt();
            System.out.println("digite monto a pagar por cada articulo: ");
            int monto = sc.nextInt();
            System.out.println("pagara: " + monto*numArti);
            precioTotal+=(monto*numArti);
            clientes--;

        } while (clientes != 0);

        System.out.println("El Ingreso total es : " + precioTotal);

    }
}
