/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana08.Practica.Codigo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Ario1
 */
public class FrameRegistro extends JFrame{
    JLabel lblnombreTrabajador, ListaTrabajador,lblcantidad,lblNcant;
    JButton btnagregar,btnmostrar,btnsalir;
    JTextArea txalista;
    
    FrameTrabajador fr=new FrameTrabajador();
    public FrameRegistro(){
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        setLayout(null);
        setTitle("VENTANA ");
        setSize(430,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        lblnombreTrabajador=new JLabel("Agenda Trabajador");
        lblnombreTrabajador.setFont(new Font("Serif", Font.ITALIC, 24));
        lblnombreTrabajador.setBounds(40, 10,310 , 30);
        
        btnagregar=new JButton("AGREGAR");
        btnagregar.setBounds(20, 50, 90, 20);
        
        btnmostrar=new JButton("MOSTRAR");
        btnmostrar.setBounds(130, 50, 95, 20);
        
        btnsalir=new JButton("SALIR");
        btnsalir.setBounds(245, 50, 90, 20);
        
        ListaTrabajador=new JLabel("Lista de Trabajadores: ");
        ListaTrabajador.setBounds(20,90 , 160, 20);
        
        txalista=new JTextArea();
        txalista.setFont(new Font("Serif", Font.BOLD, 14));
        txalista.setBounds(90, 130, 180, 300);
        
        lblcantidad=new JLabel("Cantidad:");
        lblcantidad.setBounds(20, 450, 60, 20);
        
        lblNcant=new JLabel("Nª");
        lblNcant.setBounds(80, 450, 30, 20);
        
        add(lblnombreTrabajador);
        add(btnagregar);
        add(btnmostrar);
        add(btnsalir);
        add(ListaTrabajador);
        add(txalista);
        add(lblcantidad);
        add(lblNcant);
        
        btnagregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonAgregarActionPerformed(e);
            }
        });
        
        btnmostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonMostrarActionPerformed(e);
            }
        });
        
        btnsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonSalirActionPerformed(e);
            }
        });
    }
    
    private void botonAgregarActionPerformed(ActionEvent e){
        fr.setVisible(true);
    }
    
    private void botonMostrarActionPerformed(ActionEvent e){
        txalista.setText(fr.mostrar());
        lblNcant.setText(fr.cantidad());
    }
    
    private void botonSalirActionPerformed(ActionEvent e){
        System.exit(0);
    }
    
    public static void main(String[] args) {
        new FrameRegistro();
    }
}
