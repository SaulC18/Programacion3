/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */
package s02p03operacionesbasicas;

/**
 * @author Saul Cervantes Candia
 */
public class S02P03OperacionesBasicas {

    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        
        op.sumar();
        op.sumar(10);
        op.sumar(25,10);
        
        op.restar();
        op.restar(10);
        op.restar(8, 63);
        
        op.multiplicar();
        op.multiplicar(11);
        op.multiplicar(12, 10);
        
        op.dividir();
        op.dividir(3);
        op.dividir(5.2f);
    }
    
}
