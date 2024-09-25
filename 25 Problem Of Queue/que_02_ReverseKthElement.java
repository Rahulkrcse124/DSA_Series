import java.util.*;

public class que_02_ReverseKthElement {

    public static void reverseKthElement(Queue<Integer> q, int k) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();

        for (int i = 0; i < k; i++) {
            int value = q.remove();
            st1.push(value);
        }

        while (q.size() != 0) {
            st2.push(q.remove());
        }

        while (st2.size() != 0) {
            st3.push(st2.pop());
        }

        while (st1.size() != 0) {
            q.add(st1.pop());
        }
        while (st3.size() != 0) {
            q.add(st3.pop());
        }

        // print
        Queue<Integer> temp = new LinkedList<>();
        while (q.size() != 0) {
            int value = q.remove();
            System.out.print(value + " ");
            temp.add(value);
        }

        while (temp.size() != 0) {
            q.add(temp.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        reverseKthElement(q, 4);

    }

}
