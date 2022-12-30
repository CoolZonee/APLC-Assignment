/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.text.StyleConstants.ALIGN_CENTER;

public class Report {
    public static void GenerateReport(String date, List<Order> orders) {
        // Output name of the file, exp: daily_sale_report_2021_1_1
        String fileName = "src/main/resource/report/Daily_Sale_Report_" + date + ".pdf";
        String title =  date + " SALE REPORT";
        Document doc = new Document(PageSize.A4, 50f, 50f, 50f, 50f);
        
        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(fileName));
            
            // title
            Paragraph titlePDF = new Paragraph(new Phrase(10f, title, getFont(25f)));

            // date
            Paragraph titleDate = new Paragraph(new Phrase(10f, "Date: " + date ,getFont(15f)));

            // title align center 
            titlePDF.setAlignment(ALIGN_CENTER);
            titleDate.setAlignment(ALIGN_CENTER);

            doc.open();
            // add title
            doc.add(titlePDF);
            doc.add(Chunk.NEWLINE);
            doc.add(Chunk.NEWLINE);
            // add date
            doc.add(titleDate);
            doc.add(Chunk.NEWLINE);
            doc.add(Chunk.NEWLINE);

            Paragraph subTitle1 = new Paragraph(new Phrase(10f, "Sold Product List", getFont(18f)));
            doc.add(subTitle1);

            // create table
            PdfPTable table = new PdfPTable(3); // table with 5 columns
            table.setWidthPercentage(105);
            table.setSpacingBefore(11f);
            table.setSpacingAfter(11f);

            float[] colWidth = {8f, 2f, 2f};
            table.setWidths(colWidth);

            // header rows
            Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD); // bold font;
            PdfPCell item = new PdfPCell(new Phrase("Product Name\n ", boldFont));
            PdfPCell cellQuantity = new PdfPCell(new Phrase("Quantity\n ", boldFont));
            PdfPCell revenue = new PdfPCell(new Phrase("Revenue (RM)\n ", boldFont));
            table.addCell(item);
            table.addCell(cellQuantity);
            table.addCell(revenue);
            table.setHeaderRows(1);
            
            int totalQuantity = 0;
            double totalProfit = 0.0;
            for (Order order: orders) {
                List<OrderItem> orderItems = OrderItem.loadUuidOrderItem(order.getUuid());
                for (OrderItem orderItem: orderItems) {
                    table.addCell(orderItem.getName());
                    table.addCell(String.valueOf(orderItem.getQuantity()));
                    table.addCell(String.valueOf(orderItem.getPrice()));
                    totalQuantity += orderItem.getQuantity();
                    totalProfit += orderItem.getTotalPrice();
                }
            }

            table.addCell("Total\n ");
            table.addCell(totalQuantity + "\n");
            table.addCell(String.valueOf(totalProfit));
            doc.add(table);

            doc.close();
            writer.close();
        }
        catch (FileNotFoundException | DocumentException ex) 
        {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
    
    private static Font getFont(float size) {
        return FontFactory.getFont(FontFactory.HELVETICA_BOLD, size);
    }
} 
