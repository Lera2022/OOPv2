package Ex004;

public class Dwarf extends Druid {

    public Dwarf(String name, int hp) {
        super();
        System.out.println("Вызван Dwarf()");
    }

    public Dwarf() {
        this("", 0);
        System.out.println("Вызван Dwarf()");
    }

}