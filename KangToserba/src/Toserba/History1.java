package Toserba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static Toserba.Setting.namauser;
import static Toserba.Setting.txt_namauser;
import static Toserba.dataBarang.model;
import static Toserba.dataSupplier.model;
import static Toserba.editKaryawan.txt_tanggallahir;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class History1 extends javax.swing.JFrame {

    /**
     * Creates new form History
     */
    static String namauser;
    static DefaultTableModel model;
    String selectedTransaksiID;
    
    
    public History1() {
        initComponents();
        txt_namauser.setText(namauser);
        tampilkanTransaksi();
        if(Login.getLevel().equals("karyawan")){
        btn_master4.setEnabled(false);
        }
    }
public static void tampilkanTransaksi() {
        String [] judul = {"No Transaksi","Tanggal","Total Harga","ID Supplier"};
        model = new DefaultTableModel(judul,0);
        tb_transaksi.setModel(model);
        
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_toserba","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_pembelian ");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
                model.addRow(data);     
            }
        }
        catch (SQLException ex){
            Logger.getLogger(History1.class.getName()).log(Level.SEVERE, null, ex);
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

        txt_tanggaldari = new com.toedter.calendar.JDateChooser();
        txt_tanggalsampai = new com.toedter.calendar.JDateChooser();
        txt_namauser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_transaksi = new javax.swing.JTable();
        btn_submit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_detail = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_history4 = new javax.swing.JButton();
        btn_setting4 = new javax.swing.JButton();
        btn_master4 = new javax.swing.JButton();
        btn_transaksi4 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_tanggaldari, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 150, -1));
        getContentPane().add(txt_tanggalsampai, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 140, -1));

        txt_namauser.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        txt_namauser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_namauser.setText("USERNAME");
        getContentPane().add(txt_namauser, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 290, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/profil kecil.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 40, 40));

        tb_transaksi.setBackground(new java.awt.Color(87, 101, 116));
        tb_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction Number", "Date", "Total Price", "ID Karyawan"
            }
        ));
        tb_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_transaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_transaksi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 350, 390));

        btn_submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/newbutton.png"))); // NOI18N
        btn_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_submitMouseClicked(evt);
            }
        });
        getContentPane().add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 70, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("-");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, 20));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel4.setText("transaction date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, 20));

        tb_detail.setBackground(new java.awt.Color(87, 101, 116));
        tb_detail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Price", "Amount"
            }
        ));
        jScrollPane2.setViewportView(tb_detail);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 380, 390));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/TH4.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 390, 90));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 780, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 780, 530));

        btn_history4.setBackground(new java.awt.Color(153, 153, 153));
        btn_history4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btn_history4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/history32.png"))); // NOI18N
        btn_history4.setText("   History");
        btn_history4.setFocusable(false);
        btn_history4.setMargin(new java.awt.Insets(2, 14, 3, 45));
        btn_history4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_history4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_history4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 50));

        btn_setting4.setBackground(new java.awt.Color(153, 153, 153));
        btn_setting4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btn_setting4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/setting32.png"))); // NOI18N
        btn_setting4.setText("   Setting");
        btn_setting4.setFocusable(false);
        btn_setting4.setMargin(new java.awt.Insets(2, 14, 3, 45));
        btn_setting4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setting4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_setting4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 220, 50));

        btn_master4.setBackground(new java.awt.Color(102, 102, 102));
        btn_master4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btn_master4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/master32.png"))); // NOI18N
        btn_master4.setText("   Master");
        btn_master4.setMargin(new java.awt.Insets(2, 14, 2, 45));
        btn_master4.setMaximumSize(new java.awt.Dimension(70, 23));
        btn_master4.setMinimumSize(new java.awt.Dimension(70, 23));
        btn_master4.setPreferredSize(new java.awt.Dimension(70, 23));
        btn_master4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_master4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_master4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 50));

        btn_transaksi4.setBackground(new java.awt.Color(153, 153, 153));
        btn_transaksi4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btn_transaksi4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/transaksi32.png"))); // NOI18N
        btn_transaksi4.setText("   Transaction");
        btn_transaksi4.setFocusable(false);
        btn_transaksi4.setIconTextGap(1);
        btn_transaksi4.setMargin(new java.awt.Insets(3, 14, 3, 15));
        btn_transaksi4.setMaximumSize(new java.awt.Dimension(70, 23));
        btn_transaksi4.setMinimumSize(new java.awt.Dimension(70, 23));
        btn_transaksi4.setPreferredSize(new java.awt.Dimension(70, 23));
        btn_transaksi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksi4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_transaksi4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 50));

        jPanel20.setBackground(new java.awt.Color(87, 101, 116));
        getContentPane().add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 40));

        jPanel21.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, 560));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/shops100.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TOSERBA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 100, 30));

        jPanel12.setBackground(new java.awt.Color(87, 101, 116));
        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 560));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 910, 610));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tb_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_transaksiMouseClicked
        int row = tb_transaksi.getSelectedRow();
        String transaksi = tb_transaksi.getValueAt(row, 0).toString();
        
        
        this.selectedTransaksiID = transaksi;
        String judul [] = {"Nama Produk","Harga","Jumlah"};
        model = new DefaultTableModel(judul,0);
        tb_detail.setModel(model);

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_toserba","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT tb_detail_pembelian.*,tb_barang.nama_barang, tb_barang.harga_jual FROM tb_detail_pembelian JOIN tb_barang ON tb_detail_pembelian.id_barang=tb_barang.id_barang WHERE tb_detail_pembelian.id_pembelian='"+transaksi+"'");
            while(rs.next()){
                String data [] = {rs.getString("nama_barang"),rs.getString("harga_jual"),rs.getString("tb_detail_pembelian.jumlah")};
                model.addRow(data);
            }
        }
        catch (SQLException ex){
            Logger.getLogger(History1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_transaksiMouseClicked

    private void btn_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_submitMouseClicked
        String [] judul = {"No Transaksi","Tanggal","Total Harga","ID Supplier"};
        model = new DefaultTableModel(judul,0);
        tb_transaksi.setModel(model);
        String tampilan = "yyyy-MM-dd";
            SimpleDateFormat fm = new SimpleDateFormat(tampilan);
            String tanggaldari = String.valueOf(fm.format(txt_tanggaldari.getDate()));
            String tanggalsampai = String.valueOf(fm.format(txt_tanggalsampai.getDate()));
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_toserba","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_pembelian WHERE tgl_pembelian BETWEEN '"+tanggaldari+"' AND DATE_ADD('"+tanggalsampai+"',INTERVAL 1 DAY)");
            System.out.println(tanggaldari);
            System.out.println(tanggalsampai);
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
                model.addRow(data);
            }
        }
        catch (SQLException ex){
            Logger.getLogger(History1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btn_submitMouseClicked

    private void btn_history4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_history4ActionPerformed
        new History1().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_history4ActionPerformed

    private void btn_setting4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setting4ActionPerformed
        new Setting().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_setting4ActionPerformed

    private void btn_master4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_master4ActionPerformed
        // TODO add your handling code here:
        new dataBarang().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_master4ActionPerformed

    private void btn_transaksi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksi4ActionPerformed
        new Penjualan().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_transaksi4ActionPerformed

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
            java.util.logging.Logger.getLogger(History1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History1().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_history4;
    private javax.swing.JButton btn_master4;
    private javax.swing.JButton btn_setting4;
    private javax.swing.JLabel btn_submit;
    private javax.swing.JButton btn_transaksi4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tb_detail;
    public static javax.swing.JTable tb_transaksi;
    private javax.swing.JLabel txt_namauser;
    private com.toedter.calendar.JDateChooser txt_tanggaldari;
    private com.toedter.calendar.JDateChooser txt_tanggalsampai;
    // End of variables declaration//GEN-END:variables
}
