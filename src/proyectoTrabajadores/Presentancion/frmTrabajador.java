/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoTrabajadores.Presentancion;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoTrabajadores.Datos.Trabajador;

import static proyectoTrabajadores.Presentancion.Globales.*;

/**
 *
 * @author Antonio AB
 */
public class frmTrabajador extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    boolean reg;
    int pmod;
    public String nombreColumnas[] = {"Codigo", "Nombre", "Valor Hora", "Horas Trabajadas", "Sueldo"};

    public frmTrabajador() {
        initComponents();
        inhabilitar();
        controles(true);
      
    }

    public void habilitar() {
        txtCodigo.setEnabled(true);
        txtNombre.setEnabled(true);
        txthorasTrabajadas.setEnabled(true);
        txtValor_Hora.setEnabled(true);
        txtSueldo.setEnabled(true);
    }

    public void inhabilitar() {
        txtCodigo.setEnabled(false);
        txtNombre.setEnabled(false);
        txthorasTrabajadas.setEnabled(false);
        txtValor_Hora.setEnabled(false);
        txtSueldo.setEnabled(false);

    }

    public void controles(boolean cn) {
        btnNuevo.setEnabled(cn);
        btnAgregar.setEnabled(!cn);
        btnCancelar.setEnabled(!cn);
        btnMostrar.setEnabled(cn);
    }

    public void limpiar() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txthorasTrabajadas.setText("");
        txtValor_Hora.setText("");
        txtSueldo.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jPanel1 = new javax.swing.JPanel();
        labelMetroICM1 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM2 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM3 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM4 = new com.icm.components.metro.LabelMetroICM();
        txtCodigo = new com.icm.components.metro.TextFieldMetroICM();
        txtNombre = new com.icm.components.metro.TextFieldMetroICM();
        txtValor_Hora = new com.icm.components.metro.TextFieldMetroICM();
        txthorasTrabajadas = new com.icm.components.metro.TextFieldMetroICM();
        txtSueldo = new app.bolivia.swing.JCTextField();
        labelMetroICM5 = new com.icm.components.metro.LabelMetroICM();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        btnSalir = new org.edisoncor.gui.button.ButtonIpod();
        btnNuevo = new org.edisoncor.gui.button.ButtonIpod();
        btnAgregar = new org.edisoncor.gui.button.ButtonIpod();
        btnLimpiar = new org.edisoncor.gui.button.ButtonIpod();
        btnMostrar = new org.edisoncor.gui.button.ButtonIpod();
        btnCancelar = new org.edisoncor.gui.button.ButtonIpod();
        btnBuscar = new org.edisoncor.gui.button.ButtonIpod();
        jPanel2 = new javax.swing.JPanel();
        checkSueldo = new com.icm.components.metro.CheckBoxMetroICM();
        chechNombre = new com.icm.components.metro.CheckBoxMetroICM();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new com.icm.components.metro.TableMetroICM();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setColorPrimario(new java.awt.Color(102, 102, 102));
        panel1.setColorSecundario(new java.awt.Color(255, 204, 102));
        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoAlumnos/File/fondoL.png"))); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registro De Trabajadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 255, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 51, 153));

        labelMetroICM1.setForeground(new java.awt.Color(0, 255, 0));
        labelMetroICM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_CodePen_30px.png"))); // NOI18N
        labelMetroICM1.setText("Codigo:");
        labelMetroICM1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        labelMetroICM2.setForeground(new java.awt.Color(0, 255, 0));
        labelMetroICM2.setText("Nombre:");
        labelMetroICM2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        labelMetroICM3.setForeground(new java.awt.Color(0, 255, 0));
        labelMetroICM3.setText("Valor Hora:");
        labelMetroICM3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        labelMetroICM4.setForeground(new java.awt.Color(0, 255, 0));
        labelMetroICM4.setText("Horas Travabajas");
        labelMetroICM4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        txtCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtValor_Hora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txthorasTrabajadas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelMetroICM5.setForeground(new java.awt.Color(0, 255, 0));
        labelMetroICM5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_Calculator_30px.png"))); // NOI18N
        labelMetroICM5.setText("Sueldo:");
        labelMetroICM5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelMetroICM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtValor_Hora, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(txthorasTrabajadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthorasTrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetroICM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 900, 190));

        panelImage1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoAlumnos/File/loginImagen.jpg"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_Esc_30px.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelImage1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 70, 60));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_Checked_Checkbox_30px.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        panelImage1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 60));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_Add_User_Group_Man_Man_30px_2.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelImage1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 70, 60));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_Empty_Trash_30px_2.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panelImage1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 70, 60));

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_CBS_30px.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        panelImage1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 70, 60));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_Remove_Image_30px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelImage1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 70, 60));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoAlumnos/File/icons8_Detective_30px.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelImage1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 70, 60));

        panel1.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 670, 90));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkSueldo.setForeground(new java.awt.Color(0, 255, 0));
        checkSueldo.setText("Ordenar Por Sueldo ");
        checkSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSueldoActionPerformed(evt);
            }
        });
        jPanel2.add(checkSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        chechNombre.setForeground(new java.awt.Color(0, 255, 0));
        chechNombre.setText("Ordenar Por Nombre ");
        chechNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chechNombreActionPerformed(evt);
            }
        });
        jPanel2.add(chechNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 340, 40));

        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMostrar);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 680, 160));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1010, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        reg = true;
        habilitar();
        controles(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String codigo, nombre;;
        Double valor_hora;
        int horas_trabajadas;
        double sueldo;
        if (txtCodigo.getText().compareTo("") != 0 && txtNombre.getText().compareTo("") != 0 && txthorasTrabajadas.getText().compareTo("") != 0 && txthorasTrabajadas.getText().compareTo("") != 0) {
            codigo = txtCodigo.getText();
            nombre = txtNombre.getText();
            valor_hora = Double.parseDouble(txtValor_Hora.getText());
            horas_trabajadas = Integer.parseInt(txthorasTrabajadas.getText());
            Trabajador c = new Trabajador(codigo, nombre, valor_hora, horas_trabajadas);
            txtSueldo.setText(String.valueOf(c.calcularsueldo()));
            if (reg) {
                LP.agregar(c);
                JOptionPane.showMessageDialog(panelImage1, "Datos Registrados");
            }
            limpiar();
            inhabilitar();
            controles(true);
        } else {
            JOptionPane.showMessageDialog(panelImage1, "Faltan datos");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        inhabilitar();
        controles(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        modelo.setDataVector(LP.devolverDatos(), nombreColumnas);
        tblMostrar.setModel(modelo);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigo;
        int p;

        limpiar();
        codigo = JOptionPane.showInputDialog("Ingrese codigo Trabajador a buscar");
        Trabajador x = new Trabajador(codigo, "", 0.0, 0);
        p = LP.buscar(x);
        if (p != -1) {
            x = LP.getElemento(p);
            txtCodigo.setText(x.getCodigo());
            txtNombre.setText(x.getNombre());
            txtValor_Hora.setText(String.valueOf(x.getValor_hora()));
            txthorasTrabajadas.setText(String.valueOf(x.getHoras_trabajadas()));
            txtSueldo.setText(String.valueOf(x.getSueldo()));
        }else{
            JOptionPane.showMessageDialog(null, "Codigo no encontrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void chechNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chechNombreActionPerformed
       LP.ordenar(new CompararNombre());
       modelo.setDataVector(LP.devolverDatos(), nombreColumnas);
       
    }//GEN-LAST:event_chechNombreActionPerformed

    private void checkSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSueldoActionPerformed
     LP.ordenar(new CompararSueldo());
     modelo.setDataVector(LP.devolverDatos(), nombreColumnas);
    }//GEN-LAST:event_checkSueldoActionPerformed

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
            java.util.logging.Logger.getLogger(frmTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod btnAgregar;
    private org.edisoncor.gui.button.ButtonIpod btnBuscar;
    private org.edisoncor.gui.button.ButtonIpod btnCancelar;
    private org.edisoncor.gui.button.ButtonIpod btnLimpiar;
    private org.edisoncor.gui.button.ButtonIpod btnMostrar;
    private org.edisoncor.gui.button.ButtonIpod btnNuevo;
    private org.edisoncor.gui.button.ButtonIpod btnSalir;
    private com.icm.components.metro.CheckBoxMetroICM chechNombre;
    private com.icm.components.metro.CheckBoxMetroICM checkSueldo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM2;
    private com.icm.components.metro.LabelMetroICM labelMetroICM3;
    private com.icm.components.metro.LabelMetroICM labelMetroICM4;
    private com.icm.components.metro.LabelMetroICM labelMetroICM5;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private com.icm.components.metro.TableMetroICM tblMostrar;
    private com.icm.components.metro.TextFieldMetroICM txtCodigo;
    private com.icm.components.metro.TextFieldMetroICM txtNombre;
    private app.bolivia.swing.JCTextField txtSueldo;
    private com.icm.components.metro.TextFieldMetroICM txtValor_Hora;
    private com.icm.components.metro.TextFieldMetroICM txthorasTrabajadas;
    // End of variables declaration//GEN-END:variables
}
