/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s15p02prioridadhilos;

/**
 * @author Saul Cervantes Candia
 * PRIORIDAD HILOS:
 * - Se puede establecer la "prioridad" de ejecución de un hilo con la instrucción "setPriority" que recibe parametros
 * del 1 al 10 donde:
 * - 1 es equivalente a "MIN_PRIORITY"
 * - 2, 3, 4
 * - 5 es equivalente a "NORM_PRIORITY"
 * - 6, 7, 8, 9
 * - 10 es equivalente a "MAX_PRIORITY"
 * 
 * - Obviamente se deben establecer las prioridades
 * ANTES de ejecutar 
 */
public class S15P02PrioridadHilos {

    public static void main(String[] args) {
        MiHilo h1 = new MiHilo();
        MiHilo h2 = new MiHilo();
        Thread h3 = new MiHilo(); //Polimorfismo
        Thread h4 = new MiHilo();
        
        h1.setPriority(1);
        h2.setPriority(5);
        h3.setPriority(Thread.MAX_PRIORITY);
        h4.setPriority(10);
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }

}
