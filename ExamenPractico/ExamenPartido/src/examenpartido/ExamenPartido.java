/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package examenpartido;
import java.util.Scanner;

/**
 * @author Saul Cervantes Candia - 177927
 * clase de 8 a 9 am
 */
public class ExamenPartido {

    public static void main(String[] args) {
        Partido part = new Partido();
        
        part.puntaje();
        part.impresionPuntajes();
        part.victorias();
    }

}
