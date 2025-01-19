/**
 * @author ManNghi
 * @since 16/01/2025 - 22:33
 */
public class baitap7 {
    //    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        int a = 0;
//        int b = 1;
//        for (int i = 2; i <= n; i++) {
//        int next = a + b;
//        a = b;
//        b = next;
//        }return b;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Fibonacci là: " + fibonacci(7));
//    }
//}
    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("fibonacci là: " + b);
    }
}