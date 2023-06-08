/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s01p01holamundo;

/**
 *
 * @author Saul Cervantes Candia
 */
public class Silla {
    //Atributos
    int patas;
    boolean asiento;
    String material;
    String color;
    
    //Constructor
    /*public Silla(){   //constructor vacio 
        
    }*/
    public Silla(){
        material = "Madera";
    }
    
    //Método
    public void cargar() {
        System.out.println("Estoy cargando!");
    }
    
}
