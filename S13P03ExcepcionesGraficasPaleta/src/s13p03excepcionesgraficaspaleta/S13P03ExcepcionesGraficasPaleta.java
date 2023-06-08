/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s13p03excepcionesgraficaspaleta;

/**
 * @author Saul Cervantes Candia
 */
public class S13P03ExcepcionesGraficasPaleta {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcepcionesGraficasPaleta().setVisible(true);
            }
        });
    }

}
