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
public class Partido {
    //Atributos
    String local;
    String visitante;
    int ar[][] = new int[2][4];
    Scanner entra = new Scanner(System.in);
    
    //Constructor
    public Partido(){
        
    }
    
    //Métodos
    public void puntaje(){
        System.out.print("Equipo local: ");
        local = entra.next();
        System.out.print("Equipo visitante: ");
        visitante = entra.next();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                ar[i][j] = (int)(Math.random()*(150-25)+1);
            }
        }
    }
    public void impresionPuntajes(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public void victorias(){
        //checa quien gano en el primer periodo
       if(ar[0][0]>ar[1][0]){
           System.out.println("Periodo 1 gana "+local);
       }else{
           System.out.println("Periodo 1 gana "+visitante);
       }
        //checa quien gano en el segundo periodo
       if(ar[0][1]>ar[1][1]){
           System.out.println("Periodo 2 gana "+local);
       }else{
           System.out.println("Periodo 2 gana "+visitante);
       }
        //checa quien gano en el tercero periodo
       if(ar[0][2]>ar[1][2]){
           System.out.println("Periodo 3 gana "+local);
       }else{
           System.out.println("Periodo 3 gana "+visitante);
       }
        //checa quien gano en el cuarto periodo
       if(ar[0][3]>ar[1][3]){
           System.out.println("Periodo 4 gana "+local);
       }else{
           System.out.println("Periodo 4 gana "+visitante);
       }
    }
}
