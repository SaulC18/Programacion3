/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s10p07polimorfismo;

/**
 * @author Saul Cervantes Candia
 */
public class Hijo extends Padre{

    @Override
    public void manejar(){
        System.out.println("");
        super.manejar();
        System.out.println("Mi auto es un Tesla!! :D");
    }
    
    public void programarJava(){
        System.out.println("Estoy programando en JAVA");
    }
}
