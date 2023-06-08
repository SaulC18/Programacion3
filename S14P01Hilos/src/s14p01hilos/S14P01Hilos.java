/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s14p01hilos;

/**
 * @author Saul Cervantes Candia
 * HILOS:
 * Es una propiedad de Java con la que se puede "simular" la "multiprogramación" o "multiproceso" permite "correr"
 * 2 o más bloques de código "simultáneamente".
 * - En un programa Java en ejecución siempre hay al menos UN hilo(thread)
 * - Se tiene que crear una clase que extiende de Thread y que:
 * - Sobreescribe el método "run". En este método se colocan todas las instrucciones que se quieren ejecutar 
 * "simultanáneamente".
 * - Para correr un hilo se debe mandar llamar al método "start". Start prepara el hilo para ejecutarse y después
 * manda a llamar a "run".
 * - Hay muchos métodos para controlar los hilos (play, stop, resume, etc.) que ya no estan permitidos, por lo que 
 * SE DEBE programar un mecanismo para detener el hilo.
 */
public class S14P01Hilos {

    public static void main(String[] args) {
        MiHilo h1 = new MiHilo();
        MiHilo h2 = new MiHilo();
        Thread h3 = new MiHilo(); //Polimorfismo
        Thread h4 = new MiHilo();
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }

}
