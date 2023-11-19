/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pemesananmk;

/**
 *
 * @author gamin
 */
public class Form extends javax.swing.JFrame {
    // Variabel instance untuk menyimpan status CheckBox
    private boolean isSteakEnabled = false;
    private boolean isPizzaEnabled = false;
    private boolean isBurgerEnabled = false;
    private boolean isSphagetiEnabled = false;

    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
        TFTotalBayar.setEnabled(false);
        TADataPenjualan.setEnabled(false);
        TFPizza.setEnabled(false);
        TFSteak.setEnabled(false);
        TFBurger.setEnabled(false);
        TFSphageti.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TFNoHp = new javax.swing.JTextField();
        TFBurger = new javax.swing.JTextField();
        labelTotalBayar = new javax.swing.JLabel();
        TFTotalBayar = new javax.swing.JTextField();
        BtnTambah = new javax.swing.JToggleButton();
        labelDataPenjualan = new javax.swing.JLabel();
        labelNamaAplikasi = new javax.swing.JLabel();
        CBSteak = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TADataPenjualan = new javax.swing.JTextArea();
        labelDataPenjualan1 = new javax.swing.JLabel();
        labelDataPenjualan2 = new javax.swing.JLabel();
        labelHargaSteak = new javax.swing.JLabel();
        CBPizza = new javax.swing.JCheckBox();
        labelHargaPizza = new javax.swing.JLabel();
        CBBurger = new javax.swing.JCheckBox();
        labelHargaBurger = new javax.swing.JLabel();
        CBSphageti = new javax.swing.JCheckBox();
        labelNama = new javax.swing.JLabel();
        llabelHargaSphageti = new javax.swing.JLabel();
        TFNama = new javax.swing.JTextField();
        labelDataPenjualan3 = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        TFSteak = new javax.swing.JTextField();
        TFAlamat = new javax.swing.JTextField();
        TFSphageti = new javax.swing.JTextField();
        labelNoHp = new javax.swing.JLabel();
        TFPizza = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TFNoHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNoHpActionPerformed(evt);
            }
        });

        labelTotalBayar.setText("TOTAL BAYAR :");

        TFTotalBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTotalBayarActionPerformed(evt);
            }
        });

        BtnTambah.setText("Tambah");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        labelDataPenjualan.setText("Data Penjualan : ");

        labelNamaAplikasi.setText("APLIKASI PEMESANAN");

        CBSteak.setText("Steak");
        CBSteak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSteakActionPerformed(evt);
            }
        });

        TADataPenjualan.setColumns(20);
        TADataPenjualan.setRows(5);
        jScrollPane1.setViewportView(TADataPenjualan);

        labelDataPenjualan1.setText("Data Customer : ");

        labelDataPenjualan2.setText("Menu Makanan :");

        labelHargaSteak.setText("Rp. 30.000");

        CBPizza.setText("Pizza");
        CBPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPizzaActionPerformed(evt);
            }
        });

        labelHargaPizza.setText("Rp. 50.000");

        CBBurger.setText("Burger");
        CBBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBBurgerActionPerformed(evt);
            }
        });

        labelHargaBurger.setText("Rp. 25.000");

        CBSphageti.setText("Sphageti");
        CBSphageti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSphagetiActionPerformed(evt);
            }
        });

        labelNama.setText("Nama :");

        llabelHargaSphageti.setText("Rp. 20.000");

        TFNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNamaActionPerformed(evt);
            }
        });

        labelDataPenjualan3.setText("Jumlah");

        labelAlamat.setText("Alamat :");

        TFAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFAlamatActionPerformed(evt);
            }
        });

        labelNoHp.setText("No Hp : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelAlamat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFNama, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelDataPenjualan2)
                                    .addComponent(CBSteak, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelHargaSteak, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelHargaPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelHargaBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBSphageti, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(llabelHargaSphageti, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDataPenjualan3)
                                    .addComponent(TFSteak, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFSphageti, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(17, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelNamaAplikasi)
                                        .addGap(229, 229, 229))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TFTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelDataPenjualan1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelDataPenjualan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)))
                        .addGap(12, 12, 12))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnTambah)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelNamaAplikasi)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataPenjualan1)
                    .addComponent(labelDataPenjualan2)
                    .addComponent(labelDataPenjualan3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBSteak)
                            .addComponent(labelHargaSteak)
                            .addComponent(TFSteak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBSphageti)
                            .addComponent(llabelHargaSphageti)
                            .addComponent(TFSphageti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBPizza)
                            .addComponent(labelHargaPizza)
                            .addComponent(TFPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBBurger)
                            .addComponent(labelHargaBurger)
                            .addComponent(TFBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNama)
                            .addComponent(TFNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAlamat)
                            .addComponent(TFAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNoHp)
                            .addComponent(TFNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotalBayar)
                    .addComponent(TFTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnTambah)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDataPenjualan)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFNoHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNoHpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNoHpActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        String tampilPesanan = "";
        String tampilCustomer = "";
        tampilCustomer += "Nama : " + TFNama.getText();
        tampilCustomer += "\nAlamat : " + TFAlamat.getText();
        tampilCustomer += "\nNo Hp : " + TFNoHp.getText();
        int bayar = 0;
        if(CBSteak.isSelected()){
            int jumlah = Integer.parseInt(TFSteak.getText());
            int total;
            total = jumlah * 30000;
            bayar += total;
            tampilPesanan += "- " + CBSteak.getText() + " Rp. 30.000" + " x " + jumlah + " = " + total + "\n";
        }if(CBPizza.isSelected()){
            int jumlah = Integer.parseInt(TFPizza.getText());
            int total;
            total = jumlah * 30000;
            bayar += total;
            tampilPesanan += "- " + CBPizza.getText() + " Rp. 50.000" + " x " + jumlah + " = " + total + "\n";
        }if(CBSphageti.isSelected()){
            int jumlah = Integer.parseInt(TFSphageti.getText());
            int total;
            total = jumlah * 30000;
            bayar += total;
            tampilPesanan += "- " + CBSphageti.getText() + " Rp. 20.000" + " x " + jumlah + " = " + total + "\n";
        }if(CBBurger.isSelected()){
            int jumlah = Integer.parseInt(TFBurger.getText());
            int total;
            total = jumlah * 30000;
            bayar += total;
            tampilPesanan += "- " + CBBurger.getText() + " Rp. 25.000" + " x " + jumlah + " = " + total + "\n";
        }
        TFTotalBayar.setText(String.valueOf(bayar));
        TADataPenjualan.setText(tampilCustomer + "\n=====================================\nPesanan : \n" + tampilPesanan + "=====================================\n"+"Total Bayar = " + bayar);
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void CBSteakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBSteakActionPerformed
        isSteakEnabled = CBSteak.isSelected();
        TFSteak.setEnabled(isSteakEnabled);
        if (!isSteakEnabled) {
            TFSteak.setText(""); // Jika checkbox dihilangkan, hapus inputannya
        }
    }//GEN-LAST:event_CBSteakActionPerformed

    private void CBPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPizzaActionPerformed
        isPizzaEnabled = CBPizza.isSelected();
        TFPizza.setEnabled(isPizzaEnabled);
        if (!isPizzaEnabled) {
            TFPizza.setText(""); // Jika checkbox dihilangkan, hapus inputannya
        }
    }//GEN-LAST:event_CBPizzaActionPerformed

    private void CBBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBBurgerActionPerformed
        isBurgerEnabled = CBBurger.isSelected();
        TFBurger.setEnabled(isBurgerEnabled);
        if (!isBurgerEnabled) {
            TFBurger.setText(""); // Jika checkbox dihilangkan, hapus inputannya
        }
    }//GEN-LAST:event_CBBurgerActionPerformed

    private void CBSphagetiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBSphagetiActionPerformed
        isSphagetiEnabled = CBSphageti.isSelected();
        TFSphageti.setEnabled(isSphagetiEnabled);
        if (!isSphagetiEnabled) {
            TFSphageti.setText(""); // Jika checkbox dihilangkan, hapus inputannya
        }
    }//GEN-LAST:event_CBSphagetiActionPerformed

    private void TFNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNamaActionPerformed

    private void TFAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFAlamatActionPerformed

    private void TFTotalBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTotalBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTotalBayarActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnTambah;
    private javax.swing.JCheckBox CBBurger;
    private javax.swing.JCheckBox CBPizza;
    private javax.swing.JCheckBox CBSphageti;
    private javax.swing.JCheckBox CBSteak;
    private javax.swing.JTextArea TADataPenjualan;
    private javax.swing.JTextField TFAlamat;
    private javax.swing.JTextField TFBurger;
    private javax.swing.JTextField TFNama;
    private javax.swing.JTextField TFNoHp;
    private javax.swing.JTextField TFPizza;
    private javax.swing.JTextField TFSphageti;
    private javax.swing.JTextField TFSteak;
    private javax.swing.JTextField TFTotalBayar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelDataPenjualan;
    private javax.swing.JLabel labelDataPenjualan1;
    private javax.swing.JLabel labelDataPenjualan2;
    private javax.swing.JLabel labelDataPenjualan3;
    private javax.swing.JLabel labelHargaBurger;
    private javax.swing.JLabel labelHargaPizza;
    private javax.swing.JLabel labelHargaSteak;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNamaAplikasi;
    private javax.swing.JLabel labelNoHp;
    private javax.swing.JLabel labelTotalBayar;
    private javax.swing.JLabel llabelHargaSphageti;
    // End of variables declaration//GEN-END:variables
}