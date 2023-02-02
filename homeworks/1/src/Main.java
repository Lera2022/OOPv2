import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Man first = new Man(1, "Иван", false, 1996);
        Man second = new Man(2, "Мария", true, 1998);
        Man third = new Man(3, "Пётр", false, 2020);
        Man fourth = new Man(4, "Василиса", true, 2022);
        Man fifth = new Man(5, "Марк", false, 1995);
        Man sixth = new Man(6, "Ирина", true, 1996);
        Man seventh = new Man(7, "Максим", false, 2019);
        Man eighth = new Man(8, "Евгения", true, 2018);
        Man nineth = new Man(9, "Алексей", false, 1994);
        Man tenth = new Man(10, "Светлана", true, 1993);
        Man eleventh = new Man(11, "Никита", false, 2017);
        Man twelfth = new Man(12, "Дмитрий", false, 2017);
        Man thirteenth = new Man(13, "Карина", true, 2016);
        Man fourteenth = new Man(14, "Николай", false, 1994);
        Man fifteenth = new Man(15, "Марьяна", true, 1993);
        Man sixteenth = new Man(16, "Карл", false, 2017);
        Man seventeenth = new Man(17, "Александра", true, 2016);
        Man eighteenth = new Man(18, "Кирилл", false, 1973);
        Man nineteenth = new Man(19, "Кристина", true, 1974);
        Man twentieth = new Man(20, "Макар", false, 1972);
        Man twenty_first = new Man(21, "Зарина", true, 1971);

        first.AddChild(third);
        second.AddChild(third);
        first.AddChild(fourth);
        second.AddChild(fourth);
        fifth.AddChild(seventh);
        sixth.AddChild(seventh);
        fifth.AddChild(eighth);
        sixth.AddChild(eighth);
        nineth.AddChild(eleventh);
        tenth.AddChild(eleventh);
        nineth.AddChild(twelfth);
        tenth.AddChild(twelfth);
        nineth.AddChild(thirteenth);
        tenth.AddChild(thirteenth);
        fourteenth.AddChild(sixteenth);
        fourteenth.AddChild(seventeenth);
        fifteenth.AddChild(sixteenth);
        fifteenth.AddChild(seventeenth);
        eighteenth.AddChild(first);
        nineteenth.AddChild(nineth);
        twentieth.AddChild(tenth);
        twenty_first.AddChild(fifteenth);

        // System.out.println(first.getInfo());
        Tree.View(twenty_first, 0);

        Set<Man> people = new HashSet<Man>(Arrays.asList(first, second, third, fourth, fifth, sixth, seventh, eighth, nineth, tenth, eleventh, twelfth, thirteenth, fourteenth, fifteenth, sixteenth, seventeenth, eighteenth, nineteenth, twentieth));

        Map<Integer, String> fieldsNumbers = new TreeMap<>();
        List<String> fields = Arrays.asList("id", "name", "woman", "year");
        for (int i = 0; i < fields.size(); i++) {
            fieldsNumbers.put(i, fields.get(i));
        }
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        System.out.println(fieldsNumbers);
        Scanner scanner = new Scanner(System.in);
        int param = scanner.nextInt();
        System.out.println("Введите необходимый критерий: " + getValues(people, param) );
        scanner = new Scanner(System.in);
        String filter = scanner.nextLine();
        for (Man i : people) {
            if (getValue(param, i).equals(filter)){
                System.out.println(i);
            }
        }

    }

    private static Set<String> getValues(Set<Man> people, int param) {
        Set<String> values = new TreeSet<>();
        for (Man i : people) {
            values.add(getValue(param, i));
        }
        return values;
    }

    private static String getValue(int param, Man i) {
        Object value = null;
        switch (param){
            case 0:
                value = i.id;
                break;
            case 1:
                value = i.name;
                break;
            case 2:
                value = i.woman;
                break;
            case 3:
                value = i.year;
                break;
        }
        return value.toString();
    
    }
}
