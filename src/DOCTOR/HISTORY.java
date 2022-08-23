package DOCTOR;
import Connect.Connectionpro;
import static java.lang.Thread.sleep;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class HISTORY extends javax.swing.JFrame {

//Getting Username and Name From Previos Page
    public void drusername(String druname) {
                                            uname.setText(druname);
                                       }
    public void drusersnameback(String druname) {
                                            uname.setText(druname);
                                       }
    public void drname(String drname) {
                                            name.setText(drname);
                                      }
    public void drnameback(String drname) {
                                            name.setText(drname);
                                          }
    public void pname(String pname) {
                                            patientname.setText(pname);
                                      }
    public void pnameback(String pname) {
                                            patientname.setText(pname);
                                          }
    public void puname(String patientusername) {
                                            puname.setText(patientusername);
                                      }
    public void punameback(String patientusername) {
                                            puname.setText(patientusername);
                                          }    
//end       
    public HISTORY() {
        initComponents();
        Refresh();
    }
    public void Refresh()
    {
       Thread Refresh = new Thread()
       {
       public void run(){
        try {
            for(;;){
            jComboBox1.removeAllItems();
            String pname = patientname.getText();
            String doctorname = name.getText();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDateTime now = LocalDateTime.now();
            String currentdate = dtf.format(now);
            String sql = "select date from appointment where patientname = '"+pname+"' and date <= '"+currentdate+"' and doctorname='"+doctorname+"'";
            Connection con= Connectionpro.getCon();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                String ab = rs.getString("date");
                jComboBox1.addItem(ab);
            }
            sleep(60000);       
            }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
       catch (InterruptedException ex) {
               Logger.getLogger(Doctorportal.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       };
       Refresh.start();
       
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        puname = new javax.swing.JLabel();
        patientname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setText("PREVIOUS SESSIONS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loup.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1070, 40));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setText("CHOOSE SESSION");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jComboBox1.setSelectedItem(null);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 390, 30));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton1.setText("ENTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 100, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton4.setText("<- BACK");
        jButton4.setBorder(null);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 560, 80, 40));

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("* The list update's after every 1 minute");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 380, 20));

        BG.setBackground(new java.awt.Color(204, 255, 204));
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/BG.jpg"))); // NOI18N
        BG.setOpaque(true);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        jButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton2.setText("REFRESH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 303, -1, 40));

        name.setText("jLabel4");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, -1, -1));

        uname.setText("jLabel5");
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 80, -1, -1));

        puname.setText("jLabel2");
        getContentPane().add(puname, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, -1, -1));

        patientname.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        patientname.setPreferredSize(new java.awt.Dimension(260, 33));
        getContentPane().add(patientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 440, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        PATIENT_DATA  PD =new PATIENT_DATA();
        String druname = uname.getText();
        String drname = name.getText();
        String patientusername = puname.getText();
        String pname = patientname.getText();
        PD.drusername(druname);
        PD.drname(drname);
        PD.pname(pname);
        PD.puname(patientusername);
        PD.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String xyz = (String)jComboBox1.getSelectedItem();
        hist h = new hist();
        String druname = uname.getText();
        String drname = name.getText();
        String patientusername = puname.getText();
        String pname = patientname.getText();
        h.drusername(druname);
        h.drname(drname);
        h.pname(pname);
        h.puname(patientusername);
        h.sessiondate(xyz);
        h.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            this.jComboBox1.removeAllItems();
            String pname = patientname.getText();
            String doctorname = name.getText();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDateTime now = LocalDateTime.now();
            String currentdate = dtf.format(now);
            String sql = "select date from appointment where patientname = '"+pname+"' and date <= '"+currentdate+"' and doctorname='"+doctorname+"'";
            Connection con= Connectionpro.getCon();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                String ab = rs.getString("date");
                jComboBox1.addItem(ab);
            }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(HISTORY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HISTORY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HISTORY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HISTORY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HISTORY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel name;
    private javax.swing.JLabel patientname;
    private javax.swing.JLabel puname;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}
