/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s12p01excepciones;
import java.util.*;

/**
 * @author Saul Cervantes Candia
 * EXCEPCIONES: Permiten programar alternativas a situaciones que el sistema no espera que sucedan.
 * - Controladas: Es obligatorio programar (BD)
 * - No controladas: Uno decide si quiere "gestionarlas" (suelen ser en tiempo de ejecución - runtime)
 * 
 * Hay también excepciones de sistema y propias (controladas).
 * 
 * En una excepcion propia se debe programar un método que "throws" Exception y dentro de su código debe de existir
 * una instrucción que "throw" Exception.
 * 
 * Para atrapar una excepción:
 * - Colocar el código que puede "lanzar" la excepción dentro de un "try{}"
 * - Se debe colocar una instrucción catch que atrape la excepción. (Puede no colocarse ninguna peron en ese caso es 
 * obligatorio un "finally")
 * - Finally es una instrucción que se ejecuta "si o si" después de un try.
 */
public class S12P01Excepciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int c[] = new int[5];
        System.out.println("Dame 2 numeros");
        try{
            float a = entrada.nextInt();
            float b = entrada.nextInt();
            c[3] = 4;
            System.out.println("La suma es de: "+(a+b));
            System.out.println("La division es de: "+(a/b));
            System.out.println("El elemento del arreglo es: "+c[3]);
        }catch(InputMismatchException e){
            System.out.println("ERROR: ingresa solo numeros "+e);
        }catch(ArithmeticException er){
            System.out.println("ERROR: No puede dividir entre 0 "+er);
        }catch(ArrayIndexOutOfBoundsException er){
            System.out.println("ERROR en el arreglo "+er);
        }catch(Exception er){
            System.out.println("Exception general "+er);
        }finally{
            System.out.println("Esto corre SI o SI!");
        }
        
    }

}
