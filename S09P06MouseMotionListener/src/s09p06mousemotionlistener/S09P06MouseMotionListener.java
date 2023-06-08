/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s09p06mousemotionlistener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Saul Cervantes Candia
 */
public class S09P06MouseMotionListener extends JFrame implements MouseMotionListener{
    private JPanel panel;
    public static void main(String[] args) {
        S09P06MouseMotionListener marco = new S09P06MouseMotionListener();
        marco.setSize(600, 600);
        marco.setTitle("MouseMotionListener");
        marco.crearGUI();
        marco.setVisible(true);
    }

    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(550,550));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        panel.addMouseMotionListener(this);
    }
    
    @Override
    public void mouseMoved(MouseEvent event){
        Graphics papel = panel.getGraphics();
        
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.BLUE);
        papel.fillOval(x, y, 50, 50);
    }
    
    @Override
    public void mouseDragged(MouseEvent event){
        Graphics papel = panel.getGraphics();
        
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.RED);
        papel.fillOval(x, y, 50, 50);
    }
}
