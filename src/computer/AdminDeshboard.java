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
public class AdminDeshboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDeshboard
     */
    public AdminDeshboard() {
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
        logout = new javax.swing.JButton();
        computer = new javax.swing.JButton();
        review = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        newName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        newName1 = new javax.swing.JTextField();
        newName2 = new javax.swing.JTextField();
        newAD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(860, 90));
        jPanel2.setLayout(null);

        logout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 0, 204));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout);
        logout.setBounds(680, 30, 140, 40);

        computer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        computer.setForeground(new java.awt.Color(0, 0, 204));
        computer.setText("Computer");
        computer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerActionPerformed(evt);
            }
        });
        jPanel2.add(computer);
        computer.setBounds(240, 30, 160, 40);

        review.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        review.setForeground(new java.awt.Color(0, 0, 204));
        review.setText("Review");
        review.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewActionPerformed(evt);
            }
        });
        jPanel2.add(review);
        review.setBounds(450, 30, 140, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 860, 100);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Admin ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 230, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText(" Admin Name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 330, 150, 30);
        getContentPane().add(id);
        id.setBounds(170, 240, 670, 30);
        getContentPane().add(name);
        name.setBounds(210, 340, 620, 40);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Enter name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 50, 140, 20);
        jPanel1.add(newName);
        newName.setBounds(170, 180, 350, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Give a Password:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 180, 170, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Give a ID:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 120, 110, 20);
        jPanel1.add(newName1);
        newName1.setBounds(160, 50, 350, 22);
        jPanel1.add(newName2);
        newName2.setBounds(160, 110, 350, 22);

        newAD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        newAD.setForeground(new java.awt.Color(0, 0, 204));
        newAD.setText("Add New Admin");
        newAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newADActionPerformed(evt);
            }
        });
        jPanel1.add(newAD);
        newAD.setBounds(220, 250, 280, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(280, 430, 580, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void computerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerActionPerformed
        // TODO add your handling code here:
        ComputerList CL= new ComputerList();
        CL.setVisible(true);
    }//GEN-LAST:event_computerActionPerformed

    private void reviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewActionPerformed
        // TODO add your handling code here:
        Review R= new Review();
        R.setVisible(true);
    }//GEN-LAST:event_reviewActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        AdminLogin ADL= new AdminLogin();
        ADL.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void newADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newADActionPerformed
        // TODO add your handling code here:
        AdminDeshboard ADB= new AdminDeshboard();
        ADB.setVisible(true);
    }//GEN-LAST:event_newADActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDeshboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDeshboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDeshboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDeshboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDeshboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton computer;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JLabel name;
    private javax.swing.JButton newAD;
    private javax.swing.JTextField newName;
    private javax.swing.JTextField newName1;
    private javax.swing.JTextField newName2;
    private javax.swing.JButton review;
    // End of variables declaration//GEN-END:variables
}
