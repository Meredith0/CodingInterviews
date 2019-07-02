/**
 * @author : Meredith
 * @date : 2019-06-10 15:21
 * @description : 删除链表的一个节点
 */
public class Solution18_p119 {

    public static void main (String[] args) {

        Node head = new Node();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        head = deleteNode(head, node5);

        if (head != null) {
            do {
                System.out.println(head.getData());
                head = head.getNext();
            } while (head != null);
        }


    }

    static Node deleteNode (Node head, Node node) {
        //判空
        if (head == null || node == null) {
            return head;
        }
        //如果删除的是头结点
        if (head == node) {
            head = null;
        }
        //如果删除的是中间的节点
        if (node.getNext() != null) {
            Node temp = node.getNext();//保存要删除的节点的下一个节点temp
            node.setData(temp.getData());//复制temp到要删除的节点
            node.setNext(temp.getNext());//删除temp
        }
        //如果删除的是尾节点
        else {
            Node head1=head;
            //遍历链表
            while (head1.getNext()!=null) {
                //找到尾节点
                if (head1.getNext() == node) {
                    head1.setNext(null);
                    return head;//删除完了就return
                }
                head1 = head1.getNext();
            }

        }
        return head;
    }

}

class Node {

    private Node next;
    private int data;

    public Node () {

    }

    public Node (int data) {
        this.data = data;
    }

    public Node getNext () {
        return next;
    }

    public void setNext (Node next) {
        this.next = next;
    }

    public int getData () {
        return data;
    }

    public void setData (int data) {
        this.data = data;
    }

}