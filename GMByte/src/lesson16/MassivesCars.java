package lesson16;

import lesson16.Car;

public class MassivesCars {
    public static void main(String[] args) {
        Car[] cars = new Car[10];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
        }

        cars[0].speed = 120;
        cars[1].speed = 100;

        cars[0].start();
        cars[0].stop();

        System.out.println(cars[0].speed);
        System.out.println(cars[1].speed);
    }
}

