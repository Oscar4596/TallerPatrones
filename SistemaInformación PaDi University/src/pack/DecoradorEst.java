/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author OscarLopez
 */
abstract class DecoradorEst implements intEstudiante{
    protected intEstudiante estudiante;

    public DecoradorEst(intEstudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    
    
}
