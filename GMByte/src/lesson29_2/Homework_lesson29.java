package lesson29_2;

public class Homework_lesson29 {

    public static void main(String[] args) {

        Laptop laptopt = new Laptop();
        laptopt.on();
        laptopt.job();
        laptopt.off();
        System.out.println(""); // Пропуск строки

        Laptop dvdRom = new DVDRom(); //При создании таким образом нового объекта будут доступны только
                                     // переопределённые методы класса-родителя
        dvdRom.on();
        dvdRom.job();
        dvdRom.off();

        DVDRom dvdRom1 = new DVDRom(); //Становятся доступны все методы класса-потомка и переопределённые
                                      // меирды класса-родителя
        dvdRom1.readDisk();
        dvdRom1.writeDisk();
        System.out.println(""); // Пропуск строки

        Laptop hdd = new HDD();//При создании таким образом нового объекта будут доступны только
        // переопределённые методы класса родителя
        hdd.on();
        hdd.job();
        hdd.off();

        HDD hdd1 = new HDD();
        hdd1.loadInfo();
        hdd1.saveInfo();
    }
}