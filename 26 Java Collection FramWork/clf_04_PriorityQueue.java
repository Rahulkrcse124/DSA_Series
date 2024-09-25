import java.util.PriorityQueue;

public class clf_04_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        // in priorityqueue queue give the first priority of min value

        q.add(10);
        q.add(5);
        q.add(2);
        q.add(30);
        q.add(60);

        // we push this type of value: 10 5 2 30 60

        int value = q.peek(); // peek value will be 2
        System.out.print("peek value is = " + value);

        System.out.println();
        System.out.print(q + " ");

    }
}
