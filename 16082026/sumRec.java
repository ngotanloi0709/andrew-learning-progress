public class sumRec {
    public static int sumRec(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println("from 1" + n + "is" + sumRec(n));
    }
}