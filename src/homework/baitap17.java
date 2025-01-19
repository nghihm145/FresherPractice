package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ManNghi
 * @since 19/01/2025 - 19:49
 */
public class baitap17 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5}; // 1,2,3,4,5
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(!list.contains(array[i])) {
                list.add(array[i]);
            }
        }
        // Chuyển đổi từ List<Integer> sang int[]
        int[] arrReturn = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arrReturn[i] = list.get(i);  // Sao chép giá trị từ danh sách vào mảng
        }
        return arrReturn;
    }
}

