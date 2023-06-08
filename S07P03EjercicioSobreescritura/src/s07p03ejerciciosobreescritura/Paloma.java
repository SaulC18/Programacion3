/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p03ejerciciosobreescritura;

/**
 * @author Saul Cervantes Candia
 */
public class Paloma extends Animal{
    //Método
    @Override
    public void moverse(int d){
        super.moverse(d);
        System.out.println("Soy una paloma y me transporto volando!!");
    }
}
