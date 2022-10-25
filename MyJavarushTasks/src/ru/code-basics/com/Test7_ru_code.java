
package Temp;

import java.time.LocalDate;

public class Test7_ru_code {
    public static void main(String[] args) {
        var year = Test7_ru_code.getCurrentYear();
        System.out.println(year); // выведет текущий год
    }

    public static LocalDate getCurrentYear() {
        var date = LocalDate.now();
        return date;
    }
}
