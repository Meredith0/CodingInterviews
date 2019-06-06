import java.util.Arrays;

/**
 * @author : Meredith
 * @date : 2019-06-06 11:32
 * @description : 面试题5 扩展练习  合并2个已经有序的数组A,B, A的末尾有足够的空间
 */
public class Solution5Expansion_p55 {

    static int size;

    static int[] merge (int[] A, int[] B, int ALength, int BLength) {

        if (A == null || B == null) {
            return null;
        }
        size = ALength + BLength;
        int indexOfNew = size - 1;
        int indexOfA = --ALength;
        int indexOfB = --BLength;
        //这里要do while, 否则丢失一次插入
        do {
            if (A[indexOfA] > B[indexOfB]) {
                A[indexOfNew--] = A[indexOfA--];
            } else {
                A[indexOfNew--] = B[indexOfB--];
            }
        } while (indexOfNew > 0);
        return A;
    }

    public static void main (String[] args) {

        int[] A = new int[20];
        int[] A1 = new int[]{1, 3, 5, 7, 9, 111};
        int[] B = new int[]{2, 4, 6, 6, 8, 10};
        for (int i = 0; i < A1.length; i++) {
            A[i] = A1[i];
        }

        merge(A, B, 6, 6);
        Arrays.stream(A,0,size).forEach(System.out :: print);
    }
}
