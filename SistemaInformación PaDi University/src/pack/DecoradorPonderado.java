/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import javax.swing.JOptionPane;

/**
 *
 * @author OscarLopez
 */
public class DecoradorPonderado extends DecoradorEst{

    public DecoradorPonderado(intEstudiante estudiante) {
        super(estudiante);
    }

    @Override
    public String infoEstudiante() {
        String nota = calcPonderado();
        return this.estudiante.infoEstudiante() + nota;
    }

    private String calcPonderado() {
        float notas = 0;
        float nota = 0;
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de semestres"));
        
        for (int i = 0; i < cant; i++) {
            notas = notas + Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del semestre "+(i+1)));
        }
        
        nota = notas/cant;
        
        return "\nEl promedio ponderado es: "+nota;
    }
    
}
