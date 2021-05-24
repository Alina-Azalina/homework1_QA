import java.io.IOException;

public class task13 {
    public static void main(String[] args) throws Exception {
        int[] array = getArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] getArray() throws IOException {
        // создай и заполни массив
        int[] nums = {1, 2, 3, 4, 65, 56, 9};
        return nums;

    }

    public static int max(int[] array) {
        int max = array[0];
        for (int a = 0; a < array.length; a++) {
            if (max < array[a]) {
                max = array[a];
            }
        }
        return max;
    }
}
