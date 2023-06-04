/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Productos;
import Datos.Productos;
import static Presentacion.Globales.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import javax.swing.table.DefaultTableModel;

public class frmProductos extends javax.swing.JInternalFrame {
    
    String nombreColumnas[] = {"Codigo", "Descripcion", "Precio", "Stock", "Categoria"};
    
    DefaultTableModel modelo;
    boolean reg;
    int pmod;
    
    public frmProductos() {
        initComponents();
    
        inhabilitar();
        controles(true);
        
    }
    
    public void habilitar() {
        txtCodigo.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtStock.setEnabled(true);
        cboCategoria.setEnabled(true);
    }
    
    public void inhabilitar() {
        txtCodigo.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtStock.setEnabled(false);
        cboCategoria.setEnabled(false);
    }
    
    public void limpiar() {
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        cboCategoria.setSelectedIndex(0);
    }
    
    public void controles(boolean con) {
        btnNuevo.setEnabled(con);
        btnAgregar.setEnabled(!con);
        btnCancelar.setEnabled(!con);
        btnLimpiar.setEnabled(!con);
        btnMostrar.setEnabled(con);
        btnEliminar.setEnabled(!con);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel1 = new org.edisoncor.gui.panel.Panel();
        labelProperties1 = new org.jdesktop.swingx.table.LabelProperties();
        txtCodigo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelProperties2 = new org.jdesktop.swingx.table.LabelProperties();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new org.jdesktop.swingx.JXTextArea();
        labelProperties3 = new org.jdesktop.swingx.table.LabelProperties();
        labelProperties4 = new org.jdesktop.swingx.table.LabelProperties();
        txtStock = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        cboCategoria = new com.icm.components.metro.ComboboxMetroICM();
        txtPrecio = new com.icm.components.metro.TextFieldMetroICM();
        panel2 = new org.edisoncor.gui.panel.Panel();
        btnNuevo = new org.edisoncor.gui.button.ButtonIpod();
        btnAgregar = new org.edisoncor.gui.button.ButtonIpod();
        btnLimpiar = new org.edisoncor.gui.button.ButtonIpod();
        btnMostrar = new org.edisoncor.gui.button.ButtonIpod();
        btnCancelar = new org.edisoncor.gui.button.ButtonIpod();
        btnModicar = new org.edisoncor.gui.button.ButtonIpod();
        btnEliminar = new org.edisoncor.gui.button.ButtonIpod();
        btnCancelar1 = new org.edisoncor.gui.button.ButtonIpod();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registro Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        panel1.setForeground(new java.awt.Color(51, 204, 255));
        panel1.setColorPrimario(new java.awt.Color(0, 255, 102));
        panel1.setColorSecundario(new java.awt.Color(204, 255, 51));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelProperties1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/icons8_QR_Code_30px.png"))); // NOI18N
        labelProperties1.setText("Codigo:");
        labelProperties1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel1.add(labelProperties1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCodigo.setDescripcion("Ingrese su codigo");
        panel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 46, 235, 30));

