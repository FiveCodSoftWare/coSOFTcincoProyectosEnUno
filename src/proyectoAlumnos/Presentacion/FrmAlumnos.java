/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoAlumnos.Presentacion;

import javax.swing.JOptionPane;
import proyectoAlumnos.Datos.Alumnos;
import static proyectoAlumnos.Presentacion.Globales.*;

/**
 *
 * @author Antonio AB
 */
public class FrmAlumnos extends javax.swing.JInternalFrame {

    boolean reg;
    int pmod;

    public FrmAlumnos() {
        initComponents();
        inahilitar();
        controles(true);
       
    }

    public void inahilitar() {
        txtCodigo.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtNombre.setEnabled(false);
        cboCarrera.setEnabled(false);
        cboCiclo.setEnabled(false);
        txtPromedio.setEnabled(false);
        cboEsatdo.setEnabled(false);
         cboEsatdo.setVisible(false);
         lblEsatdo.setVisible(false);
    }

    public void habilitar() {
        txtCodigo.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtNombre.setEnabled(true);
        cboCarrera.setEnabled(true);
        cboCiclo.setEnabled(true);
        txtPromedio.setEnabled(true);
        cboEsatdo.setEnabled(true);
        cboEsatdo.setVisible(true);
          lblEsatdo.setVisible(true);
    }

    public void limpiar() {
        txtCodigo.setText("");
        txtApellidos.setText("");
        txtNombre.setText("");
        cboCarrera.setSelectedIndex(0);
        cboCiclo.setSelectedIndex(0);
        txtPromedio.setText("");
        cboEsatdo.setSelectedIndex(0);
    }

