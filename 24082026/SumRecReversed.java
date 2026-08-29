public class SumRecReversed {
    public static void main(String[] args) {
        int n = 5;
        
        System.out.println(sumRecReversedCover(n));
    }

    public static int sumRecReversedCover(int n) {
        return sumRecReversed(n, 1);
    }

    public static int sumRecReversed(int n, int i) {
        if (i >= n) {
            return n;
        }

        return i + sumRecReversed(n, i + 1);
    }
}
