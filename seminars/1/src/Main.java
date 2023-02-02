public class Main {
    public static void main(String[] args) {
        Persona father = new Persona("John");
        Persona son = new Persona("David");
        Persona sister = new Persona("Marta");
        Persona daughter = new Persona("Lena");

        father.AddName(son);
        father.AddName(sister);
        sister.AddName(daughter);
        TreeView.View(father, 0);
    }


}