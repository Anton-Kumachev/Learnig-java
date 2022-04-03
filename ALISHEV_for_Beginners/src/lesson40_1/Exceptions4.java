package lesson40_1;

import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException e) { //Могут быть разные catch блоки для каждого исключения
            e.printStackTrace();
        } catch (ParseException e) { //Могут быть разные catch блоки для каждого исключения
            e.printStackTrace();
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException { //Этот метод может выбрасывать
                                                                                           // любое количество исключений

    }

}
