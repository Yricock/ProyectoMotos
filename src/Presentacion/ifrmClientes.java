package Presentacion;

import Controlador.CCCliente;
import Modelo.CMClientes;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class ifrmClientes extends javax.swing.JInternalFrame {

    CCCliente cci = new CCCliente();
    CMClientes cmc = new CMClientes();
    DefaultTableModel mod = new DefaultTableModel();
    int idcliente;
    
    public ifrmClientes() {
        idcliente=0;
        initComponents();
        this.ListarTablaCli();
       
    }
    
    private void ListarTablaCli() {
    List<CMClientes> liscli = cci.ListarTabla();
    mod = (DefaultTableModel) tblClientes.getModel();
    Object obj[] = new Object[6];

    try {
        for (int i = 0; i < liscli.size(); i++) {
            obj[0] = liscli.get(i).getIdcliente();
            obj[1] = liscli.get(i).getDnicliente();
            obj[2] = liscli.get(i).getNomcliente();
            obj[3] = liscli.get(i).getApecliente();
            obj[4] = liscli.get(i).getDircliente();            
            mod.addRow(obj);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al listar clientes: " + e.getMessage());
    }
}
    public void AgregarCliente(){
        int estado = 0;
        String dnicli = txtDniCliente.getText();
        String nomcli = txtNomCliente.getText();
        String apecli = txtApeCliente.getText();
        String dircli = txtDirCliente.getText();      
        
        if(dnicli.equals("") && nomcli.equals("")){
            JOptionPane.showMessageDialog(null, "Debe de llenar los datos correctamente");
        }
        else{
            Object ArrObj [] = new Object [4];
            ArrObj [0] = dnicli;
            ArrObj [1] = nomcli;
            ArrObj [2] = apecli;
            ArrObj [3] = dircli;           
            
            
            estado = cci.InsertarCliente(ArrObj);
            
            if (estado == 0) {
                
                 JOptionPane.showMessageDialog(null, "No se pudo insertar los datos");                                                    
            } 
            else {
                JOptionPane.showMessageDialog(null, "Los datos se inserto correctamente");
            }
        }     
    }
    

    
    public void LimpiarTabla(){
        for (int i = 0; i < mod.getRowCount(); i++){
            mod.removeRow(i);
            i = i-1;
        }
    }
    public void limpiartextos(){
    txtDniCliente.setText("");
    txtNomCliente.setText("");
    txtApeCliente.setText("");
    txtDirCliente.setText("");
    }
    
    public void ModificarCliente()
    {
        int estado=0;
        String dnicli,nomcli,apecli,dircli;
        Object obj[]=new Object[5];
        dnicli=txtDniCliente.getText();
        nomcli=txtNomCliente.getText();
        apecli=txtApeCliente.getText();
        dircli=txtDirCliente.getText();
        
        if (dnicli.equals("")&& nomcli.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Llene los datos correctamente");
        }
        else
        {
            if(idcliente!=0)//hemos escojido un cliente
            {
                obj[0]=dnicli;
                obj[1]=nomcli;
                obj[2]=apecli;
                obj[3]=dircli;
                obj[4]=idcliente;
                estado=cci.ActualizarCliente(obj);

                if(estado!=0)
                {
                    JOptionPane.showMessageDialog(null, "Cliente modificado");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se actualizaron los datos del Cliente");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la Tabla Clientes");
            }
        }   
    }
    
    public void EliminarCliente()
    {
        int Eliminar=-1;
        int fila=tblClientes.getSelectedRow();
        
        if (fila==-1) //No se a seleccionado nada
        {
            JOptionPane.showMessageDialog(this, "Debe de seleccionar una fila de la tabla Clientes");
        }
        else //Si se a seleccionado una fila
        {
            Eliminar=JOptionPane.showConfirmDialog(this, "¿Estas seguro de Borrar al cliente?");
            if (Eliminar==0)//confirma borrado
            {
                cci.BorrarCliente(idcliente);
                JOptionPane.showMessageDialog(this, "Cliente borrado correctamente");
                this.LimpiarTabla();
                this.limpiartextos();
                this.ListarTablaCli();
            }
        }
    }
    
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDniCliente = new javax.swing.JTextField();
        txtNomCliente = new javax.swing.JTextField();
        txtDirCliente = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtApeCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Modulo Clientes");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("DIRECCION");

        txtDniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniClienteActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("DNI");

        jLabel6.setText("NOMBRES");

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");

        jLabel7.setText("APELLIDOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel7))))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                        .addComponent(txtNomCliente))
                    .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnSalir)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRES", "APELLIDOS", "DIRECCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setResizable(false);
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblClientes.getColumnModel().getColumn(1).setResizable(false);
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblClientes.getColumnModel().getColumn(2).setResizable(false);
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblClientes.getColumnModel().getColumn(3).setResizable(false);
            tblClientes.getColumnModel().getColumn(4).setResizable(false);
            tblClientes.getColumnModel().getColumn(4).setPreferredWidth(60);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniClienteActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ModificarCliente();
        this.LimpiarTabla();
        this.ListarTablaCli();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        AgregarCliente();
        this.LimpiarTabla();
        this.limpiartextos();
        this.ListarTablaCli();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        String dnicli, nomcli, apecli, dircli;
        int filatabla=tblClientes.getSelectedRow();
        if (filatabla==-1)//No se a seleccionado nada 
        {
            JOptionPane.showMessageDialog(this, "Debe seccionar una fila de la tabla");
        }
        else 
        {
            btnAgregar.setEnabled(false);
            idcliente=Integer.parseInt(tblClientes.getValueAt(filatabla, 0).toString());
            dnicli=tblClientes.getValueAt(filatabla, 1).toString();
            nomcli=tblClientes.getValueAt(filatabla, 2).toString();
            apecli=tblClientes.getValueAt(filatabla, 3).toString();
            dircli=tblClientes.getValueAt(filatabla, 4).toString();
            
            txtDniCliente.setText(dnicli);
            txtNomCliente.setText(nomcli);
            txtApeCliente.setText(apecli);
            txtDirCliente.setText(dircli);
            
        }
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
    btnNuevo.setEnabled(true);
    this.limpiartextos();
    txtDniCliente.requestFocus();
    idcliente = 0;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.EliminarCliente();
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtApeCliente;
    private javax.swing.JTextField txtDirCliente;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtNomCliente;
    // End of variables declaration//GEN-END:variables
}
