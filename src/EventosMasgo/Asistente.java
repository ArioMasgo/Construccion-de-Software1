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
public class Asistente {
    private int codigo;
    private String nombre;
    private String Apllido;
    private String correo;
    private String telefono;
    private String direccion;

    public Asistente(int codigo, String nombre, String Apllido, String correo, String telefono, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Apllido = Apllido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\ncodigo :" + codigo + "\n nombre: " + nombre + "\nApllido: " + Apllido + "\ncorreo: " + correo + "\ntelefono: " + telefono + "\n direccion: " + direccion;
    }
    
    
}
