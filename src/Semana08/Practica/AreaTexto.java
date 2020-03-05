/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana08.Practica;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Ario1
 */
public class AreaTexto extends JFrame{
    public AreaTexto(){
        super("Area Texto");
        setSize(500,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea comentario = new JTextArea(8,40);
        FlowLayout dis = new FlowLayout();
        setLayout(dis);
        add(comentario);
        setVisible(true);
    }
    public static void main(String[] args) {
        AreaTexto app = new AreaTexto();
        
    }
    
}
