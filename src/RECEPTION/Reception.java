package RECEPTION;

import AMJH_CMS.Login1;
import Connect.Connectionpro;
import java.sql.*;
import javax.swing.JOptionPane;

public class Reception extends javax.swing.JFrame {
//Getting Username and Name From Previos & Next Page
    public void receptionname(String recname) {
                                            receptionname.setText(recname);
                                       }
    public void receptionuname(String recuname) {
                                            receptionuname.setText(recuname);
                                      }
//end
    public Reception() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        receptionname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        receptionuname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setText("         WELCOME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0,0,0,80));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("APPOINTMENT");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 120, 35));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SCHEDULE");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 35));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 120));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jPanel7.setBackground(new java.awt.Color(0,0,0,80));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("APPOINTMENTS");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 120, 35));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("VIEW");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 35));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 120));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("RECOVERY");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 110, -1));

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("SET");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 12, 110, -1));

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("OPTION");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 110, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 110, 90));

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("PASSWORD");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 48, 108, -1));

        jLabel18.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("CHANGE");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 17, 108, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 110, 90));

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/MYPR.png"))); // NOI18N
        jLabel22.setText("jLabel10");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 80));

        jLabel23.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel23.setText("MY PROFILE");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 90, 90, 30));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 120, 120));

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

        receptionname.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        getContentPane().add(receptionname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 500, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loup.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1070, 50));

        BG.setBackground(new java.awt.Color(204, 255, 204));
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/BG.jpg"))); // NOI18N
        BG.setOpaque(true);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        receptionuname.setText("jLabel3");
        getContentPane().add(receptionuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 100, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        RemoteBooking rb = new RemoteBooking();
        String recname = receptionname.getText();
        String recuname = receptionuname.getText();       
        rb.receptionname(recname);
        rb.receptionuname(recuname);
        rb.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        SCHDULEDATA sd = new SCHDULEDATA();
        String recname = receptionname.getText();
        String recuname = receptionuname.getText();       
        sd.receptionname(recname);
        sd.receptionuname(recuname);
        sd.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Login1 lo =new Login1();
        lo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        SetRecoveryRec sr = new SetRecoveryRec();
        String recname = receptionname.getText();
        String recuname = receptionuname.getText();
        sr.receptionname(recname);
        sr.receptionuname(recuname);
        sr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        Receptionpass rp = new Receptionpass();
        String recname = receptionname.getText();
        String recuname = receptionuname.getText();
        rp.receptionname(recname);
        rp.receptionuname(recuname);
        rp.setVisible(true);
        dispose();        
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        String rec_name=receptionname.getText();

        try{
            Connection con = Connectionpro.getCon();
            Statement stmt = con.createStatement();
            String sql="select name,email,contact,address,username,qualifications,gender from rec_reg where name = '"+ rec_name +"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                    String mprname =  rs.getString("name");
                    String mpremail = rs.getString("email");
                    String mprcont = rs.getString("contact");
                    String mpradd = rs.getString("address");
                    String mprus = rs.getString("username");
                    String mprqual = rs.getString("qualifications");
                    String mprgen = rs.getString("gender"); 
                    Myprorecp mpdr = new Myprorecp();
                    mpdr.mprnam(mprname);
                    mpdr.mpremai(mpremail);
                    mpdr.mprcon(mprcont);
                    mpdr.mprad(mpradd);
                    mpdr.mpru(mprus);
                    mpdr.mprqua(mprqual);
                    mpdr.mprge(mprgen);
                    String recname = receptionname.getText();
                    String recuname = receptionuname.getText();       
                    mpdr.receptionname(recname);
                    mpdr.receptionuname(recuname);
                    mpdr.setVisible(true);
                    dispose();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println(e);
        }
    }//GEN-LAST:event_jPanel2MouseClicked

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
            java.util.logging.Logger.getLogger(Reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reception().setVisible(true);
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel receptionname;
    private javax.swing.JLabel receptionuname;
    // End of variables declaration//GEN-END:variables
}
