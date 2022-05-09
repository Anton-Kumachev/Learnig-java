package day12.task4;

/*4.*Выполнять в подпапке task4 в day12*
    Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
    группу можно было добавлять и удалять участников. Под участником понимается
    строка (String) с именем и фамилией. Реализовать статический метод слияния групп
    (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название
    метода: transferMembers. Этот метод принимает в качестве аргументов два
    экземпляра класса MusicBand. Реализовать метод printMembers (в классе
    MusicBand), выводящий список участников в консоль. Проверить состав групп после
    слияния.*/

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("УчастникГруппы01");
        members1.add("УчастникГруппы01");
        members1.add("УчастникГруппы01");
        members1.add("УчастникГруппы01");
        members1.add("УчастникГруппы01");
        members1.add("УчастникГруппы01");

        MusicBand4 band1 = new MusicBand4("Группа01", 1965, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("УчастникГруппы02");
        members2.add("УчастникГруппы02");
        members2.add("УчастникГруппы02");
        members2.add("УчастникГруппы02");

        MusicBand4 band2 = new MusicBand4("Группа02", 1960, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand4.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
