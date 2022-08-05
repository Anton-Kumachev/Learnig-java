package level8_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность
*/

public class Solution_hard1 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        int count = 1;
        int countMax = 1;
        for (int i = 0; i < 10; i++) {
            number = Integer.parseInt(reader.readLine());
            list.add(number);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) { //Делаем сравнение через equals из-за Integer
                count++;
                if (count > countMax) {
                    countMax = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(countMax);
    }
}
