package CodeLine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sesion extends javax.swing.JFrame {

    public Sesion() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Inicia Sesión");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        t_contrasena = new javax.swing.JPasswordField();
        b_iniciar = new javax.swing.JButton();
        p_cargando = new javax.swing.JProgressBar();
        l_contrasena = new javax.swing.JLabel();
        b_crearcuenta = new javax.swing.JButton();
        t_usuario = new javax.swing.JTextField();
        l_usuario = new javax.swing.JLabel();
        i_iconsesion = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        t_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_contrasenaActionPerformed(evt);
            }
        });

        b_iniciar.setText("Iniciar");
        b_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_iniciarActionPerformed(evt);
            }
        });

        l_contrasena.setText("Contraseña:");

        b_crearcuenta.setText("Crear Cuenta");
        b_crearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_crearcuentaActionPerformed(evt);
            }
        });

        t_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_usuarioActionPerformed(evt);
            }
        });

        l_usuario.setText("Usuario:");

        i_iconsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodeLine/Images/login.png"))); // NOI18N
        i_iconsesion.setText("imagen_sesion");
        i_iconsesion.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_cargando, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_usuario)
                            .addComponent(l_contrasena))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(t_contrasena)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(b_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(b_crearcuenta)))
                .addGap(0, 264, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(i_iconsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(i_iconsesion, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_usuario))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_contrasena))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_crearcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addComponent(p_cargando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_contrasenaActionPerformed

    private void b_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_iniciarActionPerformed
        // TODO add your handling code here: 
        Account user = new Account();
        CheckString check1 = new CheckString();
        
        user = GeneraDatos(LeeArchivo(t_usuario.getText()));
        
        if((user.getPassword()).equals(check1.convertToString(t_contrasena.getPassword())) 
                && (user.getUserID()).equals(t_usuario.getText()))
        {
            CodeLine v_codeline = new CodeLine();
            v_codeline.setVisible(true);
            dispose();
        }
        else{
            t_usuario.setText("");
            t_contrasena.setText("");
        }
        
    }//GEN-LAST:event_b_iniciarActionPerformed

    private void b_crearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_crearcuentaActionPerformed
        // TODO add your handling code here:
        CrearCuenta v_crearcuenta = new CrearCuenta();
        v_crearcuenta.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_crearcuentaActionPerformed

    private void t_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_usuarioActionPerformed
    
    
    public Account GeneraDatos(String cadena)
    {
        String nombre = "";
        String userID = "";
        String email = "";
        String password = "";
        int puntaje = 0;
        String aux = cadena;
        int var = 0;
        for(int i = 0; i < aux.length();i++)
        {
            char c = aux.charAt(i);
            if(c != '/'){
                switch(var)
                {
                    case 0: nombre += c;
                            break;
                    case 1: userID += c;
                            break;
                    case 2: email += c;
                            break;
                    case 3: password += c;
                            break;
                    default: puntaje += c;
                            break;
                }
                        
            }
            else
                var++;
        }
        if(password.equals(""))
            password = " ";
        puntaje -= 48;
        Account user = new Account();
        user.addAccount(nombre, userID, email, password);
        user.setPuntaje(puntaje);
        return user;
    }
    public String LeeArchivo(String nombArch)
        { 
            String directorioActual = System.getProperty("user.dir");
            String separador = System.getProperty("file.separator");
            String texto = "";
            try {
                if(existeArchivo(nombArch)){
                    FileReader archivo = new FileReader(directorioActual+separador+"src/CodeLine/BaseDeDatos/"+nombArch);
                    BufferedReader b = new BufferedReader(archivo);
                    String cadena;
                    while((cadena = b.readLine()) != null) {
                        texto += cadena;
                    }
                    b.close();
                    return texto;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
                //e.printStackTrace();
            }
            catch (IOException e) {
                System.out.println("Entrada/Salida de datos");
                //e.printStackTrace();
            }
            return texto;
        }
    
        
        public boolean existeArchivo(String nombArch)
        {
            String directorioActual = System.getProperty("user.dir");
            String separador = System.getProperty("file.separator");            
            File archivo = new File(directorioActual+separador+"src/CodeLine/BaseDeDatos/"+nombArch);
            if(archivo.exists())
                return true;
            else
                return false;
        }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_crearcuenta;
    private javax.swing.JButton b_iniciar;
    private javax.swing.JLabel i_iconsesion;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel l_contrasena;
    private javax.swing.JLabel l_usuario;
    private javax.swing.JProgressBar p_cargando;
    private javax.swing.JPasswordField t_contrasena;
    private javax.swing.JTextField t_usuario;
    // End of variables declaration//GEN-END:variables
}
