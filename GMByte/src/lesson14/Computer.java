package lesson14;

public class Computer {
    private byte a = 0;
    private byte b = 0;

    public byte getA() {
        return a;
    }
    public void setA(byte a) {
        if (a < 20) {
            System.out.println("Введено неверное занчение a: " + a);
        } else {
            this.a = a;
        }
    }

    public byte getB() {
        return b;
    }

    public void setB(byte b) {
        if (b < 20) {
            System.out.println("Введено неверное занчение b: " + b);
        } else {
            this.b = b;
        }
    }
}
