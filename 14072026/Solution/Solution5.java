package Solution;

public class Solution5 {
    public static boolean isArmstrong(int n) {
        int digits = Common.numberOfDigits(n);
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += (int) Math.pow(lastDigit, digits);
            temp /= 10;
        }

        return sum == n;
    }
}
