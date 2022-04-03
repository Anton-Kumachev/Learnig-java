package lesson28;

//public, private, default, protected
// default - всё, что доступно в пределах этого пакета;
//protected - доступны в пределах одного пакета, доступны всем подклассам, даже если эти
//подклассы вне пакета

import lesson28.Packet1.Person;

public class Test extends Person {
    public int id;
    private int id2;
    protected int id3;

    public Test() {
    name = "Liza";
    }
}
