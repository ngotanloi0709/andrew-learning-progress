package 27072026.Exercise;

public class Bai3 {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(reverseNumber(number));
    }

    public static int reverseNumber(int n) {
        int reverse = 0
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10
        }
        return reverse;
    }
}