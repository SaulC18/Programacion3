/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s03p02encapsulacion;

/**
 * @author Saul Cervantes Candia
 */
public class Serpiente {
    //Atributos
    private String nombre;
    private float largo;
    private String color;

    //Métodos
    public void sonido(){
        System.out.println("tssssssssssss, te voy a morder");
    }
    
    //Constructor
    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setLargo(float large){
        largo = large;
    }
    public float getLargo(){
        return largo;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    
}
