/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author SR
 */
public class LabPerformance extends javax.swing.JFrame {

    /**
     * Creates new form LabPerformance
     */
    public LabPerformance() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        logout2 = new javax.swing.JButton();
        computer1 = new javax.swing.JButton();
        review1 = new javax.swing.JButton();
        deshboard1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        work = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();
        computer3 = new javax.swing.JMenuItem();
        deshboard = new javax.swing.JMenuItem();
        profile = new javax.swing.JMenuItem();
        review = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(860, 90));
        jPanel2.setLayout(null);

        logout2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout2.setForeground(new java.awt.Color(255, 51, 51));
        logout2.setText("Logout");
        logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout2ActionPerformed(evt);
            }
        });
        jPanel2.add(logout2);
        logout2.setBounds(690, 30, 110, 40);

        computer1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        computer1.setForeground(new java.awt.Color(0, 0, 255));
        computer1.setText("Computer");
        computer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computer1ActionPerformed(evt);
            }
        });
        jPanel2.add(computer1);
        computer1.setBounds(340, 30, 140, 40);

        review1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        review1.setForeground(new java.awt.Color(0, 0, 255));
        review1.setText("Review");
        review1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                review1ActionPerformed(evt);
            }
        });
        jPanel2.add(review1);
        review1.setBounds(520, 30, 120, 40);

        deshboard1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deshboard1.setForeground(new java.awt.Color(0, 0, 255));
        deshboard1.setText("DeshBoard");
        deshboard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deshboard1ActionPerformed(evt);
            }
        });
        jPanel2.add(deshboard1);
        deshboard1.setBounds(170, 30, 140, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 860, 100);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Total Project: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 270, 170, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("5");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 270, 170, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Total Working Hour: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 340, 200, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("20");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 340, 140, 16);

        work.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        work.setForeground(new java.awt.Color(51, 102, 255));
        work.setText("Add Work");
        getContentPane().add(work);
        work.setBounds(230, 460, 120, 31);

        jPanel1.setLayout(null);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 100, 130, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(440, 420, 410, 340);

        menu.setText("Menu");

        home.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        menu.add(home);

        computer3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        computer3.setText("Computer");
        computer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computer3ActionPerformed(evt);
            }
        });
        menu.add(computer3);

        deshboard.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        deshboard.setText("DeshBoard");
        deshboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deshboardActionPerformed(evt);
            }
        });
        menu.add(deshboard);

        profile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        profile.setText("Profile");
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        menu.add(profile);

        review.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        review.setText("Review");
        review.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewActionPerformed(evt);
            }
        });
        menu.add(review);

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        menu.add(logout);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewActionPerformed
        // TODO add your handling code here:
        Review R=new Review();
        R.setVisible(true);
    }//GEN-LAST:event_reviewActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Home HM=new Home();
        HM.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void computer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computer3ActionPerformed
        // TODO add your handling code here:
        ComputerList CL= new ComputerList();
        CL.setVisible(true);
    }//GEN-LAST:event_computer3ActionPerformed

    private void deshboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deshboardActionPerformed
        // TODO add your handling code here:
        DashBoard DB= new DashBoard();
        DB.setVisible(true);
                
    }//GEN-LAST:event_deshboardActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        // TODO add your handling code here:
        Profile P=new Profile();
        P.setVisible(true);
    }//GEN-LAST:event_profileActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Login L=new Login();
        L.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void deshboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deshboard1ActionPerformed
        // TODO add your handling code here:
        DashBoard DB= new DashBoard();
        DB.setVisible(true);
    }//GEN-LAST:event_deshboard1ActionPerformed

    private void computer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computer1ActionPerformed
        // TODO add your handling code here:
        ComputerList CL= new ComputerList();
        CL.setVisible(true);
    }//GEN-LAST:event_computer1ActionPerformed

    private void review1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_review1ActionPerformed
        // TODO add your handling code here:
        Review R=new Review();
        R.setVisible(true);
    }//GEN-LAST:event_review1ActionPerformed

    private void logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout2ActionPerformed
        // TODO add your handling code here:
        Login L=new Login();
        L.setVisible(true);
    }//GEN-LAST:event_logout2ActionPerformed

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
            java.util.logging.Logger.getLogger(LabPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabPerformance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabPerformance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton computer1;
    private javax.swing.JMenuItem computer3;
    private javax.swing.JMenuItem deshboard;
    private javax.swing.JButton deshboard1;
    private javax.swing.JMenuItem home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem logout;
    private javax.swing.JButton logout2;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem profile;
    private javax.swing.JMenuItem review;
    private javax.swing.JButton review1;
    private javax.swing.JButton work;
    // End of variables declaration//GEN-END:variables
}
