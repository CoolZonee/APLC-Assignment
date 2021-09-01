/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterJob;

/**
 *
 * @author jieke
 */
public class test {
    public static void main(String[] args) {
        PrinterJob pj = PrinterJob.getPrinterJob();
        Order order = new Order();
        order.setUuid("f7d7fb12-9b8c-4092-83ad-e90199c13833");
        ReceiptPrintable ts = new ReceiptPrintable(order);

        pj.setPrintable(ts, getPageFormat(pj));

         
        try{
            pj.print();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    private static PageFormat getPageFormat(PrinterJob pj){
        pj.setJobName("SALE");
        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();
        
        double bodyHeight = 0.0;
        double headerHeight = 3.0 * 5;
        double footerHeight = 5.0;
        double width = 8;
        double height = headerHeight+bodyHeight+footerHeight;
        paper.setSize(width, height);
        paper.setImageableArea(0, 10, width, height-cm_to_pp(1));
        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);
        
        return pf;
        
    }
    protected static double cm_to_pp(double cm){
        return toPPI(cm * 0.393600787);
    }
    
    protected static double toPPI(double inch){
        return inch * 72d;
    }
}
