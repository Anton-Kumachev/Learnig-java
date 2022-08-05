package Learning_Date_Calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test6 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2017, 0, 25); // 0 - это январь
        System.out.println(calendar);

        Date date = calendar.getTime();
        System.out.println(date);

        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, 7);
        calendar.set(Calendar.DAY_OF_MONTH, 5);
        calendar.set(Calendar.HOUR_OF_DAY, 8);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);

        System.out.println(calendar.getTime());

        Calendar calendar2 = new GregorianCalendar(2017, Calendar.JANUARY , 25);
        calendar2.set(Calendar.HOUR, 19);
        calendar2.set(Calendar.MINUTE, 42);
        calendar2.set(Calendar.SECOND, 12);

        calendar2.add(Calendar.MONTH, -2);//чтобы отнять значение - в метод нужно передать отрицательное число
        System.out.println(calendar2.getTime());
    }
}
