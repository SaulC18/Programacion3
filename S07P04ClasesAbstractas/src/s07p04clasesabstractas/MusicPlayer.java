/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p04clasesabstractas;

/**
 * @author Saul Cervantes Candia
 */
public abstract class MusicPlayer {
    public abstract void play();
    
    public abstract void stop();
    
    public void changeVolume(int v){
        System.out.println("Estoy al nivel de volumen "+v);
    }
}
