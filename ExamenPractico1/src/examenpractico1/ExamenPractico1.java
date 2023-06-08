/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package examenpractico1;
import java.awt.*; //Abstract Window Toolkit - Depende de la plataforma (rn cuanto a controles)
import javax.swing.*; //javax significa extensión - Independiente de la plataforma (rn cuanto a controles)
import java.awt.event.*;

/**
 * @author Saul Cervantes Candia
 */
public class ExamenPractico1 extends JFrame implements ActionListener{
    JLabel lb1, lb2, lb3, lb4;
    JButton btn1, btn2, btnGra;
    JTextField tfProm1, tfProm2;
    JPanel panel;
    public static void main(String[] args) {
        ExamenPractico1 marco = new ExamenPractico1();
        marco.setSize(400, 400);  //estan en JFrame
        marco.setTitle("Mi primer programa grafico");
        marco.crearGUI();
        marco.setVisible(true);
    }

    public void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Termina la ejecución al presionar x
        
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout()); //Administrador de contenido
        
        //Materia 1
        lb1 = new JLabel("Materia 1");
        ventana.add(lb1);
        btn1 = new JButton("Calcular 1");
        ventana.add(btn1);
        btn1.addActionListener(this);
        lb2 = new JLabel("Promedio 1");
        ventana.add(lb2);
        tfProm1 = new JTextField(10);
        ventana.add(tfProm1);
        
        //Materia 2
        lb3 = new JLabel("Materia 2");
        ventana.add(lb3);
        btn2 = new JButton("Calcular 2");
        ventana.add(btn2);
        btn2.addActionListener(this);
        lb4 = new JLabel("Promedio 2");
        ventana.add(lb4);
        tfProm2 = new JTextField(10);
        ventana.add(tfProm2);
        
        //Grafica
        btnGra = new JButton("Graficar");
        ventana.add(btnGra);
        btnGra.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        float prom=0, sum=0;
        float prom2=0, sum2=0;
        if(btn1==evt.getSource()){
            float cal[] = new float[3];
            for (int i = 0; i < 3; i++) {
                String inputValue = JOptionPane.showInputDialog("Ingrese calificacion "+(i+1));
                cal[i] = Float.parseFloat(inputValue);         
                sum+=cal[i];
            }
            prom = sum/3;
            tfProm1.setText(Float.toString(prom));
        }
        
        if(btn2==evt.getSource()){
            float cal2[] = new float[3];
            for (int i = 0; i < 3; i++) {
                String inputValue = JOptionPane.showInputDialog("Ingrese calificacion "+(i+1));
                cal2[i] = Float.parseFloat(inputValue);   
                sum2+=cal2[i];
                prom2=sum2/3;
            }
            tfProm2.setText(Float.toString(prom2));
        }
        
        //Falto lo de graficar 
    }

}
