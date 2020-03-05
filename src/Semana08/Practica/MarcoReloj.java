/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana08.Practica;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author Ario1
 */
public class MarcoReloj extends JFrame{
    public MarcoReloj() {
        super("Reloj");
        setSize(300, 75);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout dis = new FlowLayout();
        setLayout(dis);
        MarcoReloj tiempo= new MarcoReloj();
        add(tiempo);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        MarcoReloj reloj = new MarcoReloj();
    }
}

