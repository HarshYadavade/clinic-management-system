package ADMIN;

import Connect.Connectionpro ;
import java.sql.* ;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Patient_Reg extends javax.swing.JFrame {

    public Patient_Reg() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jComboBox2 = new javax.swing.JComboBox<>();
        textarea = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 150, 30));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PATIENT REGISTRATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 460, 40));

        jLabel13.setBackground(new java.awt.Color(255, 204, 204));
        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/AUPBG.jpg"))); // NOI18N
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1070, 40));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setText("NAME:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setText("EMAIL Address:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setText("MOBILE NO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel11.setText("ADDRESS:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setText("BLOOD GROUP");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setText("AADHAR CARD NO:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setText("BIRTH DATE(DDMMYYYY):");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel7.setText("GENDER:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, -1, -1));

        jButton4.setText("CLEAR");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));

        jButton5.setText("CANCEL");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, -1, -1));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 500, 30));

        jComboBox1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jComboBox1.setSelectedItem(null);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 100, 30));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setText("USERNAME:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jScrollPane7.setViewportView(jTextPane7);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 500, 30));

        jScrollPane5.setViewportView(jTextPane5);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 500, 60));

        jScrollPane4.setViewportView(jTextPane4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 180, 30));

        jScrollPane3.setViewportView(jTextPane3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 500, 30));

        jTextPane2.setBorder(null);
        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 500, 30));

        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 280, 30));

        jComboBox2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A +ve", "A -ve", "B +ve", "B-ve", "O +ve", "O -ve", "AB +ve", "AB -ve" }));
        jComboBox2.setSelectedItem(null);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 160, 40));

        textarea.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        getContentPane().add(textarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 280, 30));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/BG.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        jTextPane1.setText("");
        jTextPane2.setText("");
        jTextPane3.setText("");
        jTextPane4.setText("");
        jTextPane5.setText("");
        jPasswordField1.setText("");
        jTextPane7.setText("");
        jComboBox1.setSelectedItem(null);
        jComboBox2.setSelectedItem(null);
        jDateChooser2.setCalendar(null);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Manage_pat  pt =new Manage_pat();
        pt.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextPane1.getText().length()==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
   else if(jTextPane2.getText().length()==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
    else if(jTextPane3.getText().length()==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
     else if(jTextPane4.getText().length()==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
      else if(jTextPane5.getText().length()==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
       else if(jPasswordField1.getText().length()==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
        else if(jTextPane7.getText().length()==0)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
          else if(jComboBox1.getSelectedItem()== null)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
            else if(jComboBox2.getSelectedItem()== null)  // Checking for empty field
      JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
   else{
        String name=jTextPane2.getText();
        String email=jTextPane3.getText();
        String contact=jTextPane4.getText();
        String address=jTextPane5.getText();
        String username=jTextPane7.getText();
        String aadhar=jTextPane1.getText();
        String password=jPasswordField1.getText();
        String gender=(String)jComboBox1.getSelectedItem();
        String bloodgroup = (String)jComboBox2.getSelectedItem();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        String birth = sdf.format(jDateChooser2.getDate());
          String sql = "insert into pat_reg(name,email,contact,address,username,adhar_no,dob,gender,password,bloodgroup) values (?,?,?,?,?,?,?,?,?,?)";
            try {
                Connection con= Connectionpro.getCon();
                
                PreparedStatement prp = con.prepareStatement(sql);
                prp.setString(1, name);
                prp.setString(2, email);
                prp.setString(3, contact);
                prp.setString(4, address);
                prp.setString(5, username);
                prp.setString(6, aadhar);
                prp.setString(7, birth);
                prp.setString(8, gender);
                prp.setString(9, password);
                prp.setString(10,bloodgroup);
                prp.execute();
                JOptionPane.showMessageDialog(null, "Data Saved");
                jTextPane1.setText("");
                jTextPane2.setText("");
                jTextPane3.setText("");
                jTextPane4.setText("");
                jTextPane5.setText("");
                jPasswordField1.setText("");
                jTextPane7.setText("");
                jComboBox1.setSelectedItem(null);
                jComboBox2.setSelectedItem(null);
                jDateChooser2.setCalendar(null);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Patient_Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_Reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JLabel textarea;
    // End of variables declaration//GEN-END:variables

}
