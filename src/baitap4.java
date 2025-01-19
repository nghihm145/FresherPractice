import java.util.Arrays;

/**
 * @author ManNghi
 * @since 16/01/2025 - 20:27
 */
public class baitap4 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1};
        int index = 0;
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
