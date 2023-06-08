/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p04clasesabstractas;

/**
 * @author Saul Cervantes Candia
 * AGREGUE al proyecto al menos 2 nuevas clases de reproductores de música que extiendan a MusicPlayer.
 * Genere un objeto de cada clase y pruebe sus métodos
 */
public class S07P04ClasesAbstractas {

    public static void main(String[] args) {
        //MusicPlayer m1 = new MusicPlayer(); //No se puede
        
        MP3Player mp3 = new MP3Player();
        mp3.play();
        mp3.changeVolume(5);
        mp3.stop();
        System.out.println("");
        
        CDPlayer c1 = new CDPlayer();
        c1.play();
        c1.changeVolume(8);
        c1.stop();
        System.out.println("");
        
        TocaDisco t1 = new TocaDisco();
        t1.play();
        t1.changeVolume(4);
        t1.stop();
        System.out.println("");
        
        RadioCassette r1 = new RadioCassette();
        r1.play();
        r1.changeVolume(10);
        r1.stop();
    }

}
