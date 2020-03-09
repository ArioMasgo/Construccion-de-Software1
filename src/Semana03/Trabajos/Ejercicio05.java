/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.Trabajos;

import java.util.ArrayList;

/**
 *
 * @author Ario1
 */
class PaLinea {

    private String frase;
    private ArrayList<String> listaLetras;
    private ArrayList<Integer> listaPosiciones;

    public PaLinea(String cadena) {
        this.frase = cadena;
        listaLetras = new ArrayList<>();
        listaPosiciones = new ArrayList<>();
    }

    public void setCadena(String cadena) {
        this.frase = cadena;
    }

    private boolean letrasMinus(char i) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (i == c) {
                return true;
            }
        }
        return false;
    }

    private boolean letrasMayus(char i) {
        for (char c = 'A'; c <= 'Z'; c++) {
            if (i == c) {
                return true;
            }
        }
        return false;
    }

    public String letra(int pos) {
        return "" + frase.charAt(pos);
    }

    public void infoLetras() {

        for (int i = 0; i < frase.length(); i++) {
            listaLetras.add(letra(i));
            listaPosiciones.add(i);
        }

    }

    public String mostrar() {
        String cad = "";
        for (int i = 0; i < listaLetras.size(); i++) {

            if (letrasMayus(frase.charAt(i)) || letrasMinus(frase.charAt(i))) {
                cad += " Letra: " + listaLetras.get(i) + ", posicion: " + listaPosiciones.get(i) + "\n";
            } else if (frase.equals(" ")) {
                cad += " ";
            }
        }

        return cad;
    }

}

public class Ejercicio05 {

    public static void main(String[] args) {
        PaLinea pl = new PaLinea("Hola mundo");
        pl.infoLetras();
        System.out.println(pl.mostrar());
    }
}
