import java.util.Stack;

public class st_20_ValueOfPrefix {

    public static void evaluationOfPreFix(String preFix) {
        Stack<Integer> val = new Stack<>();
        for (int i = preFix.length() - 1; i >= 0; i--) {
            char ch = preFix.charAt(i);

            int asci = (int) ch;
            if (asci >= 48 && asci <= 57) {
                val.push(asci - 48);
            }

            else {
                if (ch == '+') {
                    int v1 = val.pop();
                    int v2 = val.pop();
                    val.push(v1 + v2);
                } else if (ch == '-') {
                    int v1 = val.pop();
                    int v2 = val.pop();
                    val.push(v1 - v2);
                } else if (ch == '*') {
                    int v1 = val.pop();
                    int v2 = val.pop();
                    val.push(v1 * v2);
                } else if (ch == '/') {
                    int v1 = val.pop();
                    int v2 = val.pop();
                    val.push(v1 / v2);
                }
            }
        }
        System.out.println(val.peek());

    }

    public static void main(String[] args) {
        String preFix = "-9/*+5346";
        evaluationOfPreFix(preFix);
    }
}
