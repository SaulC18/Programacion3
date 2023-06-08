/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s05p01enumeraciones;

/**
 * @author Saul Cervantes Candia
 * ENUMERACION:
 * Es un conjunto de constantes definidas por el usuario que pueden ser accedidas mediante un variable
 */
public class S05P01Enumeraciones {
    public enum Meses{
        ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;
    }
    
    public enum Comida{
        SANDWICH, TAMALES, TORTAS, TACOS, POZOLE, HAMBURGUESA, CEREAL;
    }

    public static void main(String[] args) {
        /*Dias d;
        d=Dias.VIERNES;
        
        System.out.println("Valor de d: "+d);
        
        if(d==Dias.VIERNES){
            System.out.println("ES VIERNES!!! WUUUUU");
        }else{
            System.out.println("No es Viernes :'(");
        }
        
        //Use un switch case con la variable d
        switch(d){
            case LUNES:
                System.out.println("Chales");
                break;
            case MARTES:
                System.out.println("Faltan 3 dias");
                break;
            case MIERCOLES:
                System.out.println("Que dia mas pesado");
                break;
            case JUEVES:
                System.out.println("Por fin casi es viernes");
                break;
            case VIERNES:
                System.out.println("Arriba los viernes");
                break;
            case SABADO:
                System.out.println("A dormir");
                break;
            case DOMINGO:
                System.out.println("NOOOOOOOO ya casi es Lunes");
                break;
            default:
                break;
        }*/
        
        Comida c, t;
        c=Comida.TACOS;
        t=Comida.TAMALES;
        
        if(c==Comida.TACOS){
            System.out.println("Excelente decision por escoger los "+c);
        }else{
            System.out.println("Estan mejor los "+t);
        }
        
        Salud s;
        s = Salud.INYECCION;
        
        switch(s){
            case MEDICAMENTO:
                System.out.println("No es tan grave :)");
                break;
            case JARABE:
                System.out.println("Es bueno para refrescar");
                break;
            case INYECCION:
                System.out.println("Es por tu salud");
                break;
            case OPERACION:
                System.out.println("Lamento las malas noticias");
                break;
            case RECETA:
                System.out.println("Ni modo");
                break;
            default:
                break;
        }
    }

}
