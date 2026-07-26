package Solution;

public class Solution6 {
    // e.g. 6 = 1 + 2 + 3 = 6 -> true
    // e.g. 28 = 1 + 2 + 4 + 7 + 14 = 28 -> true
    public static boolean isPerfectNumber(int n) {
        if (n < 2) return false;

        int sum = 1; // 1 luon la uoc cua moi so >= 2

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }
}
