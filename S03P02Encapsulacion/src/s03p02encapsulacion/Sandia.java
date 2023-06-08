/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s03p02encapsulacion;

/**
 * @author Saul Cervantes Candia
 */
public class Sandia {
    private String color;
    private String tamanio;
    private String forma;
    
    //Método
    public void sabor(){
        System.out.println("Mmmmm, que rica esta la sandia");
    }
    
    //Encapsulamiento
    public void setColor(String col){
        color = col;
    }
    public String getColor(){
        return color;
    }
    
    public void setTamanio(String tam){
        tamanio = tam;
    }
    public String getTamanio(){
        return tamanio;
    }
    
    public void setForma(String form){
        forma = form;
    }
    public String getForma(){
        return forma;
    }
}
