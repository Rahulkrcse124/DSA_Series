import java.util.Stack;

public class st_19_ValueOfPostFix {

    public static void evaluationOfPostFix(String postFix) {
        Stack<Integer> val = new Stack<>();

        for (int i = 0; i < postFix.length(); i++) {
            char ch = postFix.charAt(i);
            int asci = (int) ch;

            if (asci >= 48 && asci <= 57) {
                val.push(asci - 48);
            } else {
                if (ch == '+') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    int ans = v1 + v2;
                    val.push(ans);
                } else if (ch == '-') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    int ans = v1 - v2;
                    val.push(ans);
                } else if (ch == '*') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    int ans = v1 * v2;
                    val.push(ans);
                } else if (ch == '/') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    int ans = v1 / v2;
                    val.push(ans);
                }
            }
        }
        System.out.println(val.peek());
    }

    public static void main(String[] args) {
        String postFix = "953+4*6/-";
        evaluationOfPostFix(postFix);

    }

}
