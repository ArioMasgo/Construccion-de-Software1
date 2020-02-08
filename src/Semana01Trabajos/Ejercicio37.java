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
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double prestamo=0,tiempo=0;
        double pagoMensual=0,interes=0,interesPormes=0,npagos,prestamoTotal=0;
        System.out.println("Ingrese monto del prestamo a sacar:");
        prestamo=sc.nextInt();
        System.out.println("Ingrese porcentaje de interes");
        interes=sc.nextDouble();
        System.out.println("Ingrese tiempo a pagar "
                + "1. doce meses , 2. 18 meses");
        tiempo=sc.nextInt();
        
        if (tiempo==1) {
            interes=prestamo*interes;
            prestamoTotal= (prestamo+interes);
            pagoMensual=prestamoTotal/12;
            interesPormes=interes/12;
            npagos=12;
            System.out.println("Usted esta sacando: "+prestamo + " soles .");
            System.out.println("Su interes total es: "+interes);
            System.out.println("Pagara : "+pagoMensual+" soles por mes ");
            System.out.println("Su interes mensual a pagar es : "+interesPormes +"soles");
            System.out.println("Usted pagara: "+npagos+" cuotas");
            
        }if (tiempo==2) {
            interes=prestamo*interes;
            prestamoTotal=(prestamo+interes);
            pagoMensual=prestamoTotal/18;
            interesPormes=interes/18;
            npagos=18;
            System.out.println("Usted esta sacando: "+prestamo + " soles .");
            System.out.println("Su interes total es: "+interes);
            System.out.println("Pagara : "+pagoMensual+" soles por mes ");
            System.out.println("Su interes mensual a pagar es : "+interesPormes +"soles");
            System.out.println("Usted pagara: "+npagos+" cuotas");
        }
    }
}
