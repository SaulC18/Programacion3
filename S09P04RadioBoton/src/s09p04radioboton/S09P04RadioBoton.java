/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s09p04radioboton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * @author Saul Cervantes Candia
 */
public class S09P04RadioBoton extends JFrame implements ActionListener{
    JLabel label;
    JPanel panel;
    JRadioButton btnLinea, btnCirculo, btnRectangulo, btnIma1, btnIma2, btnIma3;
    private ImageIcon foto;
    private Icon fondo;
    
    public static void main(String[] args) {
        S09P04RadioBoton marco = new S09P04RadioBoton();
        marco.setSize(600, 600);
        marco.setTitle("RadioBoton");
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Termina la ejecución al presionar x
        
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout()); //Administrador de contenido
        
        //Panel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(380,300));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        
        //Label
        label = new JLabel(" ");
        label.setBounds(100, 100, 100, 250);
        label.setHorizontalAlignment (SwingConstants.LEFT);
        ventana.add(label);
        
        //Radio botones
        btnLinea = new JRadioButton("Linea",false);
        ventana.add(btnLinea);
        btnLinea.addActionListener(this);
        
        btnCirculo = new JRadioButton("Circulo",false);
        ventana.add(btnCirculo);
        btnCirculo.addActionListener(this);
        
        btnRectangulo = new JRadioButton("Rectangulo",false);
        ventana.add(btnRectangulo);
        btnRectangulo.addActionListener(this);    
        
        btnIma1 = new JRadioButton("Imagen 1",false);
        ventana.add(btnIma1);
        btnIma1.addActionListener(this);
        
        btnIma2 = new JRadioButton("Imagen 2",false);
        ventana.add(btnIma2);
        btnIma2.addActionListener(this);
        
        btnIma3 = new JRadioButton("Imagen 3",false);
        ventana.add(btnIma3);
        btnIma3.addActionListener(this);  
        
        //ButtonGroup - agrupa los radiobotones para que sus acciones sean excluyentes
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(btnLinea);
        grupo.add(btnCirculo);
        grupo.add(btnRectangulo);
        grupo.add(btnIma1);
        grupo.add(btnIma2);
        grupo.add(btnIma3);
    }
    
    @Override
    public void actionPerformed(ActionEvent event){
        //Limpiar panel
        Graphics papel = panel.getGraphics();
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 350, 300);
        papel.setColor(Color.RED);
        
        if(btnLinea.isSelected()){
            papel.drawLine(50, 50, 150, 150);
        }
        if(btnCirculo.isSelected()){
            papel.fillOval(50, 50, 150, 150);
        }
        if(btnRectangulo.isSelected()){
            papel.fillRect(50, 50, 150, 150);
        }
        if(btnIma1.isSelected()){
            foto = new ImageIcon(getClass().getResource("/img/1.jpg"));
            papel.drawImage(foto.getImage(), 0, 0, 300, 300, null);
            /*fondo = new ImageIcon(foto.getImage().getScaledInstance(100,100,100));
            label.setIcon(fondo);*/
        }
        if(btnIma2.isSelected()){
            foto = new ImageIcon(getClass().getResource("/img/2.jpg"));
            papel.drawImage(foto.getImage(), 0, 0, 300, 300, null);
            /*fondo = new ImageIcon(foto.getImage().getScaledInstance(100,100,100));
            label.setIcon(fondo);*/
        }
        if(btnIma3.isSelected()){
            foto = new ImageIcon(getClass().getResource("/img/3.jpg"));
            papel.drawImage(foto.getImage(), 0, 0, 300, 300, null);
            /*fondo = new ImageIcon(foto.getImage().getScaledInstance(100,100,100));
            label.setIcon(fondo);*/
        }
        
        /*
        Al menos 3 radio botones mas con los nombres de imágenes. Al seleccionar un radio boton, la imagen debe mostrarse
        en el panel
        */
    }
}
