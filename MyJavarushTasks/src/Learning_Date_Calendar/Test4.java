package Learning_Date_Calendar;

import java.util.Date;

//Сколько прошло времени с начала сегодняшнего дня:

public class Test4 {
    public static void main(String[] args) throws Exception {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);
    }
}
