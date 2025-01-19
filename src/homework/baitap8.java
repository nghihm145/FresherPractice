package homework;

/**
 * @author ManNghi
 * @since 16/01/2025 - 22:47
 */
public class baitap8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 4};
        for(int i = 0; i <= arr.length; i++){
            for(int j = 1; j <= arr.length; i++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate: " + arr[j]);
                }break;
            }
        }
    }
}
