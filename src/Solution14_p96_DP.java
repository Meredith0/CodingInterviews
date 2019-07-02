/**
 * @author : Meredith
 * @date : 2019-06-09 21:25
 * @description : 剪绳子  动态规划
 */
public class Solution14_p96_DP {

    public static void main (String[] args) {
        System.out.println(optimize(8));
    }

    //找n的最优解
    static int optimize (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Illegal parameter");
        }

        int[] opt = new int[n + 4];
        opt[0] = 0;
        opt[1] = 1;
        opt[2] = 2;
        opt[3] = 3;

        for (int i = 4; i <= n; i++) {
            int max = 0;
            for (int j = 1; j <= i / 2; j++) {
                int temp = opt[j] * opt[i - j];
                if (temp > max) {
                    max = temp;
                }
                opt[i] = max;
            }
        }
        return opt[n];
    }

}
