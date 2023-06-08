/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s10p07polimorfismo;

/**
 * @author Saul Cervantes Candia
 */
public class Cuadrado extends Circulo{
    @Override
    public void Area(){
        super.Area();
        System.out.println("El area del cuadrado es l*l");
    }
    
    public void espacio(){
        System.out.println("Sus angulos internos son de 90 grados");
    }
    
}
