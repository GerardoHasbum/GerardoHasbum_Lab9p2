/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardohasbum_lab9p2;

import javax.swing.JProgressBar;

/**
 *
 * @author ghasb
 */
public class HiloBarra implements Runnable{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;

    public HiloBarra(JProgressBar barra) {
        this.barra = barra;
        avanzar=true;
        vive=true;
    }
    
    
    

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }


    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }


    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==100){
                    vive=false;
                }                
            } //FIN IF
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }
}
