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
public class Facultad {
    private String nombre;
    private ArrayList<Carrera> carreras;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.carreras = new ArrayList<Carrera>();
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

    public void addCarreras(Carrera carrera) {
        this.getCarreras().add(carrera);
    }
    
    
}
