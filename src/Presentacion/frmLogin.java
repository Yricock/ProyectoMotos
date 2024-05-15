package Presentacion;
import Modelo.CMEmpleado ;
import Controlador.CCEmpleado ;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class frmLogin extends javax.swing.JFrame {

    CMEmpleado cme=new CMEmpleado();
    CCEmpleado cce=new CCEmpleado ();
    
    public frmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        pnlFondoLogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        btnInicioSesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Usuario:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INGRESAR DATOS PARA EL INICIO DE SESIÓN");

        pnlFondoLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondoLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_To_Do_35820.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(70, 70));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setText("CUCHITOMotosSAC.");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        pnlFondoLogin.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 340));

        jPanel2.setBackground(new java.awt.Color(255, 249, 179));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INICIAR SESIÓN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Contraseña");

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });

        btnInicioSesion.setBackground(new java.awt.Color(204, 255, 255));
        btnInicioSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnInicioSesion.setText("Iniciar Sesión");
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });

        jLabel5.setMaximumSize(new java.awt.Dimension(297, 256));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/java.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-contraseña-24.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla 2024-05-15 174048 (1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUsuario)
                            .addComponent(txtPass)
                            .addComponent(jSeparator1)
                            .addComponent(btnInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel9)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        pnlFondoLogin.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 260, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        validar_ingreso();
    }//GEN-LAST:event_btnInicioSesionActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
      char vertecla=evt.getKeyChar();
        
        if(vertecla==KeyEvent.VK_ENTER)
        {
            validar_usuario();
        }  
    }//GEN-LAST:event_txtPassKeyTyped

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed
    
    public void validar_ingreso()
    {
        String usuario,pass;
        usuario=txtUsuario.getText();
        pass=txtPass.getText();
        
        if(usuario.equals("") || pass.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Llene los datos Vacios");
            txtUsuario.requestFocus();
        }
        else
        {
           cme=cce.ValidarUsuario(usuario,pass);
           if(cme.getUserusuario()!=null && cme.getPassusuario()!=null)
           {
               JOptionPane.showMessageDialog(null,"Bienvenido al Sistema");
               frmPrincipal fp=new frmPrincipal();
               this.dispose();
               fp.setVisible(true);
           } 
           else
            {
                JOptionPane.showMessageDialog(null,"Datos incorrectos ingresar nuevamente");
                txtUsuario.setText("");
                txtPass.setText("");
                txtUsuario.requestFocus(); //El cursos aparezca en el control
                
            } 
           
        }
        
    
    }        
    
    
    public void validar_usuario()
    {
        String usuario,pass;
        usuario=txtUsuario.getText();
        pass=txtPass.getText();
        
        if(usuario.equals("") || pass.equals("") )
        {
            JOptionPane.showMessageDialog(null,"Llene los datos vacios");
        } 
        else{
        
            if(usuario.equals("MITSUKO") || usuario.equals("mitsuko") && pass.equals("123456"))
            {
                JOptionPane.showMessageDialog(null,"Bienvenido al Sistema de Ventas");
                frmPrincipal frmp=new frmPrincipal();
                this.dispose();
                frmp.setVisible(true);
            } 
            else
            {
                JOptionPane.showMessageDialog(null,"Datos incorrectos ingresar nuevamente");
                txtUsuario.setText("");
                txtPass.setText("");
                txtUsuario.requestFocus(); //El cursos aparezca en el control
                
            }    
        }
    }       
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlFondoLogin;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
