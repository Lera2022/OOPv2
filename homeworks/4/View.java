import java.util.Scanner;

public class View {
    public static void mainMenu(Company company){
        System.out.println("Выберите пункт меню:\n1 - добавить сотрудника;\n2 - посмотреть сотрудника;\n3 - перевести сотрудника;");
        Scanner in = new Scanner(System.in);
        int menuItem = in.nextInt();
        if (menuItem == 1) {
            Main run = new Main();
            run.addNewPersona(company);
        }
        else if (menuItem == 2) {
            System.out.println("Выберите пункт меню:\n1 - посмотреть конкретного сотрудника;\n2 - посмотреть всех сотрудников.");
            int menuItemAll = in.nextInt();
            if (menuItemAll == 1) {
                Persona x = findEmployee(company);
                System.out.println(x.pFIO + " " + x.pSex+ " " + x.pAge);
                View.mainMenu(company);

            }
            else if (menuItemAll == 2) {
                View.peopleView(company);
            }
        }
        else if (menuItem == 3) {
            System.out.println("Выберите пункт меню:\n1 - перевести конкретного сотрудника;\n2 - перевести всех сотрудников.");
            int menuItemAll = in.nextInt();
            if (menuItemAll == 1) {
                Main run = new Main();
                Persona x = findEmployee(company);
                System.out.println(x.pFIO + " " + x.pSex+ " " + x.pAge);
                View.compView(company);
                run.UpdateDepint(x, findGroup(company), company);
                View.mainMenu(company);
                
            }
            else if (menuItemAll == 2) {
                System.out.println("Не надо так делать, сходите к гендиректору, спросите разрешения.");
                View.mainMenu(company);
            }
        }  
    }

    public static Persona findEmployee(Company root) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите что-то из ФИО работника (in English, please): ");
        String info = in.nextLine();
        for (var a: root.groups) {
            for (Persona b: a.personaInDept) {
                if (b.pFIO.contains(info)) {
                    return b;
                }
            }
        }
        System.out.println("Такие не обнаружены");
        View.mainMenu(root);
        return null;

    }

    public static Group findGroup(Company root){
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите отдел: ");
        String dep = in.nextLine();
        for (var a: root.groups) {
            if (a.deptName.contains(dep)) {
                return a;
            }
        }
        System.out.println("Такие не обнаружены");
        View.mainMenu(root);
        return null;
    }

    public static void compView(Company root){
        System.out.println("Cписок отделов: ");
        for (var a: root.groups) {
            System.out.println(a.deptName);
        }
    }

    public static void depView(Group root, Company company){
        System.out.println("Название отдела" +" "+ root.deptName);
        for (var a: root.personaInDept) {
            System.out.println(a.pFIO + " " + a.pSex+ " " + a.pAge);
        }
        View.mainMenu(company);
    }

    public static void peopleView(Company root){
        System.out.println("Сотрудники компании: ");
        for (var a: root.groups) {
            for (var b: a.personaInDept) {
            System.out.println("Название отдела: " + a.deptName);
            System.out.println(b.pFIO + " " + b.pSex+ " " + b.pAge);
        }
        }
        View.mainMenu(root);
    }
}
