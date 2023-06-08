/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s10p05circuloextremoteclado;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Saul Cervantes Candia
 * REALIZA:
 * - El mismo ejercico del círculo extremo, pero el circulo se moverá con las teclas de direccion del teclado y aumentara
 * o disminuirá con la tecla + y - (tanto del teclado numérico, como del teclado "normal")
 * - Usar KeyListener. Típicamente hay 2 formas de usar una tecla.
 */
public class S10P05CirculoExtremoTeclado extends JFrame implements KeyListener{
    JPanel panel; //La J indica que es de Swing
       
    public static void main(String[] args) {
        S10P05CirculoExtremoTeclado marco = new S10P05CirculoExtremoTeclado();
        marco.setSize(600, 600);
        marco.setTitle("Circulo Extremo Teclado");
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Termina la ejecución al presionar x
        
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        //PANEL
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(550,550));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        
        addKeyListener(this);
    }
    int x = 0;
    int y = 0;
    int ancho = 50;
    int alto = 50;
    
    @Override
    public void keyTyped(KeyEvent event) {
        /*Graphics papel = panel.getGraphics();
        //Limpiar panel
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 300, 250);
        int n = event.getKeyCode();
        if(n == 38){
            papel.setColor(Color.MAGENTA);
            System.out.println("Teclado arriba");
            y-=4;
        }
        if(n == 40){
            papel.setColor(Color.GREEN);
            y+=4;
        }
        if(n == 37){
            papel.setColor(Color.BLUE);
            x-=4;
        }
        if(n == 39){
            papel.setColor(Color.RED);
            x+=4;
        }
        if(n == 107 || n == 521){
            papel.setColor(Color.ORANGE);
            ancho+=4;
            alto+=4;
        }
        if(n == 109 || n == 45){
            papel.setColor(Color.YELLOW);
            ancho-=4;
            alto-=4;
        }
        
        papel.fillOval(x, y, ancho, alto);*/
    }

    @Override
    public void keyPressed(KeyEvent event) {
        Graphics papel = panel.getGraphics();
        //Limpiar panel
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 550, 550);
        int n = event.getKeyCode();
        if(n == 38){
            papel.setColor(Color.MAGENTA);
            System.out.println("Teclado arriba");
            y-=4;
        }
        if(n == 40){
            papel.setColor(Color.GREEN);
            System.out.println("Teclado abajo");
            y+=4;
        }
        if(n == 37){
            papel.setColor(Color.BLUE);
            System.out.println("Teclado izquierda");
            x-=4;
        }
        if(n == 39){
            papel.setColor(Color.RED);
            System.out.println("Teclado derecha");
            x+=4;
        }
        if(n == 107 || n == 521){
            papel.setColor(Color.ORANGE);
            System.out.println("Teclado +");
            ancho+=4;
            alto+=4;
        }
        if(n == 109 || n == 45){
            papel.setColor(Color.YELLOW);
            System.out.println("Teclado -");
            ancho-=4;
            alto-=4;
        }
        
        papel.fillOval(x, y, ancho, alto);
    }

    @Override
    public void keyReleased(KeyEvent event) {
        /*Graphics papel = panel.getGraphics();
        //Limpiar panel
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 300, 250);
        int n = event.getKeyCode();
        
        if(n == 38){
            papel.setColor(Color.MAGENTA);
            System.out.println("Teclado arriba");
            y-=4;
        }
        if(n == 40){
            papel.setColor(Color.GREEN);
            y+=4;
        }
        if(n == 37){
            papel.setColor(Color.BLUE);
            x-=4;
        }
        if(n == 39){
            papel.setColor(Color.RED);
            x+=4;
        }
        if(n == 107 || n == 521){
            papel.setColor(Color.ORANGE);
            ancho+=4;
            alto+=4;
        }
        if(n == 109 || n == 45){
            papel.setColor(Color.YELLOW);
            ancho-=4;
            alto-=4;
        }
        
        papel.fillOval(x, y, ancho, alto);
        */
    }

}
