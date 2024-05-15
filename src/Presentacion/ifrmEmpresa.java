
package Presentacion;
import Controlador.CCEmpresa;
import Modelo.CMEmpresa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ifrmEmpresa extends javax.swing.JInternalFrame {

    CCEmpresa cce = new CCEmpresa();
    CMEmpresa cme = new CMEmpresa();
    DefaultTableModel mod = new DefaultTableModel();
    
    public ifrmEmpresa() {
        initComponents();
         this.ListarTablaEmp();
    }

     public void ListarTablaEmp (){
        List <CMEmpresa> liscli = cce.ListarTablaEmpresa();
        mod = (DefaultTableModel) tblEmpresa.getModel();
        Object obj [] = new Object [6];
        
         for (int i = 0; i < liscli.size(); i++) {
             obj[0] = liscli.get(i).getIdEmpresa();
             obj[1] = liscli.get(i).getNomEmpresa();
             obj[2] = liscli.get(i).getDirEmpresa();
             obj[3] = liscli.get(i).getNumEmpleados();
             obj[4] = liscli.get(i).getIdEmpleado();
             obj[5] = liscli.get(i).getIdProvedor();
             obj[6] = liscli.get(i).getIdEmpresa();                         
             mod.addRow(obj);
         }
        tblEmpresa.setModel(mod);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpresa = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tblEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblEmpresa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpresa;
    // End of variables declaration//GEN-END:variables
}
