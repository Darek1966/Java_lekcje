package docs;

public class DocumentChecker {

    public static void main(String[] args) {

        // Document docs = new ExcelDocument();
        Document docs = new PdfDocument();  // też zadziała
        docs.getDescription();
    }
}
