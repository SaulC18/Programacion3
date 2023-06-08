/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s04p01arreglos;
import java.util.Scanner;

/**
 * @author Saul Cervantes Candia
 */
public class Bidimensional {
    int a[][] = new int [3][5];
    
    public void leer(){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Dime el elemento "+i+j);
                a[i][j] = entrada.nextInt();
            }
        }
    }
    
    //Imprimir
    public void imprimir(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    //Imprimir con FOR mejorado (enhanced for)
    public void imprimirMejor(){
        for (int x[] : a) {
            for (int y : x) {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
    
    //suponga que el indice que llega a 3 son las calificaciones parciales de 5 alumnos.
    //Haga un método que reciba al usuario el número (indice) de un alumno y devuelva el promedio de los "tres parciales".
    public float promedio(int indice){
        float prom = 0;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += a[i][indice];
        }
        prom = (float)sum/3f;
        return prom;
    }
}
