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
public class main {
    public static void main(String[] args) {
        MetodoEvento metodo = new MetodoEvento();
        metodo.crearEvento(new Evento("FIIS", 0, new Expositor(12, "pedro", "soto", "@gmail"), new FechaYHora(), new FechaYHora(), "baja"));
        metodo.mostrarEventos();
    }
}
