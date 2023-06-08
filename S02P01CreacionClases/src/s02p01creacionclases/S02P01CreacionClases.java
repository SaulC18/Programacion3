/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */
package s02p01creacionclases;

/**
 *
 * @author Saul Cervantes Candia
 */
public class S02P01CreacionClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Objetos clase computadora
        Computadora objC = new Computadora();
        System.out.println("Se compro el modelo "+objC.modelo+" de la marca "+objC.marca+" en color "+objC.color);
        objC.comprar();
        Computadora objV = new Computadora();
        System.out.println("Tuvo que vender "+objV.cantidad+" telefonos por $"+objV.precio);
        objV.vender();
        System.out.println("Tuve que regalarle un "+objC.modelo+" a mi primo :(");
        objC.regalar();
        
        //Objetos clase comida
        Comida alimento = new Comida();
        System.out.println("\nCompre unas "+alimento.producto+" a $"+alimento.precioC+" en "+alimento.tienda);
        alimento.comprar();
        System.out.println("Eran unas "+alimento.producto+" de color "+alimento.color);
        alimento.probar();
        System.out.println("Me gusta prepar los alimentos y a las "+alimento.producto+" les puse "+alimento.complemento);
        alimento.probar();
    }
    
    
    
}
