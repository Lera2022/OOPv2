
class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Valera", 5000);
        AccountWorker acc2 = new AccountWorker(1, 100000.51);
        String[] people = { "Valera", "Vadim", "Vlad" };
        Integer[] numbers = { 1, 21, 51, 6, 1, 36, 2 };
        Printer.<String>print(people);
        Printer.<Integer>print(numbers);
    }
}
