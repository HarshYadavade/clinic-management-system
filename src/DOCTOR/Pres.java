package DOCTOR;

import Connect.Connectionpro;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Pres extends javax.swing.JFrame {
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
    public void sessiondate(String xyz) {
                                            sessiondate.setText(xyz);
                                      }    
//end       
    public Pres() {
                        initComponents();
                        Refresh();
                  }
    public void Refresh()
    {
       Thread Refresh = new Thread()
       {
       public void run(){
        try {
            Connection con= Connectionpro.getCon();
            DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
            tblModel.setRowCount(0);
            String patientusername = puname.getText();
            String xyz = sessiondate.getText();
            Statement stmt = con.createStatement();
            String sql ="Select * from prescription where pat_username='"+patientusername+"'and date = '"+xyz+"'";
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            while(rs.next()) {
                                    String a = rs.getString("med_name");
                                    String b = rs.getString("time");
                                    String c = rs.getString("quantity");
                                    String data [] = { a ,b, c};
                                    tblModel.addRow(data);
            }       
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
                                }
       }
       }
       ;
       Refresh.start();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        uname = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        puname = new javax.swing.JLabel();
        patientname = new javax.swing.JLabel();
        sessiondate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setText("PRESCRIPTION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, 40));

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE", "TIME", "QUANTITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(460);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 660, 340));

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loup.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1070, 40));

        BG.setBackground(new java.awt.Color(204, 255, 204));
        BG.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/BG.jpg"))); // NOI18N
        BG.setOpaque(true);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        uname.setText("jLabel5");
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        name.setText("jLabel4");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        puname.setText("jLabel2");
        getContentPane().add(puname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        patientname.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        patientname.setPreferredSize(new java.awt.Dimension(260, 33));
        getContentPane().add(patientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 30));

        sessiondate.setText("jLabel1");
        getContentPane().add(sessiondate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        hist h =new hist();
        String druname = uname.getText();
        String drname = name.getText();
        String patientusername = puname.getText();
        String pname = patientname.getText();
        String xyz = sessiondate.getText();
        h.drusername(druname);
        h.drname(drname);
        h.pname(pname);
        h.puname(patientusername);
        h.sessiondate(xyz);
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con= Connectionpro.getCon();
        try{
            DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
            tblModel.setRowCount(0);
            String patientusername = puname.getText();
            String xyz = sessiondate.getText();
            Statement stmt = con.createStatement();
            String sql ="Select * from prescription where pat_username='"+patientusername+"'and date = '"+xyz+"'";
            ResultSet rs = (ResultSet) stmt.executeQuery(sql);
            while(rs.next()) {
                                    String a = rs.getString("med_name");
                                    String b = rs.getString("time");
                                    String c = rs.getString("quantity");
                                    String data [] = { a ,b, c};
                                    tblModel.addRow(data);                
            }
        
        
        }
        catch(SQLException e){
        
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel patientname;
    private javax.swing.JLabel puname;
    private javax.swing.JLabel sessiondate;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}
