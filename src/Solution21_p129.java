/**
 * @author : Meredith
 * @date : 2019-06-30 14:31
 * @description : 调整数组顺序使奇数位于偶数前面
 */
public class Solution21_p129 {

    static void reorder (int[] arr) {
        if (arr == null) {
            return;
        }

        int front = 0;
        int rear = arr.length - 1;
        while (front < rear) {
            while (!swapCondition(arr[front]) && front < rear) {
                front++;
            }

            while (swapCondition(arr[rear]) && front < rear) {
                rear--;
            }

            if (front < rear) {
                int temp = arr[front];
                arr[front] = arr[rear];
                arr[rear] = temp;
            }
        }
    }

    static private boolean swapCondition (int a) {
        return (a & 0x1) == 1;
    }

    public static void main (String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        reorder(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

