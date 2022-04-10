package day07;

public class Player {
    private int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;

    public static int getCountPlayers() {
        return countPlayers;
    }

    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public void run() {
        if (stamina == 0)
            return;
        stamina--;

        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {
        int freePlaces = 6 - countPlayers;

        while (countPlayers <= 6) {
            if (freePlaces == 1) {
                System.out.println("Команды неполные. На поле еще есть " + freePlaces + " свободное место");
                break;
            } else if (freePlaces > 1 && freePlaces < 5) {
                System.out.println("Команды неполные. На поле еще есть " + freePlaces + " свободных места");
                break;
            } else if (freePlaces == 5) {
                System.out.println("Команды неполные. На поле еще есть " + freePlaces + " свободных мест");
                break;
            } else {
                System.out.println("Место в командах больше нет");
                break;
            }
        }
    }
}