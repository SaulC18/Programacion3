/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p02sobreescritura;

/**
 * @author Saul Cervantes Candia
 */
public class Triangulo extends Rectangulo{
    /*Sobreescribir un método implica volverlo a programar en la "subclase". Se tiene que usar exactamente la misma
    firma*/
    
    @Override
    public float area(){
        return super.area()/2f; //base*altura/2f;
                    //super permite usar métodos de la clase padre
    }
}
