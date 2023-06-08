/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s10p03paint;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * @author Saul Cervantes Candia
 * CREA:
 * - 6 radio botones con nombres de color para el "pincel" incluya blanco para borrar.
 * - Un slider para modificar el grueso del "pincel".
 * - Agregue un textField en el que se muestre el valor del slider
 * - Requiere implementar al menos 2 interfaces
 */
public class S10P03Paint extends JFrame implements ChangeListener, ActionListener, MouseMotionListener{
    JTextField tf;
    JSlider deslizante;
    JPanel panel;
    JRadioButton btnRojo, btnAzul, btnVerde, btnAmarillo, btnMagenta, btnBlanco;
    //Color color = Color.WHITE;
    
    public static void main(String[] args) {
        S10P03Paint marco = new S10P03Paint();
        marco.setSize(600, 600);
        marco.setTitle("Paint");
        marco.crearGUI();
        marco.setVisible(true);
    }

    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Termina la ejecución al presionar x
        
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout()); //Administrador de contenido
        
        //Panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(550,400));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        panel.addMouseMotionListener(this);
        
        //Radio botones
        btnRojo = new JRadioButton("Rojo",false);
        ventana.add(btnRojo);
        btnRojo.addActionListener(this);
        
        btnAzul = new JRadioButton("Azul",false);
        ventana.add(btnAzul);
        btnAzul.addActionListener(this);
        
        btnVerde = new JRadioButton("Verde",false);
        ventana.add(btnVerde);
        btnVerde.addActionListener(this);    
        
        btnAmarillo = new JRadioButton("Amarillo",false);
        ventana.add(btnAmarillo);
        btnAmarillo.addActionListener(this);
        
        btnMagenta = new JRadioButton("Magenta",false);
        ventana.add(btnMagenta);
        btnMagenta.addActionListener(this);
        
        btnBlanco = new JRadioButton("Borrar",false);
        ventana.add(btnBlanco);
        btnBlanco.addActionListener(this);  
        
        //ButtonGroup - agrupa los radiobotones para que sus acciones sean excluyentes
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(btnRojo);
        grupo.add(btnAzul);
        grupo.add(btnVerde);
        grupo.add(btnAmarillo);
        grupo.add(btnMagenta);
        grupo.add(btnBlanco);
        
        //Configurarcion del deslizante
        deslizante = new JSlider(JSlider.HORIZONTAL,10,250,120);
        ventana.add(deslizante);
        deslizante.addChangeListener(this);
        
        tf = new JTextField(5);
        ventana.add(tf);
    }
    
    @Override
    public void stateChanged(ChangeEvent ce) {
        tf.setText(Integer.toString(deslizante.getValue()));
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Limpiar panel
        Graphics papel = panel.getGraphics();
        papel.setColor(Color.WHITE);
        //papel.fillRect(0, 0, 350, 300);
        
        /*if(btnRojo == ae.getSource()){
            color = Color.RED;
            //papel.setColor(Color.RED);
        }
        if(btnAzul == ae.getSource()){
            color = Color.BLUE;
            //papel.setColor(Color.BLUE);
        }
        if(btnVerde == ae.getSource()){
            color = Color.GREEN;
            //papel.setColor(Color.GREEN);
        }
        if(btnAmarillo == ae.getSource()){
            color = Color.YELLOW;
            //papel.setColor(Color.YELLOW);
        }
        if(btnMagenta == ae.getSource()){
            color = Color.MAGENTA;
            //papel.setColor(Color.MAGENTA);
        }
        if(btnBlanco == ae.getSource()){
            color = Color.WHITE;
            //papel.setColor(Color.WHITE);
        }*/
    }

    @Override
    public void mouseDragged(MouseEvent event) {
        Graphics papel = panel.getGraphics();
        Color color = Color.WHITE;
        int n = deslizante.getValue();
        
        int x = event.getX();
        int y = event.getY();
        
        if(btnRojo.isSelected()){
            color = Color.RED;
        }
        if(btnAzul.isSelected()){
            color = Color.BLUE;
        }
        if(btnVerde.isSelected()){
            color = Color.GREEN;
        }
        if(btnAmarillo.isSelected()){
            color = Color.YELLOW;
        }
        if(btnMagenta.isSelected()){
            color = Color.MAGENTA;
        }
        if(btnBlanco.isSelected()){
            color = Color.WHITE;
            //papel.setColor(Color.WHITE);
        }
        
        papel.setColor(color);
        papel.fillOval(x, y, n, n);
    }

    @Override
    public void mouseMoved(MouseEvent event) {
        //Graphics papel = panel.getGraphics();
    }
    
    
}
