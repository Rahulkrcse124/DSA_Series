import java.util.Scanner;
import java.util.Stack;

public class st_05_InsertAtButtom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.print("enter the number of n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int value = sc.nextInt();
            st.push(value);
        }
        System.out.println();
        System.out.println("original Stack");
        System.out.print(st + " ");

        System.out.println();

        Stack<Integer> tempSt = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            tempSt.push(x);
            st.pop();
        }
        st.push(100); // here 100 push in button of stack
        while (tempSt.size() > 0) {
            int y = tempSt.peek();
            st.push(y);
            tempSt.pop();
        }
        System.out.println("after the value push in buttom of stack");
        System.out.print(st + " ");

        sc.close();
    }
}
