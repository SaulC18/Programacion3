/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s02p03operacionesbasicas;
import java.util.Scanner;

/**
 * @author Saul Cervantes Candia
 */
/*
Sobrecargue los 4 metodos al menos 2 veces mas
en la clase principal usando un objeto
pruebe los métodos
*/
public class Operaciones {
    //Atributos
    int a, b;
    
    //Métodos
    public void sumar(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        a = entrada.nextInt();
        System.out.println("Dime otro numero");
        b = entrada.nextInt();
        
        System.out.println("La suma es de: "+(a+b));
    }
    public void sumar(int c){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        a = entrada.nextInt();
        System.out.println("Dime otro numero");
        b = entrada.nextInt();
        
        System.out.println("La suma es de: "+(a+b+c));
    }
    public void sumar(int j, int f){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        a = entrada.nextInt();
        System.out.println("Dime otro numero");
        b = entrada.nextInt();
        
        System.out.println("La suma es de: "+(a+b+(2*j)+(4*f)));
    }
    
    public void restar(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        a = entrada.nextInt();
        System.out.println("Dime otro numero");
        b = entrada.nextInt();
        
        System.out.println("La resta es de: "+(a-b));
    }
    public void restar(int c){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        a = entrada.nextInt();
        System.out.println("Dime otro numero");
        b = entrada.nextInt();
        
        System.out.println("La resta es de: "+(a-b-c));
    }
    public void restar(int d, int e){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        a = entrada.nextInt();
        System.out.println("Dime otro numero");
        b = entrada.nextInt();
        
        System.out.println("La resta es de: "+(a-b-(5*d)-(2*e)));
    }
    
    public void multiplicar(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        a = entrada.nextInt();
        System.out.println("Dime otro numero");
        b = entrada.nextInt();
        
        System.out.println("La multiplicacion es de: "+(a*b));
    }
    public void multiplicar(int z){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        a = entrada.nextInt();
        System.out.println("Dime otro numero");
        b = entrada.nextInt();
        
        System.out.println("La multiplicacion es de: "+((a*b)+(2*z)));
    }
    public void multiplicar(int x, int y){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        a = entrada.nextInt();
        System.out.println("Dime otro numero");
        b = entrada.nextInt();
        
        System.out.println("La multiplicacion es de: "+(a*2)*(x*y)+(b*a));
    }
    
    public void dividir(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        a = entrada.nextInt();
        System.out.println("Dime otro numero");
        b = entrada.nextInt();
        
        System.out.println("La division es de: "+(a/b));
    }
    public void dividir(int s){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        a = entrada.nextInt();
        System.out.println("Dime otro numero");
        b = entrada.nextInt();
        
        System.out.println("La division es de: "+((a+s)/b));
    }
    public void dividir(float w){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        a = entrada.nextInt();
        System.out.println("Dime otro numero");
        b = entrada.nextInt();
        
        System.out.println("La division es de: "+(((float)a+2)+w/(float)b));
    }
}
