package Learning_Date_Calendar;

import java.util.Date;

//Наступило ли уже некоторое время:

public class Test3 {
    public static void main(String[] args) throws Exception {
        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000;   //   +5 секунд
        Date endDate = new Date(endTime);
        System.out.println("Начало ожидания потока");
        Thread.sleep(3000);              // ждем 3 секунды

        Date currentTime = new Date();
        if(currentTime.after(endDate)) {//проверяем что время currentTime после endDate
           System.out.println("End time!"); //   +2 секунды
        } else
            System.out.println("Что-то пошло не так"); // если +5 секунд
    }
}
