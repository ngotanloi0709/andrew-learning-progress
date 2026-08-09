public class CheckPalindrome {
    public static void main(String[] args) {
        int a = 12321;
        int before = a;
        int after = 0;

        while(a<0) {
            int dig = a % 10;
            after = after * 10 + dig;
            a %= 10;
        }
        if(before == after) {
            System.out.println(a + "is palindrome ");
        } else {
            System.out.println(a + "is not palindrome" );
        }
    }

} 

// palidrome is number where it is the same forward and backward
// take out last digit (%10) and reverse by multiply 10 and add digit then 
// then get last digit out by (/10) and then check