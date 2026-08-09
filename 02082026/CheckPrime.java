public class CheckPrime {
    public static void main(String[] args) {
        int a = 0;
        boolean prime = true;

        if(a<1) {
            prime = false;
        }
        else{
            for (int i = 2;i < a;i++) {
                if(a % i == 0) {
                    prime = false;
                }
            }
        }
        if(prime) {
            System.out.println(a + " is prime");
        }
        else {
            System.out.println(a + " not prime");
        }
    }
}
//prime number is number you can only divide by itself and 1
//  if a <= 1 then not prime
//then loop i==2 up to squareroot of a
//if a factor found then  not prime and print if a prime or not