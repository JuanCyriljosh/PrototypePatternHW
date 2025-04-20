public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf = registry.getPdfPrototype();
        pdf.open();
        System.out.println(pdf);
        System.out.println();

        Document text = registry.getTextPrototype();
        text.open();
        System.out.println(text);
        System.out.println();

        Document sheet = registry.getSheetPrototype();
        sheet.open();
        System.out.println(sheet);
        System.out.println();

        Document summaryPdf = registry.createPdfClone("summary_report.pdf", 30);
        summaryPdf.open();
    }
}
