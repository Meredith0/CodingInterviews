import java.util.Stack;

/**
 * @author : Meredith
 * @date : 2019-06-08 23:34
 * @description : 用2个栈实现一个队列
 */
public class Solution9_p68 {

    static Stack stack1=new Stack();
    static Stack stack2=new Stack();
    static void push (int node) {
        stack1.push(node);
    }

    static String pop () {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("队列为空");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop().toString();
    }

    public static void main (String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);

        System.out.println(pop());
    }
}
