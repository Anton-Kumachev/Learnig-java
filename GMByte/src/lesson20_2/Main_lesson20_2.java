package lesson20_2;

public class Main_lesson20_2 {
    public static void main(String[] args) {

        Acer ac = new Acer();
        ac.on();
        ac.toMyCalculation();
        ac.jobBattary();
        ac.off();

        Computer c = new Samsung();
        c.on();
        c.toMyCalculation();
        c.off();

        PC p = new Samsung();
        p.on();
        p.toMyCalculation();
        p.off();

        //Notebooks s = new Samsung(); так нельзя создать объект

        Samsung s = new Samsung();
        s.on();
        System.out.println(c.a);
        c.test();
        s.toMyCalculation();
        s.modification();
        s.off();
    }

}
