package day12.task5;

/*5. *Выполнять в подпапке task5 в day12*
    Скопировать MusicBand из прошлого задания и доработать - теперь у участника
    музыкальной группы есть не только имя, но и возраст. Соответственно, теперь под
    участником понимается не строка, а объект класса MusicArtist. Необходимо
    реализовать класс MusicArtist и доработать класс MusicBand (создать копию
    класса) таким образом, чтобы участники были - объекты класса MusicArtist. После
    этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
    проверить состав групп после слияния. Методы для слияния и для вывода участников
    в консоль необходимо тоже переработать, чтобы они работали с объектами класса
    MusicArtist.*/

import day12.task3.MusicBand3;
import day12.task4.MusicBand4;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("ИмяАртиста01", 50));
        members1.add(new MusicArtist("ИмяАртиста02", 35));
        members1.add(new MusicArtist("ИмяАртиста03", 24));
        members1.add(new MusicArtist("ИмяАртиста04", 40));
        members1.add(new MusicArtist("ИмяАртиста05", 45));
        members1.add(new MusicArtist("ИмяАртиста06", 42));

        MusicBand5 band1 = new MusicBand5("Группа01", 1965, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("ИмяАртиста07", 32));
        members2.add(new MusicArtist("ИмяАртиста08", 54));
        members2.add(new MusicArtist("ИмяАртиста09", 61));
        members2.add(new MusicArtist("ИмяАртиста10", 45));

        MusicBand5 band2 = new MusicBand5("Группа02", 1960, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand5.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
