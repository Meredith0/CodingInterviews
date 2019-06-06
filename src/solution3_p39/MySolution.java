package solution3_p39;
/**
 * @author : Meredith
 * @date : 2019-06-05 23:55
 * @description : P39 找出数组中重复的数字 位图法
 */
public class MySolution {

    public static void main(String[] args) {
        int[] input = new int[]{2, 2, 4, 4, 3, 6, 4, 6};
        int[] input1 = new int[]{1, 2, 3, 4, 5, 100};
        int[] input2 = null;
        findDuplication(input);
        findDuplication(input1);
        findDuplication(input2);

    }

    public static void findDuplication(int[] array) {
        if (array == null) {//判空
            System.out.println("输入为空");
            return;
        }
        int[] temp = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array.length) {
                System.out.println("输入值越界");
                return;
            }

            if (temp[array[i]] == 0) {//读入数据, 置1
                temp[array[i]] = 1;
            } else if (temp[array[i]] == 1) {//判断重复
                System.out.print(array[i]+"  ");
            }

        }
    }

}

