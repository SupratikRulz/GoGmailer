
package codes;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Font;
import static java.awt.font.TextAttribute.FONT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Supratik Rulz
 */
public class LoginMain extends javax.swing.JFrame {
    
    
    String useremailid="",userpassword="";

    AnimationClass ac = new AnimationClass();
    private int xMouse,yMouse;
    
    public LoginMain() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("LOGO.PNG")).getImage());
        this.setTitle("Go-Gmailer:Rulz");
        lblEmail.setBackground(new Color(0,0,0,0));
        lblPass.setBackground(new Color(0,0,0,0));
        
        startSlideShow();
    }

    void startSlideShow(){
        
        new Thread(){
            public void run(){
                
                try{
                    int count=0;
                    while(true){
                        
                        
                        switch(count){
                            
                            case 0:
                                ImageIcon i1=new ImageIcon(getClass().getResource("/login_slider_image/BG1.PNG"));
                                lblBg1.setIcon(i1);
                                
                                Thread.sleep(3000);
                                ac.jLabelXLeft(0, -650,1 , 5, lblBg1);
                                ac.jLabelXLeft(650, 0, 1, 5, lblBg2);
                                count = 1;
                                break;
                             case 1:
                                ImageIcon i2=new ImageIcon(getClass().getResource("/login_slider_image/BG2.PNG"));
                                lblBg2.setIcon(i2);
                                
                                Thread.sleep(3000);
                                ac.jLabelXRight(-650, 0,1 , 5, lblBg1);
                                ac.jLabelXRight(0, 650, 1, 5, lblBg2);
                                count = 2;
                                break;
                                
                             case 2:
                                ImageIcon i3=new ImageIcon(getClass().getResource("/login_slider_image/BG3.PNG"));
                                lblBg1.setIcon(i3);
                                
                                 
                                Thread.sleep(3000);
                                ac.jLabelXLeft(0, -650,1 , 5, lblBg1);
                                ac.jLabelXLeft(650, 0, 1, 5, lblBg2);
                                count = 3;
                                break;
                            case 3:
                                ImageIcon i4=new ImageIcon(getClass().getResource("/login_slider_image/BG4.PNG"));
                                lblBg2.setIcon(i4);
                                
                                
                                Thread.sleep(3000);
                                ac.jLabelXRight(-650, 0,1 , 5, lblBg1);
                                ac.jLabelXRight(0, 650, 1, 5, lblBg2);
                                count = 4;
                                break;
                             case 4:
                                ImageIcon i5=new ImageIcon(getClass().getResource("/login_slider_image/BG5.PNG"));
                                lblBg1.setIcon(i5);
                                
                                 
                                Thread.sleep(3000);
                                ac.jLabelXLeft(0, -650,1 , 5, lblBg1);
                                ac.jLabelXLeft(650, 0, 1, 5, lblBg2);
                                count = 5;
                                break;   
                               
                             case 5:
                                ImageIcon i6=new ImageIcon(getClass().getResource("/login_slider_image/BG6.PNG"));
                                lblBg2.setIcon(i6);
                                
                                 
                                Thread.sleep(3000);
                                ac.jLabelXRight(-650, 0,1 , 5, lblBg1);
                                ac.jLabelXRight(0, 650, 1, 5, lblBg2);
                                count = 6;
                                break;
                                 
                             case 6:
                                ImageIcon i7=new ImageIcon(getClass().getResource("/login_slider_image/BG7.PNG"));
                                lblBg1.setIcon(i7);
                                
                                 
                                Thread.sleep(3000);
                                ac.jLabelXLeft(0, -650,1 , 5, lblBg1);
                                ac.jLabelXLeft(650, 0, 1, 5, lblBg2);
                                count = 0;
                                break;   
                            
                        }
                        
                    }
                
                }
                catch(Exception e){
                
                }
            }
            
            
        }.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        checkBox = new javax.swing.JCheckBox();
        lblPass = new javax.swing.JTextField();
        lblEmail = new javax.swing.JTextField();
        lblMinimize = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblAppPasswordGenerate = new javax.swing.JLabel();
        lblShowPassword = new javax.swing.JLabel();
        lblKnowDevlopers = new javax.swing.JLabel();
        lblSignUp = new javax.swing.JLabel();
        lblOpenRemembered = new javax.swing.JLabel();
        lblForgetPass = new javax.swing.JLabel();
        TitleBar = new javax.swing.JLabel();
        lblFloat = new javax.swing.JLabel();
        lblBg2 = new javax.swing.JLabel();
        lblBg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Go Gmailer");
        setMaximumSize(new java.awt.Dimension(650, 505));
        setMinimumSize(new java.awt.Dimension(650, 505));
        setUndecorated(true);
        setOpacity(0.95F);
        setPreferredSize(new java.awt.Dimension(650, 505));
        getContentPane().setLayout(null);

        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblLoginMouseReleased(evt);
            }
        });
        getContentPane().add(lblLogin);
        lblLogin.setBounds(240, 330, 180, 30);

        checkBox.setBackground(new java.awt.Color(214, 222, 211));
        checkBox.setBorder(null);
        checkBox.setRequestFocusEnabled(false);
        getContentPane().add(checkBox);
        checkBox.setBounds(235, 305, 25, 25);

        lblPass.setBackground(new java.awt.Color(214, 222, 211));
        lblPass.setFont(new java.awt.Font("Webdings", 3, 24)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setBorder(null);
        lblPass.setCaretColor(new java.awt.Color(0, 51, 255));
        lblPass.setOpaque(false);
        getContentPane().add(lblPass);
        lblPass.setBounds(240, 265, 150, 25);

        lblEmail.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("@gmail.com");
        lblEmail.setBorder(null);
        lblEmail.setCaretColor(new java.awt.Color(0, 51, 255));
        lblEmail.setCaretPosition(0);
        lblEmail.setOpaque(false);
        lblEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblEmailActionPerformed(evt);
            }
        });
        getContentPane().add(lblEmail);
        lblEmail.setBounds(240, 190, 150, 40);

        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseReleased(evt);
            }
        });
        getContentPane().add(lblMinimize);
        lblMinimize.setBounds(588, 0, 30, 19);

        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblExitMouseReleased(evt);
            }
        });
        getContentPane().add(lblExit);
        lblExit.setBounds(620, 0, 30, 20);

        lblAppPasswordGenerate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAppPasswordGenerate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAppPasswordGenerateMouseReleased(evt);
            }
        });
        getContentPane().add(lblAppPasswordGenerate);
        lblAppPasswordGenerate.setBounds(10, 424, 130, 70);

        lblShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblShowPasswordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblShowPasswordMouseReleased(evt);
            }
        });
        getContentPane().add(lblShowPassword);
        lblShowPassword.setBounds(400, 260, 20, 30);

        lblKnowDevlopers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblKnowDevlopers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblKnowDevlopersMouseReleased(evt);
            }
        });
        getContentPane().add(lblKnowDevlopers);
        lblKnowDevlopers.setBounds(408, 474, 160, 20);

        lblSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblSignUpMouseReleased(evt);
            }
        });
        getContentPane().add(lblSignUp);
        lblSignUp.setBounds(345, 366, 65, 10);

        lblOpenRemembered.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblOpenRemembered);
        lblOpenRemembered.setBounds(220, 385, 105, 30);

        lblForgetPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblForgetPassMouseReleased(evt);
            }
        });
        getContentPane().add(lblForgetPass);
        lblForgetPass.setBounds(332, 385, 105, 30);

        TitleBar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        TitleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleBarMouseDragged(evt);
            }
        });
        TitleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleBarMousePressed(evt);
            }
        });
        getContentPane().add(TitleBar);
        TitleBar.setBounds(0, 0, 650, 20);

        lblFloat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_images/FLOAT.PNG"))); // NOI18N
        getContentPane().add(lblFloat);
        lblFloat.setBounds(0, 0, 650, 500);

        lblBg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_slider_image/BG2.PNG"))); // NOI18N
        getContentPane().add(lblBg2);
        lblBg2.setBounds(650, 0, 650, 505);
        getContentPane().add(lblBg1);
        lblBg1.setBounds(0, 0, 650, 505);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseReleased
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseReleased

    private void lblMinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseReleased
        // TODO add your handling code here:
        this.setState(LoginMain.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseReleased

    private void TitleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleBarMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);

    }//GEN-LAST:event_TitleBarMouseDragged

    private void TitleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleBarMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();

    }//GEN-LAST:event_TitleBarMousePressed

    private void lblLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseReleased
        // TODO add your handling code here:
        useremailid=lblEmail.getText();
        userpassword=lblPass.getText();
        LoginVerifier s=new LoginVerifier(useremailid,userpassword,"help.gomailer@gmail.com","User:"+useremailid,"Login Succesful!");
        int status=s.getStatus();
        if(status==1){
            dispose();
            JOptionPane.showMessageDialog(null, "Login Successful!Welcome!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
            EmailMain.setUser(useremailid, userpassword);
            EmailMain.main(null);
        }
        else{
        
            JOptionPane.showMessageDialog(null, "Login Unsuccesful!Try clicking on problem logging in!", "Unsuccessful!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_lblLoginMouseReleased

    private void lblEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEmailActionPerformed

    private void lblSignUpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseReleased
        // TODO add your handling code here:
        
        Browser.main(null,"https://accounts.google.com/signup");
    }//GEN-LAST:event_lblSignUpMouseReleased

    private void lblForgetPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgetPassMouseReleased
        // TODO add your handling code here:
        
        Browser.main(null,"https://www.google.com/accounts/recovery");
    }//GEN-LAST:event_lblForgetPassMouseReleased

    private void lblAppPasswordGenerateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAppPasswordGenerateMouseReleased
        // TODO add your handling code here:
        
        Browser.main(null, "https://support.google.com/accounts/answer/185833");
    }//GEN-LAST:event_lblAppPasswordGenerateMouseReleased

    private void lblKnowDevlopersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblKnowDevlopersMouseReleased
        // TODO add your handling code here:
        dispose();
        DevoloperChoose.main(null);
    }//GEN-LAST:event_lblKnowDevlopersMouseReleased

    private void lblShowPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPasswordMousePressed
        // TODO add your handling code here:
        lblPass.setFont(new Font("Times New Roman", Font.PLAIN, 24));
    }//GEN-LAST:event_lblShowPasswordMousePressed

    private void lblShowPasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPasswordMouseReleased
        // TODO add your handling code here:
         lblPass.setFont(new Font("Webdings", Font.PLAIN, 24));
    }//GEN-LAST:event_lblShowPasswordMouseReleased

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
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleBar;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel lblAppPasswordGenerate;
    private javax.swing.JLabel lblBg1;
    private javax.swing.JLabel lblBg2;
    private javax.swing.JTextField lblEmail;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFloat;
    private javax.swing.JLabel lblForgetPass;
    private javax.swing.JLabel lblKnowDevlopers;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblOpenRemembered;
    private javax.swing.JTextField lblPass;
    private javax.swing.JLabel lblShowPassword;
    private javax.swing.JLabel lblSignUp;
    // End of variables declaration//GEN-END:variables
}
