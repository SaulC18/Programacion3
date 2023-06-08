/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p03ejerciciosobreescritura;

/**
 * @author Saul Cervantes Candia
 */
public class Animal {
    //atributos
    int edad;
    String color;
    
    public void comer(){
        System.out.println("Comiendo!!");
    }
    public void dormir(){
        System.out.println("Durmiendo!!");
    }
    public void moverse(int d){
        System.out.println("Me estoy moviendo a "+d+" km/h");
    }
}
