/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p06actividads07;

/**
 * @author Saul Cervantes Candia
 * - Programar una clase Abstracta que comience con la inicial de su mascota, con al menos 2 métodos abstractos. (Al menos un método
 * concreto)
 * - Cree una interfaz con al menos 2 métodos. (Que tenga que ver con la clase abstracta).
 * - Cree una clase que HEREDE de la clase abstracta y que IMPLEMENTE la interfaz.
 * - Genere un objeto de la clase que pruebe todos los métodos.
 */
public class S07P06ActividadS07 {

    public static void main(String[] args) {
        BebeOrca o1 = new BebeOrca();
        //Métodos de la clase abstracta
        o1.comer();
        o1.dormir();
        o1.nadar(42);
        System.out.println("");
        //Métodos de la interfaz
        o1.ubicacion();
        o1.color();
    }

}
