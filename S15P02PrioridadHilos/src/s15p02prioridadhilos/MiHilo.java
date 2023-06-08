/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s15p02prioridadhilos;

/**
 * @author Saul Cervantes Candia
 */
public class MiHilo extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(this.getName()+" Impresion: "+(i+1));
        }
    }
}
