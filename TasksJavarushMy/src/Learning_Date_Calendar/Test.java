package Learning_Date_Calendar;

//https://javarush.ru/groups/posts/1941-kak-ne-poterjatjhsja-vo-vremeni--datetime-i-calendar

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy");
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println(calendar.getTime());
        System.out.println("Текущая дата: " + dateFormat.format(calendar.getTime()));
    }
}
