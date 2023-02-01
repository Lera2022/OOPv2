import java.util.ArrayList;

public class Contacts extends Addressbook {
    public ArrayList<Contact> c = new ArrayList();

        // Interface segregation principle
    // Принцип разделения интерфейса
    // Модули высокого уровня не должны зависеть от модулей нижнего уровня.
    // И те, и другие должны зависеть от абстракций.
    // Абстракции не должны зависеть от деталей. Детали должны зависеть от
    // абстракций.

    @Override
    public void Addressbook() {
        c.add((Contact) new Contact("Иванов Иван Иванович", "1234567890", "Иваново", "iii@mail.com"));
        Log log = new Log();
        log.logEntry("Добавлена запись");
        c.add((Contact) new Contact("Сидоров Сидор Сидорович", "5643222222", "Сидорово", "sss@mail.com"));
        log.logEntry("Добавлена запись");
    }

    @Override
    public void showAddressBook() {
        Log log = new Log();
        log.logEntry("Отобразить справочник");
        for (Contact i : c) {
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity() + " " + i.getMail());
        }
    }
}
