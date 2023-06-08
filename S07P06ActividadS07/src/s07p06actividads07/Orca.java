/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p06actividads07;

/**
 * @author Saul Cervantes Candia
 */
public abstract class Orca {
    public abstract void comer();
    
    public abstract void dormir();
            
    public void nadar(int d){
        System.out.println("Nadando "+d+" mts");
    }
}
