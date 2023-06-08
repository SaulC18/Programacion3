/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s13p02excepcionesgraficas;

/**
 * @author Saul Cervantes Candia
 */
public class ExcepcionPropia {
    public void calificacion(float e) throws Exception{
        if((e<6) || (e>10)){
            System.out.println("ERROR, calificacion no valida o espacio en blanco");
            throw new Exception();
        }
    }
    
    public void matricula(String matri) throws Exception{
        if(matri.length()>6 || matri.length()<6){
            System.out.println("Formato incorrecto");
            throw new Exception();
        }
    }
}
