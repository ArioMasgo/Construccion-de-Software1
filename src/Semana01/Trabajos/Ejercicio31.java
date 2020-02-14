/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana01.Trabajos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ario1
 */
public class Ejercicio31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precioTotal=0;
        String aux2="";
        String aux="";
        do {
            System.out.println("Ingrese precio del articulo: ");
            double precio = sc.nextDouble();
            System.out.println("Cuantas unidades va a comprar: ");
            int unidades= sc.nextInt();
            aux=JOptionPane.showInputDialog("El articulo tiene etiqueta roja: "
                    + "\"[SI][NO]\"");
//            System.out.println("El articulo tiene etiqueta roja: "
//                    + "\"[SI][NO]\"");
//            aux=sc.nextLine();
            
            precio=precio*unidades;
            if (aux.equalsIgnoreCase("Si")) {
                precio=precio-(precio*0.20);
            }
            precioTotal+=precio;
            aux2=JOptionPane.showInputDialog("Vas a sequir comprando: "
                    + "\"[SI][NO]\"");
//            System.out.println("Vas a seguir comprando: ");
//            System.out.println("[SI][NO]");
//            aux2=sc.nextLine();
        } while (!aux2.equalsIgnoreCase("no"));
            System.out.println("MOnto total: "+precioTotal);
    }
}
