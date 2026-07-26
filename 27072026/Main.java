public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(findBiggestNumber(array));
    }
    public static int findBiggestNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i]; //i la so lay vi tri va gia tri that trong array khac
        
            }
        }
        return max;
    }
}
    