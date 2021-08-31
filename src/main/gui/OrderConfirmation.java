/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.gui;

import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import javax.swing.table.DefaultTableModel;
import main.java.DateAndTime;
import main.java.Order;
import main.java.OrderItem;

/**
 *
 * @author jamie
 */
public class OrderConfirmation extends javax.swing.JPanel {
    Frame frame;
    DefaultFormatterFactory formatter;
    NumberFormat amountDisplayFormat;
    NumberFormat amountEditFormat;
    private DefaultTableModel orderSummaryTableModel;
    boolean isSufficient=false;
    Order order;
    public OrderConfirmation() {
        initComponents();
    }
    public void setOrder(Order order){
        this.order = order;
        
    }
    public void initAdditionalComponents(){
        btnPay.setEnabled(false);
        txtPaymentAmount.setText("");
        orderSummaryTableModel = (DefaultTableModel)tblOrderSummary.getModel();
        orderSummaryTableModel.setRowCount(0);
        fillOrderSummaryTable();
        txtPayableAmount.setText( "RM" + String.format("%.2f", this.order.getTotal()));
        
        
        
    }
    public void fillOrderSummaryTable(){
        for (OrderItem orderItem1: this.order.orderItem){
            orderSummaryTableModel.addRow(new Object[]{orderItem1.getCode(), 
                                                       orderItem1.getName(),
                                                       orderItem1.getQuantity(),
                                                       orderItem1.getPrice()});
        }
    }

    public void setFrame(Frame frame){
        this.frame=frame;
    }
    
    public void formatCurrencyInputField(){
        amountDisplayFormat = NumberFormat.getCurrencyInstance();
        amountDisplayFormat.setMinimumFractionDigits(0);
        amountEditFormat = NumberFormat.getNumberInstance();
        formatter = new DefaultFormatterFactory(
                        new NumberFormatter(amountDisplayFormat),
                        new NumberFormatter(amountDisplayFormat),
                        new NumberFormatter(amountEditFormat));    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formatCurrencyInputField();
        txtPaymentAmount = new javax.swing.JFormattedTextField(formatter);
        btnPay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderSummary = new javax.swing.JTable();
        lblOrderSummary = new javax.swing.JLabel();
        lblPaymentAmount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblChange = new javax.swing.JLabel();
        txtPayableAmount = new javax.swing.JTextField();
        txtChange = new javax.swing.JTextField();
        btnEnterAmount = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        txtPaymentAmount.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        btnPay.setText("Pay Amount");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        tblOrderSummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Quantity", " Price "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrderSummary);

        lblOrderSummary.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblOrderSummary.setText("Order Summary");

        lblPaymentAmount.setText("Payment Amount");

        jLabel1.setText("Payable Amount");

        lblChange.setText("Change");

        txtPayableAmount.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        txtChange.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtChange.setText("RM0.00");

        btnEnterAmount.setText("Enter Amount");
        btnEnterAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterAmountActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(lblChange)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPaymentAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPayableAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(212, 212, 212))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(lblPaymentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap()))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnEnterAmount)
                                .addGap(142, 142, 142))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(221, 221, 221))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblOrderSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblOrderSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtPayableAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(lblPaymentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPaymentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnterAmount)
                        .addGap(40, 40, 40)
                        .addComponent(lblChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterAmountActionPerformed
        this.order.setPaid(((Number)txtPaymentAmount.getValue()).doubleValue());
        txtChange.setText("RM" + String.format("%.2f", this.order.getChange()));
        if (this.order.getPaid()<this.order.getTotal()){
            JOptionPane.showMessageDialog(frame, "Insufficient Amount");
        }else{
            isSufficient=true;
            btnPay.setEnabled(true);
        }
    }//GEN-LAST:event_btnEnterAmountActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        this.order.setNewUUID();
        this.order.setDate(DateAndTime.getCurrentDate());
        this.order.addOrder();
        
        JOptionPane.showMessageDialog(frame,"Order Successful!","Order Status",JOptionPane.INFORMATION_MESSAGE);

        if (frame.user.getRole().equals("A")){
            frame.changePages(1);
        } else {
            frame.changePages(2);
        }
        
            
            

    }//GEN-LAST:event_btnPayActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        this.frame.admin.printReceipt();
    }//GEN-LAST:event_btnPrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterAmount;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChange;
    private javax.swing.JLabel lblOrderSummary;
    private javax.swing.JLabel lblPaymentAmount;
    private javax.swing.JTable tblOrderSummary;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtPayableAmount;
    private javax.swing.JFormattedTextField txtPaymentAmount;
    // End of variables declaration//GEN-END:variables
}
