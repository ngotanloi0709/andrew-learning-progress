package Solution;

public class Solution2 {
    // Reverse a number
    // e.g. 1232 -> 2321
    public static int reverseNumber(int n) {
        int result = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            result = result * 10 + lastDigit;
            n /= 10;
        }

        return result;
    }
}
