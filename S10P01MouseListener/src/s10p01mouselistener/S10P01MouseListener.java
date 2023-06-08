/*
 * Universidad Politecnica de San Luis Potosí
 * Programación III
 * Programación Orientada a Objetos
 */

package s10p01mouselistener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Saul Cervantes Candia
 */
public class S10P01MouseListener extends JFrame implements MouseListener{
    private JPanel panel;
    public static void main(String[] args) {
        S10P01MouseListener marco = new S10P01MouseListener();
        marco.setSize(600, 600);
        marco.setTitle("MouseListener");
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(600,600));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        panel.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent event){
        Graphics papel = panel.getGraphics();
        
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.PINK);
        papel.fillOval(x, y, 30, 30);
    }

    @Override
    public void mousePressed(MouseEvent event) {
        Graphics papel = panel.getGraphics();
        
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.BLUE);
        papel.fillOval(x, y, 30, 30);
    }

    @Override
    public void mouseReleased(MouseEvent event) {
        Graphics papel = panel.getGraphics();
        
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.RED);
        papel.fillOval(x, y, 30, 30);
    }

    @Override
    public void mouseEntered(MouseEvent event) {
        Graphics papel = panel.getGraphics();
        
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.YELLOW);
        papel.fillOval(x, y, 30, 30);
    }

    @Override
    public void mouseExited(MouseEvent event) {
        Graphics papel = panel.getGraphics();
        
        int x = event.getX();
        int y = event.getY();
        
        papel.setColor(Color.GREEN);
        papel.fillOval(x, y, 30, 30);
    }

}
