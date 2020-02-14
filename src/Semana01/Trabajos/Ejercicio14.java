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
public class Ejercicio14 {

    public static void main(String[] args) {
        
        float suma, Promedio, s = 0, pa, sm = 0, pg, sg = 0, ptg;
        int cantidadDeGrupo = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de grupos"));

        int CantidadDeAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de alumnos"));

        int CantidadDeMaterias = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de materias"));
        s = 0;

        float c1 = Float.parseFloat(JOptionPane.showInputDialog("Digite la calificacion 1."));
        float c2 = Float.parseFloat(JOptionPane.showInputDialog("Digite la calificacion 2."));
        float c3 = Float.parseFloat(JOptionPane.showInputDialog("Digite la calificacion 3."));
        suma = (c1 + c2 + c3);
        Promedio = suma / 3;
        s = s + Promedio;
        pa = s / CantidadDeMaterias;
        sm = sm + pa;
        JOptionPane.showMessageDialog(null, "El promedio total del alumno es " + pa);
        pg = sm / CantidadDeAlumnos;
        sg = sg + pg;

        JOptionPane.showMessageDialog(null, "El promedio total del grupo es " + pg);
        ptg = sg / cantidadDeGrupo;
        JOptionPane.showMessageDialog(null, "El promedio total de los grupos es " + ptg);

    }
}
