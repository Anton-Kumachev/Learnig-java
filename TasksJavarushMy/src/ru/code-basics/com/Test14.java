package Temp;

public class Test14 {
    public static void main(String[] args) {

    }

    public static String normalizeUrl(String address) {
        if(startWith(address))
            return address;

            return ("https://" + address);
}

    public static boolean startWith(String address) {
        return address.substring(0, 8).equals("https://");
    }
}

