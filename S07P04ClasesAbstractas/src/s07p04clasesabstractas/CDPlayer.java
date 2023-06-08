/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p04clasesabstractas;

/**
 * @author Saul Cervantes Candia
 */
public class CDPlayer extends MusicPlayer{
    @Override
    public void stop(){
        System.out.println("Deteniendo CD");
    }
    @Override
    public void play(){
        System.out.println("Reproduciendo CD");
    }
}
