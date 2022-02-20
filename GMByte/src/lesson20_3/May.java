package lesson20_3;

public class May extends Cat {

    @Override
    void voice() {
        System.out.println("Кто сказал: Мяу?");
    }

    @Override
    void eat() {
        System.out.println("Я хочу ням-ням!");
    }

    @Override
    void walk() {
        System.out.println("Я люблю сбегать из дома и потом орать под окнами =)");
    }

    @Override
    void sleep() {
        System.out.println("Сон - моё перманентное сосотояние по 18 часов в день.");
    }

    void morningMurr () {
        System.out.println("По утрам я обычно хочу жрать и мурлычу любому хозяину," +
                " кто встал с утра по-раньше и зашёл на кухню. А ещё путааюсь под ногами и обвиваю хвостом =Р");
    }
}
