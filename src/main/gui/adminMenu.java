package main.gui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import main.java.Order;
import main.java.OrderItem;
import main.java.TableSortFilter;

public class AdminMenu extends javax.swing.JPanel {
    private Frame frame;
    private DefaultTableModel orderHistoryAdminTableModel;
    private List <Order> userOrder;
    private TableRowSorter<TableModel> rowSorter;
    private String uuid;
    private Order uuidOrder;
    
    public AdminMenu() {
        initComponents();
        this.rowSorter = new TableRowSorter<>(tblOrderHistoryAdmin.getModel());
        this.tblOrderHistoryAdmin.setRowSorter(rowSorter);
        TableSortFilter.addFilter(rowSorter, tblOrderHistoryAdmin, txtSearch);
    }
    
    public void initAdditionalComponents(){
        txtUsernameAdminPage.setText(this.frame.admin.getUsername());
        txtNameAdminPage.setText(this.frame.admin.getName());
        txtAgeAdminPage.setText(this.frame.admin.getAge());
        btnDeleteOrder.setEnabled(false);
        btnViewOrder.setEnabled(false);
        orderHistoryAdminTableModel = (DefaultTableModel)tblOrderHistoryAdmin.getModel();
        orderHistoryAdminTableModel.setRowCount(0);
        fillOrderHistoryTable();
        
    }
    public void setFrame(Frame frame) {
        this.frame = frame;
    }
    public void fillOrderHistoryTable(){
        this.userOrder = this.frame.user.loadOrder();
        for(Order order : this.userOrder){
            String[] dataRow = order.toStringUser().split(";");
            orderHistoryAdminTableModel.addRow(dataRow);
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

        btnOrderPageAdmin = new javax.swing.JButton();
        btnEditProductAdmin = new javax.swing.JButton();
        btnEditUserAdmin = new javax.swing.JButton();
        btnReturnLoginAdmin = new javax.swing.JButton();
        lblAdminPage2 = new javax.swing.JLabel();
        txtAgeAdminPage = new javax.swing.JTextField();
        lblNameAdminPage = new javax.swing.JLabel();
        txtNameAdminPage = new javax.swing.JTextField();
        lblAgeAdminPage = new javax.swing.JLabel();
        txtUsernameAdminPage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderHistoryAdmin = new javax.swing.JTable();
        lblAdminPage1 = new javax.swing.JLabel();
        btnViewLoginHistory = new javax.swing.JButton();
        btnDeleteOrder = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnReport = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnOrderPageAdmin.setText("Order Page");
        btnOrderPageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderPageAdminActionPerformed(evt);
            }
        });

        btnEditProductAdmin.setText("Edit Products");
        btnEditProductAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProductAdminActionPerformed(evt);
            }
        });

        btnEditUserAdmin.setText("Edit Users");
        btnEditUserAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserAdminActionPerformed(evt);
            }
        });

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

        tblOrderHistoryAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Total", "Paid", "Change", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblOrderHistoryAdmin.getTableHeader().setReorderingAllowed(false);
        tblOrderHistoryAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderHistoryAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrderHistoryAdmin);

        lblAdminPage1.setText("Order History");

        btnViewLoginHistory.setText("Login History");
        btnViewLoginHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLoginHistoryActionPerformed(evt);
            }
        });

        btnDeleteOrder.setText("Delete Order");
        btnDeleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOrderActionPerformed(evt);
            }
        });

        btnViewOrder.setText("View Order");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNameAdminPage)
                    .addComponent(lblAgeAdminPage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNameAdminPage, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(txtAgeAdminPage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReturnLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewOrder)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteOrder))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblAdminPage2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsernameAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrderPageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditUserAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditProductAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewLoginHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256)))
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblAdminPage1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblAdminPage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteOrder)
                    .addComponent(btnViewOrder))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnOrderPageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditUserAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditProductAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnViewLoginHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAdminPage2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUsernameAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameAdminPage)
                    .addComponent(txtNameAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgeAdminPage)
                    .addComponent(txtAgeAdminPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReturnLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnLoginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnLoginAdminActionPerformed
        int result = JOptionPane.showConfirmDialog(frame,"Are you sure you want to logout?", "Logout Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            this.frame.user.saveLogoutTime();
            this.frame.userLogin.resetCredentialField();
            this.frame.changePages(0);
            this.frame.userLogin.btnLogin.requestFocus();
        }else if (result == JOptionPane.NO_OPTION){
           this.frame.changePages(1);
        }
    }//GEN-LAST:event_btnReturnLoginAdminActionPerformed

    private void btnEditProductAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProductAdminActionPerformed
        this.frame.changePages(3);
        this.frame.productPage.initAdditionalComponents();
    }//GEN-LAST:event_btnEditProductAdminActionPerformed

    private void btnOrderPageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderPageAdminActionPerformed
        this.frame.changePages(4);
        this.frame.orderProduct.initAdditionalComponents();
    }//GEN-LAST:event_btnOrderPageAdminActionPerformed

    private void btnEditUserAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserAdminActionPerformed
        this.frame.changePages(5);
        this.frame.manageUserPage.initAddtionalComponents();
    }//GEN-LAST:event_btnEditUserAdminActionPerformed

    private void btnViewLoginHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLoginHistoryActionPerformed
        this.frame.changePages(6);
        this.frame.loginHistory.initAdditionalComponents();
    }//GEN-LAST:event_btnViewLoginHistoryActionPerformed

    private void btnDeleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOrderActionPerformed
        uuidOrder = Order.getOrder(uuid);
        uuidOrder.removeOrder();
        initAdditionalComponents();
    }//GEN-LAST:event_btnDeleteOrderActionPerformed

    private void tblOrderHistoryAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderHistoryAdminMouseClicked
        btnDeleteOrder.setEnabled(true);
        btnViewOrder.setEnabled(true);
        int row = tblOrderHistoryAdmin.getSelectedRow();
        uuid = orderHistoryAdminTableModel.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tblOrderHistoryAdminMouseClicked

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        frame.orderConfirmation.initAdditionalComponentsView(OrderItem.loadUuidOrderItem(uuid), Order.getOrder(uuid));
        frame.orderConfirmation.setBackMenu(true);
        frame.orderConfirmation.setOrder(Order.getOrder(uuid));
        frame.changePages(7);
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        this.frame.changePages(8);
    }//GEN-LAST:event_btnReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteOrder;
    private javax.swing.JButton btnEditProductAdmin;
    private javax.swing.JButton btnEditUserAdmin;
    private javax.swing.JButton btnOrderPageAdmin;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnReturnLoginAdmin;
    private javax.swing.JButton btnViewLoginHistory;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdminPage1;
    private javax.swing.JLabel lblAdminPage2;
    private javax.swing.JLabel lblAgeAdminPage;
    private javax.swing.JLabel lblNameAdminPage;
    private javax.swing.JTable tblOrderHistoryAdmin;
    private javax.swing.JTextField txtAgeAdminPage;
    private javax.swing.JTextField txtNameAdminPage;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUsernameAdminPage;
    // End of variables declaration//GEN-END:variables
    

}
