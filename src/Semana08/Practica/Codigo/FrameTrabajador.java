/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana08.Practica.Codigo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Ario1
 */
public class FrameTrabajador extends JFrame{
    
    JLabel lblRegistroMascota,lblnombre,lbledad,lblraza;
    JTextField txtnombre,txtSalario,txtdia,txtmes,txtAnio;
    JButton btnregistrar;
    
    ArrayList<Alumno> alumno;
    ArrayList<Fecha> fecha;
    public FrameTrabajador(){
        iniciarComponentes();
        alumno=new ArrayList<Alumno>();
        fecha = new ArrayList<>();
    }
    
    public void iniciarComponentes(){
        setLayout(null);
        setTitle("REGISTRO");
        setSize(370, 270);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblRegistroMascota=new JLabel("Registro de trabajadores");
        lblRegistroMascota.setFont(new Font("Serif",Font.BOLD, 20));
        lblRegistroMascota.setBounds(70, 10, 180, 30);
        
        lblnombre=new JLabel("Nombre:");
        lblnombre.setBounds(20, 60, 70, 20);
        
        lbledad=new JLabel("Salario:");        
        lbledad.setBounds(20, 90, 70, 20);
        
        lblraza=new JLabel("Fecha:");
        lblraza.setBounds(20, 120, 70, 20);
        
        txtnombre=new JTextField();
        txtnombre.setBounds(100, 60, 120, 20);
        
        txtSalario=new JTextField();
        txtSalario.setBounds(100, 90, 50, 20);
        
        txtdia=new JTextField();
        txtdia.setBounds(100, 120, 30, 20);
        
        txtmes=new JTextField();
        txtmes.setBounds(140, 120, 30, 20);
        
        txtAnio=new JTextField();
        txtAnio.setBounds(180, 120, 30, 20);
        
        btnregistrar=new JButton("REGISTRAR");
        btnregistrar.setFont(new Font("Serif", Font.BOLD, 18));
        btnregistrar.setBounds(100, 160, 140, 30);
        
        add(lblRegistroMascota);
        add(lblnombre);
        add(lbledad);
        add(lblraza);
        add(txtnombre);
        add(txtSalario);
        add(txtdia);
        add(txtmes);
        add(txtAnio);
        add(btnregistrar);
        
        btnregistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonRegistrarActionPerformed(e);
            }
        });
    }
    
    private void botonRegistrarActionPerformed(ActionEvent e){
        if (txtnombre.getText().equals(" ") || txtSalario.getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos");

        } else {
            String enteroString = txtdia.getText();
            int entero = Integer.parseInt(enteroString);
            String enteroString1 = txtmes.getText();
            int entero1 = Integer.parseInt(enteroString1);
            String enteroString2 = txtAnio.getText();
            int entero2 = Integer.parseInt(enteroString2);
       

            Alumno alum = new Alumno(txtnombre.getText(), txtSalario.getText());
            Fecha fech = new Fecha(entero, entero1, entero2);
            alumno.add(alum);
            fecha.add(fech);

            txtnombre.setText("");
            txtSalario.setText("");
            txtdia.setText("");
            txtmes.setText("");
            txtAnio.setText("");
            setVisible(false);
        }
    }
    
    public String mostrar(){
        String cad="";
        for (int i = 0; i < alumno.size(); i++) {
            cad+=alumno.get(i).toString()+" \nFecha: "+fecha.get(i).MostrarFecha();
        }
        return cad;
    }
    public String cantidad(){
        return String.valueOf(alumno.size());
    }
}
