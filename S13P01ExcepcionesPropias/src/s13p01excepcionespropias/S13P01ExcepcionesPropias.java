/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s13p01excepcionespropias;
import java.util.Scanner;

/**
 * @author Saul Cervantes Candia
 * EXCEPCIONES PROPIAS:
 * - Se requiere un método que indique desde su encabezado que "throws Exception".
 * - Dentro de ese método, si se cumple una condición para lanzar la excepción requiere la instrucción "throw new Exception()"
 * 
 * AGREGUE A ESTE EJERCICIO:
 * - Un excepción propia que pida una calificación y que si es menor a 6 y mayor a 10 diga que la calificación
 * no es valida
 */
public class S13P01ExcepcionesPropias {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        MisExcepciones e1 = new MisExcepciones();
        
        System.out.println("Dime tu edad: ");
        int edad = entrada.nextInt();
        
        try{
            e1.probarEdad(edad);
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        
        System.out.println("Dame una calificacion: ");
        float calif = entrada.nextFloat();
        
        try{
            e1.calificacion2(calif);
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        /*if(edad>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("ERROR, menor de edad");
        }*/
    }

}
