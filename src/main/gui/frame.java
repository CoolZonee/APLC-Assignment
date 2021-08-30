package main.gui;

import main.java.*;

public class Frame extends javax.swing.JFrame {

    User user = new User();
    Admin admin;
    Customer customer;

    public Frame() {
        initComponents();
        setFrame();

    }

    public void setFrame() {
        this.userLogin.setFrame(this);
        this.adminMenu.setFrame(this);
        this.customerMenu.setFrame(this);
    }

    public void changePages(int tab) {
        this.jTabbedPane.setSelectedIndex(tab);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        userLogin = new main.gui.UserLogin();
        adminMenu = new main.gui.AdminMenu();
        customerMenu = new main.gui.CustomerMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane.addTab("tab1", userLogin);
        jTabbedPane.addTab("tab2", adminMenu);
        jTabbedPane.addTab("tab3", customerMenu);

        getContentPane().add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 760));

        setBounds(0, 0, 1316, 799);
    }// </editor-fold>//GEN-END:initComponents

    private void UserLoginPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_UserLoginPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_UserLoginPropertyChange

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public main.gui.AdminMenu adminMenu;
    public main.gui.CustomerMenu customerMenu;
    public javax.swing.JTabbedPane jTabbedPane;
    public main.gui.UserLogin userLogin;
    // End of variables declaration//GEN-END:variables

}
