/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana04.Practico;

import java.util.ArrayList;

/**
 *
 * @author Ario1
 */
class Disco {

    private String titulo;
    private String autor;

    public Disco(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;

    }

    @Override
    public String toString() {
        return "Disco{" + "\ntitulo= " + titulo + "\nAutor :" + autor;
    }
    
}

class Genero extends Disco {
    
    private String genero;
    
    public Genero(String genero, String titulo, String autor) {
        super(titulo, autor);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + "\ngenero= " + genero + '}';
    }

}

class Formato extends Genero {

    private String tipoformato;

    public Formato(String tipoformato, String genero, String titulo, String autor) {
        super(genero, titulo, autor);
        this.tipoformato = tipoformato;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntipoformato= " + tipoformato + '}';
    }

}

class Valor extends Formato {

    private double valor;

    public Valor(double valor, String tipoformato, String genero, String titulo, String autor) {
        super(tipoformato, genero, titulo, autor);
        this.valor = valor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nvalor= " + valor + '}';
    }

}

public class Ejercicio03 {

    ArrayList<Valor> ListaMultimedia = new ArrayList<>();
    String Nombre[] = {"pedro", "fernando", "federico", "Mario", "toni rosado"};
    String Titulo[] = {"Por ella", "Ella se fue ", "Ella nunaca me amo", "Ya te olvide ctmr"};
    String genero[] = {"rock", "reggeton", "Electro", "salsa", "cumbia"};
    String Formato[] = {"MP3", "MP4"};

    public void IngresarDisco() {
        int max = 20;
        if (ListaMultimedia.size() < max) {
            ListaMultimedia.add(new Valor(aleatorio(12, 100), Formato[aleatorio(0, 1)], genero[aleatorio(0, 4)], Titulo[aleatorio(0, 3)], Nombre[aleatorio(0, 4)]));

        } else {
            System.out.println("Lista llena ");
        }

    }

    static int aleatorio(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void MostrarDiscos() {
        for (int i = 0; i < ListaMultimedia.size(); i++) {
            System.out.println(ListaMultimedia.get(i).toString());
            System.out.println("\n----------------------------");
        }

    }

    public static void main(String[] args) {

        Ejercicio03 s = new Ejercicio03();
        s.IngresarDisco();
        s.IngresarDisco();
        s.MostrarDiscos();

    }
}
