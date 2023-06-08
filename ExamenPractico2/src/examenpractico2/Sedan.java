/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package examenpractico2;
import java.util.Scanner;

/**
 * @author Saul Cervantes Candia
 */
public class Sedan extends Carro implements Transporte{
    Scanner ent = new Scanner(System.in);
    float km=0;
    float lt=0;
    
    @Override
    public void abrirPuerta() {
        System.out.println("Abra la puerta con cuidado");
    }

    @Override
    public void mover(int km) {
        System.out.println("Acaba de recorrer "+km+" km");
    }

    @Override
    public void detener() {
        System.out.println("Se ha detenido justo a tiempo");
    }
    
    @Override
    public void saludo(){
        System.out.println("Espero que disfrute de esta experiencia");
    }
    
    public void rendimiento(){
        System.out.print("Km recorrido: ");
        km = ent.nextFloat();
        System.out.print("Litros gastados: ");
        lt = ent.nextFloat();
        km*=1000;
        float rend = km/lt;
        System.out.println("Su rendimiento es de "+rend+" km/lt");
    }
}
