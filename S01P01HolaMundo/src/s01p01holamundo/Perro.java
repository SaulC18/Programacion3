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
public class Perro {
    //Atributos
    int patas;
    String color;
    String raza;
    String nombre;
    int edad;
    
    //Métodos
    public Perro(){
        patas = 4;
        edad = 0;
    }
    
    public void ladrar(){
        System.out.println("Guau guau");
    }
    
    public void comer(){
        System.out.println("Estoy comiendo!");
    }
    
    public void caminar(){
        System.out.println("Caminando!!");
    }
    
}
