import java.util.Comparator;
import java.util.PriorityQueue;

public class clf_05_MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        // in this priorityqueue queue give the first priority of max value

        q.add(10);
        q.add(5);
        q.add(2);
        q.add(30);
        q.add(60);

        // we push this type of value: 10 5 2 30 60

        int value = q.peek(); // peek value will be 60
        System.out.print("peek value is = " + value);

        System.out.println();
        System.out.print(q + " ");

    }

}
