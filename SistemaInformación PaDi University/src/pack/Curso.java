/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author OscarLopez
 */
public class Curso {

    private String codigo;
    private String nombre;
    private ArrayList<Estudiante> Estudiantes = new ArrayList<>();
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Estudiantes = new ArrayList<Estudiante>();
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return Estudiantes;
    }

    public void addEstudiantes(Estudiante estudiante) {
        this.getEstudiantes().add(estudiante);
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void addProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    
}

