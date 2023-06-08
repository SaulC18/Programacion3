/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package examenpractico2;

/**
 * @author Saul Cervantes Candia
 */
public abstract class Carro {
    String modelo;
    float precio;
    
    public abstract void abrirPuerta();
    
    public void saludo(){
        System.out.println("Bienvenido usuario :) ");
    }
}
