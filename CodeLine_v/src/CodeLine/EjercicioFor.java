package CodeLine;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class EjercicioFor extends javax.swing.JFrame {

    public EjercicioFor() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ejercicio For");
        b_regresar.setVisible(false);
        String directorioActual = System.getProperty("user.dir");
        String separador = System.getProperty("file.separator");
        
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon img = new ImageIcon(directorioActual+separador+"src/CodeLine/Images/for.png");
        JLabel fondo = new JLabel(img);
        fondo.setBounds(-4,-14,img.getIconWidth(),img.getIconHeight());
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_regresar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rb_op1 = new javax.swing.JRadioButton();
        rb_op2 = new javax.swing.JRadioButton();
        rb_op3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_regresar.setText("Regresar");
        b_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_regresarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("      }      \t ");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("       return 0; ");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("}");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contesta la pregunta acerca del siguiente código.");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("           ¿Cual seran los valores que imprime el ciclo? ");

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" Imprime 0 1 2 3 4 5 6 7 8 9 ");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Imprime 1 2 3 4 5 6 7 8 9 10 ");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("#include <stdio.h> ");

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Imprime 0 1 2 3 4 5 6 7 8 9 10");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("int main() { ");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("       int i = 0; ");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("      for( i = 0 ; i < 10 ; i ++ ) { ");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("              printf ( \" La variable contiene: \", i + 1); ");

        rb_op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_op1ActionPerformed(evt);
            }
        });

        rb_op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_op2ActionPerformed(evt);
            }
        });

        rb_op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_op3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb_op1)
                            .addComponent(rb_op2)
                            .addComponent(rb_op3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))))
                .addContainerGap(256, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel14))
                                    .addComponent(rb_op1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addComponent(rb_op2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addComponent(rb_op3))
                .addGap(7, 7, 7)
                .addComponent(b_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_regresarActionPerformed
        // TODO add your handling code here:
        Ejercicio eje = new Ejercicio();
        eje.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_regresarActionPerformed

    private void rb_op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_op1ActionPerformed
        // TODO add your handling code here:
        rb_op1.setSelected(true);
        rb_op2.setSelected(false);
        rb_op3.setSelected(false);
    }//GEN-LAST:event_rb_op1ActionPerformed

    private void rb_op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_op2ActionPerformed
        // TODO add your handling code here:
        rb_op1.setSelected(false);
        rb_op2.setSelected(true);
        rb_op3.setSelected(false);
        b_regresar.setVisible(true);
    }//GEN-LAST:event_rb_op2ActionPerformed

    private void rb_op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_op3ActionPerformed
        // TODO add your handling code here:
        rb_op1.setSelected(false);
        rb_op2.setSelected(false);
        rb_op3.setSelected(true);
    }//GEN-LAST:event_rb_op3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioFor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_regresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rb_op1;
    private javax.swing.JRadioButton rb_op2;
    private javax.swing.JRadioButton rb_op3;
    // End of variables declaration//GEN-END:variables
}
