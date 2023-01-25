import java.util.Scanner;

public class View {
    public static void mainMenu(Company company){
        System.out.println("Выберите пункт меню:\n1 - добавить сотрудника;\n2 - показать отделы;");
        Scanner in = new Scanner(System.in);
        int menuItem = in.nextInt();
        if (menuItem == 1) {
            Main run = new Main();
            run.addNewPersona(company);
        }
        else if (menuItem == 2) {
            System.out.println("Выберите пункт меню:\n1 - перевести того же сотрудника;\n2 - вернуться в главное меню.");
            int menuItemAll = in.nextInt();
            if (menuItemAll == 1) {
                
            }
            else if (menuItemAll == 2) {
    
            }
        }   
    }

    public static void compView(Company root){
        System.out.println("Cписок отделов");
        for (var a: root.groups) {
            System.out.println(a.deptName);
        }
        View.mainMenu(root);
    }

    public static void depView(Group root, Company company){
        System.out.println("Название отдела" +" "+ root.deptName);
        for (var a: root.personaInDept) {
            System.out.println(a.pFIO + " " + a.pSex+ " " + a.pAge);
        }
        View.mainMenu(company);
    }
}
