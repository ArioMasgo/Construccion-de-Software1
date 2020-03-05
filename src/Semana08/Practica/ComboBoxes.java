/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana08.Practica;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Ario1
 */
public class ComboBoxes extends JFrame{
     public ComboBoxes() {
        super("Combo Boxes");
        setSize(345, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComboBox curso = new JComboBox();
        FlowLayout dis = new FlowLayout();
        curso.addItem("Curso de Java");
        curso.addItem("Curso de C++");
        curso.addItem("Curso de PHP");
        curso.addItem("Curso de Flash");
        curso.addItem("Curso de JavaScript");
        curso.addItem("Curso de Java");
        setLayout(dis);
         setResizable(false);
         setLocationRelativeTo(null);
        add(curso);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        ComboBoxes apli = new ComboBoxes();
    }
}
