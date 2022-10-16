package level10_11;
//package com.javarush.task.task10.task1013;

/*
Конструкторы класса Human
*/

public class Solution_medium1 {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
    private String name;
    private String sername;
    private String sex;
    private int age;
    private int weight;
    private int height;
    //1
    public Human() {

    }
    //2
    public Human(String name) {
        this.name = name;
    }
    //3
    public Human(String name, String sername) {
        this.name = name;
        this.sername = sername;
    }
    //4
    public Human(String name, String sername, String sex) {
        this.name = name;
        this.sername = sername;
        this.sex = sex;
    }
    //5
    public Human(String name, String sername, String sex, int age) {
        this.name = name;
        this.sername = sername;
        this.sex = sex;
        this.age = age;
    }
    //6
    public Human(String name, String sername, String sex, int age, int weight) {
        this.name = name;
        this.sername = sername;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
    }
    //7
    public Human(String name, String sername, String sex, int age, int weight, int height) {
        this.name = name;
        this.sername = sername;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
    }
    //8
    public Human(String name, String sex, int age, int weight, int height) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
    }
    //9
    public Human(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    //10
    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    }
}
