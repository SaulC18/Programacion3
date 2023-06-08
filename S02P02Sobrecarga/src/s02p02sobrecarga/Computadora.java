/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s02p02sobrecarga;

/**
 *
 * @author Saul Cervantes Candia
 */
public class Computadora {
    //Atributos
    String color;
    String modelo;
    String procesador;
    float precio;
    
    //Métodos
    //constructor
    public Computadora(){
        System.out.println("Constructor sin parametros");
    }
    //sobrecarga del constructor
    public Computadora(float p){
        precio = p;
    }
    
    public Computadora(String pro){
        procesador = pro;
    }
    
    //De la clase
    public void encender(){
        System.out.println("Encendido");
    }
    public void encender(float pre){
        pre=precio*2;
    }
    
    public void jugar(){
        System.out.println("A jugar!!!");
    }
}
