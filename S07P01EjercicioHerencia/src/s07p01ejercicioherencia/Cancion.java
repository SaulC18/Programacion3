/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p01ejercicioherencia;

/**
 * @author Saul Cervantes Candia
 */
public class Cancion {
    //Atributos
    String genero;
    int duracion;
    
    //Métodos
    public void cancion(int dura){
        System.out.println("La cancion dura "+dura+" minutos.");
    }
    
    public void musica(){
        System.out.println("Musica pop");
    }
}
