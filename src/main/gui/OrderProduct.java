package main.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import main.java.Cart;
import main.java.Product;
import main.java.OrderItem;
import main.java.Order;
import main.java.TableSortFilter;

public class OrderProduct extends javax.swing.JPanel {
    private DefaultTableModel productTableModel;
    private DefaultTableModel cartTableModel;
    private TableRowSorter<TableModel> rowSorter;
    private Cart cart;
    private Order order;
    private List<Product> products;
    Frame frame;
    
    public void setFrame(Frame frame){
        this.frame=frame;
    }
    
    public OrderProduct() {
        initComponents();
        this.productTableModel = (DefaultTableModel)tblProduct.getModel();
        this.cartTableModel = (DefaultTableModel)tblCart.getModel();
        this.rowSorter = new TableRowSorter<>(tblProduct.getModel());
        this.tblProduct.setRowSorter(rowSorter);
        TableSortFilter.addFilter(rowSorter, tblProduct, txtSearchProduct);
        
        this.productTableModel.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                TableModel model = (TableModel) e.getSource();
                int rowCount = model.getRowCount();
                Cart tempCart = new Cart();
                for (int i = 0; i < rowCount; i++) {
                    Product product = new Product();
                    product.setName(model.getValueAt(i, 0).toString());
                    product.setPrice(Double.parseDouble(model.getValueAt(i, 1).toString()));
                    product.setQuantity(1);
                    boolean checked = (Boolean) model.getValueAt(i, 2);
                    if (checked) {
                        tempCart.addProduct(product);
                    }
                }
                for (Product product: cart.getProducts()) {
                    for (Product temp: tempCart.getProducts()) {
                        if (product.getName().equals(temp.getName())) {
                           temp.setQuantity(product.getQuantity());
                        }
                    }
                }

                cart = tempCart;

                cartTableModel.setRowCount(0);
                for (Product product: cart.getProducts()) {
                    Vector v = new Vector();
                    v.add(product.getName());
                    v.add(product.getPrice());
                    v.add(product.getQuantity());
                    cartTableModel.addRow(v);
                }                
            }   
        });
        this.cartTableModel.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                TableModel model = (TableModel) e.getSource();
                int rowCount = model.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    cart.getProducts().get(i).setQuantity(Integer.parseInt(model.getValueAt(i, 2).toString()));
                }
                double totalPrice = cart.calculateTotalPrice();
                txtTotalPrice.setText(String.format("%.2f", totalPrice));
            }   
        });
        this.products = new ArrayList<>();
    }
    
    public void initAdditionalComponents() {
        this.cart = new Cart();
        this.order = new Order();
        this.productTableModel.setRowCount(0);
        this.cartTableModel.setRowCount(0);
        this.loadData();
    }

                                    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        txtSearchProduct = new javax.swing.JTextField();
        btnOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        lblTotalPrice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price (RM)", "Select"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        btnOrder.setText("Order");
        btnOrder.setActionCommand("Add New User");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCart);

        lblTotalPrice.setText("Total Price:");

        jLabel2.setText("Cart:");

        txtTotalPrice.setEditable(false);

        btnClear.setText("Clear");
        btnClear.setActionCommand("Add New User");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setText("Back to Menu");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(lblTotalPrice)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTotalPrice))))
                        .addComponent(txtSearchProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalPrice)
                            .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        this.cart.resetQuantityCheck();
        this.cart.setIsQuantityValid(true);
        this.order.clearOrder();
        this.cart.clearFinalCart();
        
        List <OrderItem> orderItemList = this.cart.checkProductQuantity(this.order.getUuid());
        
        if(!orderItemList.isEmpty() && this.cart.getIsQuantityValid()) {
            for (OrderItem orderItem: orderItemList) {
                this.order.addOrderItem(orderItem);
            }
        }
        
        if (this.cart.isEmpty()){
            JOptionPane.showMessageDialog(frame, "No products selected");
        }else{
            if (!this.cart.getIsQuantityValid()){
                JOptionPane.showMessageDialog(frame, cart.getQuantityInvalidMessage());            
            }else{
                if (order.hasFragileProduct(cart.getOrderedProducts())){
                    order.orderItem.add(new OrderItem(order.getUuid(),
                                                    "", "Packaging Fee",
                                                    1, 10.00));
                }
                frame.orderConfirmation.setProduct(cart.getOrderedProducts());
                frame.orderConfirmation.setOrder(this.order);
                this.frame.changePages(7);
                frame.orderConfirmation.initAdditionalComponents();
                
                frame.orderConfirmation.setBackMenu(false);
                
                
            }
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtSearchProduct.setText("");
        this.cart.clearCart();
        this.cartTableModel.setRowCount(0);
        for (int i = 0; i < productTableModel.getRowCount(); i++) {
            productTableModel.setValueAt(false, i, 2);
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (frame.user.getRole().equals("A")){
            frame.adminMenu.initAdditionalComponents();
            frame.changePages(1);
        }else{
            frame.customerMenu.initAdditionalComponents();
            frame.changePages(2);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void loadData() {
        this.products = this.frame.user.loadProduct();
        for (Product product: products) {
            Vector vector = new Vector();
            vector.add(product.getName());
            vector.add(product.getPrice());
            vector.add(false);
            this.productTableModel.addRow(vector);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnOrder;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtSearchProduct;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables

}
