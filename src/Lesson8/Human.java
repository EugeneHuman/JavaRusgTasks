package Lesson8;

/*У класса Human должны быть поля имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).*/

import java.util.ArrayList;


public class Human {
    //íàïèøèòå òóò âàø êîä
    String name;
    boolean sex;
    int age;
    ArrayList<Human> children;

    // передаем varargs в параметры конструктора
    public Human(String name, boolean sex, int age, Human... children) {
        this.name = name;
        this.sex = sex;
        this.age = age;

        this.children = new ArrayList<>();
        for (Human child : children) {
            this.children.add(child);
        }
    }

    public static void main(String[] args) {
        //íàïèøèòå òóò âàø êîä
        ArrayList<Human> children = new ArrayList<>();
        ArrayList<Human> peoples = new ArrayList<>();

        Human child1 = new Human("Son1", true, 20);
        Human child2 = new Human("Son2", true, 18);
        Human child3 = new Human("Doter", false, 17);
        Human father = new Human("Father", true, 35, child1, child2, child3);
        Human mother = new Human("Mother", false, 34, child1, child2, child3);
        Human grandFather1 = new Human("Ded1", true, 56, father);
        Human grandFather2 = new Human("Ded2", true, 56, mother);
        Human grandMother1 = new Human("Babushka1", false, 56, father);
        Human grandMother2 = new Human("Babushka2", false, 56, mother);

//      äîáàâëÿåì â ìàññèâ
        children.add(father);
        children.add(mother);
        children.add(child1);
        children.add(child2);
        children.add(child3);

        peoples.add(grandFather1);
        peoples.add(grandFather2);
        peoples.add(grandMother1);
        peoples.add(grandMother2);
        peoples.add(father);
        peoples.add(mother);
        peoples.add(child1);
        peoples.add(child2);
        peoples.add(child3);

        for (Human h : peoples) {
            System.out.println(h.toString());
        }


    }

    public String toString() {
        String text = "";
        text += "Èìÿ: " + this.name;
        text += ", ïîë: " + (this.sex ? "ìóæñêîé" : "æåíñêèé");
        text += ", âîçðàñò: " + this.age;

        int childCount = this.children.size();
        if (childCount > 0) {
            text += ", äåòè: " + this.children.get(0).name;

            for (int i = 1; i < childCount; i++) {
                Human child = this.children.get(i);
                text += ", " + child.name;
            }
        }
        return text;
    }
}
