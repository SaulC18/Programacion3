/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s08p01lineamueve;
import java.awt.*; //Abstract Window Toolkit - Depende de la plataforma (rn cuanto a controles)
import javax.swing.*; //javax significa extensión - Independiente de la plataforma (rn cuanto a controles)
import java.awt.event.*;

/**
 * @author Saul Cervantes Candia
 */
public class S08P01LineaMueve extends JFrame implements ActionListener{

    JPanel panel; //La J indica que es de Swing
    JButton boton;
    Button boton2; //Sin J es de awt
    
    public static void main(String[] args) {
        S08P01LineaMueve marco = new S08P01LineaMueve();
        marco.setSize(400, 400);  //estan en JFrame
        marco.setTitle("Mi primer programa grafico");
        marco.crearGUI();
        marco.setVisible(true);
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
        boton = new JButton("Mover Línea");
        boton.addActionListener(this); //Suscribir el boton al listener
        ventana.add(boton);
        //BOTON DE AWT
        /*boton2 = new Button("De AWT");
        ventana.add(boton2);*/
    }
    
    int x1 = 5;
    int y1 = 5;
    int x2 = 50;
    int y2 = 50;
    
    @Override
    public void actionPerformed(ActionEvent event){
        System.out.println("Presionado");
        
        Graphics papel = panel.getGraphics();
        //Limpiar panel
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 300, 250);
        //dibujar linea
        papel.setColor(Color.BLUE);
        papel.drawLine(x1, y1, x2, y2);
        //aumentar coordenadas
        x1 += 5;
        y1 += 5;
        x2 += 5;
        y2 += 5;
    }

}
