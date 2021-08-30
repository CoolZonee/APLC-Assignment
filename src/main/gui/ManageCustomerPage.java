/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.gui;

import java.awt.Frame;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import main.java.Admin;
import main.java.TableSortFilter;
import main.java.User;

public class ManageCustomerPage extends javax.swing.JPanel {
    private DefaultTableModel dfTable;
    private TableRowSorter<TableModel> rowSorter;
    private User user = new User();
    private int selectedRow;
    private Frame frame;
    Admin admin = new Admin();
    
    public ManageCustomerPage() {
        initComponents();
        this.dfTable = (DefaultTableModel)tblCustomer.getModel();
        this.rowSorter = new TableRowSorter<>(tblCustomer.getModel());
        // Disable sorting function
        for(int i = 0; i < tblCustomer.getColumnCount(); i++) {
            this.rowSorter.setSortable(i, false);
        }
        this.tblCustomer.setRowSorter(rowSorter);
        TableSortFilter.addFilter(rowSorter, tblCustomer, txtSearchProduct);
        this.enableUpdateDeleteBtn(false);
        this.loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        pnlProductDetails = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblRole = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        cmbSex = new javax.swing.JComboBox<>();
        txtSearchProduct = new javax.swing.JTextField();

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Name", "Role", "Sex", "Age"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        tblCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCustomerKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        pnlProductDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("User Details"));
        pnlProductDetails.setToolTipText("");
        pnlProductDetails.setName(""); // NOI18N

        lblUsername.setText("Username:");

        lblName.setText("Name:");

        lblSex.setText("Sex:");

        lblAge.setText("Age:");

        txtUsername.setToolTipText("");

        btnUpdate.setText("Add New Customer");
        btnUpdate.setActionCommand("Add New User");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtName.setToolTipText("");

        lblRole.setText("Role:");

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Role-", "A", "C" }));

        cmbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Sex-", "M", "F" }));

        javax.swing.GroupLayout pnlProductDetailsLayout = new javax.swing.GroupLayout(pnlProductDetails);
        pnlProductDetails.setLayout(pnlProductDetailsLayout);
        pnlProductDetailsLayout.setHorizontalGroup(
            pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName)
                    .addComponent(lblUsername)
                    .addComponent(lblRole))
                .addGap(28, 28, 28)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername)
                    .addComponent(txtName)
                    .addComponent(cmbRole, 0, 223, Short.MAX_VALUE))
                .addGap(112, 112, 112)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                        .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSex)
                            .addComponent(lblAge))
                        .addGap(33, 33, 33)
                        .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAge)
                            .addComponent(cmbSex, 0, 201, Short.MAX_VALUE)))
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
        pnlProductDetailsLayout.setVerticalGroup(
            pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUsername)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSex, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                        .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName)
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRole))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btnUpdate.getAccessibleContext().setAccessibleName("Add New User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlProductDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchProduct))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(txtSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlProductDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        this.changeSelectedData();
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void tblCustomerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCustomerKeyReleased
        this.changeSelectedData();
    }//GEN-LAST:event_tblCustomerKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        this.user.setUsername(txtUsername.getText());
        this.user.setName(txtName.getText());
        this.user.setRole(cmbRole.getSelectedItem().toString());
        this.user.setSex(cmbSex.getSelectedItem().toString());
        this.user.setAge(txtAge.getText());
        if (this.user.getIsNew()) {
            this.admin.addUser(this.user);
            Vector vector = new Vector();
            vector.add(this.user.getUsername());
            vector.add(this.user.getName());
            vector.add(this.user.getRole());
            vector.add(this.user.getSex());
            vector.add(this.user.getAge());
            this.dfTable.addRow(vector);
        } else {
            this.admin.updateUser(this.user);
            this.dfTable.setRowCount(0);
            this.loadData();
        }

        this.clearAll();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.admin.removeUser(this.user);
        this.dfTable.removeRow(this.selectedRow);
        this.clearAll();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearAll();
    }//GEN-LAST:event_btnClearActionPerformed
    
    private void changeSelectedData() {
        this.selectedRow = tblCustomer.getSelectedRow();
        this.user.setIsNew(false);
        this.user.setUsername(this.dfTable.getValueAt(this.selectedRow, 0).toString());
        this.user.setName(this.dfTable.getValueAt(this.selectedRow, 1).toString());
        this.user.setRole(this.dfTable.getValueAt(this.selectedRow, 2).toString());
        this.user.setSex(this.dfTable.getValueAt(this.selectedRow, 3).toString());
        this.user.setAge(this.dfTable.getValueAt(this.selectedRow, 4).toString());
        txtUsername.setText(this.user.getUsername());
        txtName.setText(this.user.getName());
        cmbRole.setSelectedItem(this.user.getRole());
        cmbSex.setSelectedItem(this.user.getSex());
        txtAge.setText(String.valueOf(this.user.getAge()));
        this.enableUpdateDeleteBtn(true);
    }
    
    private void enableUpdateDeleteBtn(boolean option) {
        if (!option) {
            btnUpdate.setText("Add New User");
        } else {
            btnUpdate.setText("Update User Details");
        }
        btnDelete.setEnabled(option);
        btnDelete.setEnabled(option);
        txtUsername.setEditable(!option);
    }
    
    private void loadData() {
        User[] users = this.admin.loadUser();
        for (User user: users) {
            Vector vector = new Vector();
            vector.add(user.getUsername());
            vector.add(user.getName());
            vector.add(user.getRole());
            vector.add(user.getSex());
            vector.add(user.getAge());
            this.dfTable.addRow(vector);
        }
    }
    
    public void clearAll() {
        txtSearchProduct.setText("");
        txtUsername.setText("");
        txtName.setText("");
        cmbRole.setSelectedIndex(0);
        cmbSex.setSelectedIndex(0);
        txtAge.setText("");
        tblCustomer.clearSelection();
        this.user = new User();
        this.enableUpdateDeleteBtn(false);
    }
    
    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JComboBox<String> cmbSex;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlProductDetails;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearchProduct;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
