public class familyTies {
    public static void familyTies (Man root) {
        for (Man a:root.getListName()) {
            String line = "Дети: ";
            System.out.println(line + root.GetName());
        }
    }
}
