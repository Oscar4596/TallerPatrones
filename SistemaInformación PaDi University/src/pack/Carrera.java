/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.util.ArrayList;

/**
 *
 * @author OscarLopez
 */
public class Carrera {

    private String nombre;
    private ArrayList<Curso> cursos;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<Curso>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void addCurso(Curso curso) {
        this.getCursos().add(curso);
        System.out.println("Curso " + curso.getNombre() + " añadido a " + this.getNombre());
    }

    public Curso buscarCurso(String codCurso) {
        Curso cursito = null;
        for (int i = 0; i < cursos.size(); i++) {
            if (codCurso.equals(cursos.get(i).getCodigo())) {
                cursito = cursos.get(i);
            }
        }
        return cursito;
    }

    public void addEstudiante(String codCurso, Estudiante estud) {

        Curso cursito = this.buscarCurso(codCurso);
        cursito.addEstudiantes(estud);

    }

    public void addProfesor(String codCurso, Profesor profesor) {
        Curso cursito = this.buscarCurso(codCurso);
        cursito.addProfesor(profesor);
        System.out.println("Curso " + cursito.getNombre() + " añadido a " + this.getNombre());
    }

    public void listarCursos() {
        System.out.println("Cursos de " + this.getNombre() + ":\n");
        for (int i = 0; i < this.getCursos().size(); i++) {
            System.out.println("\n\t" + this.getCursos().get(i).getNombre() + "\t\t" + this.getCursos().get(i).getCodigo());
        }
    }

    public void inforCurso(String codCurso) {
        Curso cur = this.buscarCurso(codCurso);
        System.out.println("" + cur.getNombre() + ":\n");
        System.out.println("\tProfesor: \t" + cur.getProfesor());
        for (int i = 0; i < cur.getEstudiantes().size(); i++) {
            System.out.println("\n\t\t" + cur.getEstudiantes().get(i).getNombre()
                    + "\n\t\t\tCodigo: " + cur.getEstudiantes().get(i).getCodigo());
        }
    }

}
