package document;

public class PdfDocument extends Document{  // rozszeża klasę bazową

    public void getDescription() {  // nadpisujemy metodę getDescription
        System.out.println("Jestem document PDF");
    }
}
