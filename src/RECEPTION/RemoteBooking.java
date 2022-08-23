package RECEPTION;

import Connect.Connectionpro;
import PATIENT.BOOKAPPOINTMENT;
import static java.lang.Thread.sleep;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RemoteBooking extends javax.swing.JFrame {
//Getting Username and Name From Previos & Next Page
    public void receptionname(String recname) {
                                            receptionname.setText(recname);
                                       }
    public void receptionuname(String recuname) {
                                            receptionuname.setText(recuname);
                                      }
//end 
    public RemoteBooking() {
        initComponents();
        Refresh();
    }
    public void Refresh()
    {
       Thread Refresh = new Thread()
       {
       public void run(){
        try{
            for(;;)
            {
            jComboBox3.removeAllItems();
            jDateChooser1.setCalendar(null);

            Connection con= Connectionpro.getCon();
            Statement stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select name from doctor_reg");
            while(rs.next()){
                                String name= rs.getString("name");
                                jComboBox3.addItem(name);
                             }
            sleep(60000);
            }
            }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
       catch (InterruptedException ex) {
               Logger.getLogger(RemoteBooking.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       };
       Refresh.start();
       
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        time_txt = new javax.swing.JLabel();
        dat_txt = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        receptionuname = new javax.swing.JLabel();
        day_txt = new javax.swing.JLabel();
        receptionname = new javax.swing.JLabel();
        Patname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel7.setText("BOOK APPOINTMENTS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 130, 30));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHOOSE DR. :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, 30));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TIME SLOTS:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 130, 30));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DATE:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, 30));

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("* The list update's after every 1 minute");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 270, 20));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 100, 40));

        jButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton2.setText("RESET ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 110, 40));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setText("ENTER PATIENT USERNAME:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jTextField1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 390, 30));

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

        jComboBox3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 390, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10.00 - 10.15", "10.15 - 10.30", "10.30 - 10.45", "10.45 - 11.00", "11.00 - 11.15", "11.15 - 11.30", "11.30 - 11.45", "11.45 - 12.00", "6.00 - 6.15", "6.15 - 6.30", "6.30 - 6.45", "6.45 - 7.00", "7.00 - 7.15", "7.15 - 7.30", "7.30 - 7.45", "7.45 - 8.00", "8.00 - 8.15", "8.15 - 8.30", "8.30 - 8.45", "8.45 - 9.00" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 390, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loup.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1070, 50));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/BG.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        time_txt.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        time_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(time_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 170, 30));

        dat_txt.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        dat_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(dat_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 170, 30));

        jButton3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton3.setText("REFRESH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 100, 30));

        receptionuname.setText("jLabel3");
        getContentPane().add(receptionuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 100, -1, -1));

        day_txt.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        day_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(day_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 120, 170, 30));

        receptionname.setText("jLabel2");
        getContentPane().add(receptionname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, -1, -1));

        Patname.setText("jLabel7");
        getContentPane().add(Patname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Reception r = new Reception();
        String recname = receptionname.getText();
        String recuname = receptionuname.getText();       
        r.receptionname(recname);
        r.receptionuname(recuname);
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            this.jComboBox3.removeAllItems();
            jDateChooser1.setCalendar(null);

            Connection con= Connectionpro.getCon();
            Statement stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select name from doctor_reg");
            while(rs.next()){
                String name= rs.getString("name");
                jComboBox3.addItem(name);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDateChooser1.setCalendar(null);
        jComboBox3.setSelectedItem(null);
        jTextField1.setText(" ");
        jComboBox2.setSelectedItem(null);    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
                String Doctor = (String) jComboBox3.getSelectedItem();
                String Puname = jTextField1.getText();
                String Timing = (String) jComboBox2.getSelectedItem();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
                String Date = sdf.format(jDateChooser1.getDate());
                Connection con= Connectionpro.getCon();                
                String sql = ("Select name from pat_reg where username= '"+Puname+"'");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()){
                               Patname.setText(rs.getString("name"));
                             }
                String Pname = Patname.getText();
                String sqll = ("Select app_id from appointment where doctorname='"+ Doctor +"'and timing ='"+ Timing +"' and date = '"+ Date +"'");
                ResultSet ab = stmt.executeQuery(sqll);
                if(ab.next()){
                                 JOptionPane.showMessageDialog(null, "The Slot Choose is unavailable...Choose other Time or try Changing Date!!");
                              }
                else{
                String sqlll = ("insert into appointment(doctorname,timing,date,patientname,username) values (?,?,?,?,?)");
                PreparedStatement prp = con.prepareStatement(sqlll);
                prp.setString(1, Doctor);
                prp.setString(2, Timing);
                prp.setString(3, Date);
                prp.setString(4, Pname);
                prp.setString(5, Puname);
                prp.execute();
                Fixappointmentrec fr = new Fixappointmentrec();
                String recname = receptionname.getText();
                String recuname = receptionuname.getText();
                fr.receptionname(recname);
                fr.receptionuname(recuname);
                fr.doctorname(Doctor);
                fr.puname(Puname);
                fr.pname(Pname);
                fr.time(Timing);
                fr.date(Date);        
                fr.setVisible(true);
                dispose();
                }
                
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
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
            java.util.logging.Logger.getLogger(RemoteBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoteBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoteBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoteBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoteBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Patname;
    private javax.swing.JLabel dat_txt;
    private javax.swing.JLabel day_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel receptionname;
    private javax.swing.JLabel receptionuname;
    private javax.swing.JLabel time_txt;
    // End of variables declaration//GEN-END:variables
}
