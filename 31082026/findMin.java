public class findMin {
    public static int findMax(int[] array) { //tao ham ten la findmax
        int max = array[0]; //cho so max hien tai la so dau tien
        for(int i = 0; i < array.length; i++) {//cho i = 0, i se nho hon length cua array roi cong vo sau moi vong lap
            if(array[i] > max) {//neu so ki tu i lon hon so max hien tai
                max = array[i]; // max se la so ki tu i hien tai
            }
        }
        return max; // return max
    }

    public static int sumAllEvenNumber(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(isEvenNumber(array[i])) {
                sum += array[i];
            }
        }

        return sum;
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) return true;

        return false;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 2, 6, 7, 1, 8, 9}; //day so cua minh da duoc tao ra
        System.out.println(findMax(array));// in ra so lon nhat
        System.out.println(sumAllEvenNumber(array));
    }   
}
