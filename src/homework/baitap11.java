package homework;

/**
 * @author ManNghi
 * @since 19/01/2025 - 10:43
 */
public class baitap11 {
    public static boolean Palindrome(String str){
        int l = str.length();
        for(int i = 0; i < l / 2; i++){
            if(str.charAt(i) == str.charAt(l - i -1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome("radar"));
    }
}
