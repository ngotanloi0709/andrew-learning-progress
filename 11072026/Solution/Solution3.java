package Solution;

public class Solution3 {
    // Check if a number is a palindrome
    // e.g. 12321 -> true, 1234 -> false
    public static boolean isPalindrome(int n) {
        return n == Solution2.reverseNumber(n);
    }
}
