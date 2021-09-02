package main.gui;

import java.util.List;
import javax.swing.JOptionPane;
import main.java.Order;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import main.java.OrderItem;
import main.java.TableSortFilter;

public class CustomerMenu extends javax.swing.JPanel {

    Frame frame;
    DefaultTableModel orderHistoryCustomerTableModel;
    List <Order> userOrder;
    String uuid;
    Order uuidOrder;
    private TableRowSorter<TableModel> rowSorter;
    
    public CustomerMenu() {
        initComponents();
        this.rowSorter = new TableRowSorter<>(tblOrderHistoryCustomer.getModel());
        this.tblOrderHistoryCustomer.setRowSorter(rowSorter);
        TableSortFilter.addFilter(rowSorter, tblOrderHistoryCustomer, txtSearch);
    }
    
    public void initAdditionalComponents(){
        txtUsernameCustomerPage.setText(this.frame.customer.getUsername());
        txtNameCustomerPage.setText(this.frame.customer.getName());
        txtAgeCustomerPage.setText(this.frame.customer.getAge());
        btnDeleteOrder.setEnabled(false);
        btnViewOrder.setEnabled(false);
        orderHistoryCustomerTableModel = (DefaultTableModel)tblOrderHistoryCustomer.getModel();
        orderHistoryCustomerTableModel.setRowCount(0);
        fillOrderHistoryTable();
        
    }
    public void setFrame(Frame frame) {
        this.frame = frame;
    }
    public void fillOrderHistoryTable(){
        userOrder = Order.loadUserOrder(frame.user.getUsername());
        for(Order order : this.userOrder){
            String[] dataRow = order.toStringUser().split(";");
            orderHistoryCustomerTableModel.addRow(dataRow);
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

        btnOrderPage = new javax.swing.JButton();
        btnReturnLoginCustomer = new javax.swing.JButton();
        lblCustomerPage2 = new javax.swing.JLabel();
        txtAgeCustomerPage = new javax.swing.JTextField();
        lblNameCustomerPage = new javax.swing.JLabel();
        txtNameCustomerPage = new javax.swing.JTextField();
        lblAgeCustomerPage = new javax.swing.JLabel();
        txtUsernameCustomerPage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderHistoryCustomer = new javax.swing.JTable();
        lblCustomerPage1 = new javax.swing.JLabel();
        btnDeleteOrder = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnOrderPage.setText("Order Page");
        btnOrderPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderPageActionPerformed(evt);
            }
        });

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

        tblOrderHistoryCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        tblOrderHistoryCustomer.getTableHeader().setReorderingAllowed(false);
        tblOrderHistoryCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderHistoryCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrderHistoryCustomer);

        lblCustomerPage1.setText("Order History");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNameCustomerPage)
                            .addComponent(lblAgeCustomerPage))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNameCustomerPage, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(txtAgeCustomerPage)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCustomerPage2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsernameCustomerPage, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(btnOrderPage, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(498, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReturnLoginCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(btnViewOrder)
                            .addGap(18, 18, 18)
                            .addComponent(btnDeleteOrder))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(124, 124, 124)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblCustomerPage1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblCustomerPage1)
                .addGap(11, 11, 11)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewOrder)
                    .addComponent(btnDeleteOrder))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustomerPage2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsernameCustomerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNameCustomerPage)
                            .addComponent(txtNameCustomerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnOrderPage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgeCustomerPage)
                    .addComponent(txtAgeCustomerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReturnLoginCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnLoginCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnLoginCustomerActionPerformed
        int result = JOptionPane.showConfirmDialog(frame,"Are you sure you want to logout?", "Logout Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            this.frame.user.saveLogoutTime();
            this.frame.userLogin.resetCredentialField();
            this.frame.changePages(0);
            this.frame.userLogin.btnLogin.requestFocus();
        }else if (result == JOptionPane.NO_OPTION){
           this.frame.changePages(2);
        }
        
    }//GEN-LAST:event_btnReturnLoginCustomerActionPerformed

    private void btnOrderPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderPageActionPerformed
        this.frame.changePages(4);
        this.frame.orderProduct.initAdditionalComponents();
    }//GEN-LAST:event_btnOrderPageActionPerformed

    private void btnDeleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOrderActionPerformed
        uuidOrder = Order.getOrder(uuid);
        uuidOrder.removeOrder();
        initAdditionalComponents();
    }//GEN-LAST:event_btnDeleteOrderActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        frame.orderConfirmation.initAdditionalComponentsView(OrderItem.loadUuidOrderItem(uuid), Order.getOrder(uuid));
        frame.changePages(7);
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void tblOrderHistoryCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderHistoryCustomerMouseClicked
        btnDeleteOrder.setEnabled(true);
        btnViewOrder.setEnabled(true);
        int row = tblOrderHistoryCustomer.getSelectedRow();
        uuid = orderHistoryCustomerTableModel.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tblOrderHistoryCustomerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteOrder;
    private javax.swing.JButton btnOrderPage;
    private javax.swing.JButton btnReturnLoginCustomer;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgeCustomerPage;
    private javax.swing.JLabel lblCustomerPage1;
    private javax.swing.JLabel lblCustomerPage2;
    private javax.swing.JLabel lblNameCustomerPage;
    private javax.swing.JTable tblOrderHistoryCustomer;
    private javax.swing.JTextField txtAgeCustomerPage;
    private javax.swing.JTextField txtNameCustomerPage;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUsernameCustomerPage;
    // End of variables declaration//GEN-END:variables
    

}
