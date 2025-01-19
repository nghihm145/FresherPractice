package homework;

/**
 * @author ManNghi
 * @since 17/01/2025 - 21:00
 */
public class baitap5_v2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 9, 12, 7};
        solution(arr);
    }

    public static void solution(int[] array) {
        int[] arr = new int[array.length];
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
        SortSolution.solution(array);
        System.out.println(array[array.length - 2]);
    }
}
