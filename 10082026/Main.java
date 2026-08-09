public class Main {
    public static void main(String[] args) {
        System.out.println("One dimension array");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int[][] array_2 = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24}
        };

        System.out.println();
        System.out.println("Two dimension array");

        for (int i = 0; i < array_2.length; i++) {
            for (int j = 0; j < array_2[i].length; j++) {
                System.out.print(array_2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
