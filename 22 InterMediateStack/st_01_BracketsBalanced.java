import java.util.Scanner;
import java.util.Stack;

public class st_01_BracketsBalanced {

    public static boolean checkBracketBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            }

            if (ch == ')') {
                if (st.peek() == '(') {
                    st.pop();
                }
            }
        }

        if (st.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your String = ");
        String str = sc.nextLine();

        System.out.println(checkBracketBalanced(str));
        sc.close();

    }
}