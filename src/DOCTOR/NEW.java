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

public class NEW extends javax.swing.JFrame {

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
    public void puname(String patientusername) {
                                            puname.setText(patientusername);
                                      }
//end    

    public NEW() {
        initComponents();
        Refresh();
    }
    public void Refresh()
    {
       Thread Refresh = new Thread()
       {
       public void run(){
        try {
            for(;;)
            {
                        jComboBox3.removeAllItems();
            String sql = "select med_name from add_med";
            Connection con= Connectionpro.getCon();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                String ab = rs.getString("med_name");
                jComboBox3.addItem(ab);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        uname = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        puname = new javax.swing.JLabel();
        patientname = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sr.No", "MEDICINE NAME ", "WHEN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setText("NEW SESSION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 40));

        jPanel7.setBackground(new java.awt.Color(0,0,0,80));
        jPanel7.setPreferredSize(new java.awt.Dimension(120, 40));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SAVE AND END SESSION");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 270, 40));

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
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(460);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 570, 300));

        jComboBox1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 at a TIME", "2 at a TIME", "3 at a TIME", "4 at a TIME" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 290, 30));

        jComboBox2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------1--------", "BREAKFAST (B) ", "BREAKFAST (A) ", "LUNCH (B)", "LUNCH (A)", "DINNER (B)", "DINNER (A)", "--------2--------", "BREAKFAST (B) , LUNCH (B)", "BREAKFAST (B) , LUNCH (A)", "BREAKFAST (A) , LUNCH (B)", "BREAKFAST (A) , LUNCH (A)", "BREAKFAST (B)  , DINNER (B)", "BREAKFAST (B)  , DINNER (A)", "BREAKFAST (A)  , DINNER (A)", "BREAKFAST (A)  , DINNER (A)", "LUNCH (B) , DINNER (B)", "LUNCH (B) , DINNER (A)", "LUNCH (A) , DINNER (B)", "LUNCH (A) , DINNER (A)", "--------3--------", "BREAKFAST (B) , LUNCH (B) , DINNER (B)", "BREAKFAST (B) , LUNCH (B) , DINNER (A)", "BREAKFAST (B) , LUNCH (A) , DINNER (B)", "BREAKFAST (B) , LUNCH (A) , DINNER (A)", "BREAKFAST (A) , LUNCH (B) , DINNER (B)", "BREAKFAST (A) , LUNCH (B) , DINNER (A)", "BREAKFAST (A) , LUNCH (A) , DINNER (B)", "BREAKFAST (A) , LUNCH (A) , DINNER (A)" }));
        jComboBox2.setSelectedItem(null);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 460, 30));

        jComboBox3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CROCIN", "TAZLOC" }));
        jComboBox3.setSelectedItem(null);
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 310, 30));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 120, 50));

        jButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton2.setText("ADD");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 120, 50));

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

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("(B) = BEFORE : (A) =AFTER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 310, 30));

        jTextField1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 310, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 204));
        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loup.jpg"))); // NOI18N
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1070, 40));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("* The list update's after every 1 minute");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 380, 20));

        BG.setBackground(new java.awt.Color(204, 255, 204));
        BG.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/BG.jpg"))); // NOI18N
        BG.setOpaque(true);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, -1, -1));

        jButton3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton3.setText("REFRESH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 110, 30));

        uname.setText("jLabel5");
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, -1, -1));

        name.setText("jLabel4");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, -1, -1));

        puname.setText("jLabel2");
        getContentPane().add(puname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, -1, -1));

        patientname.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        patientname.setPreferredSize(new java.awt.Dimension(260, 33));
        getContentPane().add(patientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 440, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       if(jTextField1.getText().length() == 0)
                        {
                           jLabel4.setText((String)jComboBox3.getSelectedItem());
                        }
       else{
            jLabel4.setText(jTextField1.getText());
           }
       String a = jLabel4.getText();
       String b = (String)jComboBox2.getSelectedItem();
       String c = (String)jComboBox1.getSelectedItem();
       String data [] = { a ,b, c};
        DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
        tblModel.addRow(data);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
        if(tblModel.getRowCount() > 0){
                                        tblModel.removeRow(tblModel.getRowCount() - 1);
                                       }
        else{
            JOptionPane.showMessageDialog(null,"No Data to remove..!!");
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        PATIENT_DATA pd =new PATIENT_DATA();
        String druname = uname.getText();
        String drname = name.getText();
        String patientusername = puname.getText();
        String pname = patientname.getText();        
        pd.drusername(druname);
        pd.drname(drname);
        pd.pname(pname);
        pd.puname(patientusername);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime now = LocalDateTime.now();        
        String currentdate = dtf.format(now);
        DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
        try{
                for (int i = 0; tblModel.getRowCount() > i; i++)
                    {
                        final String Med = (String) tblModel.getValueAt(i, 0);
                        final String Time = (String) tblModel.getValueAt(i, 1);
                        final String Quantity = (String) tblModel.getValueAt(i, 2);
                        String sql = "insert into prescription (pat_username,date,med_name,time,quantity) values (?,?,?,?,?)";
                        Connection con= Connectionpro.getCon();  
                        PreparedStatement prp = con.prepareStatement(sql);
                        prp.setString(1, patientusername);
                        prp.setString(2, currentdate);
                        prp.setString(3, Med);
                        prp.setString(4, Time);
                        prp.setString(5, Quantity);
                        prp.execute();
                    }
            }
        catch(SQLException e){
        
        }
        pd.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        PATIENT_DATA pd =new PATIENT_DATA();
        String druname = uname.getText();
        String drname = name.getText();
        String patientusername = puname.getText();
        String pname = patientname.getText();
        pd.drusername(druname);
        pd.drname(drname);
        pd.pname(pname);
        pd.puname(patientusername);
        pd.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime now = LocalDateTime.now();        
        String currentdate = dtf.format(now);
        String patientusername = puname.getText();
        DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
        try{
                for (int i = 0; tblModel.getRowCount() > i; i++)
                    {
                        final String Med = (String) tblModel.getValueAt(i, 0);
                        final String Time = (String) tblModel.getValueAt(i, 1);
                        final String Quantity = (String) tblModel.getValueAt(i, 2);
                        String sql = "insert into prescription (pat_username,date,med_name,time,quantity) values (?,?,?,?,?)";
                        Connection con= Connectionpro.getCon();  
                        PreparedStatement prp = con.prepareStatement(sql);
                        prp.setString(1, patientusername);
                        prp.setString(2, currentdate);
                        prp.setString(3, Med);
                        prp.setString(4, Time);
                        prp.setString(5, Quantity);
                        prp.execute();
                    }
            }
        catch(SQLException e){
        
        }
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            this.jComboBox3.removeAllItems();
            String sql = "select med_name from add_med";
            Connection con= Connectionpro.getCon();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                String ab = rs.getString("med_name");
                jComboBox3.addItem(ab);
            }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel patientname;
    private javax.swing.JLabel puname;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}
