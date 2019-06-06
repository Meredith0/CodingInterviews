/**
 * @author : Meredith
 * @date : 2019-06-06 00:25
 * @description : p44 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *     请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */
public class solution4_p44 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(isContain(matrix, 13));
    }

    /**
     * @param input 输入的二维数组
     * @param i 要查找的数
     * @return 是否存在
     */
    private static boolean isContain(int[][] input, int i) {
        if (null == input) {
            return false;
        }
        //从右上角开始
        int row = 0;
        int col = input[0].length - 1;

        //到左下角结束
        while (row < input.length && col >= 0) {
            if (i == input[row][col]) {
                return true;
            }
            //如果不相等, 并且左上角大于比较值 左移一行
            else if (input[row][col] > i) {
                col--;
            }
            //否则, 下移一行
            else {
                row++;
            }
        }
        return false;
    }

}
