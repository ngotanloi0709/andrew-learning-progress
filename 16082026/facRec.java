
public class facRec {
    public static int facRec(int n) {
        if (n == 1) return 1;
        
        return n * facRec(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(facRec(n));
    }
}
