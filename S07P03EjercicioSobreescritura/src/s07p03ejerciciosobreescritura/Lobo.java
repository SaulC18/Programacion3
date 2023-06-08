/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p03ejerciciosobreescritura;

/**
 * @author Saul Cervantes Candia
 */
public class Lobo extends Animal{
    //Métodos
    @Override
    public void moverse(int d){
        super.moverse(12);
        System.out.println("Soy un lobo, me muevo en 4 patas");
    }
}
