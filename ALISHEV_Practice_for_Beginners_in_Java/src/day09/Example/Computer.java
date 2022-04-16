package day09.Example;

public class Computer {
    private String manufacturer;
    private int productionYear;

    public Computer(String manufacturer, int productionYear) {
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
    }

    public void testA() {
        System.out.println("Hello from class A");
    }
}

class Laptop extends Computer {
    private int batteryCapacity;

    public Laptop(String manufacturer, int productionYear, int batteryCapacity) {
        super(manufacturer, productionYear);
        this.batteryCapacity = batteryCapacity;

        super.testA();
    }
}
