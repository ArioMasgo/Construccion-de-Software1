/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana02.teorico;

import java.util.ArrayList;

/**
 *
 * @author Ario1
 */
public class testDoctor {

    public static void main(String[] args) {
        ArrayList<Doctor> doctor = new ArrayList<>();
        doctor.add(new Doctor("LUIS"));
        doctor.add(new Doctor("PEDRO"));
        doctor.add(new Doctor("FEDERICO"));
        doctor.add(new Doctor("MARCOS"));
        for (Doctor doctor1 : doctor) {
            System.out.println(doctor1.toString());
        }
    }

}
