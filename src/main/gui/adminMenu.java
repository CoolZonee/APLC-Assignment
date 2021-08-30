package main.gui;
import javax.swing.JOptionPane;



public class AdminMenu extends javax.swing.JPanel {
    Frame frame;
    public AdminMenu() {
        initComponents();
    }
    public void initAdditionalComponents(){
        txtUsernameAdminPage.setText(this.frame.admin.getUsername());
        txtNameAdminPage.setText(this.frame.admin.getName());
        txtAgeAdminPage.setText(this.frame.admin.getAge());
        
    }
    public void setFrame(Frame frame) {
        this.frame = frame;
    }
 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrderPageAdmin = new javax.swing.JButton();
        btnEditProductAdmin = new javax.swing.JButton();
        btnEditCustomerAdmin = new javax.swing.JButton();
        btnReturnLoginAdmin = new javax.swing.JButton();
        lblAdminPage2 = new javax.swing.JLabel();
        txtAgeAdminPage = new javax.swing.JTextField();
        lblNameAdminPage = new javax.swing.JLabel();
        txtNameAdminPage = new javax.swing.JTextField();
        lblAgeAdminPage = new javax.swing.JLabel();
        txtUsernameAdminPage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPastPurchasesAdmin = new javax.swing.JTable();
        lblAdminPage1 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnOrderPageAdmin.setText("Order Page");

        btnEditProductAdmin.setText("Edit Products");
        btnEditProductAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProductAdminActionPerformed(evt);
            }
        });

        btnEditCustomerAdmin.setText("Edit Customers");

        btnReturnLoginAdmin.setText("Logout");
        btnReturnLoginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnLoginAdminActionPerformed(evt);
            }
        });

        lblAdminPage2.setText("Logged in as : Admin");

        txtAgeAdminPage.setEditable(false);

        lblNameAdminPage.setText("Name:");

        txtNameAdminPage.setEditable(false);

        lblAgeAdminPage.setText("Age: ");
        lblAgeAdminPage.setToolTipText("");

        txtUsernameAdminPage.setEditable(false);

        tblPastPurchasesAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Product", "Quantity", "Price", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPastPurchasesAdmin.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPastPurchasesAdmin);

        lblAdminPage1.setText("Past Purchases");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNameAdminPage)
                    .addComponent(lblAgeAdminPage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNameAdminPage, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(txtAgeAdminPage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOrderPageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditProductAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditCustomerAdmin)
                        .addGap(429, 429, 429))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReturnLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 105, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblAdminPage2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsernameAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblAdminPage1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblAdminPage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdminPage2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsernameAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNameAdminPage)
                            .addComponent(txtNameAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAgeAdminPage)
                                .addComponent(txtAgeAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnReturnLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEditCustomerAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(btnEditProductAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOrderPageAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnLoginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnLoginAdminActionPerformed
        int result = JOptionPane.showConfirmDialog(frame,"Are you sure you want to logout?", "Logout Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            this.frame.userLogin.resetCredentialField();
            this.frame.changePages(0);
            this.frame.userLogin.btnLogin.requestFocus();
        }else if (result == JOptionPane.NO_OPTION){
           this.frame.changePages(1);
        }
    }//GEN-LAST:event_btnReturnLoginAdminActionPerformed

    private void btnEditProductAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProductAdminActionPerformed
        this.frame.changePages(3);
    }//GEN-LAST:event_btnEditProductAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditCustomerAdmin;
    private javax.swing.JButton btnEditProductAdmin;
    private javax.swing.JButton btnOrderPageAdmin;
    private javax.swing.JButton btnReturnLoginAdmin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdminPage1;
    private javax.swing.JLabel lblAdminPage2;
    private javax.swing.JLabel lblAgeAdminPage;
    private javax.swing.JLabel lblNameAdminPage;
    private javax.swing.JTable tblPastPurchasesAdmin;
    private javax.swing.JTextField txtAgeAdminPage;
    private javax.swing.JTextField txtNameAdminPage;
    private javax.swing.JTextField txtUsernameAdminPage;
    // End of variables declaration//GEN-END:variables
    

}
