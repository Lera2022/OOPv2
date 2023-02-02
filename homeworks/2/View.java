package Homework2;

public class View {
    public static void treeView(Persona root, int num){
        String line = "_".repeat(num);
        System.out.println(line + root.GetName());
        for (Persona a: root.getListName()) {
            treeView(a, num + 1);
        }
    }
    
    public static void PetView(Persona root){
        System.out.println("имя домашнего зоопарка: " + root.PersZoo.HomeZooName);
        for (HomeZooPets a: root.PersZoo.listPets) {
            System.out.println(a.pType + " " + a.pNickname);
        }
    }
}