    public void controles(boolean con) {
        btnNuevo.setEnabled(con);
        btnAgregar.setEnabled(!con);
        btnCancelar.setEnabled(!con);
        btnEliminar.setEnabled(con);
        btnMostrar.setEnabled(con);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        cboEsatdo = new com.icm.components.metro.ComboboxMetroICM();
        lblEsatdo = new com.icm.components.metro.LabelMetroICM();
        txtPromedio = new org.edisoncor.gui.textField.TextFieldRectBackground();
        labelMetroICM6 = new com.icm.components.metro.LabelMetroICM();
        cboCiclo = new com.icm.components.metro.ComboboxMetroICM();
        labelMetroICM2 = new com.icm.components.metro.LabelMetroICM();
        cboCarrera = new com.icm.components.metro.ComboboxMetroICM();
        labelMetroICM5 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM4 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM3 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM1 = new com.icm.components.metro.LabelMetroICM();
        txtCodigo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        btnNuevo = new org.edisoncor.gui.button.ButtonIpod();
        btnEliminar = new org.edisoncor.gui.button.ButtonIpod();
        btnAgregar = new org.edisoncor.gui.button.ButtonIpod();
        btnLimpiar = new org.edisoncor.gui.button.ButtonIpod();
        btnMostrar = new org.edisoncor.gui.button.ButtonIpod();
        btnCancelar = new org.edisoncor.gui.button.ButtonIpod();
        btnSalir = new org.edisoncor.gui.button.ButtonIpod();

        jMenu1.setText("jMenu1");

        setBackground(new java.awt.Color(0, 153, 153));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cboEsatdo.setBackground(new java.awt.Color(0, 255, 0));
        cboEsatdo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboEsatdo.setForeground(new java.awt.Color(0, 0, 0));
        cboEsatdo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Aprovado", "Desaprovado" }));

        lblEsatdo.setText("Estado:");
        lblEsatdo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N

        txtPromedio.setDescripcion("Ingrese Promedio");

        labelMetroICM6.setText("Promedio:");
        labelMetroICM6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N

        cboCiclo.setBackground(new java.awt.Color(0, 255, 0));
        cboCiclo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboCiclo.setForeground(new java.awt.Color(0, 0, 0));
        cboCiclo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        labelMetroICM2.setText("Ciclo:");
        labelMetroICM2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N

        cboCarrera.setBackground(new java.awt.Color(0, 255, 0));
        cboCarrera.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboCarrera.setForeground(new java.awt.Color(0, 0, 0));
        cboCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Ingenieria Civil", "Geologia\t", "Medicina\t", "Ingenieria Civil Industrial", "Ingenieria en Electricidad\t", "Derecho\t", "Odontologia\t", "Ingenieria Sistemas", "Quimica y Farmacia\t", "Enfermería" }));

        labelMetroICM5.setText("Carrera:");
        labelMetroICM5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N

        labelMetroICM4.setText("Nombre:");
        labelMetroICM4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N

        labelMetroICM3.setText("Apellidos:");
        labelMetroICM3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N

        labelMetroICM1.setText("Codigo:");
        labelMetroICM1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N

        txtCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCodigo.setDescripcion("Ingrese Codigo");
        txtCodigo.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCodigo.setMinimumSize(new java.awt.Dimension(5, 20));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoAlumnos/File/icons8_Add_User_Male_30px.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoAlumnos/File/icons8_Remove_User_Female_30px.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoAlumnos/File/icons8_Businessman_30px_4.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoAlumnos/File/icons8_Vacuum_Cleaner_30px_1.png"))); // NOI18N
        btnLimpiar.setText("Limpiar ");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoAlumnos/File/icons8_Ticket_Purchase_30px.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoAlumnos/File/icons8_Delete_Ticket_30px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoAlumnos/File/icons8_Exit_Sign_30px_1.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMetroICM4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetroICM1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetroICM5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetroICM6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetroICM3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEsatdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboEsatdo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtApellidos, txtCodigo, txtNombre});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetroICM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetroICM6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEsatdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboEsatdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtApellidos, txtCodigo, txtNombre, txtPromedio});

        txtCodigo.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        reg = true;
        habilitar();
        controles(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String codigo, apellidos, nombre, carrera, ciclo, estado;;
        double promedio;
      
        if (txtCodigo.getText().compareTo("") != 0 && txtApellidos.getText().compareTo("") != 0 && txtNombre.getText().compareTo("") != 0 && cboCarrera.getSelectedIndex() > 0 && cboCiclo.getSelectedIndex() > 0 && txtPromedio.getText().compareTo("") != 0 && cboEsatdo.getSelectedIndex() > 0) {
            codigo = txtCodigo.getText();
            apellidos = txtApellidos.getText();
            nombre = txtNombre.getText();
            carrera = cboCarrera.getSelectedItem().toString();
            ciclo = cboCiclo.getSelectedItem().toString();
            promedio = Double.parseDouble(txtPromedio.getText());
            estado=cboEsatdo.getSelectedItem().toString();
            Alumnos c = new Alumnos(codigo, apellidos, nombre, carrera, ciclo, promedio,estado);
            if (reg) {
                LP.agregar(c);
                JOptionPane.showMessageDialog(rootPane, "Datos registrado");
            }
            limpiar();
            inahilitar();
            controles(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Faltan datos");
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

        frmReporteAlumno a = new frmReporteAlumno();
        a.setVisible(true);

     
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        inahilitar();
        controles(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo;
        int p;
        limpiar();
        codigo = JOptionPane.showInputDialog("Ingrese codigo a Eliminar");
        Alumnos s = new Alumnos(codigo, "", "", "", "", 0.0,"");
        p = LP.buscar(s);
        if (p != -1) {
            s = LP.getElementos(p);
            txtCodigo.setText(s.getCodigo());
            txtApellidos.setText(s.getApellidos());
            txtNombre.setText(s.getNombre());
            cboCarrera.setSelectedItem(s.getCarrera());
            cboCiclo.setSelectedItem(s.getCiclo());
            txtPromedio.setText(String.valueOf(s.getPromedio()));
            cboEsatdo.setSelectedItem(s.getEstado());
            int rep = JOptionPane.showConfirmDialog(this, "Deseas Elimnar", "Eliminar Dato", JOptionPane.YES_NO_CANCEL_OPTION);
            if (rep == JOptionPane.YES_OPTION) {
                LP.Eliminar(p);
                JOptionPane.showMessageDialog(this, "Registro Eliminado");

            }
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "El codigo No existe");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod btnAgregar;
    private org.edisoncor.gui.button.ButtonIpod btnCancelar;
    private org.edisoncor.gui.button.ButtonIpod btnEliminar;
    private org.edisoncor.gui.button.ButtonIpod btnLimpiar;
    private org.edisoncor.gui.button.ButtonIpod btnMostrar;
    private org.edisoncor.gui.button.ButtonIpod btnNuevo;
    private org.edisoncor.gui.button.ButtonIpod btnSalir;
    private com.icm.components.metro.ComboboxMetroICM cboCarrera;
    private com.icm.components.metro.ComboboxMetroICM cboCiclo;
    private com.icm.components.metro.ComboboxMetroICM cboEsatdo;
    private javax.swing.JMenu jMenu1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM2;
    private com.icm.components.metro.LabelMetroICM labelMetroICM3;
    private com.icm.components.metro.LabelMetroICM labelMetroICM4;
    private com.icm.components.metro.LabelMetroICM labelMetroICM5;
    private com.icm.components.metro.LabelMetroICM labelMetroICM6;
    private com.icm.components.metro.LabelMetroICM lblEsatdo;
    private javax.swing.JTextField txtApellidos;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtCodigo;
    private javax.swing.JTextField txtNombre;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtPromedio;
    // End of variables declaration//GEN-END:variables
}
