import java.util.Arrays;

/**
 * @author ManNghi
 * @since 17/01/2025 - 15:15
 */
public class baitap5 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != maxIndex) {
                newArr[j++] = arr[i];
            }
        }
        int secondMax = newArr[0];
        for (int i = 1; i < newArr.length; i++) {
            if (newArr[i] > secondMax) {
                secondMax = newArr[i];
            }
        }
        System.out.println(secondMax);
    }
}
