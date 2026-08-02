public class Bai3 {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(reverseNumber(number));
        System.out.println(reverseNumberSecondTime(number));
    }

    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            // statement 3 in loop
            n = n / 10;
        }
        return reverse;
    }
    public static int reverseNumberSecondTime(int n) {
        int number = 0;
        for (/* empty statement */; n > 0 ; n /= 10) number = number * 10 + n % 10;
        return number;
    }
}