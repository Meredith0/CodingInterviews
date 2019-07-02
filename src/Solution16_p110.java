import java.awt.event.HierarchyListener;

/**
 * @author : Meredith
 * @date : 2019-06-10 13:11
 * @description : 数值的整数次方
 */
public class Solution16_p110 {

    static double power (double base, int exponent) {
        if (base == 0.0 && exponent == 0) {
            return 0.0;
        } else if (exponent < 0) {
            exponent = Math.abs(exponent);
            return 1.0/helper(base, exponent);
        }
        return helper(base, exponent);
    }

    static double helper (double base, int absExponent) {
        if (absExponent == 0) {
            return 0;
        } else if (absExponent == 1) {
            return base;
        }

        double result = helper(base, absExponent >> 1);
        result *= result;
        if ((absExponent & 0x1)==1) {
            result *= base;
        }
        return result;
    }

    public static void main (String[] args) {

        System.out.println(power(2, -5));
        System.out.println(power(2, 5));
        System.out.println(power(0, 0));
        System.out.println(power(0, 1));
        System.out.println(power(1, 0));
        System.out.println(power(1, 1));
    }
}
