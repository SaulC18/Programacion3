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
public class Vector {
    int a[] = new int[5]; //5 es el tamaño del arreglo, su índice va de 0-4
    int []b = new int[5];
    float []c = new float[5];
    
    //Leer
    public void leer(){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Dime el elemento "+i);
            a[i] = entrada.nextInt();
        }
    }
    
    //Imprimir
    public void imprimir(){
        for (int i = 0; i < 5; i++) {
            System.out.println("En la posicion "+i+" el valor es "+a[i]);
        }
    }
    
    //Imprimir con FOR mejorado (enhanced for)
    public void imprimirMejor(){
        for (int x : a) {
            System.out.println(x);
        }
    }
    
    //Cree un método "mayor" que devuelve el numero mayor en el arreglo
    public void mayor(){
        int mayor = a[0];
        for (int i = 1; i < 5; i++) {
            if(a[i]>mayor){
                mayor = a[i];
            }
        }
        System.out.println("El mayor es "+mayor);
    }
    
    //Método ordenar por cualquier metodo menos burbuja
    public void ordenar(){
        int aux = 0, min = 0;
        for (int i = 0; i < 5; i++) {
            min = i;
            for (int j = i+1; j < 5; j++) {
                if(a[min] > a[j]){
                    min = j;
                }
            }
            aux = a[i];
            a[i] = a[min];
            a[min] = aux;
        }
    }
    
    public void imprimirOrdenar(){
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
