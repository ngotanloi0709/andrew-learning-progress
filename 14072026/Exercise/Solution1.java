package Exercise;

public class Solution1 {
    static int countDigitsOfNumber(int number) {
        int result = 0;
        
        while (number >= 1) {
            number /= 10;
            result++;
        }

        return result;
    }
    static int findFirstNumber(int number) {
        int power = (int) Math.pow(10, countDigitsOfNumber(number) - 1);
        
        return number / power;
    }
    static int findLastNumber(int number) {
        return number % 10;
    }
    static int findMiddleNumber(int number) {
        int divide = (int) Math.pow(10, countDigitsOfNumber(number) - 1);
        
        return (number % divide ) / 10; 
    }
    
    static int swapFirstAndLastDigitsOfNumber(int number) {
        int firstDigit = findFirstNumber(number);
        int lastDigit = findLastNumber(number);
        int power = (int) Math.pow(10, countDigitsOfNumber(number) - 1);

        // Remove first and last digits, then place them in swapped positions
        int result = number - firstDigit * power - lastDigit + lastDigit * power + firstDigit;

        return result;
    }
}
