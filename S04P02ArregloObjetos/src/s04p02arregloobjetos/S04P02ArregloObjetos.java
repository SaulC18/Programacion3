/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s04p02arregloobjetos;
import java.util.Scanner;
/**
 * @author Saul Cervantes Candia
 */
public class S04P02ArregloObjetos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mat = 0, edad = 0;
        float mat1 = 0, mat2 = 0;
        String nom = null, car = null;
        int matri = 0;
        
        int x[] = new int[5]; //arreglo de enteros
        
        Alumno a[] = new Alumno[3]; //DECLARACION
        
        //a[0] = new Alumno(); //Se inicializa con constructor vacio
        
        for (int i = 0; i < 3; i++) {
            //a[i] = new Alumno();  ejemplode inicializacion
            System.out.println("Dime la matricula ");
            mat = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Dime el nombre ");
            nom = entrada.nextLine();
            System.out.println("Dime la carrera ");
            car = entrada.nextLine();
            System.out.println("Dime la edad ");
            edad = entrada.nextInt();
            System.out.println("Calificacion de la primera materia: ");
            mat1 = entrada.nextFloat();
            System.out.println("Calificacion de la segunda materia: ");
            mat2 = entrada.nextFloat();
            
            a[i] = new Alumno(mat, nom, car, edad, mat1, mat2);
        }
        
        //Imprima el arreglo de objetos:
        for (int i = 0; i < 3; i++) {
            a[i].impresion();
        }
        
        //solicite al usuario una matricula y la busque diga si la encontro (o no) e imprima sus otros datos. (nombre, carrera y edad)
        //Hágalo de la manera mas optima posible
        float prom;
        System.out.println("Dame la matricula ");
        mat = entrada.nextInt();
        boolean b = true;
        int i=0;
        do{
            if (a[i].matricula==mat){
                System.out.println("Encontrado!");
                System.out.println("Nombre: "+a[i].nombre+", Carrera: "+a[i].carrera+", Edad: "+a[i].edad);
                prom = (a[i].materia2+a[i].materia1)/2;
                System.out.println("El promedio es: "+prom);
                b = false;
            }
            i++;
        }while(b && i<3);
        if(b){
            System.out.println("No encontrado!");
        }
        
    }
}
