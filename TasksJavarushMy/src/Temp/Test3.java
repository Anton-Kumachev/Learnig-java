package Temp;

public class Test3 {
    public static void main(String[] args) {
        var company = "Java";
        System.out.println(company.toUpperCase());
        System.out.println(company);

        var email = " SupporT@hexlet.io\n";

        // BEGIN (write your solution here)
        var one = email.trim();
        var two = one.toLowerCase();
        System.out.println(two);
    }
}
