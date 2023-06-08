/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p03ejerciciosobreescritura;

/**
 * @author Saul Cervantes Candia
 */
public class Serpiente extends Animal{
    @Override
    public void moverse(int d){
        super.moverse(d);
        System.out.println("Me deslizo a maxima velocidad");
    }
    
    @Override
    public void comer(){
        System.out.println("Me gusta comer conejos");
    }
}
