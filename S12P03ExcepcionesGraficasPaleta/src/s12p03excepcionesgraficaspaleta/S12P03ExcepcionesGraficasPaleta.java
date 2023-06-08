/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s12p03excepcionesgraficaspaleta;

/**
 * @author Saul Cervantes Candia
 */
public class S12P03ExcepcionesGraficasPaleta {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcepcionesGraficasPaleta().setVisible(true);
            }
        });
    }

}
