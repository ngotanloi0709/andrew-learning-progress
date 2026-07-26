package Exercise;

// 1/ Hoán đổi chữ số đầu tiên và chữ số cuối cùng của một số.
// 2/ Đảo ngược các chữ số của một số.
// 3/ Kiểm tra một số có phải là số đối xứng (Palindrome) hay không.
// 4/ Kiểm tra một số có phải là số nguyên tố hay không.
// 5/ Kiểm tra một số có phải là số Armstrong hay không.

// 6/ Kiểm tra một số có phải là số hoàn hảo (Perfect Number) hay không.

public class Main {    
    public static void main(String[] args) {
        System.out.println(Solution1.findFirstNumber(1234));
        System.out.println(Solution1.findLastNumber(1234));
        System.out.println(Solution1.countDigitsOfNumber(1234));
        System.out.println(Solution1.findMiddleNumber(1234));
        System.out.println(Solution1.swapFirstAndLastDigitsOfNumber(1234));
        System.out.println(Solution1.swapFirstAndLastDigitsOfNumber(12345));
    } 
    }
