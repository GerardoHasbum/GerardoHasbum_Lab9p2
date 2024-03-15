/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardohasbum_lab9p2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author ghasb
 */

public class HiloTiempo implements Runnable {
    private JLabel hora;
    private JLabel fecha;
    public HiloTiempo(JLabel hora, JLabel fecha) {
        this.hora = hora;
        this.fecha = fecha;
    }        

    @Override
    public void run() {
        while(true){
            Date h=new Date();
            DateFormat e=new SimpleDateFormat("dd/MM/yyyy");
            DateFormat f=new SimpleDateFormat("hh:mm:ss");
            hora.setText( f.format(h) );
            fecha.setText(e.format(h));
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                
            }
        }        
    }
    
}
