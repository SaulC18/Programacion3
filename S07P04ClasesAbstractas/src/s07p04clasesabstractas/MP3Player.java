/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p04clasesabstractas;

/**
 * @author Saul Cervantes Candia
 */
public class MP3Player extends MusicPlayer{
    @Override
    public void stop(){
        System.out.println("Deteniendo MP3");
    }
    @Override
    public void play(){
        System.out.println("Reproduciendo MP3");
    }
}
