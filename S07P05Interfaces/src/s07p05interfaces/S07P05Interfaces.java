/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s07p05interfaces;

/**
 * @author Saul Cervantes Candia
 * INTERFACES:
 * -Tienen todos sus métodos abstractos (no se requiere "abstract")
 * -Una clase que la IMPLEMENTE, debe programar TODOS sus métodos
 * -Una clase puede IMPLEMENTAR tantas interfaces como desee!!
 */
public class S07P05Interfaces {

    public static void main(String[] args) {
        //Telefono t1 = new Telefono(); //No se puede instanciar una interface, no es una clase
        TelefonoFijo t1 = new TelefonoFijo();
        t1.llamadaEnProgreso();
        t1.marcarNumero(41523678);
        
        Celular c1 = new Celular();
        c1.llamadaEnProgreso();
        c1.marcarNumero(54812367);
    }

}
