public class checkArmstrong {
    public static void main(String[] args) {
        int n = 153;
        int temporary = n;
        int sum = 0;
        while(temporary > 0) {
            int digits = temporary % 10;
            sum = sum + (digits * digits * digits);
            temporary = temporary /10;
        }
        if(sum = number) {
            System.out.println(n + "is armstrong number");
        }
        else {
            System.out.println(n + "is not armstrong number");
        }

    }
}
