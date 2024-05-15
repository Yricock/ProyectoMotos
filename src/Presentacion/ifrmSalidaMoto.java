
package Presentacion;

import Controlador.CCSalida;
import Modelo.CMSalida;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ifrmSalidaMoto extends javax.swing.JInternalFrame {

    CCSalida ccs = new CCSalida();
    CMSalida cms = new CMSalida();
    DefaultTableModel mod = new DefaultTableModel();
    int idsalida;
    
    public ifrmSalidaMoto() {
        initComponents();
        idsalida = 0;
        this.ListarTablaSal();
    }

    
    private void ListarTablaSal() {
    List<CMSalida> liscli = ccs.ListarTabla();
    mod = (DefaultTableModel)tblSalidaMoto.getModel();
    Object obj[] = new Object[4];

    try {
        for (int i = 0; i < liscli.size(); i++) {
            obj[0] = liscli.get(i).getIdSalida();
            obj[1] = liscli.get(i).getCantInventario();
            obj[2] = liscli.get(i).getFechaInventario();
            obj[3] = liscli.get(i).getDestinoInventario();
            
            mod.addRow(obj);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al listar salida: " + e.getMessage());
    }
}
    public void AgregarSalida(){
        int estado = 0;
        String cantsal = txtCantidad.getText();
        String destsali = txtDestino.getText();
        String fecsal = txtFecha.getText();
              
        
        if(cantsal.equals("") && destsali.equals("")){
            JOptionPane.showMessageDialog(null, "Debe de llenar los datos correctamente");
        }
        else{
            Object Obj [] = new Object [4];
            Obj [0] = cantsal;
            Obj [1] = destsali;
            Obj [2] = fecsal;
                      
            
            
            estado = ccs.InsertarSalida(Obj);
            
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
    txtCantidad.setText("");
    txtDestino.setText("");
    txtFecha.setText("");
    
    }
    
    public void ModificarSalida()
    {
        int estado=0;
        String cantsal,fecsal,dessal;
        Object obj[]=new Object[3];
        cantsal=txtCantidad.getText();
        fecsal=txtDestino.getText();
        dessal=txtFecha.getText();
        
        
        if (cantsal.equals("")&& fecsal.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Llene los datos correctamente");
        }
        else
        {
            if(idsalida!=0)//hemos escojido un cliente
            {
                obj[0]=cantsal;
                obj[1]=fecsal;
                obj[2]=dessal;
                
                estado=ccs.ActualizarSalida(obj);

                if(estado!=0)
                {
                    JOptionPane.showMessageDialog(null, "Salida modificado");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se actualizaron los datos de la salida");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la Tabla Salida");
            }
        }   
    }
    
    public void EliminarSalida()
    {
        int Eliminar=-1;
        int fila=tblSalidaMoto.getSelectedRow();
        
        if (fila==-1) //No se a seleccionado nada
        {
            JOptionPane.showMessageDialog(this, "Debe de seleccionar una fila de la tabla Clientes");
        }
        else //Si se a seleccionado una fila
        {
            Eliminar=JOptionPane.showConfirmDialog(this, "¿Estas seguro de Borrar al cliente?");
            if (Eliminar==0)//confirma borrado
            {
                ccs.BorrarSalida(idsalida);
                JOptionPane.showMessageDialog(this, "Cliente borrado correctamente");
                this.LimpiarTabla();
                this.limpiartextos();
                this.ListarTablaSal();
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalidaMoto = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

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

        jLabel1.setText("CANTIDAD");

        jLabel2.setText("FECHA");

        jLabel3.setText("DESTINO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(txtDestino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalir)
                            .addComponent(btnModificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblSalidaMoto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CANTIDAD", "FECHA", "DESTINO"
            }
        ));
        tblSalidaMoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSalidaMotoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSalidaMoto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnNuevo.setEnabled(true);
        this.limpiartextos();
        txtCantidad.requestFocus();
        idsalida = 0;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.EliminarSalida();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ModificarSalida();
        this.LimpiarTabla();
        this.ListarTablaSal();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        AgregarSalida();
        this.LimpiarTabla();
        this.limpiartextos();
        this.ListarTablaSal();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void tblSalidaMotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSalidaMotoMouseClicked
        String cantsal, fecsal, dessal;
        int filatabla=tblSalidaMoto.getSelectedRow();
        if (filatabla==-1)//No se a seleccionado nada 
        {
            JOptionPane.showMessageDialog(this, "Debe seccionar una fila de la tabla");
        }
        else 
        {
            btnAgregar.setEnabled(false);
            idsalida=Integer.parseInt(tblSalidaMoto.getValueAt(filatabla, 0).toString());
            cantsal=tblSalidaMoto.getValueAt(filatabla, 1).toString();
            fecsal=tblSalidaMoto.getValueAt(filatabla, 2).toString();
            dessal=tblSalidaMoto.getValueAt(filatabla, 3).toString();
            
            
            txtCantidad.setText(cantsal);
            txtFecha.setText(fecsal);
            txtDestino.setText(dessal);
            
            
        }
    }//GEN-LAST:event_tblSalidaMotoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSalidaMoto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
