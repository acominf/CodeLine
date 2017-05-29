package CodeLine;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class EjercicioEscan extends javax.swing.JFrame {

    public EjercicioEscan() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ejercicio Escaner");
        b_regresa.setVisible(false);
        String directorioActual = System.getProperty("user.dir");
        String separador = System.getProperty("file.separator");
        
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon img = new ImageIcon(directorioActual+separador+"src/CodeLine/Images/usoscanf.png");
        JLabel fondo = new JLabel(img);
        fondo.setBounds(-4,-14,img.getIconWidth(),img.getIconHeight());
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_regresa = new javax.swing.JButton();
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
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rb_op1 = new javax.swing.JRadioButton();
        rb_op3 = new javax.swing.JRadioButton();
        rb_op2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_regresa.setText("Regresar");
        b_regresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_regresaActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Completa el siguiente codigo y contesta las preguntas: ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("#include <stdio.h> ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("int main() {");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("       int numero = 0; ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("       printf ( \"Ingresa un dato entero: \" ); ");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("       scanf(\" %d \", &numero);  ");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("       char letra = 'c'; ");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("       printf ( \"Ingresa una letra: \" ); ");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("       scanf(\" %s \", &letra);  ");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("       float flotante = 3.1416; ");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("       printf ( \"Ingresa un dato flotante: \" ); ");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("       scanf(\" %f \", &flotante);  ");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("       return 0; ");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("}");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("    ¿Cual sera el resultado de imprimir cada ");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("variable en orden de declaracion? ");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("        Datos del usuario. ");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("        Datos inicializados ( 0 , c , 3.1416). ");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("        Ningun dato seria impreso correctamente.");

        rb_op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_op1ActionPerformed(evt);
            }
        });

        rb_op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_op3ActionPerformed(evt);
            }
        });

        rb_op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_op2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rb_op3)
                                .addComponent(rb_op2))
                            .addComponent(rb_op1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6)
                        .addComponent(jLabel14)
                        .addComponent(jLabel13)
                        .addComponent(jLabel12)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(266, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_regresa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
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
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(rb_op1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_op2))
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_op3)
                        .addGap(7, 7, 7))
                    .addComponent(jLabel19))
                .addGap(23, 23, 23)
                .addComponent(b_regresa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_regresaActionPerformed
        // TODO add your handling code here:
        Ejercicio eje = new Ejercicio();
        eje.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_regresaActionPerformed

    private void rb_op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_op1ActionPerformed
        // TODO add your handling code here:
        rb_op1.setSelected(true);
        rb_op2.setSelected(false);
        rb_op3.setSelected(false);
        b_regresa.setVisible(true);
    }//GEN-LAST:event_rb_op1ActionPerformed

    private void rb_op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_op2ActionPerformed
        // TODO add your handling code here:
        rb_op1.setSelected(false);
        rb_op2.setSelected(true);
        rb_op3.setSelected(false);
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
                new EjercicioEscan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_regresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
