package main.gui;
import javax.swing.ImageIcon;
import main.java.*;

public class Frame extends javax.swing.JFrame {

    User user = new User();
    Admin admin = new Admin();
    Customer customer = new Customer();

    public Frame() {
        initComponents();
        setFrame();
        ImageIcon img = new ImageIcon("src/main/resource/shop.png");
        this.setIconImage(img.getImage());
    }

    public void setFrame() {
        this.userLogin.setFrame(this);
        this.productPage.setFrame(this);
        this.adminMenu.setFrame(this);
        this.customerMenu.setFrame(this);
        this.loginHistory.setFrame(this);
        this.orderProduct.setFrame(this);
        this.orderConfirmation.setFrame(this);
        this.manageUserPage.setFrame(this);
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
        manageUserPage = new main.gui.ManageUserPage();
        loginHistory = new main.gui.LoginHistory();
        orderConfirmation = new main.gui.OrderConfirmation();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giants Grocer");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane.addTab("tab1", userLogin);
        jTabbedPane.addTab("tab2", adminMenu);
        jTabbedPane.addTab("tab3", customerMenu);
        jTabbedPane.addTab("tab4", productPage);
        jTabbedPane.addTab("tab5", orderProduct);
        jTabbedPane.addTab("tab6", manageUserPage);
        jTabbedPane.addTab("tab7", loginHistory);
        jTabbedPane.addTab("tab8", orderConfirmation);

        getContentPane().add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -29, 1310, 790));

        setSize(new java.awt.Dimension(1300, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserLoginPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_UserLoginPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_UserLoginPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public main.gui.AdminMenu adminMenu;
    public main.gui.CustomerMenu customerMenu;
    public javax.swing.JTabbedPane jTabbedPane;
    public main.gui.LoginHistory loginHistory;
    public main.gui.ManageUserPage manageUserPage;
    public main.gui.OrderConfirmation orderConfirmation;
    public main.gui.OrderProduct orderProduct;
    public main.gui.ProductPage productPage;
    public main.gui.UserLogin userLogin;
    // End of variables declaration//GEN-END:variables


}
