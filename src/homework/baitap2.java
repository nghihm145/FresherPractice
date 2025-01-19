package homework;

/**
 * @author ManNghi
 * @since 16/01/2025 - 20:12
 */
public class baitap2 {
    public static void main(String[] args) {
        int snt = 9;
        boolean sont = true;
        if (snt <= 1) {
            sont = false;
        }else{
            for(int i = 2; i <= snt; i++){
                if(snt % i == 0){
                    sont = false;
                    break;
                }
            }
        }
        System.out.println(snt + " là số nguyên tố: " + sont);
    }
}
