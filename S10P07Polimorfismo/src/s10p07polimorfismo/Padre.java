/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s10p07polimorfismo;

/**
 * @author Saul Cervantes Candia
 */
public class Padre extends Abuelo{

    @Override
    public void manejar(){
        super.manejar();
        System.out.println("Mi carro es automatico");
    }
    
    public void usarComputadora(){
        System.out.println("Estoy usando PC");
    }
}
