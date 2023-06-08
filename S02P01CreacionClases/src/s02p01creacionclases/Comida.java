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
public class Comida {
    String tienda;
    int precioC;
    String color;
    String producto;
    String complemento;
    
    public Comida(){
        tienda = "Soriana";
        producto = "Manzanas";
        color = "Rojas";
        precioC = 50;
        complemento = "Chamoy";
    }
    
    public void comprar(){
        System.out.println("Estan caras");
    }
    
    public void probar(){
        System.out.println("Estan muy ricas!");
    }
    
    public void preparar(){
        System.out.println("Es muy tardado pero vale la pena");
    }
    
}
