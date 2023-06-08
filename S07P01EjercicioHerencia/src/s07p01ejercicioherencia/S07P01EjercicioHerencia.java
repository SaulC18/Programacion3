/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p01ejercicioherencia;

/**
 * @author Saul Cervantes Candia
 * -Genere una "super" clase que comience con la inicial de su segundo apellido que contenga al menos 2 atributos y 2 métodos.
 * -Cree 2 clases que hereden de la "super" clase y agregue un nuevo método.
 * -Cree otra clase que herede de una de las clases anteriores y agregue un método.
 * -Use objetos de cada clase para probar todos los métodos
 */
public class S07P01EjercicioHerencia {

    public static void main(String[] args) {
        Cancion can = new Cancion();
        can.musica();
        can.cancion(3);
        
        Artista art = new Artista();
        art.cantante();
        art.musica();
        art.cancion(3);
        
        Letra let = new Letra();
        let.musica();
        let.letra();
        let.cancion(4);
        
        Concierto con = new Concierto();
        con.cantante();
        con.lugar();
        con.musica();
        con.cancion(5);
    }

}
