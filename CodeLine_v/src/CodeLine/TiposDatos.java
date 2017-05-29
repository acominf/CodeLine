package CodeLine;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class TiposDatos extends javax.swing.JFrame {
    
    public TiposDatos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Tipos de Datos");
        
        String directorioActual = System.getProperty("user.dir");
        String separador = System.getProperty("file.separator");
        
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon img = new ImageIcon(directorioActual+separador+"src/CodeLine/Images/datos.png");
        JLabel fondo = new JLabel(img);
        fondo.setBounds(-4,-14,img.getIconWidth(),img.getIconHeight());
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Podemos declarar dos o mas variables en la misma linea:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("La combinacion de identificadores con tipos de datos se utlizan para ");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("int num1, num2;");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("declarar variables, en C se necesitan declarar antes de poder usarlas,");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Asi como darles un valor inicial:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("C ofrece distintos tipos de datos, cada uno de los cuales se puede ");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("la sintaxis base de ello es:");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("float resultado = suma;");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("encontrar representado de manera diferente. ");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("tipo_Dato nombreVariable;");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipos:");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Es importa recordar que siempre termina con punto y coma, de lo ");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("int - cantidad entero");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("contrario al compilar nos marcara error.");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("char - caracter");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ejemplos:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("float - numero decimal");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("int suma;");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("double - numero decimal con mas precision que el float");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("float resultado;");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cabe señalar que todas estas palabras son reservadas por lo que ");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("char letra;");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("no podremos usarlas como identificadores.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addGap(64, 64, 64)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PantallaC pant = new PantallaC();
        pant.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiposDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
