import java.util.Scanner;
import java.util.Stack;

public class st_04_CopyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();
        Stack<Integer> tempSt = new Stack<>();
        Stack<Integer> copySt = new Stack<>();

        System.out.print("enter the number of stack = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int value = sc.nextInt();
            st.push(value);
        }
        System.out.println();

        System.out.println("original Stack");
        System.out.print(st + " ");

        while (st.size() > 0) {
            int x = st.peek();
            tempSt.push(x);
            st.pop();
        }
        while (tempSt.size() > 0) {
            int y = tempSt.peek();
            copySt.push(y);
            tempSt.pop();
        }
        System.out.println();
        System.out.println("copied Stack is:");
        System.out.print(copySt + " ");

        sc.close();

    }

}
