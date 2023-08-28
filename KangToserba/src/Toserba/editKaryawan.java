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
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Satria Yuda
 */
public class editKaryawan extends javax.swing.JFrame {

    /**
     * Creates new form editKaryawan
     */
    public editKaryawan() {
        initComponents();
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sinarharapanpos","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tb_karyawan WHERE id_karyawan ='"+dataKaryawan.selectedKaryawanID+"'");
            while(rs.next()){
                txt_idkaryawan.setText(rs.getString("id_karyawan"));
                txt_nama.setText(rs.getString("nama_karyawan"));
                cmb_jeniskelamin.setSelectedItem(rs.getString("jenis_kelamin"));
                txt_tanggallahir.setDate(rs.getDate("tgl_lahir"));
                txt_nohp.setText(rs.getString("no_hp"));
                txt_alamat.setText(rs.getString("alamat"));
                txt_email.setText(rs.getString("email"));
            }
        }
        catch (SQLException ex){
            Logger.getLogger(dataKaryawan.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        cmb_jeniskelamin = new javax.swing.JComboBox<>();
        txt_nohp = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        txt_idkaryawan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_tanggallahir = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Edit Karyawan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setText("Nama");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel3.setText("Jenis Kelamin");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel6.setText("Tanggal lahir");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel7.setText("No. Hp");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel8.setText("Alamat");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel4.setText("E-Mail");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));
        jPanel1.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 166, -1));

        cmb_jeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        jPanel1.add(cmb_jeniskelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 166, -1));

        txt_nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nohpActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 166, -1));

        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });
        jPanel1.add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 166, -1));

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 166, -1));

        btn_submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toserba/icon/Group 14(1).png"))); // NOI18N
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 145, 29));

        txt_idkaryawan.setEnabled(false);
        jPanel1.add(txt_idkaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 166, -1));

        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        txt_tanggallahir.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(txt_tanggallahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nohpActionPerformed

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sinarharapanpos","root","");
            String idkaryawan=txt_idkaryawan.getText();
            String nama=txt_nama.getText();
            String jk=cmb_jeniskelamin.getSelectedItem().toString();
            String tampilan = "yyyy-MM-dd";
            SimpleDateFormat fm = new SimpleDateFormat(tampilan);
            String tanggallahir = String.valueOf(fm.format(txt_tanggallahir.getDate()));
            try{
               Long.parseLong(txt_nohp.getText());
            String nohp=txt_nohp.getText();
            String alamat=txt_alamat.getText();
            String email=txt_email.getText();
            PreparedStatement ps = con.prepareStatement("UPDATE tb_karyawan SET nama_karyawan ='"+nama+"', jenis_kelamin = '"+jk+"', alamat = '"+alamat+"', no_hp='"+nohp+"', email = '"+email+"' , tgl_lahir = '"+tanggallahir+"'WHERE id_karyawan = '"+idkaryawan+"'");
            ps.execute();
            JOptionPane.showMessageDialog(null,"Data karyawan berhasil diedit");
            dataKaryawan.tampilkan();
            dispose();
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(this, "Masukkan Nomor HP dengan benar");
            }
        }
        catch (SQLException ex){
            Logger.getLogger(dataBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_submitActionPerformed

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
            java.util.logging.Logger.getLogger(editKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> cmb_jeniskelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_idkaryawan;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nohp;
    public static com.toedter.calendar.JDateChooser txt_tanggallahir;
    // End of variables declaration//GEN-END:variables
}
