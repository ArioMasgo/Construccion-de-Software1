/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana01.Trabajos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ario1
 */
public class Ejercicio08 {

    public static void main(String[] args) throws IOException {

        int n = 0, mayor = -99999;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese cantidad de numeros: ");
        String numCadena = bf.readLine();
        int n1 = Integer.parseInt(numCadena);
        for (int i = 0; i < n1; i++) {
            System.out.println("Ingresa un numero");
            n = Integer.parseInt(bf.readLine());
            if (n > mayor) {
                mayor = n;
            }

        }
        System.out.println("El numero mayor es :" + mayor);

    }
}
