package homework;

/**
 * @author ManNghi
 * @since 19/01/2025 - 20:14
 */
public class baitap18 {
    public static int solution(String str){
        int countSpace = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                countSpace++;
            }
        }
        return countSpace + 1;
    }

    public static void main(String[] args) {
        String name = "Hàng Mẫn Nghi";
        System.out.println("Số lượng từ trong chuỗi là: " + solution(name));
    }
}
