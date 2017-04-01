/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import javax.swing.JOptionPane;

public class Main {

    private Universidad uni;
    private Carrera carrera;
    private String nomUni, nomFacu, nomCarrera, nomCurso, codCurso;
    int mas = 1;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        nomUni = JOptionPane.showInputDialog("Ingrese el nombre de la Universidad");
        uni = new Universidad(nomUni);
        int menu = 0;

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Menú:\n\t"
                    + "1) Crear Facultad\n\t"
                    + "2) Crear Carrera\n\t"
                    + "3) Crear Curso\n\t"
                    + "4) Manejo cursos\n\t"
                    + "5) Listar facultades\n\t"
                    + "6) Lista carreras\n\t"
                    + "7) Listar cursos\n\t"
                    + "8) Listar curso\n\t"
                    + "0) Salir"));
            switch (menu) {
                case 1:
                    crearFacultad();
                    break;
                case 2:
                    crearCarrera();
                    break;
                case 3:
                    crearCurso();
                    break;
                case 4:
                    manejoCurso();
                    break;
                case 5:
                    listarFacultades();
                    break;
                case 6:
                    listarCarreras();
                    break;
                case 7:
                    listarCursos();
                    break;
                case 8:
                    infoCurso();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Que tenga un lindo día, o linda tarde o linda noche");
                    break;

            }
        } while (menu != 0);

        //Creación de facultades
        //Creación de carreras
        //Creación de cursos
        //Manejo de cursos
    }

    private void crearFacultad() {

        do {

            nomFacu = JOptionPane.showInputDialog("Ingrese el nombre de la facultad");
            uni.addFacultades(new Facultad(nomFacu));
            mas = JOptionPane.showConfirmDialog(null, "¿Desea añadir más facultades?");

        } while (mas == 0);
    }

    private void crearCarrera() {
        do {
            nomFacu = JOptionPane.showInputDialog("Ingrese el nombre de la facultad en la que desea agregar la carrera");
            nomCarrera = JOptionPane.showInputDialog("Ingrese el nombre de la carrera");
            this.carrera = new Carrera(nomCarrera);
            if (uni.buscaFacultad(nomFacu) == null) {
                JOptionPane.showMessageDialog(null, "No se encontró la carrera", "ERROR", 1);
            } else {
                uni.addCarreras(nomFacu, this.carrera);
                mas = JOptionPane.showConfirmDialog(null, "¿Desea añadir más carreras?");
            }
        } while (mas == 0);
    }

    private void crearCurso() {
        do {
            nomFacu = JOptionPane.showInputDialog("Ingrese el nombre de la facultad donde está la carrera");
            nomCarrera = JOptionPane.showInputDialog("Ingrese el nombre de la carrera que está buscando");
            if (this.uni.buscaCarrera(nomFacu, nomCarrera) == null) {
                JOptionPane.showMessageDialog(null, "No se encontró la carrera", "ERROR", 1);
            } else {
                this.carrera = uni.buscaCarrera(nomFacu, nomCarrera);
                codCurso = JOptionPane.showInputDialog("Ingrese codigo de curso");
                nomCurso = JOptionPane.showInputDialog("Ingrese nombre del curso");
                carrera.addCurso(new Curso(codCurso, nomCurso));

            }
            mas = JOptionPane.showConfirmDialog(null, "¿Desea añadir más cursos?");
        } while (mas == 0);

    }

    private void manejoCurso() {
        int masEst;
        do {

            nomFacu = JOptionPane.showInputDialog("Ingrese el nombre de la facultad donde está la carrera");
            nomCarrera = JOptionPane.showInputDialog("Ingrese el nombre de la carrera que está buscando");
            nomCurso = JOptionPane.showInputDialog("Ingrese el codigo del curso que está buscando");

            if (this.uni.buscaCarrera(nomFacu, nomCarrera) == null) {
                JOptionPane.showMessageDialog(null, "No se encontró la carrera", "ERROR", 1);
            } else if (this.carrera.buscarCurso(nomCurso) == null) {
                JOptionPane.showMessageDialog(null, "No se encontró la curso", "ERROR", 1);
            } else {

                try {
                    Curso curso = this.carrera.buscarCurso(nomCurso);

                    carrera.addProfesor(curso.getCodigo(),
                            new Profesor(
                                    JOptionPane.showInputDialog("Ingrese codigo de profesor"),
                                    JOptionPane.showInputDialog("Ingrese nombre de profesor")));

                    do {

                        carrera.addEstudiante(curso.getCodigo(),
                                new Estudiante(
                                        JOptionPane.showInputDialog("Ingrese codigo del estudiante"),
                                        JOptionPane.showInputDialog("Ingrese nombre del estudiante")));

                        masEst = JOptionPane.showConfirmDialog(null, "¿Desea añadir más estudiantes?");
                    } while (masEst == 0);

                } catch (Error er) {
                    JOptionPane.showMessageDialog(null, "No se encontró curso");
                    System.out.println(""+er);
                }

            }

            mas = JOptionPane.showConfirmDialog(null, "¿Desea modificar más cursos?");

        } while (mas == 0);
    }

    private void listarFacultades() {
        this.uni.listarFacultades();
    }

    private void listarCarreras() {
        this.uni.listarCarreras();
    }

    private void listarCursos() {
        this.carrera = this.uni.buscaCarrera(
                JOptionPane.showInputDialog("Ingrese el nombre de la facultad"),
                JOptionPane.showInputDialog("Ingrese el nombre de la carrera"));
        carrera.listarCursos();
    }

    private void infoCurso() {
        try {
            this.carrera = this.uni.buscaCarrera(
                    JOptionPane.showInputDialog("Ingrese el nombre de la facultad"),
                    JOptionPane.showInputDialog("Ingrese el nombre de la carrera"));
            carrera.inforCurso(JOptionPane.showInputDialog("Ingrese codigo del curso"));
        } catch (Error er) {
            JOptionPane.showMessageDialog(null, "No se encontró el curso");
            System.err.println("ERROR" + er);
        }
    }

}
