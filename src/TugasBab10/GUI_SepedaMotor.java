/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBab10;



import TugasBab5.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mza
 */
public class GUI_SepedaMotor extends javax.swing.JFrame {

    String nama_dealer, alamat, jenis_otomotif, merek, model, tahun, harga;
    /**
     * Creates new form GUI_Otomotif
     */
    public GUI_SepedaMotor() {
        initComponents();
        tampil();
       tampil_dealer();
       tampil_dealer1();
       DefaultTableModel dataModel = (DefaultTableModel) Table_Sepeda.getModel();
        int rowCount = dataModel.getRowCount();
        while(rowCount > 0){
            dataModel.removeRow(rowCount - 1);
            rowCount = dataModel.getRowCount();
        }
    }
    
    public Connection conn;
    
    
    public void clear() {
        txt_jenis.setText("");
        txt_merek.setText("");
        txt_model.setText("");
        txt_tahun.setText("");
        txt_harga.setText("");
    }
    
    public void koneksi() throws SQLException {
        try {
            conn = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/OOP_2218029?user=root&password=");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_SepedaMotor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            Logger.getLogger(GUI_SepedaMotor.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception es) {
            Logger.getLogger(GUI_SepedaMotor.class.getName()).log(Level.SEVERE, null, es);
        }
    }

