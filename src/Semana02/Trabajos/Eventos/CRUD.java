/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana02.Trabajos.Eventos;

/**
 *
 * @author Ario1
 */
public interface CRUD {

    double platinum = 250.50;
    double gold = 150.50;
    double vip = 95.00;

    void agregarExpositor(Expositor e);

    void AgregarAsistente(Asistente a);

    void EliminarExpositor(String cod);

    void EliminarAsistente(String cod);
}
