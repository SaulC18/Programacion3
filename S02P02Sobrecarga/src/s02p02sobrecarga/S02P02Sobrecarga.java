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
public class S02P02Sobrecarga {

    public static void main(String[] args) {
        
        Computadora c1 = new Computadora();
        
        Computadora c2 = new Computadora(1572.24f);
        
        Computadora c3 = new Computadora("Ryzen 5");
        
        c1.modelo = "ThinkCentre";
        System.out.println("Modelo de c1: "+c1.modelo);
        
        System.out.println("El precio de c2 es: "+c2.precio);
        
        System.out.println("El procesador de c3 es: "+c3.procesador);
    }
    
    /*
    Sobrecarga
    -2 o más metodos que se llamen igual
    -Reciben parámtros diferentes
    */
}
