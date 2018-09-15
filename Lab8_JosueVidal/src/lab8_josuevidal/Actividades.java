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
public class Actividades {

    private String nombre;

    private int inicio;
    private int duracion;
    private int final_temprano;
    private ArrayList<Actividades> predecesoras=new ArrayList();
    private ArrayList<Actividades> sucesoras=new ArrayList() ;
    private int retraso;

    public Actividades() {
    }

    public Actividades(String nombre, int inicio, int duracion, int final_temprano, int retraso) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.duracion = duracion;
        this.final_temprano = final_temprano;
        this.retraso = retraso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getFinal_temprano() {
        return final_temprano;
    }

    public void setFinal_temprano(int final_temprano) {
        this.final_temprano = final_temprano;
    }

    public ArrayList<Actividades> getPredecesoras() {
        return predecesoras;
    }

    public void setPredecesoras(ArrayList<Actividades> predecesoras) {
        this.predecesoras = predecesoras;
    }

    public ArrayList<Actividades> getSucesoras() {
        return sucesoras;
    }

    public void setSucesoras(ArrayList<Actividades> sucesoras) {
        this.sucesoras = sucesoras;
    }

    public int getRetraso() {
        return retraso;
    }

    public void setRetraso(int retraso) {
        this.retraso = retraso;
    }
    
    public void addPredecesoras(Actividades p) {
        predecesoras.add(p);
    }
    
    public void addSucesoras(Actividades p) {
        sucesoras.add(p);
    }


    @Override
    public String toString() {
        return "Nombre="+ nombre+"Predecesora="+predecesoras;
    }
    
}
