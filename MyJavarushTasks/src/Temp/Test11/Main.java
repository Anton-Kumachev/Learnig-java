package Temp.Test11;

public class Main {
    public static void main(String[] args) {

    F1Car f1Car = new F1Car();
    Sedan sedan = new Sedan();
    Truck truck = new Truck();
    UnusualCar unusualCar = new UnusualCar();

    truck.gas();
    sedan.gas();
    f1Car.brake();
    unusualCar.gas();
    unusualCar.brake();
    }
}