package homework;

/**
 * @author ManNghi
 * @since 16/01/2025 - 23:07
 */
public class baitap10 {
    public static void main(String[] args) {
        int a =2;
        int b = 15;
        while(a != b){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        System.out.println("UCLN là: " + a );
    }
}
