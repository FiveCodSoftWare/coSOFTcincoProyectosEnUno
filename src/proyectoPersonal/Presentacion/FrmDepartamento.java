/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoPersonal.Presentacion;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoPersonal.Datos.Departamento;
import static proyectoPersonal.Presentacion.Globales.*;

/**
 *
 * @author Antonio AB
 */
public class FrmDepartamento extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    boolean reg;
    int pmod;
    public String nombreColumnas[] = {"Nombre", "Sexo", "Edad"};

    public FrmDepartamento() {
        initComponents();
        inhabilitar();
        controles(true);
           }

    public void limpiar() {
        txtNombre.setText("");
        cboSexo.setSelectedIndex(0);
        txtEdad.setText("");
//        txtEdadPromedio.setText("");
//        txtMayorPromedio.setText("");
//        txtMenorPromdio.setText("");
//        txtProfesorMasJoven.setText("");
//        txtProfesorMayoredad.setText("");
    }

    public void habilitar() {
        txtNombre.setEnabled(true);
        cboSexo.setEnabled(true);
        txtEdad.setEnabled(true);
        txtEdadPromedio.setEnabled(true);
        txtMayorPromedio.setEnabled(true);
        txtMenorPromdio.setEnabled(true);
        txtProfesorMasJoven.setEnabled(true);
        txtProfesorMayoredad.setEnabled(true);
    }

    public void inhabilitar() {
        txtNombre.setEnabled(false);
        cboSexo.setEnabled(false);
        txtEdad.setEnabled(false);
        txtEdadPromedio.setEnabled(false);
        txtMayorPromedio.setEnabled(false);
        txtMenorPromdio.setEnabled(false);
        txtProfesorMasJoven.setEnabled(false);
        txtProfesorMayoredad.setEnabled(false);
    }

    public void controles(boolean cn) {
        btnNuevo.setEnabled(cn);
        btnAgregar.setEnabled(!cn);
        btnCancelar.setEnabled(!cn);
        btnMostrar.setEnabled(cn);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonTask1 = new org.edisoncor.gui.button.ButtonTask();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jPanel1 = new javax.swing.JPanel();
        labelMetroICM1 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM2 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM3 = new com.icm.components.metro.LabelMetroICM();
        txtNombre = new com.icm.components.metro.TextFieldMetroICM();
        txtEdad = new com.icm.components.metro.TextFieldMetroICM();
        cboSexo = new com.icm.components.metro.ComboboxMetroICM();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmostrar = new com.icm.components.metro.TableMetroICM();
        panel1 = new org.edisoncor.gui.panel.Panel();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        txtEdadPromedio = new com.icm.components.metro.LabelMetroICM();
        txtProfesorMasJoven = new com.icm.components.metro.LabelMetroICM();
        txtProfesorMayoredad = new com.icm.components.metro.LabelMetroICM();
        txtMayorPromedio = new com.icm.components.metro.LabelMetroICM();
        txtMenorPromdio = new com.icm.components.metro.LabelMetroICM();
        panel2 = new org.edisoncor.gui.panel.Panel();
        btnNuevo = new org.edisoncor.gui.button.ButtonIpod();
        btnAgregar = new org.edisoncor.gui.button.ButtonIpod();
        btnLimpiar = new org.edisoncor.gui.button.ButtonIpod();
        btnCancelar = new org.edisoncor.gui.button.ButtonIpod();
        btnMostrar = new org.edisoncor.gui.button.ButtonIpod();
        btnSAlir = new org.edisoncor.gui.button.ButtonTextDown();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice1.setBackground(new java.awt.Color(0, 255, 0));
        panelNice1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelNice1.setForeground(new java.awt.Color(102, 102, 255));
        panelNice1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registro Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        labelMetroICM1.setText("Nombre:");
        labelMetroICM1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        labelMetroICM2.setText("Sexo: ");
        labelMetroICM2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        labelMetroICM3.setText("Edad:");
        labelMetroICM3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtEdad.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione....", "Masculino", "Femenino", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panelNice1.add(jPanel1);
        jPanel1.setBounds(10, 10, 350, 220);

        tblmostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblmostrar);

        panelNice1.add(jScrollPane1);
        jScrollPane1.setBounds(380, 270, 580, 230);

        panel1.setBackground(new java.awt.Color(0, 153, 153));
        panel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel1.setForeground(new java.awt.Color(0, 153, 153));
        panel1.setColorPrimario(new java.awt.Color(0, 102, 102));
        panel1.setColorSecundario(new java.awt.Color(0, 102, 102));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMetric1.setForeground(new java.awt.Color(0, 255, 0));
        labelMetric1.setText("Mayor Promedio:");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        panel1.add(labelMetric1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        labelMetric2.setForeground(new java.awt.Color(0, 255, 0));
        labelMetric2.setText("Profesor Mas Joven:");
        labelMetric2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        panel1.add(labelMetric2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        labelMetric3.setForeground(new java.awt.Color(0, 255, 0));
        labelMetric3.setText("Edad Promedio:");
        labelMetric3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        panel1.add(labelMetric3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        labelMetric4.setForeground(new java.awt.Color(0, 255, 0));
        labelMetric4.setText("Profesor Mas Edad:");
        labelMetric4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        panel1.add(labelMetric4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        labelMetric5.setForeground(new java.awt.Color(0, 255, 0));
        labelMetric5.setText("Menores Promedio:");
        labelMetric5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        panel1.add(labelMetric5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txtEdadPromedio.setBackground(new java.awt.Color(0, 0, 0));
        txtEdadPromedio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEdadPromedio.setForeground(new java.awt.Color(255, 255, 255));
        txtEdadPromedio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panel1.add(txtEdadPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 200, 34));

        txtProfesorMasJoven.setBackground(new java.awt.Color(0, 0, 0));
        txtProfesorMasJoven.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtProfesorMasJoven.setForeground(new java.awt.Color(255, 255, 255));
        txtProfesorMasJoven.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panel1.add(txtProfesorMasJoven, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 200, 40));

        txtProfesorMayoredad.setBackground(new java.awt.Color(0, 0, 0));
        txtProfesorMayoredad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtProfesorMayoredad.setForeground(new java.awt.Color(255, 255, 255));
        txtProfesorMayoredad.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panel1.add(txtProfesorMayoredad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 200, 40));

        txtMayorPromedio.setBackground(new java.awt.Color(0, 0, 0));
        txtMayorPromedio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMayorPromedio.setForeground(new java.awt.Color(255, 255, 255));
        txtMayorPromedio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panel1.add(txtMayorPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 200, 36));

        txtMenorPromdio.setBackground(new java.awt.Color(51, 0, 51));
        txtMenorPromdio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMenorPromdio.setForeground(new java.awt.Color(255, 255, 255));
        txtMenorPromdio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panel1.add(txtMenorPromdio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 200, 38));

        panelNice1.add(panel1);
        panel1.setBounds(380, 10, 580, 250);

        panel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoAlumnos/File/loginImagen.jpg"))); // NOI18N
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoPersonal/File/icons8_Plus_30px.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setColorDeSombra(new java.awt.Color(204, 204, 204));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        panel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoPersonal/File/icons8_Classroom_30px.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setColorDeSombra(new java.awt.Color(204, 204, 204));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoPersonal/File/icons8_Broom_30px_1.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setColorDeSombra(new java.awt.Color(204, 204, 204));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoPersonal/File/icons8_Cancel_30px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setColorDeSombra(new java.awt.Color(204, 204, 204));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        btnMostrar.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoPersonal/File/icons8_Preview_Pane_30px_1.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.setColorDeSombra(new java.awt.Color(204, 204, 204));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        panel2.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        btnSAlir.setBackground(new java.awt.Color(153, 153, 255));
        btnSAlir.setText("Salir");
        btnSAlir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAlirActionPerformed(evt);
            }
        });
        panel2.add(btnSAlir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 70, -1));

        panelNice1.add(panel2);
        panel2.setBounds(10, 260, 350, 240);

        getContentPane().add(panelNice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSAlirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAlirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSAlirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        reg = true;
        habilitar();
        controles(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre;
        String sexo;
        int edad;
        if (txtNombre.getText().compareTo("") != 0 && cboSexo.getSelectedIndex() > 0 && txtEdad.getText().compareTo("") != 0) {
            nombre = txtNombre.getText();
            sexo = cboSexo.getSelectedItem().toString();
            edad = Integer.parseInt(txtEdad.getText());
            Departamento c = new Departamento(nombre, sexo, edad);
            if (reg) {

                LP.agregar(c);
                txtEdadPromedio.setText(String.valueOf(LP.Promedio()));
                // JOptionPane.showMessageDialog(null, LP.Promedio());
                LP.profesorMasJoven();
                LP.profesorMasMayor();
                LP.profesoresMayoresPromedio();
                JOptionPane.showMessageDialog(rootPane, "Datos registrados");

            }
            inhabilitar();
            controles(true);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        modelo.setDataVector(LP.devolverDatos(), nombreColumnas);
        tblmostrar.setModel(modelo);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        inhabilitar();
        controles(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDepartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod btnAgregar;
    private org.edisoncor.gui.button.ButtonIpod btnCancelar;
    private org.edisoncor.gui.button.ButtonIpod btnLimpiar;
    private org.edisoncor.gui.button.ButtonIpod btnMostrar;
    private org.edisoncor.gui.button.ButtonIpod btnNuevo;
    private org.edisoncor.gui.button.ButtonTextDown btnSAlir;
    private org.edisoncor.gui.button.ButtonTask buttonTask1;
    private com.icm.components.metro.ComboboxMetroICM cboSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private com.icm.components.metro.LabelMetroICM labelMetroICM1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM2;
    private com.icm.components.metro.LabelMetroICM labelMetroICM3;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private com.icm.components.metro.TableMetroICM tblmostrar;
    private com.icm.components.metro.TextFieldMetroICM txtEdad;
    public static com.icm.components.metro.LabelMetroICM txtEdadPromedio;
    public static com.icm.components.metro.LabelMetroICM txtMayorPromedio;
    public static com.icm.components.metro.LabelMetroICM txtMenorPromdio;
    private com.icm.components.metro.TextFieldMetroICM txtNombre;
    public static com.icm.components.metro.LabelMetroICM txtProfesorMasJoven;
    public static com.icm.components.metro.LabelMetroICM txtProfesorMayoredad;
    // End of variables declaration//GEN-END:variables
}
