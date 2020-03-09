/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana02.teorico;

/**
 *
 * @author Ario1
 */
interface general{
 void save(Object o);
}

class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
class msql implements general{

    @Override
    public void save(Object o) {
        if (o instanceof Persona) {
            System.out.println("La persona se agrego");
        }
    }    
}
class oracle implements general{

    @Override
    public void save(Object o) {
        if (o instanceof Persona) {
            System.out.println("La persona se agrego");
        }
    }    
}
class servicio{
    general gen;
    void serviogen(general p){
        gen =p;
    }
    void guardar(Persona e){
        gen.save(e);
    }
}

    

public class Ejercicio03 {
    public static void main(String[] args) {
        servicio p = new servicio();
        p.serviogen(new oracle());
        p.guardar(new Persona());
    }
    
    
    
}
