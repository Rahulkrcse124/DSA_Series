import java.util.Stack;

public class st_23_PreFixToInfix {
    public static void PrefixToInfix(String prefix) {
        Stack<String> val = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {

            char ch = prefix.charAt(i);
            int asci = (int) ch;
            String s = "" + ch;

            if (asci >= 48 && asci <= 57) {
                val.push(s);
            }

            else {

                if (ch == '+') {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    String ans = v1 + "+" + v2;
                    val.push(ans);
                } else if (ch == '-') {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    String ans = v1 + "-" + v2;
                    val.push(ans);
                } else if (ch == '*') {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    String ans = v1 + "*" + v2;
                    val.push(ans);
                } else if (ch == '/') {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    String ans = v1 + "/" + v2;
                    val.push(ans);
                }
            }
        }
        System.out.println(val.peek());
    }

    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        PrefixToInfix(prefix);
    }
}