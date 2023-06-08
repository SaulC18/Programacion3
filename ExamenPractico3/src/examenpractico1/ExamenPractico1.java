/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package examenpractico1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * @author Saul Cervantes Candia
 */
public class ExamenPractico1 extends JFrame implements ActionListener{
    JButton btnDepo, btnReti;
    JTextField tfCant;
    JLabel lb1;
    
    public static void main(String[] args){
        ExamenPractico1 marco = new ExamenPractico1();
        marco.setSize(250,110);
        marco.setTitle("Banco");
        marco.crearGUI();
        marco.setVisible(true);
        marco.setLocationRelativeTo(null);
    }
    
    public void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout()); 
        
        //Label
        lb1 = new JLabel("Cantidad");
        ventana.add(lb1);
        
        //JTextField
        tfCant = new JTextField();
        tfCant.setPreferredSize(new Dimension(100,20));
        ventana.add(tfCant);
        
        //Botones
        btnDepo = new JButton("Depositar");
        btnDepo.addActionListener(this);
        ventana.add(btnDepo);
        
        btnReti = new JButton("Retirar");
        btnReti.addActionListener(this);
        ventana.add(btnReti);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        Excepciones ex = new Excepciones();
        float saldo = 500;
        String valor = tfCant.getText();
        try{
            if(btnDepo == evt.getSource()){
                saldo = Float.parseFloat(valor) + saldo;
                JOptionPane.showMessageDialog(null, "Cantidad actual de $"+saldo);
            }
        }catch(NumberFormatException ev){
            JOptionPane.showMessageDialog(null, "Error 3: "+ev);
        }
        
        try{
            ex.retirar(Float.parseFloat(valor), saldo);
            if(btnReti == evt.getSource()){
                saldo = saldo - Float.parseFloat(valor);
                JOptionPane.showMessageDialog(null, "Cantidad actual de $"+saldo);
            }
        }catch(NumberFormatException ev){
            JOptionPane.showMessageDialog(null, "Error: "+ev);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error2: "+e);
        }
        
    }
    
}
