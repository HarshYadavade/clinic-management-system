package DOCTOR;
import Connect.Connectionpro;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class APPOIN extends javax.swing.JFrame {
//Getting Username and Name From Previos Page
    public void drusername(String druname) {
                                            uname.setText(druname);
                                       }
    public void drname(String drname) {
                                            name.setText(drname);
                                      }
//end    
  
    public APPOIN() {
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
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.setRowCount(0);
                String doctorname = name.getText();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
                LocalDateTime now = LocalDateTime.now();  
                System.out.println(dtf.format(now));
                String currentdate = dtf.format(now);
                String sql = "select * from appointment where doctorname = '"+doctorname+"' and date = '"+currentdate+"'";
                Connection con= Connectionpro.getCon();          
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()) {
                String patname =rs.getString("patientname") ;
                String patusername =rs.getString("username") ;
                String pattime =rs.getString("timing") ;
                String data [] = {patname,patusername,pattime};
                tblModel.addRow(data);
                }
                sleep(60000);}
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        patientname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setText("APPOINTMENTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "USERNAME", "TIMING "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 270));

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

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loup.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1070, 50));

        jTextField1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 220, 40));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("* The Appointment table gets updated after every 1 minute");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 380, 20));

        jButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton2.setText("ENTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ENTER PATIENT USERNAME ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 300, 40));

        BG.setBackground(new java.awt.Color(204, 255, 204));
        BG.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/BG.jpg"))); // NOI18N
        BG.setOpaque(true);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        uname.setText("jLabel5");
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 80, -1, -1));

        name.setText("jLabel4");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, -1, -1));

        patientname.setText("jLabel6");
        getContentPane().add(patientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, -1, -1));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        String druname = uname.getText();
        String drname = name.getText();
        Doctorportal D =new Doctorportal();
        D.drusername(druname);
        D.drname(drname);       
        D.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try { 
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.setRowCount(0);
                String doctorname = name.getText();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
                LocalDateTime now = LocalDateTime.now();  
                System.out.println(dtf.format(now));
                String currentdate = dtf.format(now);
                String sql = "select * from appointment where doctorname = '"+doctorname+"' and date = '"+currentdate+"'";
                Connection con= Connectionpro.getCon();          
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()) {
                String patname =rs.getString("patientname") ;
                String patusername =rs.getString("username") ;
                String pattime =rs.getString("timing") ;
                String data [] = {patname,patusername,pattime};
                tblModel.addRow(data);
            }   
            }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String patientusername = jTextField1.getText();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
        LocalDateTime now = LocalDateTime.now();         
        String currentdate = dtf.format(now);
        PATIENT_DATA pd = new PATIENT_DATA();
        try{String sqll = "select patientname from appointment where username = '"+patientusername+"' and date = '"+currentdate+"'";
                Connection con= Connectionpro.getCon();          
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sqll);
                if(rs.next()){
                                 patientname.setText(rs.getString("patientname"));
                             }
            }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        String druname = uname.getText();
        String drname = name.getText();
        String pname = patientname.getText();
        pd.drusername(druname);
        pd.drname(drname);
        pd.pname(pname);
        pd.puname(patientusername);
        pd.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(APPOIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APPOIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APPOIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APPOIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APPOIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel patientname;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables

}
