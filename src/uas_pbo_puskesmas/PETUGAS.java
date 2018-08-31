/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pbo_puskesmas;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author BULE
 */
public class PETUGAS extends javax.swing.JFrame {
private Connection conn = new koneksi().connect();
private DefaultTableModel tabmode;
    /**
     * Creates new form PETUGAS
     */
    public PETUGAS() {
        initComponents();
        non_aktif();
        autoNumber();
        dataTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtjadwal = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        txttanggal = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcowok = new javax.swing.JRadioButton();
        txtcewek = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btntambah = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        txtnama = new javax.swing.JTextField();
        txttgl = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PETUGAS");

        jLabel2.setText("Kode Petugas");

        jLabel3.setText("Nama");

        txtjadwal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hari", "Senin", "Selasa", "Rabu", "Kamis", "Jum'at" }));
        txtjadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjadwalActionPerformed(evt);
            }
        });

        jLabel4.setText("Tanggal Lahir");

        jLabel5.setText("Jadwal/Hari/Tanggal");

        jLabel6.setText("Jenis Kelamin");

        buttonGroup1.add(txtcowok);
        txtcowok.setText("Laki - Laki");

        buttonGroup1.add(txtcewek);
        txtcewek.setText("Perempuan");

        jLabel7.setText("Alamat");

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.setAutoscrolls(false);
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        btntambah.setText("TAMBAH");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnbatal.setText("BATAL");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        btnexit.setText("EXIT");
        btnexit.setToolTipText("");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btntambah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnedit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnhapus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtcowok)
                                .addGap(18, 18, 18)
                                .addComponent(txtcewek))
                            .addComponent(jScrollPane1)
                            .addComponent(btnbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtjadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtnama)
                            .addComponent(txttanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(440, 440, 440))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtjadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcowok)
                            .addComponent(txtcewek))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(btntambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnedit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhapus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnbatal)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        btnedit.setEnabled(true);
        btnedit.setText("EDIT");
        int bar = tabel.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        java.util.Date tanggal;
        try {
        tanggal = new SimpleDateFormat("yyyy-MM-dd").parse(d);
        txttgl.setDate(tanggal);
        } catch (ParseException ex) {
        }
        
        String e = tabmode.getValueAt(bar, 4).toString();
        try {
        tanggal = new SimpleDateFormat("yyyy-MM-dd").parse(e);
        txttanggal.setDate(tanggal);
        } catch (ParseException ex) {
        }
        
        String f = tabmode.getValueAt(bar, 5).toString();
        if (f.equals("Laki - Laki")){ 
            txtcowok.setSelected(true);
        }else{
            txtcewek.setSelected(true);
        }      
        String g = tabmode.getValueAt(bar, 6).toString();
        txtkode.setText(a);
        txtnama.setText(b);
        txtjadwal.setSelectedItem(c);
        txtalamat.setText(g);
    }//GEN-LAST:event_tabelMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data",
            "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
    if(ok==0){
        String sql = "delete from petugas where id_petugas='"+txtkode.getText()+"'";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            kosong();
            txtkode.requestFocus();
            dataTabel();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus "+e);
        }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        String tombol = btntambah.getText();
    if (tombol.equals("TAMBAH")){
        aktif();
        kosong();
        btntambah.setText("SIMPAN");
        btnedit.setEnabled(false);
        btnhapus.setEnabled(false);
        autoNumber();
    }else{
    String tampilan ="yyyy-MM-dd" ; 
    SimpleDateFormat fm = new SimpleDateFormat(tampilan); 
    String tanggal = String.valueOf(fm.format(txttanggal.getDate()));
    String tgl = String.valueOf(fm.format(txttgl.getDate()));
    String JK;
        if(txtcowok.isSelected()){
            JK = txtcowok.getText();
        } else{
            JK = txtcewek.getText();
        }
          
        String sql = "insert into petugas values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtkode.getText());
            stat.setString(2, txtnama.getText());
            stat.setString(3, txtjadwal.getSelectedItem().toString());
            stat.setString(4, tgl);
            stat.setString(5, tanggal);
            stat.setString(6, JK);
            stat.setString(7, txtalamat.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            dataTabel();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan "+e);
            kosong();
        }
        btntambah.setText("TAMBAH");
        non_aktif();
    }
    }//GEN-LAST:event_btntambahActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        if (btnedit.getText()=="EDIT"){
        aktif();
        btnedit.setText("UPDATE");
        btnhapus.setEnabled(false);
    }else{
       String tampilan ="yyyy-MM-dd" ; 
        SimpleDateFormat fm = new SimpleDateFormat(tampilan); 
        String tanggal = String.valueOf(fm.format(txttanggal.getDate()));
        String tgl = String.valueOf(fm.format(txttgl.getDate()));
        String JK;
        if(txtcowok.isSelected()){
            JK = txtcowok.getText();
        } else{
            JK = txtcewek.getText();
        }
        String sql = "update petugas set nama_petugas=?, jadwal_petugas=?, tgl_jadwal_petugas=?, tgl_lahir_petugas=?, jenis_kelamin_petugas=? ,alamat_petugas=? where id_petugas='"+txtkode.getText()+"'";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtnama.getText());
            stat.setString(2, txtjadwal.getSelectedItem().toString());
            stat.setString(3, tgl);
            stat.setString(4, tanggal);
            stat.setString(5, JK);
            stat.setString(6, txtalamat.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
            kosong();
            dataTabel();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diupdate "+e);
        }
        btnedit.setText("EDIT");
        non_aktif();
    }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        kosong();
        non_aktif();
        btn_aktif();
    }//GEN-LAST:event_btnbatalActionPerformed
    
     private void btn_aktif(){
        btnhapus.setEnabled(true);
        btntambah.setEnabled(true);
        btntambah.setText("TAMBAH");
    }
    
    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtjadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjadwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjadwalActionPerformed
    
    private void dataTabel(){
        Object[] Baris ={"Kode","Nama","Jadwal/Hari","Jadwal/Tanggal","Tanggal Lahir","Jenis Kelamin","Alamat"};
        tabmode = new DefaultTableModel(null, Baris);
        tabel.setModel(tabmode);
        String sql = "SELECT * FROM petugas";
        try {
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String kode = hasil.getString("id_petugas");
                String nama = hasil.getString("nama_petugas");
                String jadwal = hasil.getString("jadwal_petugas");
                String tgl = hasil.getString("tgl_jadwal_petugas");
                String tanggal = hasil.getString("tgl_lahir_petugas");
                String jenis = hasil.getString("jenis_kelamin_petugas");
                String alamat = hasil.getString("alamat_petugas");
                String[] data={kode,nama,jadwal,tgl,tanggal,jenis,alamat};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }
    
    private void autoNumber() { //jika field id_jenis di database bukan autoincrement
        try {
            String sql = "SELECT * FROM petugas ORDER BY id_petugas DESC";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet rs = stat.executeQuery(sql);
            if (rs.next()) {
                String kd = rs.getString("id_petugas").substring(1);
                String AN = "" + (Integer.parseInt(kd) + 1);
                String Nol = "";

                if(AN.length()==1){
                    Nol = "000";}
                else if(AN.length()==2){
                    Nol = "00";}
                else if(AN.length()==3){
                    Nol = "0";}
                else if(AN.length()==4){
                    Nol = "";}
                txtkode.setText("T" + Nol + AN);//sesuaikan dengan variable namenya
            } else {
                txtkode.setText("T0001");//sesuaikan dengan variable namenya
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();//penanganan masalah
        }
    }
    
    
     private void non_aktif(){
        txtkode.setEnabled(false);
        txtjadwal.setEnabled(false);
        txttanggal.setEnabled(false);
        txtcowok.setEnabled(false);
        txtcewek.setEnabled(false);
        txtalamat.setEnabled(false);
        btnedit.setEnabled(false);
        txtnama.setEnabled(false);
        txttgl.setEnabled(false);
        btnhapus.setEnabled(false);
    }
     private void aktif(){
        txtalamat.setEnabled(true);
        txtjadwal.setEnabled(true);
        txtcowok.setEnabled(true);
        txtcewek.setEnabled(true);
        txttanggal.setEnabled(true);
        txtnama.setEnabled(true);
        txttgl.setEnabled(true);
    }
    private void kosong(){
        txtkode.setText("");
        txtalamat.setText("");
        txtjadwal.setSelectedItem("Hari");
        buttonGroup1.clearSelection();
        Date tgl = new Date();
        txttanggal.setDate(tgl);
        txttgl.setDate(tgl); 
        txtnama.setText("");
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
            java.util.logging.Logger.getLogger(PETUGAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PETUGAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PETUGAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PETUGAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PETUGAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btntambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JRadioButton txtcewek;
    private javax.swing.JRadioButton txtcowok;
    private javax.swing.JComboBox<String> txtjadwal;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    private com.toedter.calendar.JDateChooser txttanggal;
    private com.toedter.calendar.JDateChooser txttgl;
    // End of variables declaration//GEN-END:variables
}