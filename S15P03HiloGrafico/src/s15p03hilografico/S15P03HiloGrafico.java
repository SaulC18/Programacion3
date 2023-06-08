/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */

package s15p03hilografico;
import java.awt.*; //Abstract Window Toolkit - Depende de la plataforma (rn cuanto a controles)
import javax.swing.*; //javax significa extensión - Independiente de la plataforma (rn cuanto a controles)
import java.awt.event.*;

/**
 * @author Saul Cervantes Candia
 * PROGRAMA una interfaz grafica con:
 * - 1 panel de 100 x 100 pixeles
 * - 1 boton "Inciar 1"
 * - 1 boton "Detener 1"
 * - Otro panel de 100 x 100
 * - 1 boton "Inciar 2"
 * - 1 boton "Detener 2"
 */
public class S15P03HiloGrafico extends JFrame implements ActionListener{
    JPanel panel, panel2; 
    JButton btnIN1, btnIN2, btnDE1, btnDE2;
    PelotaHilo pelota1, pelota2;
    boolean bandera = true;
    
    public static void main(String[] args) {
        S15P03HiloGrafico marco = new S15P03HiloGrafico();
        marco.setSize(300,260);
        marco.setTitle("Hilos gráficos");
        marco.crearGUI();
        marco.setVisible(true);
        marco.setLocationRelativeTo(null);
    }
    
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Termina la ejecución al presionar x
        
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout()); //Administrador de contenido
        //gridLayout, borderLayout, -- "administra" la distribución de objetos en ventana
        
        //Colocar los objetos en la ventana.
        //PANEL
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,100));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        
        //Botones
        btnIN1 = new JButton("Iniciar 1");
        btnIN1.addActionListener(this); //Suscribir el boton al listener
        ventana.add(btnIN1);
        
        btnDE1 = new JButton("Detener 1");
        btnDE1.addActionListener(this); //Suscribir el boton al listener
        ventana.add(btnDE1);
        
        //PANEL 2
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(100,100));
        panel2.setBackground(Color.WHITE);
        ventana.add(panel2);
        
        //Botones 2
        btnIN2 = new JButton("Iniciar 2");
        btnIN2.addActionListener(this); //Suscribir el boton al listener
        ventana.add(btnIN2);
        
        btnDE2 = new JButton("Detener 2");
        btnDE2.addActionListener(this); //Suscribir el boton al listener
        ventana.add(btnDE2);
    }

    /*
    MODIFICAR:
    - Para el Iniciar 1, restringir que no se vuelva a iniciar el hilo usando una bandera
    . Para Iniciar 2 solo inhabilitar el botón si ya inicio.
    */
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        if(btnIN1 == evt.getSource() && bandera == true){
            pelota1 = new PelotaHilo(panel);
            pelota1.start();
            bandera = false;
        }
        if(btnDE1 == evt.getSource() && bandera == false){
            pelota1.detener();
            bandera = true;
        }
        if(btnIN2 == evt.getSource()){
            pelota2 = new PelotaHilo(panel2);
            pelota2.start();
            btnIN2.setEnabled(false);
        }
        if(btnDE2 == evt.getSource()){
            pelota2.detener();
            btnIN2.setEnabled(true);
        }
    }

}
