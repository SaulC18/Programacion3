/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s04p03arraylist;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Saul Cervantes Candia
 * ArrayList:
 * Es un arreglo "dinamico" de objetos.
 * String, Integer, Float... de cualquier clase
 */
public class S04P03ArrayList {

    public static void main(String[] args) {
        //Declaración
        /*
        ArrayList b = newn ArrayList<>();
        NO es la forma más adecuada porque no se indica la "clase" del arreglo del tipo ArrayList
        */
        /*
        ArrayList <String> a = new ArrayList <>();
        
        a.add("Mundo");
        a.add("Gringa Combinada");
        a.add("Coca");
        
        System.out.println("ArrayList A: "+a);
        
        a.add(1, "Pizarron");
        System.out.println("ArrayList A: "+a);
        a.add(3,"Torta");
        System.out.println("ArrayList A: "+a);
        
        a.remove(1);
        System.out.println("ArrayList A: "+a);
        
        a.add(1, "Quesadillas");
        a.add(3,"Tamales");
        System.out.println("ArrayList A: "+a);
        */
        /*a.clear();
        System.out.println("ArrayList A: "+a);*/
        //System.out.println("Tamanio de A: "+a.size());
        
        //ITERATOR - Es una "interfaz"
        //Se usa para recorrer un ArrayList a traves de "copiar" el ArrayList usando el método Iterator (de ArrayList)
        /*
        int i = 1;
        Iterator <String> it = a.iterator();
        while(it.hasNext()){
            System.out.println("Elemento "+i+" es: "+it.next());
            i++;
        }
        */
        
        //Genere un ArrayList que almacene enteros.
        //Agregue como elementos a los primeros 10 numeros (1 al 10) usando ciclos.
        //Imprima el arreglo usando Iterator.
        ArrayList <Integer> b = new ArrayList<>();
        
        for (int j = 1; j < 11; j++) {
            b.add(j);
        }
        Iterator <Integer> iti = b.iterator();
        int j = 1;
        while(iti.hasNext()){
            System.out.println("Elemento "+j+" es: "+iti.next());
            j++;
        }
    }

}
