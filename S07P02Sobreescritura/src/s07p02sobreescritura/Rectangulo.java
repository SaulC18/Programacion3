/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p02sobreescritura;

/**
 * @author Saul Cervantes Candia
 */
public class Rectangulo extends Figuras{
    float base;
    float altura;
    
    public float area(){
        return base*altura;
    }
}
