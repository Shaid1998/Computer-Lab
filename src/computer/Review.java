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
public class Review extends javax.swing.JFrame {

    /**
     * Creates new form Review
     */
    public Review() {
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

        jPanel2 = new javax.swing.JPanel();
        logout2 = new javax.swing.JButton();
        DeshBoard2 = new javax.swing.JButton();
        computer2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        newR = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();
        computer = new javax.swing.JMenuItem();
        LabPerformence = new javax.swing.JMenuItem();
        profile = new javax.swing.JMenuItem();
        DeshBoard = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(860, 90));
        jPanel2.setLayout(null);

        logout2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logout2.setForeground(new java.awt.Color(255, 0, 0));
        logout2.setText("Logout");
        logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout2ActionPerformed(evt);
            }
        });
        jPanel2.add(logout2);
        logout2.setBounds(680, 30, 140, 50);

        DeshBoard2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DeshBoard2.setForeground(new java.awt.Color(0, 0, 255));
        DeshBoard2.setText("DeshBoard");
        DeshBoard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeshBoard2ActionPerformed(evt);
            }
        });
        jPanel2.add(DeshBoard2);
        DeshBoard2.setBounds(210, 30, 210, 50);

        computer2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        computer2.setForeground(new java.awt.Color(0, 0, 255));
        computer2.setText("Computer");
        computer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computer2ActionPerformed(evt);
            }
        });
        jPanel2.add(computer2);
        computer2.setBounds(449, 30, 151, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 860, 100);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12/12/2019", "520014", "si. no. S1101 is good", null},
                {"13/12/2019", "520018", "si. no. S1105 have windows Problem.", null},
                {"14/12/2019", "520085", "Si. No. S1108 is not Starting", null},
                {"15/12/2019", "520075", "no comment", null}
            },
            new String [] {
                "Date", "ID", "Review", "Answer"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 180, 800, 270);

        newR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newR.setForeground(new java.awt.Color(51, 51, 255));
        newR.setText("New Review");
        newR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRActionPerformed(evt);
            }
        });
        getContentPane().add(newR);
        newR.setBounds(140, 610, 520, 50);

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

        LabPerformence.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        LabPerformence.setText("Lab Performence");
        LabPerformence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabPerformenceActionPerformed(evt);
            }
        });
        menu.add(LabPerformence);

        profile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        profile.setText("Profile");
        menu.add(profile);

        DeshBoard.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        DeshBoard.setText("DeshBoard");
        DeshBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeshBoardActionPerformed(evt);
            }
        });
        menu.add(DeshBoard);

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

    private void LabPerformenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabPerformenceActionPerformed
        // TODO add your handling code here:
        LabPerformance LP= new LabPerformance();
        LP.setVisible(true);
    }//GEN-LAST:event_LabPerformenceActionPerformed

    private void DeshBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeshBoardActionPerformed
        // TODO add your handling code here:
        DashBoard DB= new DashBoard();
        DB.setVisible(true);
    }//GEN-LAST:event_DeshBoardActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Login L= new Login();
        L.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void DeshBoard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeshBoard2ActionPerformed
        // TODO add your handling code here:
        DashBoard DB= new DashBoard();
        DB.setVisible(true);
    }//GEN-LAST:event_DeshBoard2ActionPerformed

    private void newRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRActionPerformed
        // TODO add your handling code here
        NewReview NR= new NewReview();
        NR.setVisible(true);
    }//GEN-LAST:event_newRActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Home HM=new Home();
        HM.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout2ActionPerformed
        // TODO add your handling code here:
        Login L= new Login();
        L.setVisible(true);
    }//GEN-LAST:event_logout2ActionPerformed

    private void computer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computer2ActionPerformed
        // TODO add your handling code here:
        ComputerList CL= new ComputerList();
        CL.setVisible(true);
                
    }//GEN-LAST:event_computer2ActionPerformed

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
            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Review().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DeshBoard;
    private javax.swing.JButton DeshBoard2;
    private javax.swing.JMenuItem LabPerformence;
    private javax.swing.JMenuItem computer;
    private javax.swing.JButton computer2;
    private javax.swing.JMenuItem home;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JButton logout2;
    private javax.swing.JMenu menu;
    private javax.swing.JButton newR;
    private javax.swing.JMenuItem profile;
    // End of variables declaration//GEN-END:variables
}
