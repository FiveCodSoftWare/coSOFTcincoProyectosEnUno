/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoCuenta.Presentacion;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoCuenta.Datos.Cuenta;
import static proyectoCuenta.Presentacion.Globales.LP;

/**
 *
 * @author Antonio AB
 */
public class frmCuenta extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    boolean reg;
    int pmod;
    public String nombreColumnas[] = {"Codigo", "Apellidos", "Nombre", "Saldo"};

    public frmCuenta() {
        initComponents();
        inhabilitar();
        controles(true);
        
    }

    public void habilitar() {
        txtCodigo.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtNombre.setEnabled(true);
        txtSaldo.setEnabled(true);
    }

    public void inhabilitar() {
        txtCodigo.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtNombre.setEnabled(false);
        txtSaldo.setEnabled(false);
    }

    public void limpiar() {
        txtCodigo.setText("");
        txtApellidos.setText("");
        txtNombre.setText("");
        txtSaldo.setText("");
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

        panel1 = new org.edisoncor.gui.panel.Panel();
        panel2 = new org.edisoncor.gui.panel.Panel();
        txtCodigo = new com.icm.components.metro.TextFieldMetroICM();
        labelMetroICM1 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM2 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM3 = new com.icm.components.metro.LabelMetroICM();
        txtApellidos = new com.icm.components.metro.TextFieldMetroICM();
        txtSaldo = new com.icm.components.metro.TextFieldMetroICM();
        labelMetroICM4 = new com.icm.components.metro.LabelMetroICM();
        txtNombre = new com.icm.components.metro.TextFieldMetroICM();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        btnLimpiar = new org.edisoncor.gui.button.ButtonIpod();
        btnNuevo = new org.edisoncor.gui.button.ButtonIpod();
        btnAgregar = new org.edisoncor.gui.button.ButtonIpod();
        btnCancelar = new org.edisoncor.gui.button.ButtonIpod();
        btnMostrar = new org.edisoncor.gui.button.ButtonIpod();
        btnEliminar = new org.edisoncor.gui.button.ButtonIpod();
        buttonCircle1 = new org.edisoncor.gui.button.ButtonCircle();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new com.icm.components.metro.TableMetroICM();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        btnDepositar = new org.edisoncor.gui.button.ButtonIpod();
        btnConsultar = new org.edisoncor.gui.button.ButtonIpod();
        btnRetirar = new org.edisoncor.gui.button.ButtonIpod();
        txtDepositar = new javax.swing.JTextField();
        txtRetirar = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 255, 51));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setColorPrimario(new java.awt.Color(153, 153, 255));

        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 255, 0))); // NOI18N
        panel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoAlumnos/File/fondoL.png"))); // NOI18N
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 174, 40));

        labelMetroICM1.setForeground(new java.awt.Color(0, 255, 0));
        labelMetroICM1.setText("Codigo:");
        labelMetroICM1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        panel2.add(labelMetroICM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        labelMetroICM2.setForeground(new java.awt.Color(0, 255, 0));
        labelMetroICM2.setText("Apellidos:");
        labelMetroICM2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        panel2.add(labelMetroICM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        labelMetroICM3.setForeground(new java.awt.Color(0, 255, 0));
        labelMetroICM3.setText("Saldo:");
        labelMetroICM3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        panel2.add(labelMetroICM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        panel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 174, 40));
        panel2.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 170, 40));

        labelMetroICM4.setForeground(new java.awt.Color(0, 255, 0));
        labelMetroICM4.setText("Nombre:");
        labelMetroICM4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        panel2.add(labelMetroICM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        panel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, 40));

        panelImage1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 255, 0))); // NOI18N
        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoAlumnos/File/loginImagen.jpg"))); // NOI18N

        btnLimpiar.setForeground(new java.awt.Color(0, 255, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_Empty_Trash_30px_2.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnNuevo.setForeground(new java.awt.Color(0, 255, 0));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_Add_User_Group_Man_Man_30px_2.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnAgregar.setForeground(new java.awt.Color(0, 255, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_Checked_Checkbox_30px.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setForeground(new java.awt.Color(0, 255, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_Remove_Image_30px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnMostrar.setForeground(new java.awt.Color(0, 255, 0));
        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_CBS_30px.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnEliminar.setForeground(new java.awt.Color(0, 255, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoTrabajadores/File/icons8_Trash_Can_30px.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        buttonCircle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoPersonal/File/icons8_Cancel_30px.png"))); // NOI18N
        buttonCircle1.setText("buttonCircle1");
        buttonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCircle1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(buttonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblMostrar.setBackground(new java.awt.Color(204, 204, 204));
        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMostrar);

        jXPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jXPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Consultas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 255, 0))); // NOI18N
        jXPanel1.setForeground(new java.awt.Color(99, 113, 119));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDepositar.setForeground(new java.awt.Color(0, 255, 0));
        btnDepositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoCuenta/File/icons8_Initiate_Money_Transfer_48px.png"))); // NOI18N
        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });
        jXPanel1.add(btnDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, 67));

        btnConsultar.setForeground(new java.awt.Color(0, 255, 0));
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoCuenta/File/icons8_Paper_Money_48px.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jXPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnRetirar.setForeground(new java.awt.Color(0, 255, 0));
        btnRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoCuenta/File/icons8_Request_Money_48px.png"))); // NOI18N
        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        jXPanel1.add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));
        jXPanel1.add(txtDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 94, 31));
        jXPanel1.add(txtRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 94, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCircle1ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCircle1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        reg = true;
        habilitar();
        controles(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String codigo, apellidos, nombre;
        int saldo;
        if (txtCodigo.getText().compareTo("") != 0 && txtApellidos.getText().compareTo("") != 0 && txtNombre.getText().compareTo("") != 0 && txtSaldo.getText().compareTo("") != 0) {
            codigo = txtCodigo.getText();
            apellidos = txtApellidos.getText();
            nombre = txtNombre.getText();
            saldo = Integer.parseInt(txtSaldo.getText());
            Cuenta d = new Cuenta(codigo, apellidos, nombre, saldo);
            if (reg) {
                LP.agregar(d);
                JOptionPane.showMessageDialog(null, "Datos registrados");
            }
            limpiar();
            inhabilitar();
            controles(true);
        } else {
            JOptionPane.showMessageDialog(null, "Fatan datos");
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
        modelo.setDataVector(LP.devuelveDatos(), nombreColumnas);
        tblMostrar.setModel(modelo);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo;
        int p;
        limpiar();
        codigo = JOptionPane.showInputDialog("Ingrese codigo a eliminar");
        Cuenta a = new Cuenta(codigo, "", "", 0.0);
        p = LP.buscar(a);
        if (p != -1) {
            a = LP.getElementos(p);
            txtCodigo.setText(a.getCodigo());
            txtApellidos.setText(a.getApellidos());
            txtNombre.setText(a.getNombres());
            txtSaldo.setText(String.valueOf(a.getSaldo()));
            int resp = JOptionPane.showConfirmDialog(this, "Deseas Eliminar", "Elinar Dato", JOptionPane.YES_NO_OPTION);

            if (resp == JOptionPane.YES_OPTION) {
                LP.Eliminar(p);
                JOptionPane.showMessageDialog(this, "Registro Eliminado");
                modelo.setDataVector(LP.devuelveDatos(), nombreColumnas);
            }
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Codigo no existe");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String codigo;
        int p;
        limpiar();
        codigo = JOptionPane.showInputDialog("Ingrese codigo a consultar");
        Cuenta x = new Cuenta(codigo, "", "", 0.0);
        p = LP.buscar(x);
        if (p != -1) {
            x = LP.getElementos(p);
            txtCodigo.setText(x.getCodigo());
            txtApellidos.setText(x.getApellidos());
            txtNombre.setText(x.getNombres());
            txtSaldo.setText(String.valueOf(x.getSaldo()));

        } else {
            JOptionPane.showMessageDialog(null, "El codigo no existe");
        }


    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
         try {

            int fila = tblMostrar.getSelectedRow();
            String codigo = tblMostrar.getValueAt(fila, 0).toString();
            Cuenta f = new Cuenta(codigo, "", "", 0.0);
            int indice = LP.buscar(f);
            if (indice != -1) {
                f = LP.getElementos(indice);
                Double saldo = Double.parseDouble(txtRetirar.getText());
                if (saldo <= f.getSaldo()) {
                    f.retirar(saldo);
                    JOptionPane.showMessageDialog(null, "Retiro satisfactorio");
                } else {
                    JOptionPane.showMessageDialog(null, "La cuenta de: " + f.getNombres()+"\nNo cuenta con ese dinero");
                }
            }
            modelo.setDataVector(LP.devuelveDatos(), nombreColumnas);
            habilitar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Selecione una fila");
        }


    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
            try {

            int fila = tblMostrar.getSelectedRow();
            String codigo = tblMostrar.getValueAt(fila, 0).toString();
            Cuenta f = new Cuenta(codigo, "", "", 0.0);
            int indice = LP.buscar(f);
            if (indice != -1) {
                f = LP.getElementos(indice);
                Double saldo = Double.parseDouble(txtDepositar.getText());
                if (saldo > f.getSaldo()) {
                    f.depositar(saldo);
                    JOptionPane.showMessageDialog(null, "Registro satisfactorio su Saldo es: "+f.getSaldo());
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un saldo mayor a: "+f.getSaldo());
                }
            }
            modelo.setDataVector(LP.devuelveDatos(), nombreColumnas);
            habilitar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Selecione una fila");
        }
    }//GEN-LAST:event_btnDepositarActionPerformed

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
            java.util.logging.Logger.getLogger(frmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod btnAgregar;
    private org.edisoncor.gui.button.ButtonIpod btnCancelar;
    private org.edisoncor.gui.button.ButtonIpod btnConsultar;
    private org.edisoncor.gui.button.ButtonIpod btnDepositar;
    private org.edisoncor.gui.button.ButtonIpod btnEliminar;
    private org.edisoncor.gui.button.ButtonIpod btnLimpiar;
    private org.edisoncor.gui.button.ButtonIpod btnMostrar;
    private org.edisoncor.gui.button.ButtonIpod btnNuevo;
    private org.edisoncor.gui.button.ButtonIpod btnRetirar;
    private org.edisoncor.gui.button.ButtonCircle buttonCircle1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM2;
    private com.icm.components.metro.LabelMetroICM labelMetroICM3;
    private com.icm.components.metro.LabelMetroICM labelMetroICM4;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private com.icm.components.metro.TableMetroICM tblMostrar;
    private com.icm.components.metro.TextFieldMetroICM txtApellidos;
    private com.icm.components.metro.TextFieldMetroICM txtCodigo;
    private javax.swing.JTextField txtDepositar;
    private com.icm.components.metro.TextFieldMetroICM txtNombre;
    private javax.swing.JTextField txtRetirar;
    private com.icm.components.metro.TextFieldMetroICM txtSaldo;
    // End of variables declaration//GEN-END:variables
}
