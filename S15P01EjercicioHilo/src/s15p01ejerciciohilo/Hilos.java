/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s15p01ejerciciohilo;
import java.util.Scanner;

/**
 * @author Saul Cervantes Candia
 */
public class Hilos extends Thread{
    int x;
    
    public Hilos(int opc){
        x = opc;
    }
    
    @Override
    public void run(){
        if(x==1){
            for (int i = 1; i < 200; i+=2) {
                System.out.println(this.getName()+" Impresion: "+i);
            }
        }
        
        if(x==2){
            for (int i = 2; i < 200; i+=2) {
                System.out.println(this.getName()+" Impresion: "+i);
            }
        }
    }
}
