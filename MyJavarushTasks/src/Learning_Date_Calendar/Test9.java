package Learning_Date_Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test9 {
    public static void main(String[] args) {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(1212121212121L);

        System.out.println(formater.format(date));
    }
}
