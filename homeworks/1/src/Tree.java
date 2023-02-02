import java.util.ArrayList;

public class Tree {
    public static void View (Man root, int num) {
        ArrayList <String> listChildren = new ArrayList<>();
        ArrayList <String> listGrandchildren = new ArrayList<>();
        String line = "_".repeat(num);
        System.out.println(line + root.GetName());
        if (num == 1 & root.GetName() != null) {
            listChildren.add(root.GetName());
        }
        if (num == 2) {
            listGrandchildren.add(root.GetName());
        }
        for (Man a:root.getListName()) {
            View(a, num+1);
        }
        if (!listChildren.isEmpty()) {
            System.out.println("Ребёнок: " + listChildren);
        }
        if (!listGrandchildren.isEmpty()) {
            System.out.println("Внук: " + listGrandchildren);
        }
    }
}
