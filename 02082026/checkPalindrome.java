public class checkPalindrome {
    public static void main(String[] args) {
        int a = 12321;
        int before = a;
        int after = 0;

        while(n<0) {
            int dig = n % 10;
            after = after * 10 + dig;
            n % 10;
        }
        if(before == after) {
            System.out.println(before + "is palindrome ");
        }
    }
    else {
        System.out.println(original + "is not palindrome" );
    }
}

// palidrome is number where it is the same forward and backward
// take out last digit (%10) and reverse by multiply 10 and add digit then 
// then get last digit out by (/10) and then check