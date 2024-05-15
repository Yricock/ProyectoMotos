package Presentacion;
import Controlador.CCProductos;
import Controlador.CCProductos;
import Modelo.CMProductos;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 * @author Alumno
 */
public class ifrmProductos extends javax.swing.JInternalFrame {
    
    CCProductos ccp=new CCProductos();
    CMProductos cmc=new CMProductos();
    DefaultTableModel mod = new DefaultTableModel();
    int idcateg;
    
    public ifrmProductos() {
        idcateg = 0;
        initComponents();
        //ccp.CargarComboCategorias(cmbCategProd);
        this.ListarTablaCli();
    }
    
    public void ListarTablaCli (){
        List <CMProductos> liscli = ccp.ListarTablaProductos();
        mod = (DefaultTableModel) tblProductos.getModel();
        Object obj [] = new Object [5];
        
         for (int i = 0; i < liscli.size(); i++) {
            obj[0] = liscli.get(i).getIdproducto();
            obj[1] = liscli.get(i).getMarcaproducto();
            obj[2] = liscli.get(i).getModeloproducto();
            obj[3] = liscli.get(i).getColorproducto();
            obj[4] = liscli.get(i).getAñoproducto();
            mod.addRow(obj);
        }
        tblProductos.setModel(mod);
    }
    
