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
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jMenuItem4 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        Massage2 = new javax.swing.JLabel();
        Massage1 = new javax.swing.JLabel();
        Massage3 = new javax.swing.JLabel();
        Enter = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        forget = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        REG = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        HM = new javax.swing.JMenuItem();
        RG = new javax.swing.JMenuItem();
        LG = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 255));
        jLabel2.setText("Enter Your Email: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 180, 130, 30);
        getContentPane().add(Email);
        Email.setBounds(320, 190, 240, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("Enter Your Password: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 330, 160, 20);
        getContentPane().add(Password);
        Password.setBounds(310, 330, 260, 22);

        Massage2.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(Massage2);
        Massage2.setBounds(310, 260, 270, 20);

        Massage1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Massage1);
        Massage1.setBounds(310, 390, 340, 20);
        getContentPane().add(Massage3);
        Massage3.setBounds(310, 370, 310, 0);

        Enter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Enter.setForeground(new java.awt.Color(255, 51, 51));
        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });
        getContentPane().add(Enter);
        Enter.setBounds(490, 480, 190, 40);

        Cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 0, 51));
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel);
        Cancel.setBounds(180, 470, 230, 40);

        forget.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        forget.setForeground(new java.awt.Color(51, 51, 255));
        forget.setText("Forget password?");
        forget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetActionPerformed(evt);
            }
        });
        getContentPane().add(forget);
        forget.setBounds(460, 590, 210, 25);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 90));
        jPanel1.setLayout(null);

        REG.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        REG.setText("Registration");
        REG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGActionPerformed(evt);
            }
        });
        jPanel1.add(REG);
        REG.setBounds(660, 30, 150, 40);

        Home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel1.add(Home);
        Home.setBounds(340, 30, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 860, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computer/510364-amazing-santabanta-nature-wallpaper-hd-1920x1080.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 90, 860, 690);

        jMenu2.setText("Menu");

        HM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        HM.setText("Home");
        HM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HMActionPerformed(evt);
            }
        });
        jMenu2.add(HM);

        RG.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        RG.setText("Registration");
        RG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RGActionPerformed(evt);
            }
        });
        jMenu2.add(RG);

        LG.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK));
        LG.setText("Login");
        LG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LGActionPerformed(evt);
            }
        });
        jMenu2.add(LG);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HMActionPerformed
        Home HM4= new Home();
       HM4.setVisible(true);
    }//GEN-LAST:event_HMActionPerformed

    private void LGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LGActionPerformed
        Login HM5= new Login();
       HM5.setVisible(true);
    }//GEN-LAST:event_LGActionPerformed

    private void RGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RGActionPerformed
        Registration RG6= new Registration();
        RG6.setVisible(true);
    }//GEN-LAST:event_RGActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
       Home HM= new Home();
       HM.setVisible(true);
    }//GEN-LAST:event_CancelActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Home HM2= new Home();
       HM2.setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void REGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGActionPerformed
        Registration RG= new Registration();
       RG.setVisible(true);
    }//GEN-LAST:event_REGActionPerformed

    private void forgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetActionPerformed
        ForgetPassword FGP= new ForgetPassword();
        FGP.setVisible(true);
    }//GEN-LAST:event_forgetActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        if(Email.getText().trim().isEmpty() && Password.getText().trim().isEmpty()){
            Massage2.setText("Enter Your Email..");
            Massage1.setText("Enter Your password..");
        }else if (Email.getText().trim().isEmpty()){
            Massage2.setText("Enter your Email..");
        }else if(Password.getText().trim().isEmpty()){
            Massage1.setText("Enter Your password..");
        }else{
            DashBoard DHB= new DashBoard();
            DHB.setVisible(true);
        }
    }//GEN-LAST:event_EnterActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField Email;
    private javax.swing.JButton Enter;
    private javax.swing.JMenuItem HM;
    private javax.swing.JButton Home;
    private javax.swing.JMenuItem LG;
    private javax.swing.JLabel Massage1;
    private javax.swing.JLabel Massage2;
    private javax.swing.JLabel Massage3;
    private javax.swing.JTextField Password;
    private javax.swing.JButton REG;
    private javax.swing.JMenuItem RG;
    private javax.swing.JButton forget;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
