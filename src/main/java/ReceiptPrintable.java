/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jieke
 */
public class ReceiptPrintable implements Printable {
    private String saleID;
    private String totalAmount;
    private String change;
    private String totalPaid;
    
//    private HashMap<String, SaleDetail> sales;
    
//    public BillPrintable(String saleID,double totalAmount, double change,double totalPaid,HashMap<String,SaleDetail> s){
//        this.saleID = saleID;
//        this.totalAmount = String.format("%.2f", totalAmount);
//        this.change = String.format("%.2f", change);
//        this.totalPaid = String.format("%.2f", totalPaid);
        
        
//        
//        this.sales = s;
//    }
//    
    @Override
    public int print(Graphics grahpics, PageFormat pageFormat, int pageIndex )
    throws PrinterException
    {
//        int r = sales.size();
        int result = NO_SUCH_PAGE;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        if(pageIndex == 0){
            Graphics2D g2d = (Graphics2D) grahpics;
            double width = pageFormat.getImageableWidth();
            g2d.translate((int)pageFormat.getImageableX(), (int)pageFormat.getImageableY());
            try {
                int y = 20;
                int yShift = 10;
                int headerRectHeight = 15;
                int totalWidth = 40;
                String shopNameSpace = "";
                g2d.setFont(new Font("Monospaced", Font.PLAIN,9));
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
//                int shopNameWidth = (totalWidth - getShopName().length()) / 2;
//                for (int i = 0; i < shopNameWidth; i++) 
//                {
//                    shopNameSpace += " ";
//                }
//                g2d.drawString(shopNameSpace + getShopName() + shopNameSpace, 12,y); y+= yShift;
//                for (int i = 0; i < getShopAddress().length; i++) 
//                {
//                    int shopAddressWidth = (totalWidth - getShopAddress()[i].length()) / 2;
//                    String shopAddressSpace = "";
//                    for (int j = 0; j < shopAddressWidth; j++)
//                    {
//                        shopAddressSpace += " ";
//                    }
//                     g2d.drawString(shopAddressSpace + getShopAddress()[i] + shopAddressSpace, 12,y); y+= yShift;
//                }
//               
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                g2d.drawString("   SALEID: " + this.saleID, 12,y); y+= yShift;
                g2d.drawString("   Date: " + dtf.format(now), 12,y); y+= yShift;
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;


                g2d.drawString("   Item Name                  Price      ", 12,y); y+= yShift;
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
//                for(Map.Entry m : this.sales.entrySet()){
//                    
//                    SaleDetail sd = (SaleDetail) m.getValue();
//                    String n = sd.getName();
//                    String price = String.format("%.2f", sd.getPrice());
//                    char[] nChar = n.toCharArray();
//                    if(nChar.length >= 20){
//                        n = "";
//                        for(int i = 0; i < 20; i++){
//                            n += nChar[i];
//                        }
//                        n+="...";
//                    }
//                    String q_string = String.valueOf(sd.getQuantity());
//                    String p_string = String.format("%.2f",sd.getPrice());
//                    
//                    int sizeq = 17 -  p_string.length() - q_string.length();
//                    
//                    String space = "";
//                    for(int i = 0;i<sizeq;i++){
//                        space+=" ";
//                    }
//
//                    g2d.drawString(n+"", 12,y); y+= yShift;
//                    g2d.drawString("     " + sd.getQuantity() + "  *  RM" + price + space+"RM" + (sd.getPrice() * sd.getQuantity()) + "0", 12,y); y+= yShift;
//
//                }
                int size = 17;
                String space ="";
                for(int i =0;i<size;i++){
                    space+= " ";
                }
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                g2d.drawString(" TotalAmount"+space+"RM"+ this.totalAmount , 12,y); y+= yShift;
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                space = "";
                size = 24;
                for(int i =0;i<size;i++){
                    space += " ";
                }
                
                g2d.drawString(" Cash"+space+"RM"+ this.totalPaid , 12,y); y+= yShift;
                g2d.drawString("--------------------------------------------", 12,y); y+= yShift;
                space = "";
                size = 21;
                for(int i =0;i<size;i++){
                    space += " ";
                }
                
                g2d.drawString(" Balance"+space+"RM"+ this.change +" ", 12,y); y+= yShift;
                g2d.drawString("                                            ", 12,y); y+= yShift;

                g2d.drawString("********************************************", 12,y); y+= yShift;
                g2d.drawString("          THANK YOU COME AGAIN            ", 12,y); y+= yShift;
                g2d.drawString("********************************************", 12,y); y+= yShift;
                g2d.drawString("          SOFTWARE BY: TEAM10             ", 12,y); y+= yShift;
                g2d.drawString("         Contact: 03-910022030            ", 12,y); y+= yShift;

            
            }catch(Exception e){
                System.out.println(e);
            }
            result = PAGE_EXISTS;
        }
        
        return result;
    }
    
        
}