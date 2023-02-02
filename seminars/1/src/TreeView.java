public class TreeView {
    public static void View (Persona root, int num) {
        String line = "_".repeat(num);
        System.out.println(line + root.GetName());
        for (Persona a:root.getListName()) {
            View(a, num+1);
        }
    }
}
