/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package examenpractico1;
import javax.swing.JOptionPane;

/**
 * @author Saul Cervantes Candia
 */
public class Excepciones{
    public void retirar(float cant, float saldo) throws Exception{
        if(cant>saldo){
            JOptionPane.showMessageDialog(null, "Lo sentimos, no puede retirar esa cantidad");
            throw new Exception();
        }
    }
}
