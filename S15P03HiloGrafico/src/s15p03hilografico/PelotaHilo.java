/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s15p03hilografico;
import javax.swing.*;
import java.awt.*;

/**
 * @author Saul Cervantes Candia
 */
public class PelotaHilo extends Thread{
    private JPanel panel;
    boolean seguirRebotando;
    private int x = 8, cambioX = 2;
    private int y = 2, cambioY = 8;
    private int diametro = 10;
    private final int ancho = 100, alto = 100;
    
    //Constructor
    public PelotaHilo(JPanel elPanel) {
        panel = elPanel;
    }
    
    //Métodos
    @Override
    public void run(){
        seguirRebotando = true;
        while(seguirRebotando){
            mover(); //cambia los valores de cooredenadas
            rebotar(); //verificar los rangos (0-100)
            dibujar(); //dibuja el círculo
            retrasar(); //"duerme" el hilo para que se vea
            eliminar(); //eliminar el circulo
        }
    }
    
    /*
    HILOS SINCRONIZADOS
    - Son aquellos que tienen algún método marcado como "synchronized"
    - Los métodos marcados así, solo pueden ser accedidos por un hilo a la vez
    */
    
    synchronized private void mover(){
        x += cambioX;
        y += cambioY;
    }
    
    synchronized private void rebotar(){
        if (x <= 0 || x >= ancho) {
            cambioX = -cambioX;
        }
        if (y <= 0 || y >= alto) {
            cambioY = -cambioY;
        }
    }
    
    synchronized private void dibujar(){
        Graphics papel = panel.getGraphics();
        papel.setColor(Color.blue);
        papel.fillOval(x, y, diametro, diametro);
    }
    
    synchronized private void retrasar(){
        try{
            Thread.sleep(50);
        }catch(InterruptedException e){
            
        }
    }
    
    private void eliminar(){
        Graphics papel = panel.getGraphics();
        papel.setColor(Color.white);
        papel.fillOval(x, y, diametro, diametro);
    }
    
    public void detener(){
        seguirRebotando = false;
    }
}
