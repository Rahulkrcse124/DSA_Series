// how many will be remove the brackets for balanced Brakets

/*
( ( ( ( ) )
here if we would remove the 2 brackets then the stack will be balanced
beacse after perform the all code will be remaining (( two bracket in stack
if we delete the both bracket then stack will ne easly balanced
 */

import java.util.Scanner;
import java.util.Stack;

public class st_02_MinBracketBalanced {

    public static boolean minBracketBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty() || st.peek() != '(') {
                    return false;
                }
                st.pop();
            }
        }

        if (st.size() > 0) {
            int count = 0;
            while (st.size() != 0) {
                count++;
                st.pop();
            }
            System.out.println("if We remove the " + count + " Brackets then will be Balanced");
            return false;
        }

        else {
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Barackets String = ");
        String str = sc.nextLine();

        System.out.println(minBracketBalanced(str));

        sc.close();

    }

}
