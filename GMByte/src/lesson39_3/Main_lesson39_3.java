package lesson39_3;
// Уроки Java - №39 Exceptions ч.2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_lesson39_3 {
    public static void main(String[] args) {
        try {
            test();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void test() throws InterruptedException, IOException {
        Thread.sleep(1000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
    }
}