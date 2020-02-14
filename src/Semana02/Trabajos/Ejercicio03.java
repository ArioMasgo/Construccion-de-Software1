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
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese precio por metro de tela");
        double precio_por_metro_tela = sc.nextDouble();
        double telaA = precio_por_metro_tela + (precio_por_metro_tela / 2);
        double telaB = precio_por_metro_tela + ((8 * precio_por_metro_tela) / 10);
        System.out.println(telaA);
        System.out.println(telaB);
        double manoA = telaA * 0.8;
        double manoB = telaB * 0.95;
        double gastoA = telaA + manoA;
        double gastoB = telaB + manoB;
        double gananciaA = gastoA * 0.3, gananciaB = gastoA * 0.3;
        double gastototalA = gastoA + gananciaA;
        double gastototalB = gastoB + gananciaB;

        int modelo = 0;
        System.out.println("Ingrese modelo : "
                + "1. modelo A , 2. modelo B");
        modelo = sc.nextInt();
        switch (modelo) {
            case 1:
                System.out.println("Ingrese tipo n  pantalon a comprar");
                int nPantalosA = sc.nextInt();
                System.out.println("La ganacia de " + nPantalosA + " pantlones es " + nPantalosA * gananciaA);
                System.out.println("Precio de venta de A: " + gastototalA * nPantalosA);

                break;
            case 2:
                System.out.println("Ingrese tipo n  pantalon a comprar");
                int nPantalosB = sc.nextInt();
                System.out.println("La ganacia de " + nPantalosB + " pantlones es " + nPantalosB * gananciaB);
                System.out.println("Precio de venta de A: " + gastototalB * nPantalosB);

                break;
        }

    }
}
