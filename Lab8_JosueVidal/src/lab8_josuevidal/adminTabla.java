/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_josuevidal;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author wende
 */
public class adminTabla extends Thread{
    JTable t;
    String proyecto;
    ArrayList<Actividades> ap;

    public adminTabla() {

    }

    public adminTabla(ArrayList<Actividades> ap) {
        this.ap = ap;
    }

    public adminTabla(ArrayList<Actividades> ap, String proyecto, JTable t) {
        this.t = t;
        this.proyecto = proyecto;
        this.ap = ap;
    }

    public adminTabla(ArrayList<Actividades> ap, String car) {
        this.proyecto = car;
        this.ap = ap;
    }

    public ArrayList<Actividades> getAp() {
        return ap;
    }

    public void setAp(ArrayList<Actividades> ap) {
        this.ap = ap;
    }

    @Override
    public void run() {

        DefaultTableModel m = (DefaultTableModel) t.getModel();
        
        
        for (int i = 0; i < ap.size(); i++) {

            Actividades tmp = ap.get(i);
            Object row[] = {proyecto, tmp.getNombre(), tmp.getDuracion()};
            try {

                Thread.sleep((long)tmp.getDuracion()*1000);
                m.addRow(row);
            } catch (InterruptedException e) {
            }
        }
    }
}
