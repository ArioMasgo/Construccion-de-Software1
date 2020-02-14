/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventosMasgo;

/**
 *
 * @author Ario1
 */
public class MisConstantes {
    static int num=1;
    private int nro;
    private String codigo;
    private String ubicacion;
    private double costo;

    public MisConstantes(int nro, String codigo, String ubicacion, double costo) {
        this.nro = num++;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.costo = costo;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return  "\nnro: " + nro + "\ncodigo: " + codigo + "\nubicacion: " + ubicacion + "\ncosto: " + costo ;
    }
    
    
    
}
