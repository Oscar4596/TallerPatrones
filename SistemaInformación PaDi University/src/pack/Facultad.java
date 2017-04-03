/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author OscarLopez
 */
public class Facultad {

    private String nombre;
    private ArrayList<Carrera> carreras;
    private CarreraFactory carrerasFactory;
    

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.carreras = new ArrayList<Carrera>();
        carrerasFactory = new CarreraFactory();
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void addCarreras(String nomCarrera) {
        
        this.carreras = carrerasFactory.getCarrera(nomCarrera, this.getCarreras());
        
        
    }

}
