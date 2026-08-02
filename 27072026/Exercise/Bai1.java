public class Bai1 {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 3, 10};
        System.out.println(findSmallestNum(array));
        System.out.println(findSmallestNumButReverseOrder(array));
        System.out.println(findSmallestNumberUsingWhileLoop(array));
    }

    public static boolean isAbiggerThanB(int a, int b) {
        if (a > b) return true;
        
        return false;
    }

    public static int findSmallestNum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            int usedToCompareNumber = array[i];

            if (isAbiggerThanB(min, usedToCompareNumber)) {
                min = usedToCompareNumber;
            }
        }

        return min;
    }

    public static int findSmallestNumButReverseOrder(int[] array) {
        int min = array[array.length - 1];

        for (int i = array.length - 1; i >= 0; i--) {
            int usedToCompareNumber = array[i];

            if (isAbiggerThanB(min, usedToCompareNumber)) {
                min = usedToCompareNumber;
            }
        }
        return min;
    }
    public static int findSmallestNumberUsingWhileLoop(int[] array) {
        int min = array[0];
        int i = 1;

        while (i < array.length) {
            if (min > array[i]) {
                min = array[i];
            }
            
            i++;
        }

        return min;
    }
}