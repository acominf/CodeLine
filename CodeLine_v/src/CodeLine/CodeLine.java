package CodeLine;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class CodeLine extends javax.swing.JFrame {
    public CodeLine() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Menú");
        
        String directorioActual = System.getProperty("user.dir");
        String separador = System.getProperty("file.separator");
        
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon img = new ImageIcon(directorioActual+separador+"src/CodeLine/Images/fondo.png");
        JLabel fondo = new JLabel(img);
        fondo.setBounds(-4,-14,img.getIconWidth(),img.getIconHeight());
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_codeline = new javax.swing.JLabel();
        b_seccion2 = new javax.swing.JButton();
        b_ejercicios = new javax.swing.JButton();
        l_bienvenida = new javax.swing.JLabel();
        b_seccion1 = new javax.swing.JButton();
        l_vision = new javax.swing.JLabel();
        l_mision = new javax.swing.JLabel();
        l_autores = new javax.swing.JLabel();
        l_contenidomision = new javax.swing.JLabel();
        l_contenidovision1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        l_codeline.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        l_codeline.setText("CodeLine: Aprende a programar.");

        b_seccion2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        b_seccion2.setText("Código y Sintaxis");
        b_seccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seccion2ActionPerformed(evt);
            }
        });

        b_ejercicios.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        b_ejercicios.setText("Ejercicios");
        b_ejercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ejerciciosActionPerformed(evt);
            }
        });

        l_bienvenida.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        l_bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_bienvenida.setText("Bienvenid@");

        b_seccion1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        b_seccion1.setText("Pseudocódigo");
        b_seccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seccion1ActionPerformed(evt);
            }
        });

        l_vision.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l_vision.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_vision.setText("Visión:");

        l_mision.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l_mision.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_mision.setText("Misión:");

        l_autores.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        l_autores.setText("Creado por: Rodrigo González y Efraín Morín.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(l_autores))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_mision, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b_seccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(l_codeline)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(b_seccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(b_ejercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(l_vision, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(l_contenidovision1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 13, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_contenidomision, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(l_bienvenida)
                                .addGap(76, 300, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_codeline, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_ejercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_seccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_seccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_mision)
                    .addComponent(l_vision))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(l_bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(l_contenidomision, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_contenidovision1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(l_autores)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_seccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seccion1ActionPerformed
        // TODO add your handling code here:
        //seleccionado();
        Pantalla_Leccion pant = new Pantalla_Leccion();
        pant.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_seccion1ActionPerformed

    private void b_seccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seccion2ActionPerformed
        // TODO add your handling code here:
        //seleccionado();
        PantallaC pant = new PantallaC();
        pant.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_seccion2ActionPerformed

    private void b_ejerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ejerciciosActionPerformed
        // TODO add your handling code here:
        //seleccionado();
        Ejercicio ejer = new Ejercicio();
        ejer.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_ejerciciosActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CodeLine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_ejercicios;
    private javax.swing.JButton b_seccion1;
    private javax.swing.JButton b_seccion2;
    private javax.swing.JLabel l_autores;
    private javax.swing.JLabel l_bienvenida;
    private javax.swing.JLabel l_codeline;
    private javax.swing.JLabel l_contenidomision;
    private javax.swing.JLabel l_contenidovision1;
    private javax.swing.JLabel l_mision;
    private javax.swing.JLabel l_vision;
    // End of variables declaration//GEN-END:variables

}
