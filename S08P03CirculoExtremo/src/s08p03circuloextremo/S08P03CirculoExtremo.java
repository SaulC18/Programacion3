/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s08p03circuloextremo;

import java.awt.*; //Abstract Window Toolkit - Depende de la plataforma (rn cuanto a controles)
import javax.swing.*; //javax significa extensión - Independiente de la plataforma (rn cuanto a controles)
import java.awt.event.*;

/**
 * @author Saul Cervantes Candia
 * Haga un programa que mueva o modifique un circulo usando 6 botones:
 * -Izquierda
 * -Derecha
 * -Arriba
 * -Abajo
 * -Cerca (aumentar)
 * -Lejos (reducir)
 * -Cada que se presione un botón, haga que el circulo cambie de color
 */
public class S08P03CirculoExtremo extends JFrame implements ActionListener{
    JPanel panel; //La J indica que es de Swing
    JButton btnIzq;
    JButton btnDer; 
    JButton btnArr;
    JButton btnAbajo; 
    JButton btnAu;
    JButton btnRe; 
    
    public static void main(String[] args) {
        S08P03CirculoExtremo marco2 = new S08P03CirculoExtremo();
        marco2.setSize(400, 400);
        marco2.setTitle("Circulo Mueve");
        marco2.crearGUI();
        marco2.setVisible(true);
    }
    
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Termina la ejecución al presionar x
        
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout()); //Administrador de contenido
        //gridLayout, borderLayout, -- "administra" la distribución de objetos en ventana
        
        //Colocar los objetos en la ventana.
        //PANEL
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,250));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        
        //Boton
        btnIzq = new JButton("Izquierda");
        btnIzq.addActionListener(this); //Suscribir el boton al listener
        ventana.add(btnIzq);
        
        btnDer = new JButton("Derecha");
        btnDer.addActionListener(this); //Suscribir el boton al listener
        ventana.add(btnDer);
        
        btnArr = new JButton("Arriba");
        btnArr.addActionListener(this); //Suscribir el boton al listener
        ventana.add(btnArr);
        
        btnAbajo = new JButton("Abajo");
        btnAbajo.addActionListener(this); //Suscribir el boton al listener
        ventana.add(btnAbajo);
        
        btnAu = new JButton("Aumentar");
        btnAu.addActionListener(this); //Suscribir el boton al listener
        ventana.add(btnAu);
        
        btnRe = new JButton("Reducir");
        btnRe.addActionListener(this); //Suscribir el boton al listener
        ventana.add(btnRe);
    }
    
    int x = 120;
    int y = 90;
    int ancho = 50;
    int alto = 50;
    
    
    @Override
    public void actionPerformed(ActionEvent event){
        Graphics papel = panel.getGraphics();
        //Limpiar panel
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 300, 250);
        
        
        if(btnIzq == event.getSource()){
            papel.setColor(Color.BLUE);
            System.out.println("Boton izquierdo");
            x-=4;
        }
        Object origen = event.getSource();
        if(btnDer == origen){
            papel.setColor(Color.RED);
            System.out.println("Boton derecho");
            x+=4;
        }
        if(btnArr == origen){
            papel.setColor(Color.GREEN);
            System.out.println("Boton arriba");
            y-=4;
        }
        if(btnAbajo == origen){
            papel.setColor(Color.ORANGE);
            System.out.println("Boton abajo");
            y+=4;
        }
        if(btnAu == origen){
            papel.setColor(Color.PINK);
            System.out.println("Boton aumentar");
            ancho+=4;
            alto+=4;
        }
        if(btnRe == origen){
            papel.setColor(Color.YELLOW);
            System.out.println("Boton reducir");
            ancho-=4;
            alto-=4;
        }
        papel.fillOval(x, y, ancho, alto);
    }
}