        labelProperties2.setText("Descripcion:");
        labelProperties2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel1.add(labelProperties2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 102, 230, 80));

        labelProperties3.setText("Precio:");
        labelProperties3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel1.add(labelProperties3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        labelProperties4.setText("Stock:");
        labelProperties4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel1.add(labelProperties4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        panel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 276, 235, 30));

        jXLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/icons8_Shopping_Cart_Loaded_20px_1.png"))); // NOI18N
        jXLabel1.setText("Categoria:");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel1.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 351, 99, -1));

        cboCategoria.setBackground(new java.awt.Color(204, 204, 204));
        cboCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboCategoria.setForeground(new java.awt.Color(0, 0, 0));
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione....", "Cervezas ", "Chocolates", "Conservas", "Congelados", "Zumos", "Pan", "Aceites", "Batidos", "Frutas", " ", " ", " " }));
        panel1.add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        txtPrecio.setForeground(new java.awt.Color(0, 153, 204));
        txtPrecio.setCaretColor(new java.awt.Color(204, 204, 204));
        txtPrecio.setDisabledTextColor(new java.awt.Color(0, 51, 153));
        panel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 230, -1));

        panel2.setBackground(new java.awt.Color(153, 153, 153));
        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Opciones"));
        panel2.setForeground(new java.awt.Color(153, 153, 153));
        panel2.setColorPrimario(new java.awt.Color(51, 102, 255));
        panel2.setColorSecundario(new java.awt.Color(51, 255, 153));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/icons8_Add_Property_30px.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        panel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 70));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/icons8_Add_Shopping_Cart_30px.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 70));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/icons8_CCleaner_30px.png"))); // NOI18N
        btnLimpiar.setText("Limpiar ");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 70));

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/icons8_Show_Property_30px.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        panel2.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 70));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/icons8_Unavailable_30px_1.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, 70));

        btnModicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/icons8_Sort_By_Modified_Date_30px.png"))); // NOI18N
        btnModicar.setText("Midificar");
        btnModicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModicarActionPerformed(evt);
            }
        });
        panel2.add(btnModicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 70));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/icons8_Trash_30px.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 70));

        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/icons8_Close_Window_30px.png"))); // NOI18N
        btnCancelar1.setText("Salir");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        panel2.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        reg = true;
        habilitar();
        controles(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String codigo, descripción, categoria;
        Double precio;
        int stock;
        if (txtCodigo.getText().compareTo("") != 0 && txtDescripcion.getText().compareTo("") != 0 && txtPrecio.getText().compareTo("") != 0 && txtStock.getText().compareTo("") != 0 && cboCategoria.getSelectedIndex() > 0) {
            codigo = txtCodigo.getText();
            descripción = txtDescripcion.getText();
            precio = Double.parseDouble(txtPrecio.getText());
            stock = Integer.parseInt(txtStock.getText());
            categoria = cboCategoria.getSelectedItem().toString();
            Productos pro = new Productos(codigo, descripción, precio, stock, categoria);
            
            if (reg) {
                LP.agregar(pro);
                JOptionPane.showMessageDialog(null, "Dato registrado");
            } else {
                LP.reemplaza(pmod, pro);
                JOptionPane.showMessageDialog(null, "Dato modificado");
            }
            limpiar();
            inhabilitar();
            controles(true);
        } else {
            JOptionPane.showMessageDialog(null, "Faltan datos");
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        frmReporte s = new frmReporte();
        s.setVisible(true);
      
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnModicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModicarActionPerformed
        String codigo;
        limpiar();
        codigo = JOptionPane.showInputDialog("Codigo del Producto");
        Productos c = new Productos(codigo, "", 0.0, 0, "");
        pmod = LP.buscar(c);
        if (pmod != -1) {
            c = LP.getElemento(pmod);
            txtCodigo.setText(c.getCodigo());
            txtDescripcion.setText(c.getDescripción());
            txtPrecio.setText(String.valueOf(c.getPrecio()));
            txtStock.setText(String.valueOf(c.getStock()));
            cboCategoria.setSelectedItem(c.getCategoria());
            reg = true;
            habilitar();
            controles(false);
        } else {
            JOptionPane.showInputDialog(null, "El codigo no ha sido encontrado");
        }
        

    }//GEN-LAST:event_btnModicarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        inhabilitar();
        controles(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo2;
        int p;
        limpiar();
        codigo2 = JOptionPane.showInputDialog("Ingrese Codigo  a eliminar : ");
        Productos x = new Productos(codigo2, "", 0.0, 0, "");
        p = LP.buscar(x);
        if (p != -1) {
            x = LP.getElemento(p);
            txtCodigo.setText(x.getCodigo());
            txtDescripcion.setText(x.getDescripción());
            txtPrecio.setText(String.valueOf(x.getPrecio()));
            txtStock.setText(String.valueOf(x.getStock()));
            cboCategoria.setSelectedItem(x.getCategoria());
            int resp = JOptionPane.showConfirmDialog(this, "Deseas Eliminarlo ", "Eliminar Dato", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                LP.Eliminar(p);
                JOptionPane.showMessageDialog(this, "Registro eliminado");
            }
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "El Codigo no existe");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelar1ActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
           UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
                   
                
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod btnAgregar;
    private org.edisoncor.gui.button.ButtonIpod btnCancelar;
    private org.edisoncor.gui.button.ButtonIpod btnCancelar1;
    private org.edisoncor.gui.button.ButtonIpod btnEliminar;
    private org.edisoncor.gui.button.ButtonIpod btnLimpiar;
    private org.edisoncor.gui.button.ButtonIpod btnModicar;
    private org.edisoncor.gui.button.ButtonIpod btnMostrar;
    private org.edisoncor.gui.button.ButtonIpod btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.icm.components.metro.ComboboxMetroICM cboCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.table.LabelProperties labelProperties1;
    private org.jdesktop.swingx.table.LabelProperties labelProperties2;
    private org.jdesktop.swingx.table.LabelProperties labelProperties3;
    private org.jdesktop.swingx.table.LabelProperties labelProperties4;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtCodigo;
    private org.jdesktop.swingx.JXTextArea txtDescripcion;
    private com.icm.components.metro.TextFieldMetroICM txtPrecio;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtStock;
    // End of variables declaration//GEN-END:variables
}
