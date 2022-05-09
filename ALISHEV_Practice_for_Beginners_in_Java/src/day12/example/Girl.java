package day12.example;

import java.util.ArrayList;
import java.util.List;

public class Girl {
    private String name;
    private int age;
    private List<Doll> dolls;  // Изначально ссылается на null
    // Конструктор без аргументов
    public Girl(){
        this.name = ""; // инициализируем пустой строкой
        this.dolls = new ArrayList<>();// инициализируем пустым списком
        // поле age будет по умолчанию инициализировано 0
    }
    // Конструктор со всеми аргументами
    public Girl(String name, int age, List<Doll> dolls) {
        this.name = name;
        this.age = age;
        this.dolls = dolls;
    }
    // Геттеры / Сеттеры
    public List<Doll> getDolls() {
        return dolls;
    }

    public void setDolls(List<Doll> dolls) {
        this.dolls = dolls;
    }

    public String getName() {
        return name;
    }
}

