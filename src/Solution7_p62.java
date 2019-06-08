import java.util.Arrays;
import 二叉树节点.Node;

/**
 * @author : Meredith
 * @date : 2019-06-07 16:52
 * @description : 重建二叉树
 */
public class Solution7_p62 {

    //根据前序遍历和中序遍历重建二叉树
    static Node rebuild (int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        if (pre.length != in.length) {
            return null;
        }

        Node root = new Node(pre[0]);//"根"节点

        for (int i = 0; i < pre.length; i++) {
            if (pre[0] == in[i]) {
                root.left = rebuild(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                root.right = rebuild(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in,
                    i + 1, in.length));
            }
        }
        return root;
    }

    //前序遍历
    static void preTraverse (Node node) {
        if (node == null) {
            return;
        } else {
            System.out.print(node.data + " ");
            preTraverse(node.left);
            preTraverse(node.right);

        }
    }

    public static void main (String[] args) {
        Node rebuild = rebuild(new int[]{1, 2, 4, 7, 3, 5, 6, 8}, new int[]{4, 7, 2, 1, 5, 3, 8, 6});

        preTraverse(rebuild);
    }

}
