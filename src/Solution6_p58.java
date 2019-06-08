import java.util.Stack;

/**
 * @author : Meredith
 * @date : 2019-06-07 00:10
 * @description : 反向输出链表
 */
public class Solution6_p58 {

    static void showReversedList (Node head) {
        Node temp = head;
        Stack stack = new Stack();
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        // stack.stream().forEach(stack.pop());
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    static void append (Node head, Node newNode) {
        Node lastNode = findLastNode(head);
        lastNode.next = newNode;
    }

    static Node findLastNode (Node head) {
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        return lastNode;
    }

    public static void main (String[] args) {

        Node head = new Node(1);
        append(head, new Node(2));
        append(head, new Node(3));
        append(head, new Node(4));
        append(head, new Node(5));
        append(head, new Node(6));

        showReversedList(head);
    }
    static class Node {

        int data;
        Node next = null;

        public Node (int data) {
            this.data = data;
        }

    }

}