    public void tampil() {
        DefaultTableModel dataModel = new DefaultTableModel();
        dataModel.addColumn("Nama Dealer");
        dataModel.addColumn("Alamat");
        dataModel.addColumn("Jenis Otomotif");
        dataModel.addColumn("Merek");
        dataModel.addColumn("Model");
        dataModel.addColumn("Tahun");
        dataModel.addColumn("Harga");
        
        try {
            koneksi();
            String sql = "SELECT * FROM tb_sepedamotor";
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                dataModel.addRow(new Object[]{res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10),});
            }
            Table_Sepeda.setModel(dataModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "BELUM TERKONEKSI");
        }
    }

    public void tampil_dealer() {
        try {
            koneksi();
            String sql = "SELECT NamaDealer FROM tb_Dealer order by NamaDealer asc";
            Statement stt = conn.createStatement();
            ResultSet res = stt.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[3];
                ob[0] = res.getString(1);
                cmb_nama.addItem((String) ob[0]);
            }
            res.close();
            stt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void tampil_dealer1() {
        try {
            koneksi();
            String sql = "SELECT Alamat FROM tb_dealer order by Alamat asc";
            Statement stt = conn.createStatement();
            ResultSet res = stt.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[3];
                ob[0] = res.getString(1);
                cmb_alamat.addItem((String) ob[0]);
            }
            res.close();
            stt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void refresh() {
        new GUI_SepedaMotor().setVisible(true);
        this.setVisible(false);
    }

    public void insert() {
        String NamaDealer = (String) cmb_nama.getSelectedItem();
        String Alamat = (String) cmb_alamat.getSelectedItem();
        String JenisOtomotif = txt_jenis.getText();
        String Merek = txt_merek.getText();
        String Model = txt_model.getText();
        String Tahun = txt_tahun.getText();
        String Harga = txt_harga.getText();
        
        try {
            koneksi();
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO tb_sepedamotor(NamaDealer, Alamat, JenisOtomotif, Merek, Model, Tahun, Harga)"
                    + "VALUES('" + NamaDealer + "','" + Alamat + "','" + JenisOtomotif + "','" + Merek + "','" + Model + "','" + Tahun + "',"
                    + "'" + Harga + "')");
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Memasukan Data Nilai!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Input!");
        }
        refresh();
    }

    public void delete() {
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "DELETE FROM tb_sepedamotor WHERE Nama Dealer='" + cmb_nama.getSelectedItem() + "' AND Alamat='" + cmb_alamat.getSelectedItem() + "'";
                java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
                clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus");
            }
        }
    }

        void itempilih() {
        cmb_nama.setSelectedItem(nama_dealer);
        cmb_alamat.setSelectedItem(alamat);
        txt_jenis.setText(jenis_otomotif);
        txt_merek.setText(merek);
        txt_model.setText(model);
        txt_tahun.setText(tahun);
        txt_harga.setText(harga);
    }


    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_merek = new javax.swing.JTextField();
        txt_model = new javax.swing.JTextField();
        txt_tahun = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        btn_cetak = new javax.swing.JToggleButton();
        btn_keluar = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        txt_jenis = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Sepeda = new javax.swing.JTable();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_namaDealer = new javax.swing.JButton();
        cmb_nama = new javax.swing.JComboBox<>();
        btn_alamat = new javax.swing.JButton();
        cmb_alamat = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PENJUALAN OTOMOTIF");

        jLabel2.setText("Merek");

        jLabel3.setText("Model");

        jLabel4.setText("Tahun");

        jLabel5.setText("Harga");

        btn_cetak.setText("CETAK");
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });

        btn_keluar.setText("KELUAR");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        jLabel6.setText("Jenis");

        Table_Sepeda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Dealer", "Alamat", "Jenis Otomotif", "Merek", "Model", "Tahun", "Harga"
            }
        ));
        Table_Sepeda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_SepedaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table_Sepeda);

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_namaDealer.setText("Nama Dealer");
        btn_namaDealer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_namaDealerActionPerformed(evt);
            }
        });

        cmb_nama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Nama Dealer-" }));

        btn_alamat.setText("Alamat");
        btn_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alamatActionPerformed(evt);
            }
        });

        cmb_alamat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Alamat-" }));
        cmb_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_alamatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_merek)
                                    .addComponent(txt_model)
                                    .addComponent(txt_tahun)
                                    .addComponent(txt_harga, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(txt_jenis)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_namaDealer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_alamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmb_nama, 0, 143, Short.MAX_VALUE)
                                    .addComponent(cmb_alamat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_cetak)
                                .addGap(81, 81, 81)
                                .addComponent(btn_hapus)
                                .addGap(82, 82, 82)
                                .addComponent(btn_batal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_keluar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_namaDealer)
                            .addComponent(cmb_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_alamat)
                            .addComponent(cmb_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_merek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cetak)
                            .addComponent(btn_keluar)
                            .addComponent(btn_hapus)
                            .addComponent(btn_batal))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        insert();
    }//GEN-LAST:event_btn_cetakActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        delete();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        clear();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_namaDealerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_namaDealerActionPerformed
        new GUI_DealerMobil().setVisible(true);
    }//GEN-LAST:event_btn_namaDealerActionPerformed

    private void btn_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alamatActionPerformed
        // TODO add your handling code here:
        new GUI_DealerMobil().setVisible(true);
    }//GEN-LAST:event_btn_alamatActionPerformed

    private void Table_SepedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_SepedaMouseClicked
        // TODO add your handling code here:
        int tabel = Table_Sepeda.getSelectedRow(); //0
        nama_dealer = Table_Sepeda.getValueAt(tabel, 0).toString();
        alamat = Table_Sepeda.getValueAt(tabel, 1).toString();
        jenis_otomotif = Table_Sepeda.getValueAt(tabel, 2).toString();
        merek = Table_Sepeda.getValueAt(tabel, 3).toString();
        model = Table_Sepeda.getValueAt(tabel, 4).toString();
        tahun = Table_Sepeda.getValueAt(tabel, 5).toString();
        harga = Table_Sepeda.getValueAt(tabel, 6).toString();
        itempilih();

    }//GEN-LAST:event_Table_SepedaMouseClicked

    private void cmb_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_alamatActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_SepedaMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_SepedaMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_SepedaMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_SepedaMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GUI_SepedaMotor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Sepeda;
    private javax.swing.JButton btn_alamat;
    private javax.swing.JButton btn_batal;
    private javax.swing.JToggleButton btn_cetak;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JToggleButton btn_keluar;
    private javax.swing.JButton btn_namaDealer;
    private javax.swing.JComboBox<String> cmb_alamat;
    private javax.swing.JComboBox<String> cmb_nama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_jenis;
    private javax.swing.JTextField txt_merek;
    private javax.swing.JTextField txt_model;
    private javax.swing.JTextField txt_tahun;
    // End of variables declaration//GEN-END:variables
}
