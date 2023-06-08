/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s13p01excepcionespropias;

/**
 * @author Saul Cervantes Candia
 */
public class MisExcepciones {
    public void probarEdad(int e) throws Exception{
        if(e>=18){
            System.out.println("Edad valida!");
        }else{
            System.out.println("ERROR, edad no valida");
            throw new Exception();
        }
    }
    
    public void calificacion(float e) throws Exception{
        if(e>=6 && e<=10){
            System.out.println("Calificacion valida!");
        }else{
            System.out.println("ERROR, calificacion no valida");
            throw new Exception();
        }
    }
    
    public void calificacion2(float e) throws Exception{
        if((e<6) || (e>10)){
            System.out.println("ERROR, calificacion no valida");
            throw new Exception();
        }
    }
}
