/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_josuevidal;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Proyecto {

    private int duracion;
    private String nombre;
    private ArrayList<Actividades> actividades = new ArrayList();

    public Proyecto(int duracion, String nombre) {
        this.duracion = duracion;
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Actividades> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividades> actividades) {
        this.actividades = actividades;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
