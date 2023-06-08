/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s08p02circulomueve;
import java.awt.*; //Abstract Window Toolkit - Depende de la plataforma (rn cuanto a controles)
import javax.swing.*; //javax significa extensión - Independiente de la plataforma (rn cuanto a controles)
import java.awt.event.*;

/**
 * @author Saul Cervantes Candia
 */
public class S08P02CirculoMueve extends JFrame implements ActionListener{
    JPanel panel; //La J indica que es de Swing
    JButton btnIzq;
    JButton btnDer; //Sin J es de awt
    
    public static void main(String[] args) {
        S08P02CirculoMueve marco2 = new S08P02CirculoMueve();
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
        papel.setColor(Color.BLUE);
        
        if(btnIzq == event.getSource()){
            System.out.println("Se presionado boton izquierdo");
            x-=4;
            papel.fillOval(x, y, ancho, alto);
        }
        Object origen = event.getSource();
        if(btnDer == origen){
            System.out.println("Se presionado boton derecho");
            x+=4;
            papel.fillOval(x, y, ancho, alto);
        }
        
        //dibujar círculo
        
        
        
    }
}
