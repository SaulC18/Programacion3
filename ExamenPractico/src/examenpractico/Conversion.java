/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package examenpractico;
import java.util.Scanner;

/**
 * @author Saul Cervantes Candia - 177927
 * clase de 8 a 9 am
 */
public class Conversion {
    //Atributos
    private float peso;
    private float dolar;
    private float euro;
    Scanner entra = new Scanner(System.in);

    //Constructor
    public Conversion(){
        
    }
    
    public Conversion(float p){
        peso = p;
    }
    
    //Métodos
    public void pesoDolar(){
        System.out.print("Ingrese el valor que quieres convertir a dolares: ");
        setDolar(entra.nextFloat());
        
        //Conversión
        setPeso(getDolar()*0.054f); //valor de pesos a dolares
        System.out.println("En total son "+getPeso()+" dolares\n");
    }
    public void pesoEuro(){
        System.out.print("Ingrese el valor que quieres convertir a euros: ");
        setEuro(entra.nextFloat());
        
        //Conversión
        setPeso(getEuro()*0.051f); //valor de pesos a euro
        System.out.println("En total son "+getPeso()+" euros");
    }
    
    //Encapsulamiento
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getDolar() {
        return dolar;
    }
    public void setDolar(float dolar) {
        this.dolar = dolar;
    }
    public float getEuro() {
        return euro;
    }
    public void setEuro(float euro) {
        this.euro = euro;
    }
    
    
    
    
    
}
