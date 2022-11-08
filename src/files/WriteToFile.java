package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("text.txt");
        writer.write("Sam tekst");  // zapis do pliku (text jest nadpisywany)
        writer.close();
    }
}
