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
public class Universidad {

    private String nombre;
    private ArrayList<Facultad> facultades;

    public Universidad(String nombre) {
        this.nombre = nombre;
        facultades = new ArrayList<Facultad>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }

    public void addFacultades(Facultad facultad) {
        this.getFacultades().add(facultad);
        System.out.println("Facultad " + facultad.getNombre() + " añadida");
    }

    public Facultad buscaFacultad(String nombreFacultad) {
        Facultad facultad = null;
        for (int i = 0; i < facultades.size(); i++) {
            if (nombreFacultad.equals(facultades.get(i).getNombre())) {
                facultad = facultades.get(i);
            }
        }
        return facultad;
    }

    public void addCarreras(String nomFacu, Carrera carrera) {
        Facultad faculti = this.buscaFacultad(nomFacu);
        faculti.addCarreras(carrera);
        System.out.println("Carrera " + carrera.getNombre() + " añadida en " + faculti.getNombre());
    }

    public Carrera buscaCarrera(String nomFacultad, String nomCarrera) {
        Facultad fac = this.buscaFacultad(nomFacultad);
        Carrera car = null;
        for (int i = 0; i < fac.getCarreras().size(); i++) {
            if(nomCarrera.equals(fac.getCarreras().get(i).getNombre())){
            car = fac.getCarreras().get(i);
            }
        }
        return car;
    }
    public void listarFacultades(){
        System.out.println("Facultades universidad "+this.getNombre()+":\n");
        for (int i = 0; i < this.getFacultades().size(); i++) {
            System.out.println("\t-"+this.getFacultades().get(i).getNombre());
        }
    }
    public void listarCarreras(){
        System.out.println("Carreras universidad "+this.getNombre()+":\n\tFacultades:");
        for (int i = 0; i < this.getFacultades().size(); i++) {
            System.out.println("\t\t-"+this.getFacultades().get(i).getNombre());
            for (int j = 0; j < this.getFacultades().get(i).getCarreras().size(); j++) {
                System.out.println("\t\t\t-"+this.getFacultades().get(i).getCarreras().get(i).getNombre());
                
            }
        }
    }

}
