public class fibonaci {

    public static int getTheFibonaci(int i) {
        if (i==0) return 0;
        if (i==1) return 1;
        return getTheFibonaci(i-1) + getTheFibonaci(i-2);
    }

    public static void main(String[] args) {
        int n = 20; 
        int i = 0;
        int result = 0;
        System.out.println("fibonaci numbers less than " + n + " are ");
        
        while(result < n) {
            System.out.println(result);
            i++;
            result = getTheFibonaci(i);
        }
    }
}