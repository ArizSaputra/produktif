/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toserba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Satria Yuda
 */
public class editBarang extends javax.swing.JFrame {

    /**
     * Creates new form editProduk
     */
    public editBarang() {
        initComponents();
        tampil_combo();
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sinarharapanpos","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_barang WHERE id_barang ='"+dataBarang.selectedBarangID+"'");
            while(rs.next()){
                txt_idbarang.setText(rs.getString("id_barang"));
                txt_nama.setText(rs.getString("nama_barang"));
                cmb_jenis.setSelectedItem(rs.getString("id_jenis"));
                txt_kuantitas.setText(rs.getString("kuantitas"));
                txt_hargabeli.setText(rs.getString("harga_beli"));
                txt_hargajual.setText(rs.getString("harga_jual"));
            }
        }
        catch (SQLException ex){
            Logger.getLogger(dataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_kuantitas = new javax.swing.JTextField();
        txt_hargabeli = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        cmb_jenis = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_hargajual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_idbarang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Edit Barang");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setText("Nama");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel3.setText("Jenis");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel6.setText("Kuantitas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel7.setText("Harga Beli");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));
        jPanel1.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 166, -1));

        txt_kuantitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kuantitasActionPerformed(evt);
            }
        });
        jPanel1.add(txt_kuantitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 166, -1));

        txt_hargabeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargabeliActionPerformed(evt);
            }
        });
        jPanel1.add(txt_hargabeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 166, -1));

        btn_submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/Group 14(1).png"))); // NOI18N
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 145, 29));

        jPanel1.add(cmb_jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 166, -1));

        jLabel8.setText("Harga Jual");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        txt_hargajual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargajualActionPerformed(evt);
            }
        });
        jPanel1.add(txt_hargajual, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 166, -1));

        jLabel4.setText("ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        txt_idbarang.setEnabled(false);
        jPanel1.add(txt_idbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 166, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_kuantitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kuantitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kuantitasActionPerformed

    private void txt_hargabeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargabeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargabeliActionPerformed

    private void txt_hargajualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargajualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargajualActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sinarharapanpos","root","");
            String idbarang=txt_idbarang.getText();
            String nama=txt_nama.getText();
            String kuantitas=txt_kuantitas.getText();
            try {
            long harga_jual =Long.parseLong(txt_hargajual.getText());
            long harga_beli =Long.parseLong(txt_hargabeli.getText());
            String jb=cmb_jenis.getSelectedItem().toString();
            PreparedStatement ps = con.prepareStatement("UPDATE tb_barang SET nama_barang ='"+nama+"', kuantitas = '"+kuantitas+"', harga_beli = '"+harga_beli+"', harga_jual ='"+harga_jual+"', id_jenis = '"+jb+"' WHERE id_barang = '"+idbarang+"'");
            ps.execute();
            JOptionPane.showMessageDialog(null,"Data barang berhasil diedit");
            dataBarang.tampilkanbarang();
            dispose();
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(this, "Masukkan angka dengan benar");
            }
        }
        catch (SQLException ex){
            Logger.getLogger(dataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_submitActionPerformed
public static void tampil_combo(){
    try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sinarharapanpos","root","");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM tb_jenis_barang");
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            cmb_jenis.addItem(rs.getString("id_jenis"));
        }
        
        rs.last();
        int jumlahdata = rs.getRow();
        rs.first();
    }
    catch(Exception e){
    
    }
    
    
    }
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
            java.util.logging.Logger.getLogger(editBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private static javax.swing.JComboBox<String> cmb_jenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_hargabeli;
    private javax.swing.JTextField txt_hargajual;
    private javax.swing.JTextField txt_idbarang;
    private javax.swing.JTextField txt_kuantitas;
    private javax.swing.JTextField txt_nama;
    // End of variables declaration//GEN-END:variables
}
