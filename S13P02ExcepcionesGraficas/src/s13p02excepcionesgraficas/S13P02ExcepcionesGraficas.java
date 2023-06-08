/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s13p02excepcionesgraficas;
import java.awt.*; //Abstract Window Toolkit - Depende de la plataforma (rn cuanto a controles)
import javax.swing.*; //javax significa extensión - Independiente de la plataforma (rn cuanto a controles)
import java.awt.event.*;

/**
 * @author Saul Cervantes Candia
 * EXCEPCION PROPIA GRAFICA
 * - Realice un programa con interfaz gráfica que reciba la matricula de un alumno y verifique que sea válida.
 * - Reciba 3 calificaciones de los 3 parciales en 3 textfields y en otro la calificacion del final.
 * - Muestre el promedio final de la materia.
 * (VALIDE QUE LAS CALIFICACIONES estén entre 0 y 10)
 * - Si se lanza alguna de las excepciones limpiar los textfield.
 * - Cree las excepciones propias en una clase nueva.
 */
public class S13P02ExcepcionesGraficas extends JFrame implements ActionListener{
    JLabel lblN1, lblN2, lblN3, lblN4, lblN5, lblResultado;
    JTextField tfN1, tfN2, tfN3, tfN4, tfN5, tfResultado;
    JButton btnCalcular;
    public static void main(String[] args) {
        S13P02ExcepcionesGraficas marco = new S13P02ExcepcionesGraficas();
        marco.setSize(190, 250);
        marco.setTitle("Excepciones");
        marco.crearGUI();
        marco.setVisible(true);
        marco.setLocationRelativeTo(null);
        marco.setResizable(false);
    }

    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Termina la ejecución al presionar x
        
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout()); //Administrador de contenido
        
        //Configurar objetos
        //Suma
        lblN1 = new JLabel("Matricula: ");
        ventana.add(lblN1);
        tfN1 = new JTextField(7);
        ventana.add(tfN1);
        //Resta
        lblN2 = new JLabel("Parcial 1: ");
        ventana.add(lblN2);
        tfN2 = new JTextField(7);
        ventana.add(tfN2);
        
        lblN3 = new JLabel("Parcial 2: ");
        ventana.add(lblN3);
        tfN3 = new JTextField(7);
        ventana.add(tfN3);
        
        lblN4 = new JLabel("Parcial 3: ");
        ventana.add(lblN4);
        tfN4 = new JTextField(7);
        ventana.add(tfN4);
        
        lblN5 = new JLabel("EX Final: ");
        ventana.add(lblN5);
        tfN5 = new JTextField(7);
        ventana.add(tfN5);
        //Botones
        btnCalcular = new JButton("Calcular");
        ventana.add(btnCalcular);
        btnCalcular.addActionListener(this);
        
        //Resultado
        lblResultado = new JLabel("Promedio Final: ");
        ventana.add(lblResultado);
        tfResultado = new JTextField(7);
        ventana.add(tfResultado);
        tfResultado.setEditable(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        ExcepcionPropia e = new ExcepcionPropia();
        //matricula
        try{
            String matri = tfN1.getText();
            e.matricula(matri);
        }catch(Exception er){
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Ingrese bien matricula: "+er);
            tfN1.setText("");
        }
        //calificaciones
        try{
            float n1 = Float.parseFloat(tfN2.getText());
            e.calificacion(n1);
            float n2 = Float.parseFloat(tfN3.getText());
            e.calificacion(n2);
            float n3 = Float.parseFloat(tfN4.getText());
            e.calificacion(n3);
            float n4 = Float.parseFloat(tfN5.getText());
            e.calificacion(n4);
            
            float prom=(n1+n2+n3+n4)/4;
            if(btnCalcular == ae.getSource()){
                tfResultado.setText(Float.toString((float)(prom)));
            }
        }catch(Exception er){
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Calificacion no valida: "+er);
            tfN2.setText("");
            tfN3.setText("");
            tfN4.setText("");
            tfN5.setText("");
        }
    }
}
