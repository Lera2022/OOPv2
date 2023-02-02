package Seminar2;

public class View {
    public static void treeView(Persona root, int num){
        String line = "_".repeat(num);
        System.out.println(line + root.GetName());
        for (Persona a: root.getListName()) {
            treeView(a, num + 1);
        }
    }
    
    public static void bookView(Persona root){
        System.out.println("имя библиотеки" + root.PersLibr.LibraryName);
        for (LibraryBooks a: root.PersLibr.listBook) {
            System.out.println(a.bAutor + " " + a.bName);
        }
    }
}
