public class FindMax {
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arrTest = {5, 2, 9, 1, 7};
        System.out.println("biggest is: " + findMax(arrTest));
    }
}