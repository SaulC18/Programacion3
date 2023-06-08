/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */
package s01p01holamundo; //nombre del proyecto

/**
 *
 * @author 177927
 */
//identificadores de acceso: *public, *private, *package private, *protected
public class S01P01HolaMundo { //identificador de acceso
    //las clases siempre empiezan con mayúscula
    //todo lo que no sea una clase debe de comenzar con minúscula
    
    public static void main(String[] args) {
        //static: permite ejecutar un método sin necesidad de un objeto
        //void: vacio
        //main -> se llama driver class o main class (
        /*
        // TODO code application logic here
        System.out.println("Hola Mundo");
        
        //Instrucción constructora - Permite crear objeto
        //Forma 1
        Silla s1 = new Silla();
        s1.cargar();
        
        s1.patas = 3;
        System.out.println("La silla tiene "+s1.patas+" patas");
        System.out.println("La silla es de "+s1.material);
        */
        //Forma 2 (No se utilizara)
        /*Silla s2;
        s2 = new Silla();*/
        
        Perro firulais = new Perro();
        
        System.out.println("Firulais tiene "+firulais.edad+" anios");
        System.out.println("Firulais tiene "+firulais.patas+" patas");
        
        firulais.nombre = "Luis";
        firulais.raza = "Beagle";
        
        System.out.println("Firulais en realidad se llama "+firulais.nombre);
        System.out.println("Firulais es de raza "+firulais.raza);
        
        firulais.caminar();
        firulais.comer();
        firulais.ladrar();
    }
    //import (librerias java.lang(por default), java.util.*(util trae todas las clases) o java.util.Scanner
    
}

/*
    todo en java son clases
    

*/