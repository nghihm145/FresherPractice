/**
 * @author ManNghi
 * @since 19/01/2025 - 11:28
 */
public class baitap15 {
    public static void main(String[] args) {
        boolean check = true;
        int year = 2023;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Năm " + year + " là năm nhuần: " + check);
                } else {
                    check = false;
                    System.out.println("Năm " + year + " là năm nhuần: " + check);
                }
            } else {
                System.out.println("Năm " + year + " là năm nhuần: " + check);
            }
        } else {
            check = false;
            System.out.println("Năm " + year + " là năm nhuần: " + check);
        }
    }
}
