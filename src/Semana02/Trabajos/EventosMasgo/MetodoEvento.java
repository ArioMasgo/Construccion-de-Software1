/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventosMasgo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ario1
 */
public class MetodoEvento {
    ArrayList<Evento> evento = new ArrayList<Evento>();
    FechaYHora f= new FechaYHora();
    ArrayList<Asistente> asistente = new ArrayList<Asistente>();
    ArrayList<Expositor> expositor = new ArrayList<Expositor>();
    
    public void crearEvento(Evento e){
        this.evento.add(e);
    }
    
    public void mostrarEventos(){
        for (Evento e : evento) {
            System.out.println(e.toString()+f.MostrarFecha());
        }
    }
    
    public void crearExpositor(Expositor ex){
        this.expositor.add(ex);
    }
    public void crearAsistente(Asistente asis){
        this.asistente.add(asis);
    }
    
    public void elimianrEvento(String titulo){
        boolean band = true;
        for (int i = 0; i < evento.size(); i++) {
            if (evento.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                evento.remove(i);
                band = false;
            }
        }if (band) {
            JOptionPane.showMessageDialog(null, "El Evento no existe");
        }
    }
    
    public void elimanaarExpositor(String name){
        boolean band = true;
        for (int i = 0; i < expositor.size(); i++) {
            if (expositor.get(i).getNombre().equalsIgnoreCase(name)) {
                expositor.remove(i);
                band = false;
            }
        }if (band) {
            JOptionPane.showMessageDialog(null, "El Evento no existe");
        }
    }
}
