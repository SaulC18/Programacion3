/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p06actividads07;

/**
 * @author Saul Cervantes Candia
 */
public class BebeOrca extends Orca implements Mar{
    @Override
    public void comer() {
        System.out.println("Vamos a cazar");
    }

    @Override
    public void dormir() {
        System.out.println("Vamos a descansar, ya comi mucho");
    }

    @Override
    public void ubicacion() {
        System.out.println("Estoy en el mar negro");
    }

    @Override
    public void color() {
        System.out.println("El mar es azul");
    }
    
}
