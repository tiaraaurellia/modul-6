/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author Rara ^___^
 */
public class array extends javax.swing.JFrame {

    /**
     * Creates new form array
     */
    public array() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dok = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        usia = new javax.swing.JTextField();
        jenis = new javax.swing.JTextField();
        goldar = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        kewar = new javax.swing.JTextField();
        waktu = new javax.swing.JTextField();
        dokter = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Pemilihan dokter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 130, 40);

        jLabel2.setText("Pilih dokter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 60, 70, 20);

        dok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih Salah Satu---", "DR. Keyla", "DR. Aurell", "DR. Ihza" }));
        dok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokActionPerformed(evt);
            }
        });
        getContentPane().add(dok);
        dok.setBounds(140, 60, 150, 30);

        jLabel3.setText("Identitas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 110, 80, 20);

        jLabel4.setText("Nama");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 140, 60, 20);
        getContentPane().add(nama);
        nama.setBounds(160, 140, 160, 30);
        getContentPane().add(alamat);
        alamat.setBounds(160, 180, 160, 30);
        getContentPane().add(usia);
        usia.setBounds(160, 220, 160, 30);
        getContentPane().add(jenis);
        jenis.setBounds(160, 260, 160, 30);
        getContentPane().add(goldar);
        goldar.setBounds(160, 300, 160, 30);
        getContentPane().add(status);
        status.setBounds(160, 340, 160, 30);
        getContentPane().add(kewar);
        kewar.setBounds(160, 380, 160, 30);
        getContentPane().add(waktu);
        waktu.setBounds(160, 420, 160, 30);
        getContentPane().add(dokter);
        dokter.setBounds(160, 460, 160, 30);

        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 180, 60, 20);

        jLabel6.setText("Usia");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 220, 60, 20);

        jLabel7.setText("Jenis kelamin");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 260, 80, 20);

        jLabel8.setText("Golongan darah");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 300, 90, 20);

        jLabel9.setText("Status");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 340, 90, 20);

        jLabel10.setText("Kewarganegaraan");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 380, 100, 20);

        jLabel11.setText("Waktu Praktek");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 420, 90, 20);

        jLabel12.setText("Dokter Spesialis");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(60, 460, 90, 20);

        setBounds(0, 0, 434, 628);
    }// </editor-fold>//GEN-END:initComponents

    private void dokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokActionPerformed
        // TODO add your handling code here:
        if(dok.getSelectedItem().equals("DR. Keyla")){
            nama.setText("DR. Keyla ");
            alamat.setText("Jl. Sekarpuro 16, Malang");
            usia.setText("20 Tahun");
            jenis.setText("Perempuan");
            goldar.setText("A");
            status.setText("Belum Menikah ");
            kewar.setText("Indonesia");
            dokter.setText("Dokter Umum");
            waktu.setText(" Pagi (07.00-15.00)");
        }
        else if(dok.getSelectedItem().equals("DR. Aurell")){
            nama.setText("DR. Aurell");
            alamat.setText("Jl. Ijen 3, Malang");
            usia.setText("19 Tahun");
            jenis.setText("Perempuan");
            goldar.setText("O");
            status.setText("Belum Menikah");
            kewar.setText("Indonesia");
            dokter.setText("Dokter Bedah");
            waktu.setText(" Sore (16.00-22.00)");
        }
        else if(dok.getSelectedItem().equals("DR. Ihza")){
            nama.setText("DR. Ihza");
            alamat.setText("Jl. Bandung 9, Malang");
            usia.setText("21 Tahun");
            jenis.setText("Laki-Laki");
            goldar.setText("B");
            status.setText("Belum Menikah");
            kewar.setText("Indonesia");
            dokter.setText("Dokter Gizi");
            waktu.setText(" Malam (22.00-06.00)");
        }
    }//GEN-LAST:event_dokActionPerformed

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
            java.util.logging.Logger.getLogger(array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new array().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JComboBox<String> dok;
    private javax.swing.JTextField dokter;
    private javax.swing.JTextField goldar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jenis;
    private javax.swing.JTextField kewar;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField status;
    private javax.swing.JTextField usia;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables
}
