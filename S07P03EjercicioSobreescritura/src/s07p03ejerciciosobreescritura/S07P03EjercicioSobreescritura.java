/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p03ejerciciosobreescritura;

/**
 * @author Saul Cervantes Candia
 * AGREGUE AL PROYECTO 2 clases que comiencen con las iniciales de tu nombre.
 * Sobreescriba y use "super" con el me´todo moverse y al menos uno más.
 * Cree objetos de estos nuevos animales y prube los métodos
 */
public class S07P03EjercicioSobreescritura {

    public static void main(String[] args) {
        /*Lobo w1 = new Lobo();
        w1.comer();
        w1.dormir();
        w1.moverse(13);
        
        Paloma p1 = new Paloma();
        p1.comer();
        p1.dormir();
        p1.moverse(13);*/
        
        Serpiente s1 = new Serpiente();
        s1.comer();
        s1.dormir();
        s1.moverse(18);
        System.out.println("");
        Sapo s2 = new Sapo();
        s2.comer();
        s2.dormir();
        s2.moverse(5);
    }

}


/*
Un método concreto tiene programación {}
Abstract Classes
-Palabra R -Abstract-
-tiene al menos 1 método abstract
*/