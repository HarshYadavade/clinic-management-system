package RECEPTION;

import PATIENT.*;

public class Fixappointmentrec extends javax.swing.JFrame {
//Getting Username and Name From Previos & Next Page
    public void receptionname(String recname) {
                                            receptionname.setText(recname);
                                       }
    public void receptionuname(String recuname) {
                                            receptionuname.setText(recuname);
                                      }
    public void doctorname(String Doctor) {
                                            nameofdoctor.setText(Doctor);
                                       }
    public void pname(String Pname) {
                                            patientname.setText(Pname);
                                       }
    public void puname(String Puname) {
                                            patientusername.setText(Puname);
                                       }
    public void time(String Timing) {
                                            time.setText(Timing);
                                       }
    public void date(String Date) {
                                            timeofappointment.setText(Date);
                                       }    
//end
    public Fixappointmentrec() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        patientname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameofdoctor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        timeofappointment = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        patientusername = new javax.swing.JLabel();
        receptionuname = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        receptionname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Click Here to Continue ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 300, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientname.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        patientname.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        jPanel3.add(patientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 490, 30));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel5.setText("You confirmed appointment of");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        nameofdoctor.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        nameofdoctor.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        jPanel3.add(nameofdoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 490, 30));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jLabel6.setText("DR.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        timeofappointment.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        timeofappointment.setText("12-12-1200");
        jPanel3.add(timeofappointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 110, -1));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 279, 113, 30));

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel10.setText("at");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 40, 30));

        time.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        time.setText("10.00 am");
        jPanel3.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 130, 30));

        jLabel12.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel12.setText("on ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 310));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        BG.setBackground(new java.awt.Color(204, 255, 204));
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/BG.jpg"))); // NOI18N
        BG.setOpaque(true);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));
        getContentPane().add(patientusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 40));

        receptionuname.setText("jLabel3");
        getContentPane().add(receptionuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 100, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, 170, 60));

        receptionname.setText("jLabel2");
        getContentPane().add(receptionname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        Reception r = new Reception();
        String recname = receptionname.getText();
        String recuname = receptionuname.getText();       
        r.receptionname(recname);
        r.receptionuname(recuname);
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(Fixappointmentrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fixappointmentrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fixappointmentrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fixappointmentrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fixappointmentrec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameofdoctor;
    private javax.swing.JLabel patientname;
    private javax.swing.JLabel patientusername;
    private javax.swing.JLabel receptionname;
    private javax.swing.JLabel receptionuname;
    private javax.swing.JLabel time;
    private javax.swing.JLabel timeofappointment;
    // End of variables declaration//GEN-END:variables
}
