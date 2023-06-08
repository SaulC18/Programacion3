/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s06p01herencia;

/**
 * @author Saul Cervantes Candia
 */
public class S06P01Herencia {

    public static void main(String[] args) {
        /*Dog2 dog = new Dog2(); 
        dog.bark(); 
        dog.eat();
        Cat2 cat = new Cat2();
        cat.meow();
        cat.rest();
        Horse2 horse = new Horse2(); 
        horse.neigh(); 
        horse.move(12);
        Mouse mouse = new Mouse();
        mouse.bark();
        mouse.chillido();*/
        
        PerroRescatista frida = new PerroRescatista();
        frida.eat();      //animal
        frida.rest();     //animal
        frida.move(10);   //animal
        frida.bark();     //dog2
        frida.rescatar(); //perro rescatista
    }

}
