/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s02p01creacionclases;

/**
 *
 * @author Saul Cervantes Candia
 */
public class Computadora {
    String marca;
    String modelo;
    int cantidad;
    int precio;
    String color;
    
    public Computadora(){
        marca = "Samsung";
        cantidad = 4;
        precio = 2000;
        color = "Negro";
        modelo = "Telefono";
    }
    
    public void comprar(){
        System.out.println("Se pudo comprar!");
    }
    
    public void vender(){
        System.out.println("Necesitaba el dinero");
    }
    
    public void regalar(){
        System.out.println("Felicidades");
    }
}
