/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p04clasesabstractas;

/**
 * @author Saul Cervantes Candia
 */
public class RadioCassette extends MusicPlayer{
    @Override
    public void stop(){
        System.out.println("Quitando cassette");
    }
    @Override
    public void play(){
        System.out.println("Insertando cassette");
    }
}
