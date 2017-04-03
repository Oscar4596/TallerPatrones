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
public class DecoradorNotasSemestre extends DecoradorEst{

    public DecoradorNotasSemestre(intEstudiante estudiante) {
        super(estudiante);
    }

    
    
    @Override
    public String infoEstudiante() {
        String nota = calcularNotaSemestre();
        return this.estudiante.infoEstudiante()+"\nLa nota del semestre es: "+ nota;
    }

    private String calcularNotaSemestre() {
    float notas = 0;
    float nota = 0;
        for (int i = 0; i < 3; i++) {
            notas = notas + Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del corte "+(i+1)+":"));
            
        }
        nota = notas/3;
        return nota+"";
    }
    
}
