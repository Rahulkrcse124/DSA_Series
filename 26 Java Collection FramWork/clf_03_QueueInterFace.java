import java.util.LinkedList;
import java.util.Queue;

public class clf_03_QueueInterFace {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // queue based on fifo concept linked first in first out

        // if we want to add the value in queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.print(q + " ");

        System.out.println();

        // if we want to print the top of queue
        int value = q.peek();
        System.out.print("top of queue = " + value);

        System.out.println();
        // if we want to remove the top of queue value
        q.remove();
        System.out.print("after remove the top value  = " + q + " ");

    }

}
