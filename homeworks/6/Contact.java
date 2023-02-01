// Open-closed principle
// Принцип открытости/закрытости
// Можно улучшать, но нельзя изменять

// Liskov substitution principle
// Принцип подстановки Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель

public class Contact extends Phonebook {

    private String Email;

    public Contact(String name, String phone, String city, String email) {
        super(name, phone, city);
        this.Email = email;
    }

    public String getMail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
