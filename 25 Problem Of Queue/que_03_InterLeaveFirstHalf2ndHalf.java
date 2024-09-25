import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class que_03_InterLeaveFirstHalf2ndHalf {

    public static void originalQueqe(Queue<Integer> q) {

        Queue<Integer> helper = new LinkedList<>();
        while (q.size() > 0) {
            int value = q.remove();
            System.out.print(value + " ");
            helper.add(value);
        }
    }

    public static void interLeaveQueue(Queue<Integer> q) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> tempst1 = new Stack<>();
        Stack<Integer> tempst2 = new Stack<>();

        int n = q.size() / 2;
        for (int i = 1; i <= n; i++) {
            st1.add(q.remove());
        }
        // System.out.print(st1 + " ");

        while (q.size() > 0) {
            st2.add(q.remove());
        }
        // System.out.print(st2 + " ");

        while (st1.size() > 0) {
            tempst1.push(st1.pop());
        }
        while (st2.size() > 0) {
            tempst2.push(st2.pop());
        }

        while (tempst1.size() > 0 && tempst2.size() > 0) {
            q.add(tempst1.pop());
            q.add(tempst2.pop());
        }
        System.out.print(q + " ");
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        // originalQueqe(q);
        System.out.print("original queue = " + q);

        System.out.println();
        System.out.println();

        System.out.println("interLeave queue is: ");
        interLeaveQueue(q);
    }
}
