package interview;

/**
 * @author ManNghi
 * @since 19/01/2025 - 20:43
 */
public class Exercise01 {
    public static void solution(String name) {
        int[] Arr1 = {1, -2, -3, 5};
        int mul = 1;
        int var4 = Arr1.length;

        for (int j : Arr1) {
            if (j % 2 == 0) {
                mul *= j;
            }
        }

        System.out.println(mul);
    }

    public static void main(String[] args) {
        solution("Hi");
    }
}
