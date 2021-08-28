package main.gui;
import main.java.*;

public class customerMenu extends javax.swing.JPanel {

    /**
     * Creates new form adminMenu
     */
    
    public customerMenu() {
        initComponents();
    }
    private void initAdditionalComponents(){
        txtUsernameCustomerPage.setText(this.customer.getUsername());
        txtNameCustomerPage.setText(this.customer.getName());
        txtAgeCustomerPage.setText(this.customer.getAge());
        
    }
    public void setFrame(frame frame) {
        this.frame = frame;
    }
    public void setCustomer(customer customer){
        this.customer=customer;
        this.initAdditionalComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrderPage = new javax.swing.JButton();
        btnReturnLoginCustomer = new javax.swing.JButton();
        lblCustomerPage2 = new javax.swing.JLabel();
        txtAgeCustomerPage = new javax.swing.JTextField();
        lblNameCustomerPage = new javax.swing.JLabel();
        txtNameCustomerPage = new javax.swing.JTextField();
        lblAgeCustomerPage = new javax.swing.JLabel();
        txtUsernameCustomerPage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPastPurchasesCustomer = new javax.swing.JTable();
        lblCustomerPage1 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnOrderPage.setText("Order Page");

        btnReturnLoginCustomer.setText("Logout");
        btnReturnLoginCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnLoginCustomerActionPerformed(evt);
            }
        });

        lblCustomerPage2.setText("Logged in as : Customer");

        txtAgeCustomerPage.setEditable(false);

        lblNameCustomerPage.setText("Name:");

        txtNameCustomerPage.setEditable(false);

        lblAgeCustomerPage.setText("Age: ");
        lblAgeCustomerPage.setToolTipText("");

        txtUsernameCustomerPage.setEditable(false);

        tblPastPurchasesCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPastPurchasesCustomer.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPastPurchasesCustomer);

        lblCustomerPage1.setText("Past Purchases");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNameCustomerPage)
                    .addComponent(lblAgeCustomerPage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNameCustomerPage, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(txtAgeCustomerPage))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReturnLoginCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(btnOrderPage, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 105, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblCustomerPage2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsernameCustomerPage, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblCustomerPage1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblCustomerPage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerPage2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsernameCustomerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNameCustomerPage)
                            .addComponent(txtNameCustomerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrderPage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAgeCustomerPage)
                        .addComponent(txtAgeCustomerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnReturnLoginCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnLoginCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnLoginCustomerActionPerformed
        this.frame.userLogin1.resetCredentialField();
        this.frame.changePages(0);
        this.frame.userLogin1.btnLogin.requestFocus();
        
        
    }//GEN-LAST:event_btnReturnLoginCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderPage;
    private javax.swing.JButton btnReturnLoginCustomer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgeCustomerPage;
    private javax.swing.JLabel lblCustomerPage1;
    private javax.swing.JLabel lblCustomerPage2;
    private javax.swing.JLabel lblNameCustomerPage;
    private javax.swing.JTable tblPastPurchasesCustomer;
    private javax.swing.JTextField txtAgeCustomerPage;
    private javax.swing.JTextField txtNameCustomerPage;
    private javax.swing.JTextField txtUsernameCustomerPage;
    // End of variables declaration//GEN-END:variables
    frame frame;
    customer customer;
}
