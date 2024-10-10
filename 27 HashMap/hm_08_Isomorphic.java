import java.util.*;

public class hm_08_Isomorphic {

    public static boolean isIsomorphic(String s, String t) {

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            char sch = s.charAt(i);
            String strch = "" + sch;

            char tch = t.charAt(i);
            String strtch = "" + tch;

            if (map.containsKey(strch)) {
                if (map.get(strtch) != strtch) {
                    return false;
                } else if (map.containsValue(strtch)) {
                    return false;
                } else {
                    map.put(strch, strtch);
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aabc";
        String t = "xxyz";
        System.out.println(isIsomorphic(s, t));
    }

}
