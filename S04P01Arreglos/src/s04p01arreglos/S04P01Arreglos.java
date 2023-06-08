/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s04p01arreglos;
import java.util.Scanner;
/**
 * @author Saul Cervantes Candia
 * ARREGLOS
 * Es una estructura de datos que permite agrupar un conjunto de valores de un mismo tipo, bajo un mismo nombre y accederlos a través de un
 * ínidce, que comienza en 0.
 * Puede ser unidimensionales (vectores), bidimensionales (matrices) o n-dimensionales.
 */
public class S04P01Arreglos {

    public static void main(String[] args) {
        /*
        Vector vec = new Vector();
        vec.leer();
        vec.imprimir();
        vec.imprimirMejor();
        vec.mayor();
        vec.ordenar();
        vec.imprimirOrdenar();
        */
        Bidimensional bidi = new Bidimensional();
        bidi.leer();
        bidi.imprimir();
        bidi.imprimirMejor();
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Numero de alumno (0-4)");
        x = entrada.nextInt();
        System.out.println("El promedio es: "+bidi.promedio(1));
    }

}
