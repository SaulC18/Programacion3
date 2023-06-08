/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p04clasesabstractas;

/**
 * @author Saul Cervantes Candia
 */
public class TocaDisco extends MusicPlayer{
    @Override
    public void stop(){
        System.out.println("Quitando la aguja");
    }
    @Override
    public void play(){
        System.out.println("Colocando disco y luego la aguja");
    }
}
