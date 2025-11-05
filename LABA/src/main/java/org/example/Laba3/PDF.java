package org.example.Laba3;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class PDF {

    public static void createPDF(DefaultTableModel tableModel, String[] tableHeader){
        try {
            // Создание объекта шрифта для русского текста
            PdfFont font = PdfFontFactory.createFont("FONTS/arialmt.ttf");
            PdfWriter pdfWriter = new PdfWriter("TABLE.pdf");
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            //Таблица внутри pdf
            Table pdfTable = new Table(4);
            Vector<Vector> data = tableModel.getDataVector();


            //Добавление заголовка таблицы
            for (String head: tableHeader){
                pdfTable.addHeaderCell(new Cell().add(new Paragraph(head).setFont(font)));
            }
            //ДОбавление данных в таблицу
            for (Vector row: data){
                for (Object obj: row){
                    String str = obj.toString();
                    Cell cell = new Cell().add(new Paragraph(str).setFont(font));
                    pdfTable.addCell(cell);
                }
            }
            //Создание pdf файла
            Document doc = new Document(pdfDocument);
            doc.add(pdfTable);
            doc.close();


        }
        catch (Exception ex){
            System.out.print(ex);
        }
    }
}
