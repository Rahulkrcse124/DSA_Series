import java.util.*;

public class que_02_PrintAll {

    public static void queqePrint(Queue<Integer> q) {
        Queue<Integer> temp = new LinkedList<>();

        while (q.size() > 0) {
            System.out.print(q.peek() + " ");
            temp.add(q.remove());
        }

        while (temp.size() > 0) {
            int v = temp.remove();
            q.add(v);
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
        queqePrint(q);
    }

}
