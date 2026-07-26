package Solution;

public class Solution1 {
    // replace first and last digit of a number
    // e.g. 1232 -> 2231
    public static int replaceFirstAndLastDigit(int n) {
        int digits = Common.numberOfDigits(n);
        int power = (int) Math.pow(10, digits - 1);

        int firstDigit = n / power;
        int lastDigit = n % 10;
        int middle = n - firstDigit * power - lastDigit;

        return lastDigit * power + middle + firstDigit;
    }
}
