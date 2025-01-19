package homework;

/**
 * @author ManNghi
 * @since 19/01/2025 - 20:25
 */
public class baitap19 {
    public static String solution(String str) {
        return str.replace(" ", "");
    }

    public static String solution2(String str) {
        String[] arrStr = str.split(" "); // tách chuỗi theo space --> ["Hang", "Man", "Nghi]
        String strReturn = "";

        for (String strTemp : arrStr) {
            strReturn = strReturn + strTemp;
        }
        return strReturn;
    }

    public static String solution3(String str) {
        String strReturn = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
//                strReturn = strReturn + str.charAt(i);
                strReturn += str.charAt(i);
            }
        }
        return strReturn;
    }

    public static void main(String[] args) {
        String name = "Hàng Mẫn Nghi";
        System.out.println("Chuỗi sau khi bỏ space: " + solution(name));
        System.out.println("Chuỗi sau khi bỏ space: " + solution2(name));
        System.out.println("Chuỗi sau khi bỏ space: " + solution3(name));
    }
}
