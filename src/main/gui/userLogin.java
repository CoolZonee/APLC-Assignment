package main.gui;


import java.awt.Font;
import main.java.*;

public class UserLogin extends javax.swing.JPanel {
    Frame frame;
    Font fontPlain=new Font("Tahoma", Font.PLAIN,11);
    Font fontItalics=new Font("Tahoma", Font.ITALIC,11);    
    public UserLogin() {
        initComponents();
        resetCredentialField();
    }
    public void setFrame(Frame frame) {
        this.frame = frame;
    }
    public void clearInvalidCredentials(){
        lblInvalidCredentials.setVisible(false);
    }
    public void resetCredentialField(){
        lblInvalidCredentials.setVisible(false);
        txtUsernameLogin.setFont(fontItalics);
        txtPasswordLogin.setFont(fontItalics);
        //txtPasswordLogin.setEchoChar((char)0);
        txtUsernameLogin.setText("Enter username here");
        txtPasswordLogin.setText("Enter password here");
        showPasswordState();
            
        
    }
    private void showPasswordState(){
        if (chkShowPassword.isSelected()==true || String.valueOf(txtPasswordLogin.getPassword()).equals("Enter password here") ){
            txtPasswordLogin.setEchoChar((char)0);
        }else{
            txtPasswordLogin.setEchoChar('*');
        }
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
        txtUsernameLogin = new javax.swing.JTextField();
        txtPasswordLogin = new javax.swing.JPasswordField();
        lblInvalidCredentials = new javax.swing.JLabel();
        chkShowPassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblLoginText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));

        txtUsernameLogin.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtUsernameLogin.setText("Enter username here");
        txtUsernameLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameLoginFocusLost(evt);
            }
        });

        txtPasswordLogin.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtPasswordLogin.setText("Enter password here");
        txtPasswordLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordLoginFocusLost(evt);
            }
        });

        lblInvalidCredentials.setForeground(new java.awt.Color(255, 51, 51));
        lblInvalidCredentials.setText("Invalid Username & Password");
        lblInvalidCredentials.setToolTipText("");

        chkShowPassword.setText("Show Password");
        chkShowPassword.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkShowPasswordStateChanged(evt);
            }
        });

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogin.setLabel("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblLoginText.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblLoginText.setText("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsernameLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasswordLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chkShowPassword)
                        .addGap(141, 141, 141))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblInvalidCredentials))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblLoginText)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLoginText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsernameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addComponent(lblInvalidCredentials)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkShowPassword)
                .addGap(50, 50, 50)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 300, 350));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 80)); // NOI18N
        jLabel3.setText("Giants");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 220, 120));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        jLabel4.setText("Grocer");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 70, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        if (frame.user.authenticate(txtUsernameLogin.getText(),String.valueOf(txtPasswordLogin.getPassword()))==true){
            if ("A".equals(frame.user.getRole())){
                frame.admin=new Admin(frame.user.getRole(),frame.user.getUsername(),frame.user.getPassword(), frame.user.getSex(), frame.user.getName(), frame.user.getAge());
                this.frame.adminMenu.initAdditionalComponents();
                this.frame.changePages(1);

            }else{
                frame.customer=new Customer(frame.user.getRole(),frame.user.getUsername(),frame.user.getPassword(), frame.user.getSex(), frame.user.getName(), frame.user.getAge());
                this.frame.customerMenu.initAdditionalComponents();
                this.frame.changePages(2);
            }
        }else{
            resetCredentialField();
            lblInvalidCredentials.setVisible(true);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameLoginFocusGained
        if (txtUsernameLogin.getText().equals("Enter username here")){
            txtUsernameLogin.setText("");
            txtUsernameLogin.setFont(fontPlain);
        }
    }//GEN-LAST:event_txtUsernameLoginFocusGained

    private void txtPasswordLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordLoginFocusGained
        if(String.valueOf(txtPasswordLogin.getPassword()).equals("Enter password here")){
            txtPasswordLogin.setText("");
            txtPasswordLogin.setFont(fontPlain);
        }
        showPasswordState();
    }//GEN-LAST:event_txtPasswordLoginFocusGained

    private void chkShowPasswordStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkShowPasswordStateChanged
        showPasswordState();
    }//GEN-LAST:event_chkShowPasswordStateChanged

    private void txtUsernameLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameLoginFocusLost
        if(txtUsernameLogin.getText().equals("")){
            txtUsernameLogin.setFont(fontItalics);
            txtUsernameLogin.setText("Enter username here");
                           
        }
    }//GEN-LAST:event_txtUsernameLoginFocusLost

    private void txtPasswordLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordLoginFocusLost
        if(String.valueOf(txtPasswordLogin.getPassword()).equals("")){
            txtPasswordLogin.setFont(fontItalics);
            txtPasswordLogin.setEchoChar((char)0);
            txtPasswordLogin.setText("Enter password here");
                           
        }
    }//GEN-LAST:event_txtPasswordLoginFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox chkShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInvalidCredentials;
    private javax.swing.JLabel lblLoginText;
    private javax.swing.JPasswordField txtPasswordLogin;
    private javax.swing.JTextField txtUsernameLogin;
    // End of variables declaration//GEN-END:variables

    
}

