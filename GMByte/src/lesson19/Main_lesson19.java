package lesson19;

public class Main_lesson19 {
    public static void main(String[] args) {

        Panasonic_a1 pa2 = new Panasonic_a2(); //Это пульт от телевизора a1, который подходит к телевизору a2.
                                               // При этом на нём нет кнопки паузы и контрастности как на пульте a2,
                                               //  поэтому эти методы не доступны при таком создании объекта. Таким образом
                                               // тип указателя Panasonic_a1 pa2 делает доступными переменные и методы
                                               // родительского класса объекту наследника.
        pa2.on();
        pa2.off();

        Vityaz1 vit = new Vityaz2();
        vit.on();

        Panasonic_a1 pxz = new Panasonic_xz();
        
    }
}
