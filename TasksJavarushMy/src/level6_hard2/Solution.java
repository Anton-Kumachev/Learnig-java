package level6_hard2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String fatherName = reader.readLine(); //Ввод имени папы-кота
//        Cat catFather = new Cat(fatherName); //Создание папы-кота
//
//        String motherName = reader.readLine(); //Ввод имени мамы-кошки
//        Cat catMother = new Cat(motherName); //Создание мамы-кошки
//
//        String daughterName = reader.readLine(); //Ввод имени кошки-дочери
//        Cat catDaughter = new Cat(daughterName, catFather, catMother); //Создание кошки-дочери
//
//        String sonName = reader.readLine(); //Ввод имени кота-сына
//        Cat catSon = new Cat(sonName, catFather, catMother); //Создание кота-сына
//
//        String grandFatherName = reader.readLine(); //Ввод имени дедушки-кота
//        Cat catGrandFather = new Cat(grandFatherName); //Создание дедушки-кота
//
//        String grandMotherName = reader.readLine(); //Ввод имени бабушки-кошки
//        Cat catGrandMother = new Cat(grandMotherName); //Создание бабушки-кошки
//
//        System.out.println(grandFatherName);
//        System.out.println(grandMotherName);
//        System.out.println(catFather);
//        System.out.println(catMother);
//        System.out.println(catSon);
//        System.out.println(catDaughter);
//    }
//
//    public static class Cat {
//        private String daughter;
//        private String son;
//        private Cat father;
//        private Cat mother;
//        private Cat grandFather;
//        private Cat grandMother;
//
//
//        Cat(String daughter) {
//            this.daughter = daughter;
//        }
//
//        Cat(String daughter, Cat father, Cat mother) {
//            this.daughter = daughter;
//            this.father = father;
//            this.mother = mother;
//        }
//
//        Cat(String son, Cat father, Cat mother, String daughter) {
//            this.son = son;
//            this.father = father;
//            this.mother = mother;
//            this.daughter = null;
//        }
//
//        @Override
//        public String toString() {
//            if (father == null && mother == null) {
//                return "The cat's name is " + grandFather + ", no mother" + ", no father ";
//            } else if (mother == null) {
//                return "The cat's name is " + grandMother + ", no mother ";
//            } else if () {
//
//            }
//                return "The cat's name is " + name + ", father is " + father.name;
//            else if () {
//
//            }
//            return "The cat's name is " + name + ", father is " + father.name;
//        }
//    }
//
//}
