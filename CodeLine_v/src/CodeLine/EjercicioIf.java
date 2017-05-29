package CodeLine;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class EjercicioIf extends javax.swing.JFrame {

    public EjercicioIf() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ejercicio if");
        b_regresar.setVisible(false);
        String directorioActual = System.getProperty("user.dir");
        String separador = System.getProperty("file.separator");
        
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon img = new ImageIcon(directorioActual+separador+"src/CodeLine/Images/condicional.png");
        JLabel fondo = new JLabel(img);
        fondo.setBounds(-4,-14,img.getIconWidth(),img.getIconHeight());
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rb_opcion1 = new javax.swing.JRadioButton();
        rb_opcion2 = new javax.swing.JRadioButton();
        rb_opcion3 = new javax.swing.JRadioButton();
        rb_opcion4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_regresar.setText("Regresar");
        b_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_regresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("1. Completa el siguiente codigo. ");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("#include <stdio.h> ");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("#define N 5 ");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("int main() { ");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("       int i = 0; ");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("      for( i = 0 ; i < N ; i ++ ) { ");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("               if ( i  == i%2 ) { ");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("                       printf ( i ); ");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("               } ");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("      }      \t ");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("       return 0; ");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("}");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("           ¿Cual seran los valores que imprime el ciclo? ");

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Imprime 1 2 3 4 5 ");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Imprime 0 1 2 3 4 ");

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Imprime 0 2 4 ");

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Imprime 1 2 4");

        rb_opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_opcion1ActionPerformed(evt);
            }
        });

        rb_opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_opcion2ActionPerformed(evt);
            }
        });

        rb_opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_opcion3ActionPerformed(evt);
            }
        });

        rb_opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_opcion4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(rb_opcion1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 229, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_opcion3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb_opcion4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb_opcion2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(247, 247, 247)
                        .addComponent(b_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel14)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb_opcion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_opcion2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(rb_opcion3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))
                            .addComponent(rb_opcion4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(b_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_regresarActionPerformed
        // TODO add your handling code here:
        Ejercicio eje = new Ejercicio();
        eje.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_regresarActionPerformed

    private void rb_opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_opcion1ActionPerformed
        // TODO add your handling code here:
        rb_opcion1.setSelected(true);
        rb_opcion2.setSelected(false);
        rb_opcion3.setSelected(false);
        rb_opcion4.setSelected(false);
    }//GEN-LAST:event_rb_opcion1ActionPerformed

    private void rb_opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_opcion2ActionPerformed
        // TODO add your handling code here:
        rb_opcion1.setSelected(false);
        rb_opcion2.setSelected(true);
        rb_opcion3.setSelected(false);
        rb_opcion4.setSelected(false);
    }//GEN-LAST:event_rb_opcion2ActionPerformed

    private void rb_opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_opcion3ActionPerformed
        // TODO add your handling code here:
        rb_opcion1.setSelected(false);
        rb_opcion2.setSelected(false);
        rb_opcion3.setSelected(true);
        rb_opcion4.setSelected(false);
        b_regresar.setVisible(true);
    }//GEN-LAST:event_rb_opcion3ActionPerformed

    private void rb_opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_opcion4ActionPerformed
        // TODO add your handling code here:
        rb_opcion1.setSelected(false);
        rb_opcion2.setSelected(false);
        rb_opcion3.setSelected(false);
        rb_opcion4.setSelected(true);
    }//GEN-LAST:event_rb_opcion4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioIf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rb_opcion1;
    private javax.swing.JRadioButton rb_opcion2;
    private javax.swing.JRadioButton rb_opcion3;
    private javax.swing.JRadioButton rb_opcion4;
    // End of variables declaration//GEN-END:variables
}
