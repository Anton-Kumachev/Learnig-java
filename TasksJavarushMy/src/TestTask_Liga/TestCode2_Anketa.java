package TestTask_Liga;

public class TestCode2_Anketa {
    public static void main(String[] args) {
        // Line n1
        int cardVal = 15;
        switch (cardVal) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.println("Hit");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Double");
                break;
            case 15:
            case 16:
                System.out.println("Surrender");
                break;
            default:
                System.out.println("Stand");
        }
    }
}
