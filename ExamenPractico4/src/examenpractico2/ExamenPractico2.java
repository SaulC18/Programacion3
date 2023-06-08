/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package examenpractico2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * @author Saul Cervantes Candia
 */
public class ExamenPractico2 extends JFrame implements ActionListener{
    JButton btnValidar;
    JTextField tfCantC, tfCantCh;
    JLabel lbCam, lbCho;
    
    public static void main(String[] args) {
        ExamenPractico2 marco = new ExamenPractico2();
        marco.setSize(300,150);
        marco.setTitle("Hilos gráficos");
        marco.crearGUI();
        marco.setVisible(true);
        marco.setLocationRelativeTo(null);
    }

    public void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout()); 
        
        //Label
        lbCam = new JLabel("Cantidad camiones");
        ventana.add(lbCam);
        
        //JTextField
        tfCantC = new JTextField();
        tfCantC.setPreferredSize(new Dimension(100,20));
        ventana.add(tfCantC);
        
        lbCho = new JLabel("Cantidad choferes");
        ventana.add(lbCho);
        
        tfCantCh = new JTextField();
        tfCantCh.setPreferredSize(new Dimension(100,20));
        ventana.add(tfCantCh);
        
        //Botones
        btnValidar = new JButton("Validar");
        btnValidar.addActionListener(this);
        ventana.add(btnValidar);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        Excepciones2 exc = new Excepciones2();
        
        try{
            int cam = Integer.parseInt(tfCantC.getText());
            int cho = Integer.parseInt(tfCantCh.getText());
            if(btnValidar == ev.getSource()){
                exc.validar(cam, cho);
                if(cam<cho){
                    JOptionPane.showMessageDialog(null, "Dia valido");
                }
            }   
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
    }
}
