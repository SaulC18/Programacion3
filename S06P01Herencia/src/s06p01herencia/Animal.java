/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s06p01herencia;

/**
 * @author Saul Cervantes Candia
 */
public class Animal {
    int weight; 
    int age; 
    String hairColor; 
    public void eat(){ System.out.println("Que rico alimento"); } 
    public void rest(){ System.out.println("A descansar"); } 
    public void move(int direction) 
    { System.out.println("Vamos a caminar "+direction+" mts"); } 
}
