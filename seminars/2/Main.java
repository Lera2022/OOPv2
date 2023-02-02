package Seminar2;

// К задачам из предыдущего дз добавить абстракции. т е на этом дз нужно гарантированно продумать иерархию компонент и взаимодействия их
// между собой. Обеспечить переход от использования явных классов в сторону использования абстрактных типов. Т е работаем не с:
// - конкретным экземпляром генеалогического древа, а с интерфейсом “ генеалогическое древо”
// - конкретным экземпляром котика, а с интерфейсом “котик”, лучше уйти от взаимодействия с конкретными питомцами и повысить
// уровень абстракции до взаимодействия с котиком, собачкой или хомяком т е с интерфейсом “животное”
// Предложить любопытный сценарий - что если внезапно котик пропал, и на его место хозяин хочет поставить хомячка. Т е прямая отсылка к
// внедрению и инверсии зависимостей.

public class Main {
    public static void main(String[] args) {
        // Persona father = new Persona("Papa");
        // Persona son = new Persona("Son");
        // Persona sister = new Persona("Sister");
        // Persona grandSister = new Persona("grandSister");

        Persona papa = new Persona("Ima", "F", 33, "lib1");
        Persona son = new Persona("Sin", "F", 13, "lib2");
        papa.PersLibr.AddBook("Пушкин", "Собрание сочинений", "RU");
        papa.PersLibr.AddBook("Носов", "Незнайка на луне", "RU");
        son.PersLibr.AddBook("Народное авторство", "Азбука", "RU");
        son.PersLibr.AddBook("А. Милн", "Винни Пух и все-все-все", "RU");
        papa.AddName(son);
        View.treeView(papa, 0);
        System.out.println("*".repeat(15));
        View.bookView(papa);
        View.bookView(son);
        papa.Voice();
        // father.AddName(son);
        // father.AddName(sister);
        // father.AddName(grandSister);
      
    }
    
}
