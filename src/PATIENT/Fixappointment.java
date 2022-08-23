package PATIENT;

public class Fixappointment extends javax.swing.JFrame {

    //Getting Username and Name From Previos Page
    public void patusername(String patuname) {
                                            patientusername.setText(patuname);
                                       }
    public void patname(String patname) {
                                            patientname.setText(patname);
                                      }
    public void doctorname(String Doctor) {
                                                nameofdoctor.setText(Doctor);
                                           }
    public void time(String Time) {
                                                time.setText(Time);
                                           }
    public void date(String Date) {
                                                timeofappointment.setText(Date);
                                           }
//end
    public Fixappointment() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        patientname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameofdoctor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        timeofappointment = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        patientusername = new javax.swing.JLabel();

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

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel4.setText("Dear, ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        patientname.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        patientname.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        jPanel3.add(patientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 490, 30));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel5.setText("your appointment is confirmed with");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        nameofdoctor.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        nameofdoctor.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        jPanel3.add(nameofdoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 490, 30));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jLabel6.setText("DR.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        timeofappointment.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        timeofappointment.setText("12-12-1200");
        jPanel3.add(timeofappointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 110, -1));

        jLabel7.setBackground(new java.awt.Color(255, 51, 51));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Please make sure you reach 15 minutes prior to Appointment Time");
        jLabel7.setOpaque(true);
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 22)); // NOI18N
        jLabel8.setText("AMJH CLINICS");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel10.setText("at");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 40, 30));

        time.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        time.setText("10.00 am");
        jPanel3.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 130, 30));

        jLabel13.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel13.setText("Thank You ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

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
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 279, 113, 30));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, -1, -1));
        getContentPane().add(patientusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        PATIENT_PORTAL pp  =new PATIENT_PORTAL();
        String patname = patientname.getText();
        String patuname = patientusername.getText();
        pp.patname(patname);
        pp.patusername(patuname);
        pp.setVisible(true);
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
            java.util.logging.Logger.getLogger(Fixappointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fixappointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fixappointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fixappointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fixappointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameofdoctor;
    private javax.swing.JLabel patientname;
    private javax.swing.JLabel patientusername;
    private javax.swing.JLabel time;
    private javax.swing.JLabel timeofappointment;
    // End of variables declaration//GEN-END:variables
}
