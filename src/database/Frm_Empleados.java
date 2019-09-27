package database;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.text.AbstractDocument;

public class Frm_Empleados extends javax.swing.JFrame {

    Empleados db = null;
    UppercaseDocumentFilter filter = new UppercaseDocumentFilter();
    String type = "";

    public Frm_Empleados() {
        initComponents();
        db = new Empleados();
        ((AbstractDocument) txtNombre.getDocument()).setDocumentFilter(filter);
        db.getTotalTrabajador(tblEmpleados);
    }

    private void clear() {
        txtClave.setText("");
        txtNombre.setText("");
        cbSueldo.setSelectedIndex(0);
        spDiasTrabajados.setValue(1);
    }

    private void changeEnable(boolean change) {
        btnAgregar.setEnabled(!change);
        btnModificar.setEnabled(!change);
        btnEliminar.setEnabled(!change);
        btnBuscar.setEnabled(!change);
        tblEmpleados.setEnabled(!change);
        btnGuardar.setEnabled(change);
        btnCancelar.setEnabled(change);
        txtClave.setEnabled(change);
        txtNombre.setEnabled(change);
        cbSueldo.setEnabled(change);
        spDiasTrabajados.setEnabled(change);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        spDiasTrabajados = new javax.swing.JSpinner();
        cbSueldo = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empleados");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado"));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Clave:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Sueldo:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Días Trabajados:");

        txtClave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtClave.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtClave.setToolTipText("Clave del trabajador");
        txtClave.setEnabled(false);
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNombre.setToolTipText("Nombre del trabajador");
        txtNombre.setEnabled(false);

        spDiasTrabajados.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        spDiasTrabajados.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        spDiasTrabajados.setEnabled(false);
        spDiasTrabajados.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spDiasTrabajadosStateChanged(evt);
            }
        });

        cbSueldo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbSueldo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "150", "200", "250", "300" }));
        cbSueldo.setEnabled(false);

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(spDiasTrabajados, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbSueldo, javax.swing.GroupLayout.Alignment.LEADING, 0, 77, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spDiasTrabajados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        btnModificar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblEmpleados.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre", "Sueldo", "Días", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpleados.setToolTipText("");
        tblEmpleados.setRowHeight(17);
        tblEmpleados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        btnAgregar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName(" Empleado");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String clave = txtClave.getText();
        switch (type) {
            case "Nuevo": {
                boolean existe = false;
                for (int i = 0; i < tblEmpleados.getRowCount(); i++) {
                    if (tblEmpleados.getValueAt(i, 0).equals(clave)) {
                        existe = true;
                    }
                }
                if (!existe) {
                    String nombre = txtNombre.getText();
                    int sueldo = Integer.parseInt(cbSueldo.getSelectedItem().toString());
                    int dias = Integer.parseInt(spDiasTrabajados.getValue().toString());
                    int sueldo_total = sueldo * dias;
                    int resultado = db.insertTrabajador(clave, nombre, sueldo, dias, sueldo_total);
                    if (resultado == 1) {
                        JOptionPane.showMessageDialog(new JFrame(), "Datos guardados correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        clear();
                        changeEnable(false);
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "Datos no fueron guardados correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    db.getTotalTrabajador(tblEmpleados);
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Se encuentra un registro con la misma clave", "Error", JOptionPane.WARNING_MESSAGE);
                }
                tblEmpleados.clearSelection();
                btnModificar.setEnabled(false);
                btnEliminar.setEnabled(false);
                break;
            }
            case "Modificar":
                String nombre = txtNombre.getText();
                int sueldo = Integer.parseInt(cbSueldo.getSelectedItem().toString());
                int dias = Integer.parseInt(spDiasTrabajados.getValue().toString());
                int sueldo_total = sueldo * dias;
                int resultado = db.updateTrabajador(clave, nombre, sueldo, dias, sueldo_total);
                if (resultado == 1) {
                    JOptionPane.showMessageDialog(new JFrame(), "Datos guardados correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Datos no fueron guardados correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                }
                changeEnable(false);
                db.getTotalTrabajador(tblEmpleados);
                tblEmpleados.clearSelection();
                btnModificar.setEnabled(false);
                btnEliminar.setEnabled(false);
                break;
            default:
                type = "";
                break;
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        changeEnable(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyTyped
        NumberFilter g = new NumberFilter(evt, txtClave);
    }//GEN-LAST:event_txtClaveKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int row = tblEmpleados.getSelectedRow();
        if (row >= 0) {
            String clave = tblEmpleados.getValueAt(tblEmpleados.getSelectedRow(), 0).toString();
            if (JOptionPane.showConfirmDialog(new JFrame(), "Deseas elimninar el clave: " + clave + "?", "Eliminar",
              JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                int resultado = db.deleteTrabajador(clave);
                if (resultado == 1) {
                    JOptionPane.showMessageDialog(new JFrame(), "El registro se eliminó con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    db.getTotalTrabajador(tblEmpleados);
                    tblEmpleados.clearSelection();
                    btnModificar.setEnabled(false);
                    btnEliminar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Se produjo un error", "error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked
        int row = tblEmpleados.getSelectedRow();
        if (tblEmpleados.isEnabled()) {
            if (row >= 0) {
                clear();
                txtClave.setText(tblEmpleados.getValueAt(row, 0).toString());
                txtNombre.setText(tblEmpleados.getValueAt(row, 1).toString());
                cbSueldo.setSelectedItem(tblEmpleados.getValueAt(row, 2).toString());
                spDiasTrabajados.setValue(tblEmpleados.getValueAt(row, 3));
                btnModificar.setEnabled(true);
                btnEliminar.setEnabled(true);
            } else {
                tblEmpleados.clearSelection();
                btnModificar.setEnabled(false);
                btnEliminar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_tblEmpleadosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String input = (String) JOptionPane.showInputDialog(
          new JFrame(), "Ingresa el numero de clave", "Buscar", JOptionPane.INFORMATION_MESSAGE,
          new ImageIcon("/assets/magnifier 16x16.png"), null, "");
        for (int i = 0; i < tblEmpleados.getRowCount(); i++) {
            if (tblEmpleados.getValueAt(i, 0).equals(input)) {
                try {
                    tblEmpleados.setRowSelectionInterval(i, i);
                    int rowIndex = tblEmpleados.getSelectedRow();
                    int columnIndex = 0;
                    boolean includeSpacing = true;
                    Rectangle cellRect = tblEmpleados.getCellRect(rowIndex, columnIndex, includeSpacing);
                    tblEmpleados.scrollRectToVisible(cellRect);
                    clear();
                    txtClave.setText(tblEmpleados.getValueAt(i, 0).toString());
                    txtNombre.setText(tblEmpleados.getValueAt(i, 1).toString());
                    cbSueldo.setSelectedItem(tblEmpleados.getValueAt(i, 2).toString());
                    spDiasTrabajados.setValue(tblEmpleados.getValueAt(i, 3));
                    btnModificar.setEnabled(true);
                    btnEliminar.setEnabled(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(new JFrame(), e, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        Toolkit.getDefaultToolkit().beep();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        type = "Nuevo";
        changeEnable(true);
        clear();
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        type = "Modificar";
        changeEnable(true);
        txtClave.setEnabled(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void spDiasTrabajadosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spDiasTrabajadosStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_spDiasTrabajadosStateChanged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbSueldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spDiasTrabajados;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
