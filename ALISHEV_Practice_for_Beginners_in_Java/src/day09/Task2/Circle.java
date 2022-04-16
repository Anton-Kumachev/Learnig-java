package day09.Task2;

public class Circle extends Figure {
    private double r;

    public Circle(double r, String color) {
        super(color);
        this.r = r;
    }

    @Override
    public double area() {
        return r * r * Math.PI; //Math.PI - число пи = 3.14
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * r;
    }
}
