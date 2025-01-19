package homework;

/**
 * @author ManNghi
 * @since 19/01/2025 - 11:16
 */
public class baitap14 {
    public static void main(String[] args) {
        int n = 5;
        int ketqua = 1;
        for(int i = 1; i <=n; i++){
            ketqua = ketqua * i;
        }
        System.out.println("Giai thừa của " + n + " là: " + ketqua);
    }
}
