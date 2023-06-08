/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p05interfaces;

/**
 * @author Saul Cervantes Candia
 */
public class Celular implements Telefono{
    @Override
    public void marcarNumero(int n){
        System.out.println("Marcando a "+n);
    }
    @Override
    public void llamadaEnProgreso(){
        System.out.println("Riiiiiiiiiinnnnnnn!!!!!!");
    }
}
