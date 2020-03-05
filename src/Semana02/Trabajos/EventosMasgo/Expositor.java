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
public class Expositor {
    private int codigo;
    private String nombre;
    private String Apllido;
    private String correo;

    public Expositor(int codigo, String nombre, String Apllido, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Apllido = Apllido;
        this.correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApllido() {
        return Apllido;
    }

    public void setApllido(String Apllido) {
        this.Apllido = Apllido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return  "\ncodigo: " + codigo + "\nnombre: " + nombre + "\nApllido: " + Apllido + "\ncorreo: " + correo ;
    }
    
    
}
