/**
 * @author : Meredith
 * @date : 2019-06-29 19:25
 * @description : 表示数值的字符串
 */
public class Solution20_p127 {

    static boolean isNumeric (char[] str) {
        if (str == null) {
            return false;
        }
        int index = 0;//下标
        int ecount = 0;//有多少个e
        int point = 0;//有多少个小数点

        //跳过开头的正负号
        if (str[0] == '-' || str[0] == '+') {
            index++;
        }

        for (int i = index; i < str.length; i++) {
            //如果在其他地方(e)出现'-' '+',返回false
            if (str[i] == '-' || str[i] == '+') {
                if (str[i - 1] != 'e' || str[i - 1] != 'E') {
                    return false;
                }
                continue;
            }

            //找到e
            if (str[i] == 'e' || str[i] == 'E') {
                ecount++;
                //有多个e
                if (ecount > 1) {
                    return false;
                }
                //出现e前面是非数字或没有数字
                if (i == 0 || !Character.isDigit(str[i - 1]) || i == str.length - 1) {
                    return false;
                }
                //
                point++;
                continue;
            }

            if (str[i] == '.') {
                point++;
                if (point > 1) {
                    return false;
                }
                continue;
            }
            //出现非数字且不是'e'/'E' 直接返回false(小数点和正负号用continue跳过了
            if (!Character.isDigit(str[i]) && (str[i] != 'e' || str[i] != 'E')) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        String str1 = "+100";
        String str2 = "5e2";
        String str3 = "-123";
        String str4 = "3.14";
        String str5 = "-1e-16";
        String str6 = "123e";
        String str7 = "1a4.12";
        String str8 = "+-5";
        String str9 = "12e+5.4";

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        char[] char3 = str3.toCharArray();
        char[] char4 = str4.toCharArray();
        char[] char5 = str5.toCharArray();
        char[] char6 = str6.toCharArray();
        char[] char7 = str7.toCharArray();
        char[] char8 = str8.toCharArray();
        char[] char9 = str9.toCharArray();

        System.out.println(char2);
        System.out.println(isNumeric(char1));
        System.out.println(isNumeric(char2));
        System.out.println(isNumeric(char3));
        System.out.println(isNumeric(char4));
        System.out.println(isNumeric(char5));
        System.out.println(isNumeric(char6));
        System.out.println(isNumeric(char7));
        System.out.println(isNumeric(char8));
        System.out.println(isNumeric(char9));
    }

}