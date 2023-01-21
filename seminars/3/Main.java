import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public void setPersona() {

        Scanner in = new Scanner(System.in);
        String FIO;
        String Sex;
        int Age;
        System.out.println("-".repeat(25));
        System.out.println("Сортировка по параметру:");
        System.out.println("\t1 - ФИО работника");
        FIO = in.nextLine();
        System.out.println("\t2 - Пол работника");

        System.out.println("\t3 - Возраст работника");
    }
}