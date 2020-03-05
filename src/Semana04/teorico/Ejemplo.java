/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana04.teorico;

/**
 *
 * @author Ario1
 */
interface Prestable{
    void Prestar();
    void devolver();
    boolean prestado();
}
class Libro implements Prestable{
    private String codigo;
    private String titulo;
    private String AñodePublicacion;
    private boolean prestado;

    public Libro(String codigo, String titulo, String AñodePublicacion,boolean prestado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.AñodePublicacion = AñodePublicacion;
        this.prestado=prestado;
    }
      @Override
    public void Prestar() {
          if (prestado==prestado()) {
              prestado=true;
          }else{
              System.out.println("EL libro esta prestado");
          }

    }

    @Override
    public void devolver() {
        if (this.prestado==prestado()) {
            prestado=false;
        }else{
            System.out.println("Usted no adquirio este libro");
        }
        
    }

    @Override
    public boolean prestado() {
        if (prestado==true) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", A\u00f1odePublicacion=" + AñodePublicacion + ", prestado=" + prestado + '}';
    }

  

}
//class lisbros extends Libro{
//    private boolean prestado;
//    public lisbros(String codigo, String titulo, String AñodePublicacion, boolean prestado) {
//        super(codigo, titulo, AñodePublicacion);
//        this.prestado=prestado;
//    }
//    @Override
//    public void Prestar(){
//        
//    }
//
//}


public class Ejemplo {
    
}
