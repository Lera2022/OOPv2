package Homework2;

// К задачам из предыдущего дз добавить абстракции. т е на этом дз нужно гарантированно продумать иерархию компонент и взаимодействия их
// между собой. Обеспечить переход от использования явных классов в сторону использования абстрактных типов. Т е работаем не с:
// - конкретным экземпляром котика, а с интерфейсом “котик”, лучше уйти от взаимодействия с конкретными питомцами и повысить
// уровень абстракции до взаимодействия с котиком, собачкой или хомяком т е с интерфейсом “животное”
// Предложить любопытный сценарий - что если внезапно котик пропал, и на его место хозяин хочет поставить хомячка. Т е прямая отсылка к
// внедрению и инверсии зависимостей.

public class Main {
    public static void main(String[] args) {

        Persona father = new Persona("Иван", "M", 33, "aquarium");
        Persona mother = new Persona("Мария", "F", 38, "puppies");
        Persona son = new Persona("Никита", "М", 13, "cageWithHamsters");
        father.PersZoo.AddPet("fish", "Клякса", "Буль-буль");
        father.PersZoo.AddPet("fish", "Амиго", "Буль-буль");
        mother.PersZoo.AddPet("puppie", "Снежинка", "Тяв-тяв");
        mother.PersZoo.AddPet("puppie", "Джокер", "Тяв-тяв");
        son.PersZoo.AddPet("hamster", "Агат", "Цик-цик");
        son.PersZoo.AddPet("hamster", "Хомчик", "Цик-цик");
        father.AddName(son);
        View.treeView(father, 0);
        System.out.println("*".repeat(15));
        View.PetView(father);
        View.PetView(mother);
        View.PetView(son);
        father.Voice();
    
    }
    
}
