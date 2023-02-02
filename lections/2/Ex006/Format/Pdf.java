package Ex006.Format;

import java.io.FileWriter;
import java.io.IOException;

import Ex006.Document.TextDocument;

public class Pdf extends TextFormat {
    
    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".pdf", false)){
            writer.write("<?Pdf Format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
