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
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
        this.setBounds(100,50,861,800);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logout1 = new javax.swing.JButton();
        review6 = new javax.swing.JButton();
        computer5 = new javax.swing.JButton();
        computer6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emaill = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();
        computer = new javax.swing.JMenuItem();
        labperformence = new javax.swing.JMenuItem();
        deshboard2 = new javax.swing.JMenuItem();
        review = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(860, 90));
        jPanel1.setLayout(null);

        logout1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logout1.setForeground(new java.awt.Color(255, 0, 51));
        logout1.setText("Logut");
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });
        jPanel1.add(logout1);
        logout1.setBounds(700, 20, 130, 50);

        review6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        review6.setForeground(new java.awt.Color(51, 102, 255));
        review6.setText("Review");
        jPanel1.add(review6);
        review6.setBounds(540, 20, 120, 40);

        computer5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        computer5.setForeground(new java.awt.Color(51, 102, 255));
        computer5.setText("Deshboard");
        computer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computer5ActionPerformed(evt);
            }
        });
        jPanel1.add(computer5);
        computer5.setBounds(170, 20, 160, 40);

        computer6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        computer6.setForeground(new java.awt.Color(51, 102, 255));
        computer6.setText("Computer");
        computer6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computer6ActionPerformed(evt);
            }
        });
        jPanel1.add(computer6);
        computer6.setBounds(360, 20, 160, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-2, -2, 870, 90);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Name: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 150, 120, 40);
        getContentPane().add(name);
        name.setBounds(140, 166, 390, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 210, 120, 40);
        getContentPane().add(id);
        id.setBounds(140, 230, 390, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Emaill:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 260, 120, 40);
        getContentPane().add(emaill);
        emaill.setBounds(140, 280, 390, 20);

        update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        update.setForeground(new java.awt.Color(0, 51, 255));
        update.setText("Update Profile");
        getContentPane().add(update);
        update.setBounds(120, 350, 340, 40);

        menu.setText("Menu");

        home.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        menu.add(home);

        computer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        computer.setText("Computer");
        computer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerActionPerformed(evt);
            }
        });
        menu.add(computer);

        labperformence.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        labperformence.setText("Lab Performence");
        labperformence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labperformenceActionPerformed(evt);
            }
        });
        menu.add(labperformence);

        deshboard2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        deshboard2.setText("DeshBoard");
        deshboard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deshboard2ActionPerformed(evt);
            }
        });
        menu.add(deshboard2);

        review.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
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

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Home HM=new Home();
        HM.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void deshboard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deshboard2ActionPerformed
        // TODO add your handling code here:
        DashBoard DB=new DashBoard();
        DB.setVisible(true);
    }//GEN-LAST:event_deshboard2ActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        Login LG= new Login();
        LG.setVisible(true);
    }//GEN-LAST:event_logout1ActionPerformed

    private void computer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computer5ActionPerformed
        // TODO add your handling code here:
        DashBoard CL= new DashBoard();
        CL.setVisible(true);
    }//GEN-LAST:event_computer5ActionPerformed

    private void computer6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computer6ActionPerformed
        // TODO add your handling code here:
        ComputerList CL= new ComputerList();
        CL.setVisible(true);
    }//GEN-LAST:event_computer6ActionPerformed

    private void labperformenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labperformenceActionPerformed
        // TODO add your handling code here:
        LabPerformance LP= new LabPerformance();
        LP.setVisible(true);
    }//GEN-LAST:event_labperformenceActionPerformed

    private void reviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewActionPerformed
        // TODO add your handling code here:
        Review R=new Review();
        R.setVisible(true);
    }//GEN-LAST:event_reviewActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Login L=new Login();
        L.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void computerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerActionPerformed
        // TODO add your handling code here:
        ComputerList CL= new ComputerList();
        CL.setVisible(true);
    }//GEN-LAST:event_computerActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem computer;
    private javax.swing.JButton computer5;
    private javax.swing.JButton computer6;
    private javax.swing.JMenuItem deshboard2;
    private javax.swing.JLabel emaill;
    private javax.swing.JMenuItem home;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem labperformence;
    private javax.swing.JMenuItem logout;
    private javax.swing.JButton logout1;
    private javax.swing.JMenu menu;
    private javax.swing.JLabel name;
    private javax.swing.JMenuItem review;
    private javax.swing.JButton review6;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
