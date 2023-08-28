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
import javax.swing.table.DefaultTableModel;
import static Toserba.Setting.namauser;
import static Toserba.Setting.txt_namauser;

/**
 *
 * @author ACER
 */

public class dataBarang extends javax.swing.JFrame {

    /**
     * Creates new form dataBarang
     */
    static DefaultTableModel model;
    static String selectedJenisID;
    static String selectedBarangID;
    static String namauser;
    
    public dataBarang() {
        initComponents();
        txt_namauser.setText(namauser);
        tampilkanjenis();
        this.selectedBarangID = null;
        this.selectedJenisID = null;
    }
    public static void tampilkanjenis() {
        String [] judul = {"ID","Jenis Barang"};
        model = new DefaultTableModel(judul,0);
        tb_jenisbarang.setModel(model);
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sinarharapanpos","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_jenis_barang");
            while(rs.next()){
                String data [] = {rs.getString("id_jenis"), rs.getString("nama_jenis")};
                model.addRow(data);
            }
        }
        catch (SQLException ex){
            Logger.getLogger(dataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void tampilkanbarang() {
        String [] judul = {"ID","Nama Produk","Kuantitas","Harga Beli","Harga Jual"};
        model = new DefaultTableModel(judul,0);
        tb_barang.setModel(model);
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sinarharapanpos","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_barang WHERE id_jenis='"+selectedJenisID+"'");
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
                model.addRow(data);
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

        btn_history1 = new javax.swing.JButton();
        btn_setting1 = new javax.swing.JButton();
        btn_master1 = new javax.swing.JButton();
        btn_transaksi1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Profil2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnl_barang = new javax.swing.JPanel();
        btn_barang = new javax.swing.JLabel();
        btn_karyawan = new javax.swing.JLabel();
        btn_supplier = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JLabel();
        btn_edit = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JLabel();
        btn_tambahjenis = new javax.swing.JLabel();
        btn_hapusjenis = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_barang = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_jenisbarang = new javax.swing.JTable();
        txt_namauser = new javax.swing.JLabel();
        Profil1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btn_history4 = new javax.swing.JButton();
        btn_setting4 = new javax.swing.JButton();
        btn_master4 = new javax.swing.JButton();
        btn_transaksi4 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();

        btn_history1.setBackground(new java.awt.Color(0, 153, 153));
        btn_history1.setText("History");
        btn_history1.setFocusable(false);
        btn_history1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_history1ActionPerformed(evt);
            }
        });

