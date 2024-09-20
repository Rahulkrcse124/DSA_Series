import java.util.Scanner;
import java.util.Stack;

public class st_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("enter the number of n ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("stack is: ");
        System.out.println(st);
        // while (st.size() >= 1) {
        // System.out.print(st.peek() + " ");
        // st.pop();
        // }

        sc.close();
    }

}
