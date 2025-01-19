/**
 * @author ManNghi
 * @since 16/01/2025 - 20:04
 */
public class baitap1 {
    public static void main(String[] args) {
        String input = "hello";
        String output = "";
        for(int i = input.length() -1; i >= 0; --i){
            output = output + input.charAt(i);
        }
        System.out.println("Reverse: " + output);
    }
}
