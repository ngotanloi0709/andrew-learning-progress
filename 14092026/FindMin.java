public class FindMin {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] testArray = {5, 2, 9, 1, 7};
        System.out.println("smallest is: " + findMin(testArray));
    }
}