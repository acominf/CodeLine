package CodeLine;

import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class CrearCuenta extends javax.swing.JFrame {
    public CrearCuenta() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Crear Cuenta");
        
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

        b_cargarImagen = new javax.swing.JButton();
        b_borrarImagen = new javax.swing.JButton();
        l_nombre = new javax.swing.JLabel();
        l_usuario = new javax.swing.JLabel();
        l_correo = new javax.swing.JLabel();
        l_contrasena = new javax.swing.JLabel();
        l_confirmar = new javax.swing.JLabel();
        t_usuario = new javax.swing.JTextField();
        t_correo = new javax.swing.JTextField();
        t_nombre = new javax.swing.JTextField();
        t_confirmar = new javax.swing.JPasswordField();
        t_contrasena = new javax.swing.JPasswordField();
        c_condiciones = new javax.swing.JCheckBox();
        b_registrar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.yellow);

        b_cargarImagen.setText("Cargar Imagen");
        b_cargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cargarImagenActionPerformed(evt);
            }
        });

        b_borrarImagen.setText("Borrar Imagen");
        b_borrarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_borrarImagenActionPerformed(evt);
            }
        });

        l_nombre.setText("Nombre Completo:");

        l_usuario.setText("Usuario:");

        l_correo.setText("Correo:");

        l_contrasena.setText("Contraseña:");

        l_confirmar.setText("Confirmar Contraseña:");
        l_confirmar.setToolTipText("");

        t_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nombreActionPerformed(evt);
            }
        });

        t_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_confirmarActionPerformed(evt);
            }
        });

        t_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_contrasenaActionPerformed(evt);
            }
        });

        c_condiciones.setText("Aceptar Términos y Condiciones.");

        b_registrar.setText("Registrar");
        b_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registrarActionPerformed(evt);
            }
        });

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b_cancelar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l_correo)
                            .addComponent(l_nombre)
                            .addComponent(l_usuario)
                            .addComponent(l_contrasena)
                            .addComponent(l_confirmar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(266, 266, 266))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(b_registrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(c_condiciones))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(b_cargarImagen)
                        .addGap(118, 118, 118)
                        .addComponent(b_borrarImagen)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_borrarImagen)
                    .addComponent(b_cargarImagen))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_nombre)
                    .addComponent(t_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_correo)
                    .addComponent(t_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_usuario)
                    .addComponent(t_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_contrasena)
                    .addComponent(t_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_confirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_confirmar))
                .addGap(18, 18, 18)
                .addComponent(c_condiciones)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_registrar)
                    .addComponent(b_cancelar))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_cargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cargarImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_cargarImagenActionPerformed

    private void t_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_confirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_confirmarActionPerformed

    private void t_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_contrasenaActionPerformed

    private void t_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nombreActionPerformed

    private void b_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_registrarActionPerformed
        // TODO add your handling code here:
        CheckString check1 = new CheckString();
        CheckString check2 = new CheckString();
        CheckString check3 = new CheckString();
        CheckString check4 = new CheckString();
        CheckString check5 = new CheckString();
        char dato[] = t_confirmar.getPassword();
        String dat = ""+Arrays.toString(dato);
        if(check1.verificaCadenaInt(dat) == 0)
            t_confirmar.setText("******");
        if(c_condiciones.isSelected() &&  
               check1.verificaCadena(t_correo.getText()) &&
               check2.verificaCadena(t_nombre.getText()) &&
               check3.verificaCadena(t_usuario.getText()) &&
               check4.verificaPassword(t_contrasena.getPassword(), t_confirmar.getPassword()))
        {
            Account cuenta = new Account();
            
            cuenta.addAccount(t_nombre.getText(),t_usuario.getText(), t_correo.getText(), check5.convertToString(t_contrasena.getPassword()));
            if(cuenta.escribeArchivo(t_usuario.getText())){
            Sesion v_sesion = new Sesion();
            v_sesion.setVisible(true);
            dispose();
            }
            else{
                t_usuario.setText("");
            }
        }
        
        if(check1.verificaCadena(t_correo.getText()) == false)
            t_correo.setText("");
        if(check2.verificaCadena(t_nombre.getText())== false)
            t_nombre.setText("");
        if(check3.verificaCadena(t_usuario.getText())== false)
            t_usuario.setText("");
        if(check4.verificaPassword(t_contrasena.getPassword(), t_confirmar.getPassword())== false){
            t_confirmar.setText("");
            t_contrasena.setText("");
        }        
    }//GEN-LAST:event_b_registrarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        // TODO add your handling code here:
        Sesion v_sesion = new Sesion();
        v_sesion.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_borrarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_borrarImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_borrarImagenActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_borrarImagen;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_cargarImagen;
    private javax.swing.JButton b_registrar;
    private javax.swing.JCheckBox c_condiciones;
    private javax.swing.JLabel l_confirmar;
    private javax.swing.JLabel l_contrasena;
    private javax.swing.JLabel l_correo;
    private javax.swing.JLabel l_nombre;
    private javax.swing.JLabel l_usuario;
    private javax.swing.JPasswordField t_confirmar;
    private javax.swing.JPasswordField t_contrasena;
    private javax.swing.JTextField t_correo;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_usuario;
    // End of variables declaration//GEN-END:variables
}
