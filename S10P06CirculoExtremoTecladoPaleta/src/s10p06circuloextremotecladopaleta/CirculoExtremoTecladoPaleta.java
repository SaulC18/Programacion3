/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */
package s10p06circuloextremotecladopaleta;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Saul Cervantes Candia
 */
public class CirculoExtremoTecladoPaleta extends javax.swing.JFrame {

    /**
     * Creates new form CirculoExtremoTecladoPaleta
     */
    public CirculoExtremoTecladoPaleta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int x = 0;
    int y = 0;
    int ancho = 50;
    int alto = 50;
    
    private void panelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelKeyPressed
        Graphics papel = panel.getGraphics();
        //Limpiar panel
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 550, 550);
        int n = evt.getKeyCode();
        if(n == 38){
            papel.setColor(Color.MAGENTA);
            System.out.println("Teclado arriba");
            y-=4;
        }
        if(n == 40){
            papel.setColor(Color.GREEN);
            System.out.println("Teclado abajo");
            y+=4;
        }
        if(n == 37){
            papel.setColor(Color.BLUE);
            System.out.println("Teclado izquierda");
            x-=4;
        }
        if(n == 39){
            papel.setColor(Color.RED);
            System.out.println("Teclado derecha");
            x+=4;
        }
        if(n == 107 || n == 521){
            papel.setColor(Color.ORANGE);
            System.out.println("Teclado +");
            ancho+=4;
            alto+=4;
        }
        if(n == 109 || n == 45){
            papel.setColor(Color.YELLOW);
            System.out.println("Teclado -");
            ancho-=4;
            alto-=4;
        }
        
        papel.fillOval(x, y, ancho, alto);
    }//GEN-LAST:event_panelKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        Graphics papel = panel.getGraphics();
        //Limpiar panel
        papel.setColor(Color.WHITE);
        papel.fillRect(0, 0, 550, 550);
        int n = evt.getKeyCode();
        if(n == 38){
            papel.setColor(Color.MAGENTA);
            System.out.println("Teclado arriba");
            y-=4;
        }
        if(n == 40){
            papel.setColor(Color.GREEN);
            System.out.println("Teclado abajo");
            y+=4;
        }
        if(n == 37){
            papel.setColor(Color.BLUE);
            System.out.println("Teclado izquierda");
            x-=4;
        }
        if(n == 39){
            papel.setColor(Color.RED);
            System.out.println("Teclado derecha");
            x+=4;
        }
        if(n == 107 || n == 521){
            papel.setColor(Color.ORANGE);
            System.out.println("Teclado +");
            ancho+=4;
            alto+=4;
        }
        if(n == 109 || n == 45){
            papel.setColor(Color.YELLOW);
            System.out.println("Teclado -");
            ancho-=4;
            alto-=4;
        }
        
        papel.fillOval(x, y, ancho, alto);
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}