/**
 * @author ManNghi
 * @since 16/01/2025 - 23:01
 */
public class baitap9 {
    public static void main(String[] args) {
        String str = "hello";
        char ch = 'l';
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("So lan ki tu l xuat hien la " + count);
    }
}
