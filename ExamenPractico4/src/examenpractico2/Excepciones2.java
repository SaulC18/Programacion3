/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package examenpractico2;
import javax.swing.JOptionPane;

/**
 * @author Saul Cervantes Candia
 */
public class Excepciones2 {
    public void validar(int cam, int cho) throws Exception{
        if(cam>cho){
            JOptionPane.showMessageDialog(null, "Lo sentimos, la operacion del dia es invalida");
            throw new Exception();
        }
    }
}
