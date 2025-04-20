public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textPrototype;
    private SpreadsheetDocument sheetPrototype;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150);

        System.out.println("Creating a Text Document prototype.");
        textPrototype = new TextDocument("meeting_notes.txt", "UTF-8", 250);

        System.out.println("Creating a Spreadsheet Document prototype.\n");
        sheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
    }

    public Document createPdfClone(String fileName, int pageCount) {
        PdfDocument prototype = (PdfDocument) pdfPrototype.clone();
        return new PdfDocument(fileName, prototype.getAuthor(), pageCount);
    }

    public Document getPdfPrototype() {
        return pdfPrototype.clone();
    }

    public Document getTextPrototype() {
        return textPrototype.clone();
    }

    public Document getSheetPrototype() {
        return sheetPrototype.clone();
    }
}