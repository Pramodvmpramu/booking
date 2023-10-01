package com.booking.util;

import com.booking.payload.UserDTO;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

public class PdfExplorer {
    public static ByteArrayInputStream exportUsersToPdf(List<UserDTO> users) throws Exception {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PdfWriter writer = new PdfWriter(outputStream);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument, PageSize.A4);

        document.add(new Paragraph("LIst of User"));

        Table table = new Table(UnitValue.createPointArray(new float[]{16, 6, 100, 10f, 10f}));
        table.addCell("ID");
        table.addCell("First Name");
        table.addCell("Last Name");
        table.addCell("Email");
        table.addCell("Phone Number");
        table.addCell("Profile Picture");

        for (UserDTO user : users) {
            table.addCell(String.valueOf(user.getId()));
            table.addCell(user.getFirstName());
            table.addCell(user.getLastName());
            table.addCell(user.getEmail());
            table.addCell(user.getPhoneNumber());
            table.addCell(user.getProfilePicture());
        }

        document.add(table);
        document.close();
        return new ByteArrayInputStream(outputStream.toByteArray());
    }
}