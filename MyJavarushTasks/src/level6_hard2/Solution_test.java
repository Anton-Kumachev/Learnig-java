package level6_hard2;
//package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/
public class Solution_test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Ввод с клавиатуры

        System.out.println("Имя кошки-мамы: ");
        String motherName = reader.readLine(); //Ввод имени кошки-мамы
        Cat catMother = new Cat(motherName); //Создание объекта кошки-мамы

        System.out.println("Имя кошки-дочки: ");
        String daughterName = reader.readLine(); //Ввод имени кошки-дочки
        Cat catDaughter = new Cat(daughterName, catMother); //Создание объекта кошки-дочери

        System.out.println(catMother);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }

        @Override
        public String toString() {
            if (parent == null)
                return "The cat's name is " + name + ", no mother ";
            else
                return "The cat's name is " + name + ", mother is " + parent.name;
        }
    }
}
