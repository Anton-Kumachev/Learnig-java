package lesson29;

public class Notebook {

    CDRom cdr = new CDRom();
    HDD hdd = new HDD();

    void on() {
        System.out.println("Я включился");
    }

    void job() {
        System.out.println("Я работаю");
        cdr.readDisk();
        hdd.saveInfo();
        cdr.writeDisk();
        hdd.loadInfo();
    }

    void off() {
        System.out.println("Я выключился");
    }
}
