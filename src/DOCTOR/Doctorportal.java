package DOCTOR;

import AMJH_CMS.Login1;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import Connect.Connectionpro;
import java.sql.*;
import javax.swing.JOptionPane;

public class Doctorportal extends javax.swing.JFrame {
    
//Getting Username and Name From Previos Page
    public void drusername(String druname) {
                                            uname.setText(druname);
                                       }
    public void drname(String drname) {
                                            name.setText(drname);
                                      }
//end
    
    public Doctorportal() {
                            initComponents();
                            CurrentDate();
                            CurrentTime();
                            CurrentDay();
    
                            }
    
    
    public void CurrentDate()
    {
       Thread CurrentDate = new Thread()
       {
       public void run(){
       
           try {
               for(;;){
               Calendar cal = new GregorianCalendar();
               int month = cal.get(Calendar.MONTH);
               int year = cal.get(Calendar.YEAR);
               int day = cal.get(Calendar.DAY_OF_MONTH);
               dat_txt.setText("DATE:"+day+"/"+(month+1)+"/"+year);
               sleep(1000);}
           } catch (InterruptedException ex) {
               Logger.getLogger(Doctorportal.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       };
       CurrentDate.start();
       
    }
   //..........................................................................................................
    public void CurrentTime()
    {
        
       Thread CurrentTime = new Thread()
       {
       public void run(){
       
           try {
               for(;;){
               Calendar cal = new GregorianCalendar();
       int second = cal.get(Calendar.SECOND);
       int minutes = cal.get(Calendar.MINUTE);
       int hours = cal.get(Calendar.HOUR);
       time_txt.setText("TIME:"+hours+":"+minutes+":"+second);
               sleep(1);}
           } catch (InterruptedException ex) {
               Logger.getLogger(Doctorportal.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       };
       CurrentTime.start();
           }
    //.........................................................................................................
    public void CurrentDay()
    {
        
       Thread CurrentDay = new Thread()
       {
       public void run(){
       
           try {
               for(;;){
               Calendar cal = new GregorianCalendar();
       int day  = cal.get(Calendar.DAY_OF_WEEK);
       String s = null ;
       if(day == 2){
        s = "Monday";           
    } else if (day==3){
        s = "Tueday";
    } else if (day==4){
        s = "Wednesday";
    } else if (day==5){
        s = "Thursday";
    } else if (day==6){
        s = "Friday";
    } else if (day==7){
        s = "Saturday";
    } else if (day==1){
        s = "Sunday";
    }
       day_txt.setText("Day:"+ s );
               sleep(10);}
           } catch (InterruptedException ex) {
               Logger.getLogger(Doctorportal.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       };
       CurrentDay.start();
           
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        dat_txt = new javax.swing.JLabel();
        time_txt = new javax.swing.JLabel();
        day_txt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3.setText("      WELCOME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4.setText("APPOINTMENTS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton4.setText("LOGOUT <");
        jButton4.setBorder(null);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 90, 40));

        name.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 10, 570, 50));

        dat_txt.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        dat_txt.setText("xxx");
        getContentPane().add(dat_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 220, 40));

        time_txt.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        time_txt.setText("xxx");
        getContentPane().add(time_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 190, 40));

        day_txt.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        day_txt.setText("xxx");
        getContentPane().add(day_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, -1, -1));

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/MYPR.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 80));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel11.setText("MY PROFILE");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 90, 90, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 120, 120));

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
        jLabel15.setText("PASSWORD");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 53, 108, -1));

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("CHANGE");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 17, 108, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 110, 90));

        jPanel1.setBackground(new java.awt.Color(0,0,0,80));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setText("APPOINTMENTS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 98, -1, 16));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/appo80.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 106, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 120, 120));

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
        jLabel16.setText("RECOVERY");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 110, -1));

        jLabel18.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("SET");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 12, 110, -1));

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("OPTION");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 110, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loside.jpg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 110, 90));

        jLabel6.setBackground(new java.awt.Color(255, 255, 204));
        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loup.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1070, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/loup.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1070, 50));

        Background.setBackground(new java.awt.Color(204, 255, 204));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/BG.jpg"))); // NOI18N
        Background.setOpaque(true);
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        uname.setText("jLabel4");
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseReleased

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        APPOIN a = new APPOIN();
        String druname = uname.getText();
        String drname = name.getText();
        a.drusername(druname);
        a.drname(drname);
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Login1 lo =new Login1();
        lo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        Doctorpass ap = new Doctorpass();
        String druname = uname.getText();
        String drname = name.getText();
        ap.drusername(druname);
        ap.drname(drname);
        ap.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        SetRecoveryDoc sr = new SetRecoveryDoc();
        String druname = uname.getText();
        String drname = name.getText();
        sr.drusername(druname);
        sr.drname(drname);
        sr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
              String dr_name= name.getText();
        
        try{
            Connection con = Connectionpro.getCon();
            Statement stmt = con.createStatement();
                String sql="select * from doctor_reg where name = '"+ dr_name +"'";
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next()){                    
                    String mprname =  rs.getString("name");
                    String mpremail = rs.getString("email");
                    String mprcont = rs.getString("contact");
                    String mpradd = rs.getString("address");
                    String mprus = rs.getString("username");
                    String mprqual = rs.getString("qualifications");
                    String mprgen = rs.getString("gender"); 
                    String mprspl =rs.getString("spl");
                    Myprodr mpdr = new Myprodr();
                    mpdr.mprnam(mprname);
                    mpdr.mpremai(mpremail);
                    mpdr.mprcon(mprcont);
                    mpdr.mprad(mpradd);
                    mpdr.mpru(mprus);
                    mpdr.mprqua(mprqual);
                    mpdr.mprge(mprgen);
                    mpdr.mprsp(mprspl);
                    String druname = uname.getText();
                    String drname = name.getText();
                    mpdr.drusername(druname);
                    mpdr.drname(drname);
                    mpdr.setVisible(true);
                    dispose();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println(e);
        }
    }//GEN-LAST:event_jPanel2MouseClicked

   
     
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Doctorportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctorportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctorportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctorportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctorportal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel dat_txt;
    private javax.swing.JLabel day_txt;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel name;
    private javax.swing.JLabel time_txt;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}
