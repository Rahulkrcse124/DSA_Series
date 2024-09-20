import java.util.Scanner;
import java.util.Stack;

public class st_06_InsertAtIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.println("enter the number of n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }

        System.out.print("enter the index = ");
        int index = sc.nextInt();
        System.out.print("enter the value = ");
        int value = sc.nextInt();

        System.out.println();
        System.out.println("original Stack");
        System.out.println(st);

        Stack<Integer> tempSt = new Stack<>();

        while (st.size() > index) {
            int x = st.peek();
            tempSt.push(x);
            st.pop();
        }
        st.push(value);
        while (tempSt.size() > 0) {
            int y = tempSt.peek();
            st.push(y);
            tempSt.pop();
        }

        System.out.println();
        System.out.println("after push the value of index");
        System.out.println(st);

        sc.close();
    }

}
