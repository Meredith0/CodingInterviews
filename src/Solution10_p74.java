/**
 * @author : Meredith
 * @date : 2019-06-09 00:26
 * @description : 求第n个斐波那契数
 */

/**  青蛙跳台阶也是斐波那契数列  */

public class Solution10_p74 {

    static long fibOnN (int n) {
        final int[] result = new int[]{0, 1};
        if (n < 2) {
            return result[n];
        }

        long temp1 = 1;//fib(n-1)
        long temp2 = 0;//fib(n-2)
        long fib=0;
        for (int i = 0; i < n - 2; i++) {
            fib = temp1 + temp2;
            temp2=temp1;
            temp1 = fib;
        }
        return fib;
    }

    public static void main (String[] args) {
        System.out.println(fibOnN(10));
    }

}
