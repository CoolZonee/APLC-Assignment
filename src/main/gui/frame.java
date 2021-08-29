package main.gui;
import main.java.*;
public class Frame extends javax.swing.JFrame {

    User User=new User();
    Admin Admin;
    Customer Customer;
    public Frame() {  
        initComponents();
        setFrame();

    }
    public void setFrame(){
        this.UserLogin.setFrame(this);
        this.AdminMenu.setFrame(this);
        this.CustomerMenu.setFrame(this);
    }
    
    public void changePages(int tab){
        this.jTabbedPane2.setSelectedIndex(tab);

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        UserLogin = new main.gui.UserLogin();
        AdminMenu = new main.gui.AdminMenu();
        CustomerMenu = new main.gui.CustomerMenu();
        productPage = new main.gui.ProductPage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setToolTipText("");

        UserLogin.setRequestFocusEnabled(false);
        UserLogin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                UserLoginPropertyChange(evt);
            }
        });
        jTabbedPane2.addTab("tab1", UserLogin);
        jTabbedPane2.addTab("tab2", AdminMenu);
        jTabbedPane2.addTab("tab3", CustomerMenu);
        jTabbedPane2.addTab("tab4", productPage);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 750));

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
    public main.gui.AdminMenu AdminMenu;
    public main.gui.CustomerMenu CustomerMenu;
    public main.gui.UserLogin UserLogin;
    private javax.swing.JTabbedPane jTabbedPane2;
    private main.gui.ProductPage productPage;
    // End of variables declaration//GEN-END:variables

}
