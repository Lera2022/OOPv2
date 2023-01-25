
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Company first = new Company("Our");
        View.mainMenu(first);
        // Main run = new Main();

        // Scanner in = new Scanner(System.in);
        // String FIO;
        // String Sex;
        // int Age;
        // System.out.println("-".repeat(25));
        // System.out.println("ФИО работника: ");
        // FIO = in.nextLine();
        // System.out.println("ПОЛ работника: ");
        // Sex = in.nextLine();
        // System.out.println("Возраст работника: ");
        // Age = in.nextInt();
        // Persona p = new Persona(FIO, Sex, Age);
        // p.Display();
        // Group depAcc = new Group("Accounting");
        // run.addPersonaToDepartment(p, depAcc);
        // View.depView(depAcc);
        // Group depAcc1 = new Group(run.UpdateDepint());
        // run.addPersonaToDepartment(p, depAcc1);
        // View.depView(depAcc1);

    }

    public void addNewPersona(Company company) {
        Main run = new Main();
        Scanner in = new Scanner(System.in);
        String FIO;
        String Sex;
        int Age;
        System.out.println("-".repeat(25));
        System.out.println("ФИО работника (in English, please): ");
        FIO = in.nextLine();
        System.out.println("ПОЛ работника (in English, please): ");
        Sex = in.nextLine();
        System.out.println("Возраст работника: ");
        Age = in.nextInt();
        Persona p = new Persona(FIO, Sex, Age);
        p.Display();
        Group depAcc = new Group("Accounting");
        run.addGroupToCompany(company, depAcc);
        run.addPersonaToDepartment(p, depAcc, company);
        View.depView(depAcc, company);
    }

    public void addGroupToCompany(Company company, Group group){
        company.addGroup(group);
    }

    public void addPersonaToDepartment(Persona persona, Group group, Company company) {
        boolean check = persona.checkAddGroup(group);
        if (check) {
            group.addPeople(persona);
        } else {
            System.out.println("Олень отказался!");
            View.mainMenu(company);
        }
    }

    public String UpdateDepint() {
        Scanner in = new Scanner(System.in);
        System.out.println("Хотите перейти в другой отдел?:");
        System.out.println("0 - НЕТ\n1 - ДА");
        int answer = in.nextInt();

        if (answer == 0) {
            System.out.println("Молодец, стабильность - признак мастерста");
        }
        if (answer == 1) {
            System.out.println("В какой отдел желаете перейти?");
            System.out.println("IT\nLogistics\nFinance");
        }
        String answer1 = in.next();
        return answer1;
    }


}
