package main.java;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.List;

public class ReceiptPrintable implements Printable {
    private Order order;
    private List<OrderItem> orderItems;
    public ReceiptPrintable (Order order) {
        this.order = order; 
        this.orderItems = OrderItem.loadUuidOrderItem(order.getUuid());
    }
    
    @Override
    public int print(Graphics grahpics, PageFormat pageFormat, int pageIndex)
    throws PrinterException
    {
        int result = NO_SUCH_PAGE; 
        if(pageIndex == 0){
            Graphics2D g2d = (Graphics2D) grahpics;
            g2d.translate((int)pageFormat.getImageableX(), (int)pageFormat.getImageableY());
            try {
                int y = 20;
                int yShift = 10;
                g2d.setFont(new Font("Monospaced", Font.PLAIN,9));
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                g2d.drawString("                Receipt", 12,y); y+= yShift;
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                g2d.drawString("OrderID: ", 12,y); y+= yShift;
                g2d.drawString("   " + this.order.getUuid(), 12, y); y+= yShift;
                g2d.drawString("Date: " + this.order.getDate(), 12,y); y+= yShift;
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;


                g2d.drawString("   Item Name                  Price      ", 12,y); y+= yShift;
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                for(OrderItem orderItem: orderItems){
                    String name = orderItem.getName();
                    String price = String.format("%.2f", orderItem.getPrice());
                    String totalPrice = String.format("%.2f", orderItem.getTotalPrice());
                    char[] nChar = name.toCharArray();
                    if(nChar.length >= 20){
                        name = "";
                        for(int i = 0; i < 20; i++){
                            name += nChar[i];
                        }
                        name+="...";
                    }
                    String q_string = String.valueOf(orderItem.getQuantity());
                    String p_string = String.format("%.2f",orderItem.getPrice());
                    
                    int sizeq = 17 -  p_string.length() - q_string.length();
                    
                    String space = "";
                    for(int i = 0; i < sizeq; i++){
                        space += " ";
                    }

                    g2d.drawString(name +"", 12,y); y+= yShift;
                    g2d.drawString("     " +  orderItem.getQuantity() + "  *  RM" + price + space+"RM" + totalPrice, 12,y); y+= yShift;

                }
                int size = 17;
                String space ="";
                for(int i = 0 ; i < size; i++){
                    space+= " ";
                }
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                g2d.drawString(" TotalAmount"+space+"RM"+ String.format("%.2f", this.order.getTotal()) , 12,y); y+= yShift;
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                space = "";
                size = 24;
                for(int i = 0 ; i <size; i++){
                    space += " ";
                }
                
                g2d.drawString(" Paid"+space+"RM"+ String.format("%.2f", this.order.getPaid()) , 12,y); y+= yShift;
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                space = "";
                size = 22;
                for(int i = 0; i < size; i++){
                    space += " ";
                }
                
                g2d.drawString(" Change"+space+"RM"+ String.format("%.2f", this.order.getChange()) +" ", 12,y); y+= yShift;
                g2d.drawString("                                            ", 12,y); y+= yShift;

                g2d.drawString("********************************************", 12,y); y+= yShift;
                g2d.drawString("          THANK YOU COME AGAIN            ", 12,y); y+= yShift;
                g2d.drawString("********************************************", 12,y); y+= yShift;
                g2d.drawString("       SOFTWARE BY: Keat and Jamie        ", 12,y); y+= yShift;
                g2d.drawString("          Contact: 03-123456789           ", 12,y); y+= yShift;

            
            }catch(Exception e){
                System.out.println(e);
            }
            result = PAGE_EXISTS;
        }
        
        return result;
    }
    
    public PageFormat getPageFormat(PrinterJob pj, int numOfItem) {
        pj.setJobName("Receipt");
        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();
        
        double bodyHeight = 0.0;
        double headerHeight = 3.0 * 10;
        double footerHeight = 5.0;
        double width = cm_to_pp(8);
        double height = cm_to_pp(headerHeight+bodyHeight+footerHeight);
        paper.setSize(width, height);
        paper.setImageableArea(0, 10, width, height-cm_to_pp(1));
        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);
        
        return pf;
    }   
    
    protected double cm_to_pp(double cm){
        return toPPI(cm * 0.393600787);
    }
    
    protected double toPPI(double inch){
        return inch * 72d;
    }
}