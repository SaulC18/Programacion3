/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s03p02encapsulacion;

/**
 * @author Saul Cervantes Candia
 * REQUISITOS PARA ENCAPSULAR:
 * 1. Las variables de instancia deben marcarse como private!!
 * 2. A cada variable se le debe programar su "set"(establecer) y su "get"(obtener)
 */
public class VideoJuego {
    //Atributos
    String apodo; //definido como package private
    private String nombre;
    private String desarrollador;
    private double precio;
    private String consola;
    
    //Método
    public void iniciar(){
        System.out.println("Arrancando el juego");
    }
    
    //setters y getters (establecer y obtener)
    public void setNombre(String n) {
        nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setPrecio(double p) {
        precio = p;
    }
    public double getPrecio(){
        return precio;
    }
    
    public void setDesarrollador(String d){
        desarrollador = d;
    }
    public String getDesarrollador(){
        return desarrollador;
    }

    public String getConsola() {
        return consola;
    }
    public void setConsola(String consola) {
        this.consola = consola;
    }
    
    
}
