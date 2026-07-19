package Solution;

public class Common {
    public static int numberOfDigits(int n) {
        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }
        
    return count;
    }
}
