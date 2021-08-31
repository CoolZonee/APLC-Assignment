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
import main.java.Product;
import main.java.TableSortFilter;

public class ProductPage extends javax.swing.JPanel {
    private DefaultTableModel dfTable;
    private TableRowSorter<TableModel> rowSorter;
    private Product product = new Product();
    private int selectedRow;
    private Frame frame;
    Admin admin = new Admin();
    
    public ProductPage() {
        initComponents();
        this.dfTable = (DefaultTableModel)tblProduct.getModel();
        this.rowSorter = new TableRowSorter<>(tblProduct.getModel());
        // Disable sorting function
        for(int i = 0; i < tblProduct.getColumnCount(); i++) {
            this.rowSorter.setSortable(i, false);
        }
        this.tblProduct.setRowSorter(rowSorter);
        TableSortFilter.addFilter(rowSorter, tblProduct, txtSearchProduct);
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
        tblProduct = new javax.swing.JTable();
        pnlProductDetails = new javax.swing.JPanel();
        lblCode = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtName = new javax.swing.JTextArea();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblFragile = new javax.swing.JLabel();
        ckbFragile = new javax.swing.JCheckBox();
        txtSearchProduct = new javax.swing.JTextField();

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Quantity", "Price (RM)", "Fragile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Boolean.class
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
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        tblProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblProductKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        pnlProductDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Product Details"));
        pnlProductDetails.setToolTipText("");
        pnlProductDetails.setName(""); // NOI18N

        lblCode.setText("Code:");

        lblName.setText("Name:");

        lblQuantity.setText("Quantity:");

        lblPrice.setText("Price:");

        txtCode.setToolTipText("");

        txtName.setColumns(20);
        txtName.setRows(5);
        jScrollPane2.setViewportView(txtName);

        btnUpdate.setText("Add New Product");
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

        lblFragile.setText("Fragile:");

        javax.swing.GroupLayout pnlProductDetailsLayout = new javax.swing.GroupLayout(pnlProductDetails);
        pnlProductDetails.setLayout(pnlProductDetailsLayout);
        pnlProductDetailsLayout.setHorizontalGroup(
            pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName)
                    .addComponent(lblCode))
                .addGap(28, 28, 28)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCode)
                    .addComponent(jScrollPane2))
                .addGap(111, 111, 111)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                        .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrice)
                            .addComponent(lblQuantity)
                            .addComponent(lblFragile))
                        .addGap(34, 34, 34)
                        .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(txtPrice)
                            .addComponent(ckbFragile)))
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
        pnlProductDetailsLayout.setVerticalGroup(
            pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCode)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                        .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                        .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFragile, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckbFragile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlProductDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
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
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        this.changeSelectedData();
    }//GEN-LAST:event_tblProductMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearAll();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.admin.removeProduct(this.product);
        this.dfTable.removeRow(this.selectedRow);
        this.clearAll();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProductKeyReleased
        this.changeSelectedData();
    }//GEN-LAST:event_tblProductKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        this.product.setCode(txtCode.getText());
        this.product.setName(txtName.getText());
        this.product.setQuantity(Integer.parseInt(txtQuantity.getText()));
        this.product.setPrice(Double.parseDouble(txtPrice.getText()));
        this.product.setIsFragile(ckbFragile.isSelected());
        if (this.product.getIsNew()) {
            this.admin.addProduct(this.product);
            Vector vector = new Vector();
            vector.add(this.product.getCode());
            vector.add(this.product.getName());
            vector.add(this.product.getQuantity());
            vector.add(this.product.getPrice());
            vector.add(this.product.getIsFragile());
            this.dfTable.addRow(vector);
        } else {
            this.admin.updateProduct(this.product);
            this.dfTable.setRowCount(0);
            this.loadData();
        }
        
        this.clearAll();
    }//GEN-LAST:event_btnUpdateActionPerformed
   
    private void changeSelectedData() {
        this.selectedRow = tblProduct.getSelectedRow();
        this.product.setIsNew(false);
        this.product.setCode(this.dfTable.getValueAt(this.selectedRow, 0).toString());
        this.product.setName(this.dfTable.getValueAt(this.selectedRow, 1).toString());
        this.product.setQuantity(Integer.parseInt(this.dfTable.getValueAt(this.selectedRow, 2).toString()));
        this.product.setPrice(Double.parseDouble(this.dfTable.getValueAt(this.selectedRow, 3).toString()));
        this.product.setIsFragile(Boolean.parseBoolean(this.dfTable.getValueAt(this.selectedRow, 4).toString()));
        txtCode.setText(this.product.getCode());
        txtName.setText(this.product.getName());
        txtQuantity.setText(String.valueOf(this.product.getQuantity()));
        txtPrice.setText(String.valueOf(this.product.getPrice()));
        ckbFragile.setSelected(this.product.getIsFragile());
        this.enableUpdateDeleteBtn(true);
    }
    
    private void enableUpdateDeleteBtn(boolean option) {
        if (!option) {
            btnUpdate.setText("Add New Product");
        } else {
            btnUpdate.setText("Update Product Details");
        }
        btnDelete.setEnabled(option);
        btnDelete.setEnabled(option);
        txtCode.setEditable(!option);
    }
    
    private void loadData() {
        Product[] products = this.admin.loadProduct();
            for (Product product: products) {
            Vector vector = new Vector();
            vector.add(product.getCode());
            vector.add(product.getName());
            vector.add(product.getQuantity());
            vector.add(product.getPrice());
            vector.add(product.getIsFragile());
            this.dfTable.addRow(vector);
        }
    }
    
    public void clearAll() {
        txtSearchProduct.setText("");
        txtCode.setText("");
        txtName.setText("");
        txtQuantity.setText("");
        txtPrice.setText("");
        tblProduct.clearSelection();
        ckbFragile.setSelected(false);
        this.product = new Product();
        this.enableUpdateDeleteBtn(false);
    }
    
    public void setFrame(Frame frame) {
        this.frame = frame;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox ckbFragile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblFragile;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JPanel pnlProductDetails;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextArea txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearchProduct;
    // End of variables declaration//GEN-END:variables
}
