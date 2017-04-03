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
public class CarreraFactory {
    private HashMap<String, Carrera> carrPorNombre;

    public CarreraFactory() {
        carrPorNombre = new HashMap<String, Carrera>();
    }

    public ArrayList<Carrera> getCarrera(String nombre, ArrayList<Carrera> carreras){
        Carrera carr = (Carrera)carrPorNombre.get(nombre);
        if(carr == null){
            carr = new Carrera(nombre);
            carrPorNombre.put(nombre, carr);
            carreras.add(carr);
            System.out.println("Carrera " + carr.getNombre() + " añadida ");
        }
        return carreras;
    }
}
