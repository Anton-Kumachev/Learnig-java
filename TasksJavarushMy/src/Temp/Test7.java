
package Temp;

import java.time.LocalDate;

public class Test7 {
    public static void main(String[] args) {
        var year = Test7.getCurrentYear();
        System.out.println(year); // выведет текущий год
    }

    public static LocalDate getCurrentYear() {
        var date = LocalDate.now();
        return date;
    }
}
