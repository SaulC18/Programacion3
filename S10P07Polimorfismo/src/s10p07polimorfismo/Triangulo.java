/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s10p07polimorfismo;

/**
 * @author Saul Cervantes Candia
 */
public class Triangulo extends Cuadrado{
    @Override
    public void Area(){
        super.Area();
        System.out.println("El area del triangulo es (b*h)/2");
    }
    
    public void forma(){
        System.out.println("Un triangulo puede ser equilatero, escaleno o isoceles");
    }
}
