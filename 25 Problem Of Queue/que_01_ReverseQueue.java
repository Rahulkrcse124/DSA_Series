import java.util.*;

public class que_01_ReverseQueue {

    public static void originalQueue(Queue<Integer> q) {
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

    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> rst = new Stack<>();
        Stack<Integer> ost = new Stack<>();
        while (q.size() != 0) {
            int value = q.remove();
            rst.push(value);
        }

        while (rst.size() != 0) {
            int value = rst.pop();
            System.out.print(value + " ");
            ost.push(value);
        }

        while (ost.size() != 0) {
            int value = ost.pop();
            q.add(value);
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
        q.add(70);
        System.out.println("original Quque");
        originalQueue(q);
        System.out.println();

        System.out.println();
        System.out.println("reverse Queue");
        reverseQueue(q);
    }
}