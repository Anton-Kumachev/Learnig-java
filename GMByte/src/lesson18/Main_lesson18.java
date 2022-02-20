package lesson18;

public class Main_lesson18 {
    public static void main(String[] args) {
        Notebook note = new Notebook();
        note.hdd = 50;
        note.ram = 4;

        System.out.println(note.hdd);
        System.out.println(note.ram);

        note.on();
        note.jobS();
        note.jobB();
        note.off();
    }
}
