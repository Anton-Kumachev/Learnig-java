package lesson29_2;

public class DVDRom extends Laptop {

    public void readDisk() {
        System.out.println("Читаю диск");
    }
    public void writeDisk() {
        System.out.println("Записываю диск");
    }

    @Override
    public void on() {
        System.out.println("Я включился - я DVDRom");
    }

    @Override
    void job() {
        System.out.println("Я работаю - я DVDRom");
    }

    @Override
    void off() {
        System.out.println("Я выключился - я DVDRom");;
    }
}
