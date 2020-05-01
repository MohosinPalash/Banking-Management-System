/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author mohos
 */
public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterFrame
     */
    public RegisterFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        LoginPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SignInButton = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EmailAddress = new javax.swing.JTextField();
        UserName = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        ConfirmPassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginPanel.setBackground(new java.awt.Color(58, 14, 18));
        LoginPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Admin SignUp");

        SignInButton.setBackground(new java.awt.Color(88, 48, 50));
        SignInButton.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        SignInButton.setForeground(new java.awt.Color(255, 255, 255));
        SignInButton.setText("Sign in");
        SignInButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        SignInButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SignInButtonFocusGained(evt);
            }
        });
        SignInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInButtonMouseClicked(evt);
            }
        });

        SignUpButton.setBackground(new java.awt.Color(88, 48, 50));
        SignUpButton.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(255, 255, 255));
        SignUpButton.setText("Sign up");
        SignUpButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        SignUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpButtonMouseClicked(evt);
            }
        });
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("username");

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Password");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Confirm Password");

        EmailAddress.setBackground(new java.awt.Color(58, 14, 18));
        EmailAddress.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        EmailAddress.setForeground(new java.awt.Color(153, 153, 153));
        EmailAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmailAddress.setText("Email Address");
        EmailAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        EmailAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailAddressFocusLost(evt);
            }
        });
        EmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddressActionPerformed(evt);
            }
        });

        UserName.setBackground(new java.awt.Color(58, 14, 18));
        UserName.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(153, 153, 153));
        UserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserName.setText("Username");
        UserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        UserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UserNameFocusLost(evt);
            }
        });
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });

        Password.setBackground(new java.awt.Color(58, 14, 18));
        Password.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        ConfirmPassword.setBackground(new java.awt.Color(58, 14, 18));
        ConfirmPassword.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        ConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SignInButton, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(SignUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(EmailAddress)
                    .addComponent(UserName)
                    .addComponent(jLabel7)
                    .addComponent(Password)
                    .addComponent(ConfirmPassword))
                .addGap(29, 29, 29))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(2, 2, 2)
                .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(LoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 300, -1));

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(226, 199, 178));
        jLabel12.setText("&");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(226, 199, 178));
        jLabel11.setText("Mohosin Islam Palash");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, -1, 20));

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(226, 199, 178));
        jLabel10.setText("Samia Rahman Misty");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(226, 199, 178));
        jLabel9.setText("A Project By:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        jLabel5.setBackground(new java.awt.Color(226, 199, 178));
        jLabel5.setFont(new java.awt.Font("Cambria", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(226, 199, 178));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Banking Management System");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/front33.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignInButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SignInButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_SignInButtonFocusGained

    private void SignUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpButtonMouseClicked

    }//GEN-LAST:event_SignUpButtonMouseClicked

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        String email = EmailAddress.getText();
        String user = UserName.getText();
        String pass = String.valueOf(Password.getPassword());
        String ConPass = String.valueOf(ConfirmPassword.getPassword());
        
        if(verifyField())
        {
            if(!verifyUsername(user))
            {
                
                    PreparedStatement st;
                    ResultSet rs;
                
                String SignUpQuery = "INSERT INTO `admin_login`(`email_add`, `user_name`, `password`) VALUES (?,?,?) ";
                try {
                    st = Database_Connection.getConnectoin().prepareStatement(SignUpQuery);
                    st.setString(1, email);
                    st.setString(2, user);
                    st.setString(3, pass);
                    if (st.executeUpdate()!=0)
                    {
                        JOptionPane.showMessageDialog(null, "Account successfully created.", "Admin Registration",2);
                    }else{
                         JOptionPane.showMessageDialog(null, "Wrong Information. Check Again!", "Error",2);
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(RegisterFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                }
                
                
            }
            
        
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void EmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddressActionPerformed

    private void EmailAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailAddressFocusGained
         if (EmailAddress.getText().trim().toLowerCase().equals("email address"))
        {
            EmailAddress.setText("");
            EmailAddress.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_EmailAddressFocusGained

    private void EmailAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailAddressFocusLost
         if (EmailAddress.getText().trim().toLowerCase().equals("email address") ||
              EmailAddress.getText().trim().equals(""))
        {
            EmailAddress.setText("Email Address");
            EmailAddress.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_EmailAddressFocusLost

    private void UserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserNameFocusGained
         if (UserName.getText().trim().toLowerCase().equals("username"))
        {
            UserName.setText("");
            UserName.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_UserNameFocusGained

    private void UserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserNameFocusLost
         if (UserName.getText().trim().toLowerCase().equals("username") ||
              UserName.getText().trim().equals(""))
        {
            UserName.setText("Username");
            UserName.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_UserNameFocusLost

    private void SignInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseClicked
        
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_SignInButtonMouseClicked
    
    
    // Registration verification conditions
    public boolean verifyField()
    {
        String email = EmailAddress.getText();
        String user = UserName.getText();
        String pass = String.valueOf(Password.getPassword());
        String ConPass = String.valueOf(ConfirmPassword.getPassword());
        
        //if there is any empty field
        if( email.trim().equals("") ||
             user.trim().equals("") ||
             pass.trim().equals("") ||
             ConPass.trim().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Please fill up the all fields. ", "Error",2);
            return false;
        }
        //if the two password doesn't match
        else if(!pass.equals(ConPass))
        {
                 JOptionPane.showMessageDialog(null, "Password doesn't match. ", "Error",2);
                 return false;
        }else if (!email.endsWith("@gmail.com")){
            JOptionPane.showMessageDialog(null, "Invalid email address ", "Error",2);
                 return false;
        }
        //if everything is okay
        else
        {
            return true;
        }
    }
    
    // check wheteher the username is already exist or not
    public boolean verifyUsername (String username)
    {
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        String query = "SELECT * FROM `admin_login` WHERE `user_name` = ? ";
        
        try {
            st = Database_Connection.getConnectoin().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                username_exist = true;
                 JOptionPane.showMessageDialog(null, "This username is already existed.", "Error",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return username_exist;
        
    }
    
    
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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.JTextField EmailAddress;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton SignInButton;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
