package Learning_Date_Calendar;

import java.util.Date;

public class Test11 {
    public static void main(String[] args) throws InterruptedException {

        Date date1 = new Date();
        Thread.sleep(2000);//приостановим работу программы на 2 секунды

        Date date2 = new Date();

        System.out.println(date1.getTime());
        System.out.println(date2.getTime());

        System.out.println(date1.equals(date2)); //ПК сравнивает количество миллисекунд, прошедших с 00:00
                                                 //1 января 1970 для каждой даты.
    }
}
