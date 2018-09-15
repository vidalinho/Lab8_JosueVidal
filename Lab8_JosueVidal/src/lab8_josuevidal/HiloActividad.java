/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_josuevidal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
/**
 *
 * @author wende
 */
public class HiloActividad extends Thread {
    private JLabel hora;
    private int secs;
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    
    public HiloActividad(JLabel hora) {
        this.hora = hora;
    }

    public HiloActividad(JLabel hora, int secs, JProgressBar barra) {
        this.hora = hora;
        this.secs = secs;
        this.barra = barra;
        avanzar = true;
        vive = true;
    }

    

    @Override
    public void run() {
        int itime = 0;
       while(true && itime<=secs){
           itime += 1;
           String time =Integer.toString(itime); 
           hora.setText(time);
           barra.setValue(barra.getValue()+1);
           
           try {
               Thread.sleep(1000);
           } catch (Exception e) {
           }
       }
}
}
