import java.util.ArrayList;

public class Addressbook {
    public ArrayList<Phonebook> pb = new ArrayList();

    public void Addressbook(){
        pb.add(new Phonebook("Иванов Иван Иванович", "1234567890", "Иваново"));
        Log log = new Log();
        log.logEntry("Добавлена запись");
        pb.add(new Phonebook("Сидоров Сидор Сидорович", "5643222222", "Сидорово"));
        log.logEntry("Добавлена запись");
    }

    public void showAddressBook(){
        Log log = new Log();
        log.logEntry("Отобразить справочник");
        for(Phonebook i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
    }
}