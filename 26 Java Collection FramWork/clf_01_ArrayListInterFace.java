import java.util.ArrayList;

public class clf_01_ArrayListInterFace {
    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.print(a + " ");

        System.out.println();

        // get value through the index
        System.out.println(a.get(0)); // 10

        // if we want to modified any index value
        a.set(2, 300);
        System.out.println(a.get(2));

        // if we want to check the value is exist or not there in the arraylist
        System.out.println(a.contains(40)); // true
        System.out.println(a.contains(500)); // false

    }
}