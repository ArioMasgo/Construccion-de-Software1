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
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de clientes ");
        int clientes = sc.nextInt();

        int precioTotal = 0;
        do {
            int precio = 100;
            System.out.println("Ingresa la Edad del cliente: ");
            int edad = sc.nextInt();
            if (edad < 5) {
                System.out.println("No esta permitido el ingreso menores de 5 años");
            }
            if (edad >= 5 && edad <= 14) {
                precio = (int) (precio * 0.65);
                System.out.println("pagara: " + precio);

            }
            if (edad >= 15 && edad <= 19) {
                precio = (int) (precio * 0.75);
                System.out.println("pagara: " + precio);
            }
            if (edad >= 20 && edad <= 45) {
                precio = (int) (precio * 0.90);
                System.out.println("pagara: " + precio);
            }
            if (edad >= 46 && edad <= 65) {
                precio = (int) (precio * 0.75);
                System.out.println("pagara: " + precio);
            }
            if (edad >= 66) {
                precio = (int) (precio * 0.75);
                System.out.println("pagara: " + precio);
            }
            precioTotal += precio;
            clientes--;
        } while (clientes != 0);

        System.out.println("El precio total de los clientes es : " + precioTotal);
    }
}