        btn_setting1.setBackground(new java.awt.Color(0, 153, 153));
        btn_setting1.setText("Setting");
        btn_setting1.setFocusable(false);
        btn_setting1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setting1ActionPerformed(evt);
            }
        });

        btn_master1.setBackground(new java.awt.Color(0, 102, 102));
        btn_master1.setText("Master");
        btn_master1.setMaximumSize(new java.awt.Dimension(70, 23));
        btn_master1.setMinimumSize(new java.awt.Dimension(70, 23));
        btn_master1.setPreferredSize(new java.awt.Dimension(70, 23));
        btn_master1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_master1ActionPerformed(evt);
            }
        });

        btn_transaksi1.setBackground(new java.awt.Color(0, 153, 153));
        btn_transaksi1.setText("Transaksi");
        btn_transaksi1.setFocusable(false);
        btn_transaksi1.setIconTextGap(1);
        btn_transaksi1.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btn_transaksi1.setMaximumSize(new java.awt.Dimension(70, 23));
        btn_transaksi1.setMinimumSize(new java.awt.Dimension(70, 23));
        btn_transaksi1.setPreferredSize(new java.awt.Dimension(70, 23));
        btn_transaksi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksi1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        Profil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/LogoSHP (3).png"))); // NOI18N
        jPanel2.add(Profil2);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_barang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_barang.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/data45.png"))); // NOI18N
        btn_barang.setText(" ");
        btn_barang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_barang.setIconTextGap(1);
        btn_barang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnl_barang.add(btn_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, 70));

        btn_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/karyawan45.png"))); // NOI18N
        btn_karyawan.setText("employee");
        btn_karyawan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_karyawan.setIconTextGap(1);
        btn_karyawan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_karyawanMouseClicked(evt);
            }
        });
        pnl_barang.add(btn_karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 60, 70));

        btn_supplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/supplier45.png"))); // NOI18N
        btn_supplier.setText("Suppliers");
        btn_supplier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_supplier.setIconTextGap(1);
        btn_supplier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_supplierMouseClicked(evt);
            }
        });
        pnl_barang.add(btn_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 70, 70));

        btn_tambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/plus45.png"))); // NOI18N
        btn_tambah.setText("Add");
        btn_tambah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_tambah.setIconTextGap(1);
        btn_tambah.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahMouseClicked(evt);
            }
        });
        pnl_barang.add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, 50, 60));

        btn_edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/edit.png"))); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_edit.setIconTextGap(1);
        btn_edit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editMouseClicked(evt);
            }
        });
        pnl_barang.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 50, 70));

        btn_hapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/delete45.png"))); // NOI18N
        btn_hapus.setText("Delete");
        btn_hapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_hapus.setIconTextGap(1);
        btn_hapus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapusMouseClicked(evt);
            }
        });
        pnl_barang.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 500, 50, 60));

        btn_tambahjenis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_tambahjenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/icons8-add-folder-40.png"))); // NOI18N
        btn_tambahjenis.setText("Add type");
        btn_tambahjenis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_tambahjenis.setIconTextGap(1);
        btn_tambahjenis.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_tambahjenis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahjenisMouseClicked(evt);
            }
        });
        pnl_barang.add(btn_tambahjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 80, -1));

        btn_hapusjenis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_hapusjenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/icons8-delete-folder-40.png"))); // NOI18N
        btn_hapusjenis.setText("Delete type");
        btn_hapusjenis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_hapusjenis.setIconTextGap(1);
        btn_hapusjenis.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_hapusjenis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapusjenisMouseClicked(evt);
            }
        });
        pnl_barang.add(btn_hapusjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 70, -1));

        tb_barang = new javax.swing.JTable() {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        tb_barang.setBackground(new java.awt.Color(87, 101, 116));
        tb_barang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tb_barang.setForeground(new java.awt.Color(255, 255, 255));
        tb_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Neme of goods", "Quantity", "Purchase price", "Selling price"
            }
        ));
        tb_barang.setGridColor(new java.awt.Color(255, 255, 255));
        tb_barang.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tb_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_barangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_barang);

        pnl_barang.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 490, 380));

        tb_jenisbarang = new javax.swing.JTable() {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        tb_jenisbarang.setBackground(new java.awt.Color(87, 101, 116));
        tb_jenisbarang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tb_jenisbarang.setForeground(new java.awt.Color(255, 255, 255));
        tb_jenisbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Types of goods"
            }
        ));
        tb_jenisbarang.setGridColor(new java.awt.Color(153, 153, 153));
        tb_jenisbarang.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tb_jenisbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_jenisbarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_jenisbarang);

        pnl_barang.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 270, 380));

        txt_namauser.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        txt_namauser.setForeground(new java.awt.Color(255, 255, 255));
        txt_namauser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_namauser.setText("USERNAME");
        pnl_barang.add(txt_namauser, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 290, 40));

        Profil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/profil kecil.png"))); // NOI18N
        pnl_barang.add(Profil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 40, 40));

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        pnl_barang.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 790, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        pnl_barang.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 790, 530));

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
        pnl_barang.add(btn_history4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 50));

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
        pnl_barang.add(btn_setting4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 220, 50));

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
        pnl_barang.add(btn_master4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 50));

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
        pnl_barang.add(btn_transaksi4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 50));

        jPanel20.setBackground(new java.awt.Color(87, 101, 116));
        pnl_barang.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 40));

        jPanel21.setBackground(new java.awt.Color(0, 0, 0));
        pnl_barang.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/shops100.png"))); // NOI18N
        pnl_barang.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TOSERBA");
        pnl_barang.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 100, 30));

        jPanel12.setBackground(new java.awt.Color(87, 101, 116));
        pnl_barang.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 560));

        getContentPane().add(pnl_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_karyawanMouseClicked
        new dataKaryawan().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_karyawanMouseClicked

    private void btn_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_supplierMouseClicked
        new dataSupplier().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_supplierMouseClicked

    private void btn_tambahjenisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahjenisMouseClicked
        new tambahJenisBarang().setVisible(true);
    }//GEN-LAST:event_btn_tambahjenisMouseClicked

    private void btn_hapusjenisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusjenisMouseClicked
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sinarharapanpos","root","");
            PreparedStatement ps = con.prepareStatement("DELETE FROM tb_jenis_barang WHERE id_jenis = '"+this.selectedJenisID+"'");
            ps.execute();
            JOptionPane.showMessageDialog(null,"jenis berhasil dihapus");
            this.tampilkanjenis();
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Tidak bisa dihapus karena masih terdapat data barang didalamnya");
            Logger.getLogger(dataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_hapusjenisMouseClicked

    private void btn_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseClicked
        new tambahBarang().setVisible(true);
    }//GEN-LAST:event_btn_tambahMouseClicked

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        if(selectedBarangID != null){
        new editBarang().setVisible(true);
        } else JOptionPane.showMessageDialog(null,"Pilih barang terlebih dahulu");
    }//GEN-LAST:event_btn_editMouseClicked

    private void tb_jenisbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_jenisbarangMouseClicked
        //mendapatkan id jenis
        int row = tb_jenisbarang.getSelectedRow();
        String jenisbarang = tb_jenisbarang.getValueAt(row, 0).toString();
        //*
        //memasukkan nilai id jenis ke variabel global
        this.selectedJenisID = jenisbarang;
        //*
        //setting tabel
        String judul [] = {"ID","Nama Produk","Kuantitas","Harga Beli","Harga Jual"};
        model = new DefaultTableModel(judul,0);
        tb_barang.setModel(model);
        //*
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sinarharapanpos","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_barang WHERE id_jenis = '"+jenisbarang+"'");
            while(rs.next()){ 
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
                model.addRow(data);
            }
        }
        catch (SQLException ex){
            Logger.getLogger(dataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_jenisbarangMouseClicked

    private void tb_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_barangMouseClicked
        int row = tb_barang.getSelectedRow();
        String barang = tb_barang.getValueAt(row, 0).toString();
        this.selectedBarangID = barang;
    }//GEN-LAST:event_tb_barangMouseClicked

    private void btn_hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseClicked
        
      try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sinarharapanpos","root","");
            PreparedStatement ps = con.prepareStatement("DELETE FROM tb_barang WHERE id_barang = '"+this.selectedBarangID+"'");
            ps.execute();
            JOptionPane.showMessageDialog(null,"data berhasil dihapus");
            this.tampilkanbarang();
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Tidak bisa dihapus karena terdapat data barang yang digunakan pada transaksi");
            Logger.getLogger(dataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_hapusMouseClicked

    private void btn_history1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_history1ActionPerformed
        new History().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_history1ActionPerformed

    private void btn_setting1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setting1ActionPerformed
        new Setting().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_setting1ActionPerformed

    private void btn_master1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_master1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_master1ActionPerformed

    private void btn_transaksi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksi1ActionPerformed
        new Penjualan().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_transaksi1ActionPerformed

    private void btn_history4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_history4ActionPerformed
        new Dashboard2().setVisible(true);
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
            java.util.logging.Logger.getLogger(dataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Profil1;
    private javax.swing.JLabel Profil2;
    private javax.swing.JLabel btn_barang;
    private javax.swing.JLabel btn_edit;
    private javax.swing.JLabel btn_hapus;
    private javax.swing.JLabel btn_hapusjenis;
    private javax.swing.JButton btn_history1;
    private javax.swing.JButton btn_history4;
    private javax.swing.JLabel btn_karyawan;
    private javax.swing.JButton btn_master1;
    private javax.swing.JButton btn_master4;
    private javax.swing.JButton btn_setting1;
    private javax.swing.JButton btn_setting4;
    private javax.swing.JLabel btn_supplier;
    private javax.swing.JLabel btn_tambah;
    private javax.swing.JLabel btn_tambahjenis;
    private javax.swing.JButton btn_transaksi1;
    private javax.swing.JButton btn_transaksi4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnl_barang;
    public static javax.swing.JTable tb_barang;
    private static javax.swing.JTable tb_jenisbarang;
    private javax.swing.JLabel txt_namauser;
    // End of variables declaration//GEN-END:variables
}