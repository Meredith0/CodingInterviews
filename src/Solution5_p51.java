/**
 * @author : Meredith
 * @date : 2019-06-06 10:29
 * @description : 将一个字符串中的空格替换成“%20”。
 *     例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
 */
public class Solution5_p51 {

    public static void main(String[] args) {
        String str = "  We  Are     Happy  ";

        char[] input = new char[200];

        for (int i = 0; i < str.length(); i++) {
            input[i] = str.charAt(i);
        }
        input=replaceBlank(input);
        System.out.println(input);
    }

   private static char[] replaceBlank(char[] input) {
        if (input == null) {
            return null;
        }

        int indexOfOriginal = 0;//字符串的实际长度
        int blankLength = 0;//空格个数

        //遍历字符串
        while (input[indexOfOriginal] != '\0') {
            //统计空格数
            if (input[indexOfOriginal] == ' ') {
                blankLength++;
            }
            indexOfOriginal++;//统计实际长度

        }

        int indexOfNew = indexOfOriginal + blankLength * 2;//新字符串的长度=原字符串长度+空格个数*2

        //从后面开始遍历,  或者2个指针相遇, 表示前面没有空格了, 也退出
        while (indexOfOriginal >= 0 && indexOfNew > indexOfOriginal) {
            //找到空格, 则写入 %20
            if (input[indexOfOriginal] == ' ') {
                input[indexOfNew--] = '0';
                input[indexOfNew--] = '2';
                input[indexOfNew--] = '%';
            }
            //否则写入原数组值
            else {
                input[indexOfNew--] = input[indexOfOriginal];
            }
            indexOfOriginal--;
        }
        return input;
    }

}
