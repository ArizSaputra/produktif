/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Toserba;

/**
 *
 * @author Ariz
 */
public class Dashboard1 extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard1
     */
        public Dashboard1{
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_barang = new javax.swing.JLabel();
        btn_karyawan = new javax.swing.JLabel();
        btn_supplier = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JLabel();
        btn_tambahjenis = new javax.swing.JLabel();
        btn_hapusjenis = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_barang = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_jenisbarang = new javax.swing.JTable();
        txt_namauser = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_history4 = new javax.swing.JButton();
        btn_setting4 = new javax.swing.JButton();
        btn_transaksi4 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btn_master5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_barang.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btn_barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/data45.png"))); // NOI18N
        btn_barang.setText(" ");
        btn_barang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_barang.setIconTextGap(1);
        btn_barang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        txt_namauser.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        txt_namauser.setForeground(new java.awt.Color(255, 255, 255));
        txt_namauser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_namauser.setText("USERNAME");

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));

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

        jPanel20.setBackground(new java.awt.Color(87, 101, 116));

        jPanel21.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/shops100.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TOSERBA");

        jPanel12.setBackground(new java.awt.Color(87, 101, 116));

        btn_master5.setBackground(new java.awt.Color(102, 102, 102));
        btn_master5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btn_master5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/master32.png"))); // NOI18N
        btn_master5.setText("   Master");
        btn_master5.setBorderPainted(false);
        btn_master5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_master5.setMargin(new java.awt.Insets(2, 14, 2, 45));
        btn_master5.setMaximumSize(new java.awt.Dimension(70, 23));
        btn_master5.setMinimumSize(new java.awt.Dimension(70, 23));
        btn_master5.setPreferredSize(new java.awt.Dimension(70, 23));
        btn_master5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_master5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(btn_transaksi4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(231, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(680, 680, 680)
                            .addComponent(txt_namauser, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_setting4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btn_history4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(130, 130, 130)
                                            .addComponent(btn_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(120, 120, 120)
                                            .addComponent(btn_hapusjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addComponent(btn_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(btn_barang))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(btn_tambahjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(290, 290, 290)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(589, Short.MAX_VALUE)
                    .addComponent(btn_master5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(221, 221, 221)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(btn_transaksi4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_namauser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(370, 370, 370)
                            .addComponent(btn_setting4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(310, 310, 310)
                            .addComponent(btn_history4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(btn_hapusjenis))
                                .addComponent(btn_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(450, 450, 450)
                                    .addComponent(btn_tambahjenis))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(233, 233, 233)
                    .addComponent(btn_master5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(317, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_karyawanMouseClicked
        new dataKaryawan().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_karyawanMouseClicked

    private void btn_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_supplierMouseClicked
        new dataSupplier().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_supplierMouseClicked

    private void btn_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseClicked
        new tambahBarang().setVisible(true);
    }//GEN-LAST:event_btn_tambahMouseClicked

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

    private void tb_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_barangMouseClicked
        int row = tb_barang.getSelectedRow();
        String barang = tb_barang.getValueAt(row, 0).toString();
        this.selectedBarangID = barang;
    }//GEN-LAST:event_tb_barangMouseClicked

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

    private void btn_history4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_history4ActionPerformed
        new History().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_history4ActionPerformed

    private void btn_setting4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setting4ActionPerformed
        new Setting().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_setting4ActionPerformed

    private void btn_transaksi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksi4ActionPerformed
        new Penjualan().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_transaksi4ActionPerformed

    private void btn_master5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_master5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_master5ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_barang;
    private javax.swing.JLabel btn_hapusjenis;
    private javax.swing.JButton btn_history4;
    private javax.swing.JLabel btn_karyawan;
    private javax.swing.JButton btn_master5;
    private javax.swing.JButton btn_setting4;
    private javax.swing.JLabel btn_supplier;
    private javax.swing.JLabel btn_tambah;
    private javax.swing.JLabel btn_tambahjenis;
    private javax.swing.JButton btn_transaksi4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tb_barang;
    private static javax.swing.JTable tb_jenisbarang;
    private javax.swing.JLabel txt_namauser;
    // End of variables declaration//GEN-END:variables
}