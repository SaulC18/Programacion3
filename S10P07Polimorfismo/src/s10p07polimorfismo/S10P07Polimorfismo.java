/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s10p07polimorfismo;

/**
 * @author Saul Cervantes Candia
 * AGREGA AL PROYECTO:
 * - 3 clases con 3 niveles de herencia
 * - A cada clase agrega 2 m,étodos, uno de ellos debe de estar sobreescrito en los niveles inferiores
 * - Crea un objeto de cada clase
 * - "Convierte" los objetos de las clases superiores a sus niveles "inferiores" usando polimorfimso y prueba los métodos sobreescritos.
 */
public class S10P07Polimorfismo {

    public static void main(String[] args) {
        /*Abuelo a = new Abuelo();
        Padre p = new Padre();
        Hijo h = new Hijo();
        
        a.dormir();
        a.manejar();
        System.out.println("---------");
        p.usarComputadora();
        p.manejar();
        System.out.println("---------");
        h.programarJava();
        h.manejar();
        
        //POLIMORFISMO CON HERENCIA
        //Permitir que un objeto de la clase "superior" puede usar SOLO los métodos SOBREESCRITOS en las subclases.
        
        //"convertir" un objeto de una superclase en uno de una subclase
        System.out.println("---------");
        System.out.println("POLIMORFISMO");
        System.out.println("Abuelo: ");
        a = new Padre();
        a.manejar();
        //No es e¿posible con métodos diferentes a los sobreescritos
        System.out.println("---------");
        a = new Hijo();
        a.manejar();*/
        
        
        Circulo ci = new Circulo();
        Cuadrado cua = new Cuadrado();
        Triangulo tri = new Triangulo();
        
        ci.Area();
        ci.rodar();
        System.out.println("---------");
        cua.Area();
        cua.espacio();
        System.out.println("---------");
        tri.Area();
        tri.forma();
        
        System.out.println("---------");
        System.out.println("POLIMORFISMO");
        System.out.println("Circulo: ");
        ci = new Cuadrado();
        ci.Area();
        //No es e¿posible con métodos diferentes a los sobreescritos
        System.out.println("---------");
        ci = new Triangulo();
        ci.Area();
    }

}
