/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s10p04paintpaleta;

/**
 * @author Saul Cervantes Candia
 */
public class S10P04PaintPaleta {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaintPaleta().setVisible(true);
            }
        });
    }

}
