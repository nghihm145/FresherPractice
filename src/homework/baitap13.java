package homework;

/**
 * @author ManNghi
 * @since 19/01/2025 - 11:04
 */
public class baitap13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
