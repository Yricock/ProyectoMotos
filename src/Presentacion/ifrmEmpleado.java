package Presentacion;

import Controlador.CCEmpleado;
import Modelo.CMEmpleado;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Alumno
 */
public class ifrmEmpleado extends javax.swing.JInternalFrame {
    
    CCEmpleado cce = new CCEmpleado();
    CMEmpleado cme = new CMEmpleado();
    DefaultTableModel mod = new DefaultTableModel();
    //int idcliente;
    
    public ifrmEmpleado()
    {
        //idcliente=0;
        initComponents();
        this.ListarTablaEmple();
    }
    
    public void ListarTablaEmple (){
        List <CMEmpleado> liscli = cce.ListarTablaUsuario();
        mod = (DefaultTableModel) tblUsuarios.getModel();
        Object obj [] = new Object [6];
        
         for (int i = 0; i < liscli.size(); i++) {
             obj[0] = liscli.get(i).getIdEmpleado();
             obj[1] = liscli.get(i).getNomEmpleado();
             obj[2] = liscli.get(i).getCargEmpleado();
             obj[3] = liscli.get(i).getSalariEmpleado();
             obj[4] = liscli.get(i).getFechEmpleado();
             obj[5] = liscli.get(i).getTelfEmpleado();
             obj[6] = liscli.get(i).getEmailEmpleado();
             obj[7] = liscli.get(i).getIdVenta();            
             mod.addRow(obj);
         }
        tblUsuarios.setModel(mod);
    }
    
    /*public void AgregarUsuario(){
        int estado = 0;
        String dnicli = txtDniUsuario.getText();
        String nomcli = txtNombreUsuario.getText();
        String apecli = txtApellidoUsuario.getText();
        String telfcli = txtTelefonoUsuario.getText();
        String dircli = txtDireccionUsuario.getText();
        String usercli = txtUserUsuario.getText();
        String passcli = txtPassUsuario.getText();
        
        if(dnicli.equals("") && nomcli.equals("") && apecli.equals("") && telfcli.equals("") && dircli.equals("") && usercli.equals("") && passcli.equals("")){
            JOptionPane.showMessageDialog(null, "Debe de llenar los datos correctamente");
        }
        else{
            Object ArrObj [] = new Object [6];
            ArrObj [0] = dnicli;
            ArrObj [1] = nomcli;
            ArrObj [2] = apecli;
            ArrObj [3] = telfcli;
            ArrObj [4] = dircli;
            ArrObj [5] = usercli;
            ArrObj [6] = passcli;
            
            estado = cci.InsertarUsuario(ArrObj);
            
            if (estado == 0) {
                
                JOptionPane.showMessageDialog(null, "No se pudo insertar los datos");                                                    
            } 
            else {
                JOptionPane.showMessageDialog(null, "Los datos se inserto correctamente");
            }
        }     
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDniUsuario = new javax.swing.JTextField();
        txtApellidoUsuario = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtTelefonoUsuario = new javax.swing.JTextField();
        txtDireccionUsuario = new javax.swing.JTextField();
        btnAgregarUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnSalirUsuario = new javax.swing.JButton();
        btnNuevoUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Modulo Usuarios");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setText("NOMBRE");

        jLabel3.setText("CARGO");

        jLabel4.setText("SALARIO");

        jLabel5.setText("FECHA DE EMPLEACION");

        txtDniUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtApellidoUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNombreUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtTelefonoUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefonoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoUsuarioActionPerformed(evt);
            }
        });

        txtDireccionUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAgregarUsuario.setText("AGREGAR");
        btnAgregarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setText("MODIFICAR");
        btnModificarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnEliminarUsuario.setText("ELIMINAR");
        btnEliminarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnSalirUsuario.setText("SALIR");
        btnSalirUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnNuevoUsuario.setText("NUEVO");
        btnNuevoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDniUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtDireccionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalirUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(184, 184, 184))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDniUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelefonoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDireccionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnAgregarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificarUsuario)
                        .addGap(14, 14, 14)
                        .addComponent(btnEliminarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNuevoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalirUsuario)))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRE", "APELLIDO", "TELEFONO", "DIRECCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(1).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(2).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(3).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(4).setResizable(false);
            tblUsuarios.getColumnModel().getColumn(5).setResizable(false);
        }

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoUsuarioActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        /*AgregarUsuario();
        //this.LimpiarTabla();
        //this.limpiartextos();
        this.ListarTablaClis();*/
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnSalirUsuario;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApellidoUsuario;
    private javax.swing.JTextField txtDireccionUsuario;
    private javax.swing.JTextField txtDniUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtTelefonoUsuario;
    // End of variables declaration//GEN-END:variables
}
