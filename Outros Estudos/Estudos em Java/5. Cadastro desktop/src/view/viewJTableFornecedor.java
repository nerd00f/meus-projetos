/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Fornecedor;
import model.dao.FornecedorDAO;

/**
 *
 * @author AIPSI01T
 */
public class viewJTableFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form viewJTableFornecedor
     */
    public viewJTableFornecedor() throws SQLException {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTFornecedor.getModel();
        jTFornecedor.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }

    public void readJTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTFornecedor.getModel();
        modelo.setNumRows(0);
        FornecedorDAO fdao = new FornecedorDAO();
        for (Fornecedor f : fdao.read()) {
            modelo.addRow(new Object[]{
                f.getId(),
                f.getRazaoSocial(),
                f.getNomeFantasia(),
                f.getCNPJ(),
                f.getInscricaoEstadual(),
                f.getEndereço(),
                f.getChars()
            });
        }
    }

    public void readJTableForDesc(String desc) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTFornecedor.getModel();
        modelo.setNumRows(0);
        FornecedorDAO fdao = new FornecedorDAO();
        for (Fornecedor f : fdao.readForDesc(desc)) {
            modelo.addRow(new Object[]{
                f.getId(),
                f.getRazaoSocial(),
                f.getNomeFantasia(),
                f.getCNPJ(),
                f.getInscricaoEstadual(),
                f.getEndereço(),
                f.getChars()});

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtBuscaNome = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFornecedor = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        txtInscricaoEstadual = new javax.swing.JTextField();
        txtNomeFantasia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtChars = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Pesquisa por nome:");

        txtBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNomeActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Razão Social", " Nome Fantasia", "CNPJ", "Inscrição Estadual", "Endereço", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTFornecedor);

        jLabel5.setText("Endereço");

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        jLabel1.setText("Razão Social");

        jLabel2.setText("Inscrição Estadual");

        jLabel3.setText("Nome Fantasia");

        txtInscricaoEstadual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInscricaoEstadualActionPerformed(evt);
            }
        });

        txtNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFantasiaActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Fornecedores");

        jLabel7.setText("CNPJ");

        jLabel8.setText("Sexo");

        txtChars.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        txtChars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCharsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(124, 124, 124))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(txtEndereco)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(165, 165, 165)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(76, 76, 76)
                                        .addComponent(jButton2)
                                        .addGap(66, 66, 66)
                                        .addComponent(jButton3)))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCNPJ)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtChars, 0, 197, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaNomeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            readJTableForDesc(txtBuscaNome.getText());
        } catch (SQLException ex) {
            Logger.getLogger(viewJTableCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtInscricaoEstadualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInscricaoEstadualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInscricaoEstadualActionPerformed

    private void txtNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFantasiaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Fornecedor f = new Fornecedor();
        FornecedorDAO dao = new FornecedorDAO();
        f.setRazaoSocial(txtRazaoSocial.getText());
        f.setNomeFantasia(txtNomeFantasia.getText());
        f.setCNPJ(txtCNPJ.getText());
        f.setInscricaoEstadual(txtInscricaoEstadual.getText());
        f.setEndereço(txtEndereco.getText());
        f.setChars((String)txtChars.getSelectedItem());
        dao.create(f);
        txtRazaoSocial.setText("");
        txtNomeFantasia.setText("");
        txtCNPJ.setText("");
        txtInscricaoEstadual.setText("");
        txtEndereco.setText("");
        txtChars.setSelectedItem("M, F");
        try {
            readJTable();
        } catch (SQLException ex) {
            Logger.getLogger(viewJTableFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTFornecedor.getSelectedRow() != -1) {
            Fornecedor f = new Fornecedor();
            FornecedorDAO dao = new FornecedorDAO();
            f.setId((int) jTFornecedor.getValueAt(jTFornecedor.getSelectedRow(), 0));
            dao.delete(f);
            txtRazaoSocial.setText("");
            txtNomeFantasia.setText("");
            txtCNPJ.setText("");
            txtInscricaoEstadual.setText("");
            txtEndereco.setText("");
            txtChars.setSelectedItem("M, F");
            try {
                readJTable();
            } catch (SQLException ex) {
                Logger.getLogger(viewJTableCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um fornecedor para excluir");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTFornecedor.getSelectedRow() != -1) {
            Fornecedor f = new Fornecedor();
            FornecedorDAO dao = new FornecedorDAO();
            f.setRazaoSocial(txtRazaoSocial.getText());
            f.setNomeFantasia(txtNomeFantasia.getText());
            f.setCNPJ(txtCNPJ.getText());
            f.setInscricaoEstadual(txtInscricaoEstadual.getText());
            f.setEndereço(txtEndereco.getText());
            f.setChars((String)txtChars.getSelectedItem());
            f.setId((int) jTFornecedor.getValueAt(jTFornecedor.getSelectedRow(), 0));
            dao.update(f);
            txtRazaoSocial.setText("");
            txtNomeFantasia.setText("");
            txtCNPJ.setText("");
            txtInscricaoEstadual.setText("");
            txtEndereco.setText("");
            txtChars.setSelectedItem("M, F");
        }
        try {
            readJTable();
        } catch (SQLException ex) {
            Logger.getLogger(viewJTableCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCharsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCharsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCharsActionPerformed

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
            java.util.logging.Logger.getLogger(viewJTableFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewJTableFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewJTableFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewJTableFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new viewJTableFornecedor().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(viewJTableFornecedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTFornecedor;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JComboBox txtChars;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtInscricaoEstadual;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtRazaoSocial;
    // End of variables declaration//GEN-END:variables

}
