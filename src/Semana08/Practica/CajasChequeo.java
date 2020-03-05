/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana08.Practica;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author Ario1
 */
public class CajasChequeo extends JFrame{
    
    public CajasChequeo() {
        
        super("Cajas Chequeo");
        setSize(345, 120);
        //perimite Cerrar el programa
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox cursoJava = new JCheckBox("Curso de Java",true);
        JCheckBox cursoFlash = new JCheckBox("Curso de Flash",true);
        JCheckBox cursoPHP = new JCheckBox("Curso de PHP",false);
        JCheckBox cursoRuby = new JCheckBox("Curso de Ruby",false);
        //Hacen que todos queden en la ventana
        FlowLayout dis = new FlowLayout();
        setLayout(dis);
        
        ButtonGroup cursos = new ButtonGroup();
        cursos.add(cursoJava);
        cursos.add(cursoFlash);
        cursos.add(cursoPHP);
        cursos.add(cursoRuby);
        //centra la ventana 
        setLocationRelativeTo(null);
        //tamaño fijo a la ventana
        setResizable(false);
        add(cursoJava);
        add(cursoFlash);
        add(cursoPHP);
        add(cursoRuby);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        CajasChequeo app = new CajasChequeo();
    }
    
}
