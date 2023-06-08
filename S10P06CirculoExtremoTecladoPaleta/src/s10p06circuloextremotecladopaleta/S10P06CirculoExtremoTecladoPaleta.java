/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s10p06circuloextremotecladopaleta;

/**
 * @author Saul Cervantes Candia
 */
public class S10P06CirculoExtremoTecladoPaleta {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CirculoExtremoTecladoPaleta().setVisible(true);
            }
        });
    }

}
