/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p03ejerciciosobreescritura;

/**
 * @author Saul Cervantes Candia
 */
public class Sapo extends Animal{
    @Override
    public void moverse(int d){
        super.moverse(d);
        System.out.println("Me gusta brincar");
    }
    
    @Override
    public void dormir(){
        System.out.println("Me gusta dormir en el agua");
    }
}
