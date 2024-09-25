import java.util.*;

public class deque_01 {
    public static void main(String args[]) {
        Deque<Integer> q = new LinkedList<>();

        q.addFirst(10);
        q.addFirst(20);
        q.addFirst(30);
        q.addFirst(40);
        q.addFirst(50);
        System.out.println("deque after adding in First");
        System.out.print(q + " ");

        System.out.println();
        q.addLast(100);
        q.addLast(200);
        q.addLast(300);
        q.addLast(400);
        q.addLast(500);
        System.out.println("deque after adding in last");
        System.out.print(q + " ");

        System.out.println();
        System.out.println("remove last side");
        q.removeLast();
        System.out.print(q + " ");

        System.out.println();
        System.out.println("remove First Side");
        q.removeFirst();
        System.out.print(q + " ");

        System.out.println();
        System.out.println();
        System.out.println("peek first element elemement");
        System.out.print(q.getFirst());

        System.out.println();
        System.out.println();
        System.out.println("peek last element elemement");
        System.out.print(q.getLast());

        System.out.println();
        System.out.println();
        System.out.println("remove the all");
        q.removeAll(q);
        System.out.println(q);
    }
}