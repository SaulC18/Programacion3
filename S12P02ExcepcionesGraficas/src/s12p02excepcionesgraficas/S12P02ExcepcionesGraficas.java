/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s12p02excepcionesgraficas;
import java.awt.*; //Abstract Window Toolkit - Depende de la plataforma (rn cuanto a controles)
import javax.swing.*; //javax significa extensión - Independiente de la plataforma (rn cuanto a controles)
import java.awt.event.*;

/**
 * @author Saul Cervantes Candia
 * Con base en el ejercicio S08P05Operaciones modifique para que se atrapen todas las excepciones que pudieran lanzarse, además
 * de programar una excepeción general.
 * Si se lanza una excepcion, mande un mensaje de error mediante un JOptionPane  y limpie el contenido de los textFields
 */
public class S12P02ExcepcionesGraficas extends JFrame implements ActionListener{
    JLabel lblN1, lblN2, lblResultado;
    JTextField tfN1, tfN2, tfResultado;
    JButton btnSumar, btnRestar, btnMultiplicar, btnDividir;
    public static void main(String[] args) {
        S12P02ExcepcionesGraficas marco = new S12P02ExcepcionesGraficas();
        marco.setSize(200, 201);
        marco.setTitle("Operaciones");
        marco.crearGUI();
        marco.setVisible(true);
        marco.setLocationRelativeTo(null);
    }
    
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Termina la ejecución al presionar x
        
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout()); //Administrador de contenido
        
        //Configurar objetos
        //Suma
        lblN1 = new JLabel("Número 1: ");
        ventana.add(lblN1);
        tfN1 = new JTextField(7);
        ventana.add(tfN1);
        //Resta
        lblN2 = new JLabel("Número 2: ");
        ventana.add(lblN2);
        tfN2 = new JTextField(7);
        ventana.add(tfN2);
        //Botones
        btnSumar = new JButton("Sumar");
        ventana.add(btnSumar);
        btnSumar.addActionListener(this);
        
        btnRestar = new JButton("Restar");
        ventana.add(btnRestar);
        btnRestar.addActionListener(this);
        
        btnMultiplicar = new JButton("Multiplicar");
        ventana.add(btnMultiplicar);
        btnMultiplicar.addActionListener(this);
        
        btnDividir = new JButton("Dividir");
        ventana.add(btnDividir);
        btnDividir.addActionListener(this);
        
        
        //Resultado
        lblResultado = new JLabel("Resultado: ");
        ventana.add(lblResultado);
        tfResultado = new JTextField(7);
        ventana.add(tfResultado);
        
        tfResultado.setEditable(false);
    }

    @Override
    public void actionPerformed(ActionEvent event){
        try{
            String t1 = tfN1.getText();
            float n1 = Float.parseFloat(t1);

            float n2 = Float.parseFloat(tfN2.getText());

            if(btnSumar == event.getSource()){
                tfResultado.setText(Float.toString((n1+n2)));
            }
            if(btnRestar == event.getSource()){
                tfResultado.setText(Float.toString((n1-n2)));
            }
            if(btnMultiplicar == event.getSource()){
                tfResultado.setText(Float.toString((int)(n1*n2)));
            }
            if(btnDividir == event.getSource()){
                tfResultado.setText(Float.toString((n1/n2)));
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingrese numero entero o decimal "+e);
            tfN1.setText("");
            tfN2.setText("");
        }catch(Exception er){
            JOptionPane.showMessageDialog(this, er);
            System.out.println("Error "+er);
        }
    }
}
