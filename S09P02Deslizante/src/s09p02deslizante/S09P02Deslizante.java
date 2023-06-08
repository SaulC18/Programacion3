/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s09p02deslizante;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * @author Saul Cervantes Candia
 * Agregue:
 * - Otro JPanel en el que se dibuje otro circulo de otro color a partir de otro JSlider
 * y poninedo su valor con otro JLabel y otro JTextField.
 * - Agregue un tercer textfield en el que diga cual de los círculos es más grnade o bien si son iguales
 */
public class S09P02Deslizante extends JFrame implements ChangeListener{
    JLabel label, label2;
    JTextField tf, tf2, tf3;
    JSlider deslizante, deslizante2;
    JPanel panel, panel2;
    public static void main(String[] args) {
        S09P02Deslizante marco = new S09P02Deslizante();
        marco.setSize(700, 800);
        marco.setTitle("Deslizante");
        marco.crearGUI();
        marco.setVisible(true);
    }
    
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Termina la ejecución al presionar x
        
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout()); //Administrador de contenido
        
        //Panel - de 300x300 dibujar un circulo que crezca y decrezca al mover el deslizante
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        
        //Label y TextField
        label = new JLabel("Valor: ");
        ventana.add(label);
        
        tf = new JTextField(5);
        ventana.add(tf);
        
        //Configurarcion del deslizante
        deslizante = new JSlider(JSlider.HORIZONTAL,10,250,120);
        ventana.add(deslizante);
        deslizante.addChangeListener(this);
        
        //tf.setText(Integer.toString(deslizante.getValue()));
        //Panel - de 300x300 dibujar un circulo que crezca y decrezca al mover el deslizante
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(300,300));
        panel2.setBackground(Color.WHITE);
        ventana.add(panel2);
        
        //Label y TextField
        label2 = new JLabel("Valor: ");
        ventana.add(label2);
        
        tf2 = new JTextField(5);
        ventana.add(tf2);
        
        //Configurarcion del deslizante
        deslizante2 = new JSlider(JSlider.HORIZONTAL,10,250,120);
        ventana.add(deslizante2);
        deslizante2.addChangeListener(this);
        
        tf3 = new JTextField(20);
        ventana.add(tf3);
    }

    int x = 1;
    int y = 1;
    int ancho = 2;
    int alto = 2;
    
    @Override
    public void stateChanged(ChangeEvent event) {
        //Primer circulo
        tf.setText(Integer.toString(deslizante.getValue()));
        int n = deslizante.getValue();
        
        Graphics papel = panel.getGraphics();
        //Limpiar panel
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 300, 300);
        papel.setColor(Color.BLUE);
        
        //papel.fillOval(x, y, n, n);
        papel.fillOval(150-n/2, 150-n/2, n, n);
        
        //Segundo circulo
        tf2.setText(Integer.toString(deslizante2.getValue()));
        int n2 = deslizante2.getValue();
        
        Graphics papel2 = panel2.getGraphics();
        //Limpiar panel
        papel2.setColor(Color.WHITE);
        papel2.fillRect(0, 0, 300, 300);
        papel2.setColor(Color.GREEN);
        
        //papel.fillOval(x, y, n, n);
        papel2.fillOval(150-n2/2, 150-n2/2, n2, n2);
        
        if(n > n2){
            tf3.setText("Azul es el mas grande");
        }else{
            tf3.setText("Verde es el mas grande");
        }
        if(n == n2){
            tf3.setText("Son iguales");
        }
    }

}
