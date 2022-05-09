package day12.task3;

/*3.Выполнять в подпапке task3 в day12*
    Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
    (название музыкальной группы и год основания). Создать 10 или более экземпляров
    класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
    которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
    список. Создать статический метод в классе Task3:
    public static List<MusicBand> groupsAfter2000(List<MusicBand>
    bands)
    Этот метод принимает список групп в качестве аргумента и возвращает новый список,
    состоящий из групп, основанных после 2000 года. Вызвать метод
    groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
    из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
    после 2000 года).*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand3 band1 = new MusicBand3("Музыкальная группа 01", 2007);
        MusicBand3 band2 = new MusicBand3("Музыкальная группа 02", 1976);
        MusicBand3 band3 = new MusicBand3("Музыкальная группа 03", 1960);
        MusicBand3 band4 = new MusicBand3("Музыкальная группа 04", 2018);
        MusicBand3 band5 = new MusicBand3("Музыкальная группа 05", 2006);
        MusicBand3 band6 = new MusicBand3("Музыкальная группа 06", 2014);
        MusicBand3 band7 = new MusicBand3("Музыкальная группа 07", 1965);
        MusicBand3 band8 = new MusicBand3("Музыкальная группа 08", 1966);
        MusicBand3 band9 = new MusicBand3("Музыкальная группа 09", 2008);
        MusicBand3 band10 = new MusicBand3("Музыкальная группа 10", 2003);

        List<MusicBand3> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);

        List<MusicBand3> musicBandsAfter2000 = new ArrayList<>();
        for (MusicBand3 band : musicBands) {
            if (band.getYear() > 2000) {
                musicBandsAfter2000.add(band);
            }
        }
        System.out.println(musicBandsAfter2000);
    }
}
