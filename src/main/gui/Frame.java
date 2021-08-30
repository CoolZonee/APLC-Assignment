package main.gui;

public class Frame extends javax.swing.JFrame {
    
    public Frame() {  
        initComponents();
        passFrame();

    }
    public void passFrame(){
        this.userLogin.setFrame(this);
        this.adminMenu.setFrame(this);
        this.customerMenu.setFrame(this);
        this.productPage.setFrame(this);
    }
    
    public void changePages(int tab){
        this.jTabbedPane2.setSelectedIndex(tab);
        this.userLogin.clearInvalidCredentials();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        userLogin = new main.gui.UserLogin();
        adminMenu = new main.gui.AdminMenu();
        customerMenu = new main.gui.CustomerMenu();
        orderProduct = new main.gui.OrderProduct();
        productPage = new main.gui.ProductPage();
        manageCustomerPage = new main.gui.ManageCustomerPage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jTabbedPane2.setToolTipText("");
        jTabbedPane2.addTab("tab1", userLogin);
        jTabbedPane2.addTab("tab2", adminMenu);
        jTabbedPane2.addTab("tab3", customerMenu);
        jTabbedPane2.addTab("tab4", orderProduct);
        jTabbedPane2.addTab("tab5", productPage);
        jTabbedPane2.addTab("tab6", manageCustomerPage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1316, 799));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userLogin1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_userLogin1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_userLogin1PropertyChange

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
                System.out.println(this);
                
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.gui.AdminMenu adminMenu;
    private main.gui.CustomerMenu customerMenu;
    private javax.swing.JTabbedPane jTabbedPane2;
    private main.gui.ManageCustomerPage manageCustomerPage;
    private main.gui.OrderProduct orderProduct;
    private main.gui.ProductPage productPage;
    private main.gui.UserLogin userLogin;
    // End of variables declaration//GEN-END:variables

}
