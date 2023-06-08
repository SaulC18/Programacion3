/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s15p01ejerciciohilo;

/**
 * @author Saul Cervantes Candia
 * REALIZA:
 * - Una clase que extienda de Thread y que si recibe un 1 imprima los numeros "nones" del 1 al 200 
 * y si recibe un 2 imprima los números pares del 1 al 200.
 * - Genere 4 hilos de la clase
 */
public class S15P01EjercicioHilo {

    public static void main(String[] args) {
        Hilos h1 = new Hilos(1);
        Hilos h2 = new Hilos(2);
        Hilos h3 = new Hilos(1);
        Hilos h4 = new Hilos(2);
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }

}
