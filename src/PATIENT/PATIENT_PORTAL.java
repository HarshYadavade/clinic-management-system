package PATIENT;

import AMJH_CMS.Login1;
import Connect.Connectionpro;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.*;
import javax.swing.JOptionPane;

public class PATIENT_PORTAL extends javax.swing.JFrame {
//Getting Username and Name From Previos Page
    public void patusername(String patuname) {
                                            patientusername.setText(patuname);
                                       }
    public void patname(String patname) {
                                            patientname.setText(patname);
                                      }
//end    
    public PATIENT_PORTAL() {
        initComponents();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        patientname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        patientusername = new javax.swing.JLabel();
        ndate = new javax.swing.JLabel();
        ntime = new javax.swing.JLabel();
        ndrname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0,0,0,80));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NEXT");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 38, 128, 20));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SESSION");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 64, 128, 23));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 120));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 130, 120));

        jPanel2.setBackground(new java.awt.Color(0,0,0,80));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PREVIOUS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 40, 128, 22));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SESSIONS");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 68, 128, 23));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 130, 120));

        jPanel1.setBackground(new java.awt.Color(0,0,0,80));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOOK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 29, 128, 20));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("APPOINTMENT");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 60, 128, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 130, 120));

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("RECOVERY");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 110, -1));

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("SET");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 12, 110, -1));

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("OPTION");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 110, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 110, 90));

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("PASSWORD");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 48, 108, -1));

        jLabel18.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("CHANGE");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 108, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 110, 90));

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/MYPR.png"))); // NOI18N
        jLabel20.setText("jLabel10");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 80));

        jLabel21.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel21.setText("MY PROFILE");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 90, 90, 30));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 120));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 120, 120));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton3.setText("LOGOUT <");
        jButton3.setBorder(null);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 90, 40));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel9.setText("WELCOME");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 160, 40));

        patientname.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        getContentPane().add(patientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 580, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loup.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 120));

        BG.setBackground(new java.awt.Color(204, 255, 204));
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/BG.jpg"))); // NOI18N
        BG.setOpaque(true);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));
        getContentPane().add(patientusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 40));

        ndate.setText("jLabel3");
        getContentPane().add(ndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 130, -1, -1));

        ntime.setText("jLabel3");
        getContentPane().add(ntime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 170, -1, -1));

        ndrname.setText("jLabel3");
        getContentPane().add(ndrname, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
       String patname = patientname.getText();
       String patuname = patientusername.getText();
       UPLOADREPORTS UR = new UPLOADREPORTS();
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
       LocalDateTime now = LocalDateTime.now();
       String currentdate = dtf.format(now);
       try{
            Connection con= Connectionpro.getCon();
            Statement stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from appointment where username = '"+patuname+"'and date >= '"+currentdate+"'");
            while(rs.next()){
                ndate.setText(rs.getString("date"));
                ntime.setText(rs.getString("timing"));
                ndrname.setText(rs.getString("doctorname"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "no data");
        }
       String nextdate = ndate.getText();
       String atime = ntime.getText();
       String adrname = ndrname.getText();
       UR.ndate(nextdate);
       UR.patname(patname);
       UR.drname(adrname);
       UR.patusername(patuname);
       UR.stime(atime);
       UR.setVisible(true);
       dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       BOOKAPPOINTMENT BA = new BOOKAPPOINTMENT();
       String patname = patientname.getText();
       String patuname = patientusername.getText();
       BA.patname(patname);
       BA.patusername(patuname);
       BA.setVisible(true);
       dispose();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Login1 lo =new Login1();
        lo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
       SetRecovery sr = new SetRecovery();
       String patname = patientname.getText();
       String patuname = patientusername.getText();
       sr.patname(patname);
       sr.patusername(patuname);
       sr.setVisible(true);
       dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        HISTORY his =new HISTORY();
        String patname = patientname.getText();
        String patuname = patientusername.getText();
        his.patname(patname);
        his.patusername(patuname);
        his.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
       Patientpass pp = new Patientpass();
       String patname = patientname.getText();
       String patuname = patientusername.getText();
       pp.patname(patname);
       pp.patusername(patuname);
       pp.setVisible(true);
       dispose();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        String pat_name=patientname.getText();
        Connection con = Connectionpro.getCon();
        try{
                
                Statement stmt = con.createStatement();
                String sql="select * from pat_reg where name = '"+ pat_name +"'";
                ResultSet rs = stmt.executeQuery(sql);
                    if(rs.next()){
                        String mprname = rs.getString("name");
                        String mpremail = rs.getString("email");
                        String mprcont = rs.getString("contact");
                        String mpradd = rs.getString("address");
                        String mprus = rs.getString("username");
                        String mpradhar = rs.getString("adhar_no");
                        String mprdob = rs.getString("dob");
                        String mprgen = rs.getString("gender");
                        String mprblood = rs.getString("bloodgroup");
                        MyPropat mpdr = new MyPropat();
                        mpdr.mprnam(mprname);
                        mpdr.mpremai(mpremail);
                        mpdr.mprcon(mprcont);
                        mpdr.mprad(mpradd);
                        mpdr.mpru(mprus);
                        mpdr.mpradha(mpradhar);
                        mpdr.mprdo(mprdob);
                        mpdr.mprge(mprgen);
                        mpdr.mprbloo(mprblood);
                        String patname = patientname.getText();
                        String patuname = patientusername.getText();
                        mpdr.patname(patname);
                        mpdr.patusername(patuname);
                        mpdr.setVisible(true);
                        dispose();
                }
                }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jPanel4MouseClicked

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
            java.util.logging.Logger.getLogger(PATIENT_PORTAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PATIENT_PORTAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PATIENT_PORTAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PATIENT_PORTAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PATIENT_PORTAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel ndate;
    private javax.swing.JLabel ndrname;
    private javax.swing.JLabel ntime;
    private javax.swing.JLabel patientname;
    private javax.swing.JLabel patientusername;
    // End of variables declaration//GEN-END:variables
}
