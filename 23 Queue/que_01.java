import java.util.*;

public class que_01 {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        System.out.println(que.isEmpty());
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println(que);

        // poll() and remove do the same work
        que.remove();
        System.out.println(que);

        que.poll();
        System.out.println(que);
        System.out.println(que.isEmpty());

        System.out.println("size of queue: " + que.size());
    }
}