package homework;

/**
 * @author ManNghi
 * @since 16/01/2025 - 20:36
 */
public class baitap6 {
    public static boolean DoiXung(String str) {
        int l = str.length();
        for (int i = 0; i < l / 2; i++) {
            if (str.charAt(i) != str.charAt(l - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(DoiXung("madam"));
    }
}
