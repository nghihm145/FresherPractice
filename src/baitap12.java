/**
 * @author ManNghi
 * @since 19/01/2025 - 10:56
 */
public class baitap12 {
    public static void main(String[] args) {
        String input = "Java programming";
        char a = 'p';
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == a){
                count++;
            }
        }
        System.out.println("số lần xuất hiện của ký tự " + a + " là: " + count);
    }
}
