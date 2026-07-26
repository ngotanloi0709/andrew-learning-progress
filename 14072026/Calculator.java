public class Calculator {
    boolean isEvenNumber(int number) {
        return number % 2 == 0 ? true : false;
    }
    
    int sumEvenNumber(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (isEvenNumber(array[i])) {
                sum += array[i];            }
        }
        return sum;
    
    }

    long calcFactorial(int n) {
        long factorial = 1;
        for(int i = 1; i <= n; i++) factorial *= i;
        
        return factorial;
    } 
}
