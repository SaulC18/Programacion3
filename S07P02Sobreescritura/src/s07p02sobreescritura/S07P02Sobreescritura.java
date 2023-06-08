/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p02sobreescritura;

/**
 * @author Saul Cervantes Candia
 */
public class S07P02Sobreescritura {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.base = 5f;
        r1.altura = 10f;
        System.out.println("El area del rectangulo es "+r1.area());
        
        Triangulo t1 = new Triangulo();
        t1.base = 5f;
        t1.altura = 10f;
        System.out.println("El area del triangulo es "+t1.area());
    }

}
