package level8_11;
//package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/*
Собираем семейство
*/

public class Solution_hard4 {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human child1 = new Human();
        child1.name = "Ребёнок1";
        child1.sex = true;
        child1.age = 5;

        Human child2 = new Human();
        child2.name = "Ребёнок2";
        child2.sex = false;
        child2.age = 8;

        Human child3 = new Human();
        child3.name = "Ребёнок3";
        child3.sex = true;
        child3.age = 10;

        ArrayList<Human> childList =new ArrayList<>();
        childList.add(child1);
        childList.add(child2);
        childList.add(child3);

        Human father = new Human();
        father.name = "Отец";
        father.sex = true;
        father.age = 38;
        father.children = childList;

        ArrayList<Human> parentsFather =new ArrayList<>();
        parentsFather.add(father);

        Human mother = new Human();
        mother.name = "Мать";
        mother.sex = false;
        mother.age = 31;
        mother.children = childList;

        ArrayList<Human> parentsMother =new ArrayList<>();
        parentsMother.add(mother);

        Human grandfather1 = new Human();
        grandfather1.name = "Дед1";
        grandfather1.sex = true;
        grandfather1.age = 80;
        grandfather1.children = parentsFather;

        Human grandmother1 = new Human();
        grandmother1.name = "Бабушка1";
        grandmother1.sex = false;
        grandmother1.age = 75;
        grandmother1.children = parentsFather;

        Human grandfather2 = new Human();
        grandfather2.name = "Дед2";
        grandfather2.sex = true;
        grandfather2.age = 90;
        grandfather2.children = parentsMother;

        Human grandmother2 = new Human();
        grandmother2.name = "Бабушка2";
        grandmother2.sex = false;
        grandmother2.age = 75;
        grandmother2.children = parentsMother;

        System.out.println(grandfather1.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        //напишите тут ваш код
    String name;
    boolean sex; //true - муж., false - жен.
    int age;
    List<Human> children = new ArrayList<>();
    //ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
