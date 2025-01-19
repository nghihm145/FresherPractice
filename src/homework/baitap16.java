package homework;

/**
 * @author ManNghi
 * @since 19/01/2025 - 11:50
 */
public class baitap16 {
    public static void main(String[] args) {
        int input = 1342;
        System.out.println(solution(input));
    }

    public static int solution(int number) {
        int sum = 0;
        String stringNumber = String.valueOf(number);
        for (int i = 0; i < stringNumber.length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
        }
        return sum;
    }
}
