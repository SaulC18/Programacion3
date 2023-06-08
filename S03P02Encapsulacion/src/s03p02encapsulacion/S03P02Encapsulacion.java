/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */
package s03p02encapsulacion;

/**
 * @author Saul Cervantes Candia
 * Encapsulación: es una propiedad de POO que se define que cada variable debe tener protegido su acceso para que solo pueda
 * accederse por medio de metodos.
 * 
 * IDENTIFICADORES DE ACCESO:
 * public - pueden ser accedidos desde cualquier clase
 * private - solo puede ser accedido por la misma clase
 * package private - Solo puede ser accedido dentro del mismo proyecto (default)
 * protected - solo puede ser accedida dentro de la cadena de herencia
 */
public class S03P02Encapsulacion {

    public static void main(String[] args) {
        VideoJuego v1 = new VideoJuego();
        v1.apodo = "Paquito";
        
        v1.setNombre("cuphead");
        System.out.println("Nombre del videojuego: "+v1.getNombre());
        
        Serpiente serp = new Serpiente();
        serp.setNombre("Anaconda");
        serp.setColor("Negro");
        serp.setLargo(5.4f);
        System.out.println("La serpiente "+serp.getNombre()+" es de color "+serp.getColor()+" y mide "+serp.getLargo()+" mts.");
        
        Sandia san = new Sandia();
        san.setColor("Bandera");
        san.setForma("Cuadrada");
        san.setTamanio("Grande");
        System.out.println("Compre una sandia color "+san.getColor()+" de forma "+san.getForma()+" de un tamanio "+san.getTamanio());
    }
    
}
