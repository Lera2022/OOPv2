import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Log {
    String FILE_PATH = "./homeworks/5/";
    String FILE_NAME_EXPORT = "log.csv";
    String FILE_PATH_FULL = FILE_PATH + FILE_NAME_EXPORT;
    String entry;

    public void logEntry(String entry) {
        Date date = new Date();
        String d = date.toString();
        try (FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME_EXPORT, true)) {
            String text = d + ": " + entry;
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}