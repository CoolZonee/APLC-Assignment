package main.gui;

public class frame extends javax.swing.JFrame {


    public frame() {  
        initComponents();
        passFrame();

    }
    public void passFrame(){
        this.userLogin1.setFrame(this);
        this.adminMenu1.setFrame(this);
        this.customerMenu3.setFrame(this);
//        this.productPage.setFrame(this);
    }
    
    public void changePages(int tab){
        this.jTabbedPane2.setSelectedIndex(tab);
        this.userLogin1.clearInvalidCredentials();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        userLogin1 = new main.gui.userLogin();
        adminMenu1 = new main.gui.adminMenu();
        customerMenu3 = new main.gui.customerMenu();
        jPanel1 = new javax.swing.JPanel();
        productPage = new main.gui.ProductPage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setToolTipText("");

        userLogin1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                userLogin1PropertyChange(evt);
            }
        });
        jTabbedPane2.addTab("tab1", userLogin1);
        jTabbedPane2.addTab("tab2", adminMenu1);
        jTabbedPane2.addTab("tab3", customerMenu3);

        jPanel1.add(productPage);

        jTabbedPane2.addTab("tab4", jPanel1);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 750));

        setBounds(0, 0, 1316, 799);
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
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
                System.out.println(this);
                
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public main.gui.adminMenu adminMenu1;
    public main.gui.customerMenu customerMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private main.gui.ProductPage productPage;
    private main.gui.userLogin userLogin1;
    // End of variables declaration//GEN-END:variables

}
