package document;

public class DocumentChecker {

    public static void main(String[] args) {
        // ExcelDocument document = new ExcelDocument();   // taka możliwość
        Document excelDocument = new ExcelDocument();   // inna możliwość
        Document pdfDocument = new PdfDocument();
// wywołanie metod
        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
