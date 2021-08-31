package main.gui;

import main.java.*;

public class Frame extends javax.swing.JFrame {

    User user = new User();
    Admin admin;
    Customer customer;
    Order order = new Order();

    public Frame() {
        initComponents();
        setFrame();

    }

    public void setFrame() {
        this.userLogin.setFrame(this);
        this.adminMenu.setFrame(this);
        this.customerMenu.setFrame(this);
        this.loginHistory.setFrame(this);
        this.orderProduct.setFrame(this);
        this.orderConfirmation.setFrame(this);
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
        productPage = new main.gui.ProductPage();
        orderProduct = new main.gui.OrderProduct();
        manageCustomerPage = new main.gui.ManageCustomerPage();
        loginHistory = new main.gui.LoginHistory();
        orderConfirmation = new main.gui.OrderConfirmation();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane.addTab("tab1", userLogin);
        jTabbedPane.addTab("tab2", adminMenu);
        jTabbedPane.addTab("tab3", customerMenu);
        jTabbedPane.addTab("tab4", productPage);
        jTabbedPane.addTab("tab5", orderProduct);
        jTabbedPane.addTab("tab6", manageCustomerPage);
        jTabbedPane.addTab("tab7", loginHistory);
        jTabbedPane.addTab("tab8", orderConfirmation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1300, 800));
        setLocationRelativeTo(null);
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
    public main.gui.LoginHistory loginHistory;
    private main.gui.ManageCustomerPage manageCustomerPage;
    public main.gui.OrderConfirmation orderConfirmation;
    public main.gui.OrderProduct orderProduct;
    private main.gui.ProductPage productPage;
    public main.gui.UserLogin userLogin;
    // End of variables declaration//GEN-END:variables

}