    /*public void LimpiarTablaProductos(){
        for (int i = 0; i < mod.getRowCount(); i++){
            mod.removeRow(i);
            i = i-1;
        }
    }
    public void limpiartextos(){
        txtNombre.setText("");
        spnCosto.setName("");
        spnStock.setName("");
    }
    
    public void AgregarProducto(){
        int estado = 0;
        String nomcli = txtNombre.getText();
        double coscli = Double.parseDouble(spnCosto.getValue().toString());
        int stocli=Integer.parseInt(spnStock.getValue().toString());
        int idcli = idcateg;
        
        if(nomcli.equals("")){
            JOptionPane.showMessageDialog(null, "Debe de llenar los datos correctamente");
        }
        else{
            Object ArrObj [] = new Object [4];
            ArrObj [0] = nomcli;
            ArrObj [1] = coscli;
            ArrObj [2] = stocli;
            ArrObj [3] = idcli;
            
            estado = ccp.InsertarProducto(ArrObj);
            
            if (estado == 0) {
                
                 JOptionPane.showMessageDialog(null, "No se pudo insertar los datos");                                                    
            } 
            else {
                JOptionPane.showMessageDialog(null, "Los datos se inserto correctamente");
            }
        }     
    }
    
    
    
    
    
    
    public void Modificarproducto() {
    int estado = 0;
    String nomcli;
    double coscli;
    int stocli;
   // Asegúrate de que esta variable esté definida y asignada correctamente
    Object obj[] = new Object[4];
    nomcli = txtNombre.getText();
    coscli = ((SpinnerNumberModel)spnCosto.getModel()).getNumber().doubleValue(); // Obtiene el valor del spinner de costo
    stocli = ((SpinnerNumberModel)spnStock.getModel()).getNumber().intValue(); // Obtiene el valor del spinner de stock

    if (nomcli.equals("")) {
        JOptionPane.showMessageDialog(null, "Llene los datos correctamente");
    } else {
        if (idcateg != 0) { // hemos escogido un producto
            obj[0] = nomcli;
            obj[1] = coscli;
            obj[2] = stocli;
            obj[3] = idcateg;
            estado = ccp.ActualizarProducto(obj);

            if (estado != 0) {
                JOptionPane.showMessageDialog(null, "Producto modificado");
            } else {
                JOptionPane.showMessageDialog(null, "No se actualizaron los datos del Producto");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la Tabla Productos");
        }
    }
}

    
    public void EliminarProducto()
    {
         int Eliminar = -1;
        int fila=tblProducto.getSelectedRow();
        
        if (fila == -1) //No se a seleccionado nada
        {
            JOptionPane.showMessageDialog(this, "Debe de seleccionar una fila de la tabla Productos");
        }
        else //Si se a seleccionado una fila
        {
            Eliminar=JOptionPane.showConfirmDialog(this, "¿Estas seguro de Borrar el Producto?");
            if (Eliminar == 0)//confirma borrado
            {
                ccp.BorrarProducto(idcateg);
                JOptionPane.showMessageDialog(this, "Producto borrado correctamente");
                this.LimpiarTablaProductos();
                this.limpiartextos();
                this.ListarTablaCli();
            }
        }
    }
    
    public void IdCategoria(){
        String nomcate=cmbCategProd.getSelectedItem().toString();
        idcateg=ccp.idCategoria(nomcate);
        //JOptionPane.showMessageDialog(this, idcateg);
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        btnAgregarPro = new javax.swing.JButton();
        btnModificarPro = new javax.swing.JButton();
        btnNuevoProd = new javax.swing.JButton();
        btnEliminarProd = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtAño = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();

        setClosable(true);
        setTitle("Modulo Producto");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("MARCA DEL PRODUCTO");

        jLabel2.setText("MODELO DEL PRODUCTO");

        jLabel3.setText("COLOR DEL PRODUCTO");

        jLabel4.setText("AÑO DEL PRODUCTO");

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        btnAgregarPro.setText("AGREGAR");
        btnAgregarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProActionPerformed(evt);
            }
        });

        btnModificarPro.setText("MODIFICAR");
        btnModificarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProActionPerformed(evt);
            }
        });

        btnNuevoProd.setText("NUEVO");
        btnNuevoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProdActionPerformed(evt);
            }
        });

        btnEliminarProd.setText("ELIMINAR");
        btnEliminarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProdActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");

        txtAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoActionPerformed(evt);
            }
        });

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtAño)
                    .addComponent(txtColor)
                    .addComponent(txtModelo))
                .addGap(306, 306, 306)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAgregarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarPro)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(btnModificarPro)
                .addGap(18, 18, 18)
                .addComponent(btnNuevoProd)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarProd)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        tblProductos.setForeground(new java.awt.Color(153, 0, 153));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MARCA ", "MODELO", "COLOR", "AÑO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setResizable(false);
            tblProductos.getColumnModel().getColumn(1).setResizable(false);
            tblProductos.getColumnModel().getColumn(2).setResizable(false);
            tblProductos.getColumnModel().getColumn(3).setResizable(false);
            tblProductos.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProActionPerformed
        /*AgregarProducto();
        this.LimpiarTablaProductos();
        this.limpiartextos();
        this.ListarTablaCli();*/
    }//GEN-LAST:event_btnAgregarProActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
                
        /*String nompro, catepro;
        double costopro = 0.1; 
        int stockpro = 1; 
        int filatabla = tblProducto.getSelectedRow();
        
        if (filatabla == -1) {//no se a seleccionado nada
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila dela tabla");
        } 
        
        else {
            btnAgregarPro.setEnabled(false);
            
            idcateg = Integer.parseInt(tblProducto.getValueAt(filatabla, 0).toString());
            nompro = tblProducto.getValueAt(filatabla, 1).toString();
            costopro = Double.parseDouble(tblProducto.getValueAt(filatabla, 2).toString());
            stockpro = Integer.parseInt(tblProducto.getValueAt(filatabla, 3).toString());
            catepro = tblProducto.getValueAt(filatabla, 4).toString();
                                  
            txtNombre.setText(nompro);
            spnCosto.setValue(costopro);
            spnStock.setValue(stockpro);
            cmbCategProd.setSelectedItem(catepro);
        }*/
    }//GEN-LAST:event_tblProductosMouseClicked

    private void btnNuevoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProdActionPerformed
   /* btnAgregarPro.setEnabled(true);
    this.limpiartextos();
    txtNombre.requestFocus();
    idcateg = 0;*/
    }//GEN-LAST:event_btnNuevoProdActionPerformed

    private void btnModificarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProActionPerformed
        // TODO add your handling code here:
        /*this.Modificarproducto();
        this.LimpiarTablaProductos();
        this.ListarTablaCli();*/
    }//GEN-LAST:event_btnModificarProActionPerformed

    private void btnEliminarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProdActionPerformed
        // TODO add your handling code here:
        //this.EliminarProducto();
    }//GEN-LAST:event_btnEliminarProdActionPerformed

    private void txtAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPro;
    private javax.swing.JButton btnEliminarProd;
    private javax.swing.JButton btnModificarPro;
    private javax.swing.JButton btnNuevoProd;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
