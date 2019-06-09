/**
 * @author : Meredith
 * @date : 2019-06-10 00:25
 * @description : 二进制中 1 的个数
 */
public class Solution15_p100 {

    static int countBinaryOne (int n) {
        int count=0;
        while (n!=0) {
            n = (n-1) & n;
            ++count;
        }
        return count;
    }

    public static void main (String[] args) {
        System.out.println(countBinaryOne(-100));
        System.out.println(Integer.toBinaryString(-100));
        System.out.println(countBinaryOne(100));
        System.out.println(Integer.toBinaryString(100));
    }
}
