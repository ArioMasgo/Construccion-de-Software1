/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana08.Practica;

import javax.swing.JFrame;

/**
 *
 * @author Ario1
 */
public class CursosVideoTutoriales extends JFrame {

    public CursosVideoTutoriales() {
        super("Curso Videotutoriales Java");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        CursosVideoTutoriales curso = new CursosVideoTutoriales();
    }
}
