package Solution;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Solution1.replaceFirstAndLastDigit(1234));
        System.out.println(Solution2.reverseNumber(1234));
        System.out.println(Solution3.isPalindrome(12321)); // true
        System.out.println(Solution3.isPalindrome(1234));  // false
        System.out.println(Solution4.isPrime(7));   // true
        System.out.println(Solution4.isPrime(12));  // false
        System.out.println(Solution5.isArmstrong(153));  // true
        System.out.println(Solution5.isArmstrong(123));  // false
        System.out.println(Solution6.isPerfectNumber(28));  // true
        System.out.println(Solution6.isPerfectNumber(12));  // false
    }
}