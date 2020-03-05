/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorVentaLaLechera;

/**
 *
 * @author Ario1
 */
public class Producto {
    private String nombre;
    private double precio;
    private String unidad;
    private int Stock;

    public Producto(String nombre, double precio, String unidad, int Stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidad = unidad;
        this.Stock = Stock;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    public void modificarStock(int sto){
        Stock=Stock-sto;
        System.out.println("Venta realizada");
    }
    
    public boolean quedaStock(int stock){
        if (this.Stock>=stock) {
            return true;
        } else {
            System.err.println("Error. Stock al Vacio");
            return false;
        }
    }

    @Override
    public String toString() {
        return "\nnombre: " + nombre + "\nprecio: " + precio + "\nunidad: " + unidad + "\nStock: " + Stock;
    }
    
    
}
