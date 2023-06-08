/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s04p02arregloobjetos;

/**
 * @author Saul Cervantes Candia
 */
public class Alumno {
    //Atributos
    int matricula;
    String nombre;
    String carrera;
    int edad;
    float materia1;
    float materia2;
    
    //Constructores
    public Alumno(){
        
    }
    
    public Alumno(int m, String n, String c, int e, float mat1, float mat2){
        matricula = m;
        nombre = n;
        carrera = c;
        edad = e;
        materia1 = mat1;
        materia2 = mat2;
    }
    
    
    //Métodos
    public void darseDeBaja(){
        System.out.println("NP - No Pude!");
    }
    
    public void impresion(){
        System.out.println("Alumno: "+nombre+", Matricula: "+matricula+", Carrera: "+carrera+", Edad: "+edad);
    }
}
