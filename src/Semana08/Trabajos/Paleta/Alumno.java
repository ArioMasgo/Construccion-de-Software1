/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana08.Trabajos.Paleta;

/**
 *
 * @author Ario1
 */
public class Alumno {
    static int idx = 1;
    private String name;
    private int id;
    private String salario;
    private String check;

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public Alumno(String name,String salario) {
        this.name = name;
        this.id = idx++;
        this.salario = salario;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nid: " + id + "\nnombre: " + name + " \nsalario: " + salario;
    }
}
