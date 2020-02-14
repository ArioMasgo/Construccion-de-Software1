/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventosMasgo;

import java.util.ArrayList;

/**
 *
 * @author Ario1
 */
public class Evento {

    private String titulo;
    private int duracion;
    private Expositor expo;
    private FechaYHora fecha=new FechaYHora();
    private String Temporada;
    private ArrayList<MisConstantes> constantes = new ArrayList<MisConstantes>();
    
    public Evento(String titulo, int duracion, Expositor expo, FechaYHora fechaEntrada, FechaYHora fechasalida, String Temporada) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.expo = expo;
        this.fecha = fechaEntrada;
        this.fecha = fechasalida;
        this.Temporada = Temporada;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public Expositor getExpo() {
        return expo;
    }
    
    public void setExpo(Expositor expo) {
        this.expo = expo;
    }
    
    public FechaYHora getFecha() {
        return fecha;
    }
    
    public void setFecha(FechaYHora fecha) {
        this.fecha = fecha;
    }
    
    public String getTemporada() {
        return Temporada;
    }
    
    public void setTemporada(String Temporada) {
        this.Temporada = Temporada;
    }
    
    public void DesignarPrecio(String codigo) {
        for (int i = 0; i < constantes.size(); i++) {
            if (constantes.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                constantes.get(i).setCosto(250.50);
            } else if (constantes.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                constantes.get(i).setCosto(150.50);
            } else if (constantes.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                constantes.get(i).setCosto(95.00);
            }
        }
        
    }
    
    public double montoTotal(double precio){
         final double IGV=0.18;
         return precio*IGV;
    }
    
    @Override
    public String toString() {
        return "\ntitulo: " + titulo + "\nduracion; " + duracion +"\n-----------" +"\nexpositor:" + expo + "\n-----------------"+"\nfecha: " + fecha.MostrarFecha() + "\nTemporada: " + Temporada;
    }
    
}
