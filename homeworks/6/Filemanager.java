import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Filemanager {
    String FILE_PATH = "./seminars/5/";
    String FILE_NAME_EXPORT = "export.csv";
    String FILE_PATH_FULL = FILE_PATH + FILE_NAME_EXPORT;

    public void ExportFile(ArrayList<Phonebook> pb) {
        Log log = new Log();
        log.logEntry("Выгрузить данные");
        try (FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME_EXPORT, false)) {
            // запись всей строки
            // String text = "Hello Gold!";
            for (Phonebook i : pb) {
                String text = i.getName() + ";" + i.getPhone() + ";" + i.getCity();
                writer.write(text);
                // запись по символам
                writer.append('\n');
                // writer.append('E');
            }
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public void ImportFile(ArrayList<Phonebook> pb) {
        Log log = new Log();
        log.logEntry("Загрузить данные");
        try {
            File file = new File(FILE_PATH_FULL);
            // создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            // создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                // System.out.println(line);
                String[] tmp = line.split(";", 0);
                pb.add(new Phonebook(tmp[0], tmp[1], tmp[2]));
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
