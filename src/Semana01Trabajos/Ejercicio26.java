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
public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Peso = 0;
        int UltimoPeso = 0;
        int AcumuladorPeso = 0;
        int DiferenciaPeso = 0;
        int PromedioPeso = 0;
        
        System.out.println("-------");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese peso :");
            Peso = sc.nextInt();
            AcumuladorPeso = AcumuladorPeso + Peso;
        }
        PromedioPeso = AcumuladorPeso / 10;
        DiferenciaPeso = PromedioPeso - UltimoPeso;

        if (Peso > 0) {
            System.out.println("Subio: " + DiferenciaPeso);

        }
        if (Peso < 0) {
            System.out.println("Bajo: " + DiferenciaPeso);

        }
    }
}