/**
 * @author : Meredith
 * @date : 2019-06-09 19:08
 * @description : 旋转数组中的最小数字
 */
public class Solution11_p82 {

    static int findMin (int[] input) {
        if (input == null) {
           return 0;
        }

        int left = 0;
        int right = input.length - 1;
        int mid = 0;

        while (input[left] >= input[right]) {
            if (right - left <= 1) {
                mid = right;
                break;
            }
            mid = (left + right) / 2;
            if (input[left] == input[mid] && input[mid] == input[right]) {
                if (input[left + 1] != input[right - 1]) {
                    mid = input[left + 1] < input[right - 1] ? left + 1 : right - 1;
                } else {
                    left++;
                    right--;
                }
            } else {
                if (input[left] <= input[mid]) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
        }
        return input[mid];

    }

    public static void main (String[] args)  {
        int[] input = new int[]{3, 4, 5, -1, 1, 2};
        System.out.println(findMin(input));
    }
}
