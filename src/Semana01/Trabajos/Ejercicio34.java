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
public class Ejercicio34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite_estandar = 50000, limite_offset = 10000, opciones = 0, copias = 0;
        String nombre_tipo = "", respuesta = "";
        int total_comprado = 0;
        do {
            System.out.println("----Copias XD------");
            System.out.println("Tipo de impresion a realizar:");
            System.out.println("1. impresion del tipo offset max:10000:");
            System.out.println("2. impresion del tipo estandar max:50000");
            System.out.println("3. salir");
            opciones = sc.nextInt();
            switch (opciones) {
                case 1:
                    if (limite_offset > 0) {
                        System.out.println("Cantidad de impresion disponible :" + limite_offset);
                        System.out.println("Cuantas copias dese realizar?");
                        copias = sc.nextInt();
                        while ((limite_offset - copias) < 0) {
                            System.out.println("Exedes el limite de impresion");
                            copias = sc.nextInt();
                        }
                        limite_offset = limite_offset - copias;
                        total_comprado = copias;
                    } else {
                        System.out.println("Ya no hay impresiones de este tipo");
                    }

                    break;
                case 2:
                    if (limite_estandar > 0) {
                        System.out.println("Cantidad de impresion disponible :" + limite_offset);
                        System.out.println("Cuantas copias dese realizar?");
                        copias = sc.nextInt();
                        while ((limite_estandar - copias) < 0) {
                            System.out.println("Exedes el limite de impresion");
                            copias = sc.nextInt();
                        }
                        limite_estandar = limite_estandar - copias;
                        total_comprado = copias;
                    } else {
                        System.out.println("Ya no hay impresiones de este tipo");
                    }
                    break;

            }
        } while (opciones!=3);

    }
}
