
/*
example : listen
          silent
          both are anagram to Each other then return  : true; 

example2: listenly
          silent : 
          Both are not Anagram because every each character not available to each other          
*/
import java.util.*;

public class hm_07_Anagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<String, Integer> map = new HashMap<>();

        if (s.length() == t.length()) {

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                String str = "" + ch;

                if (!map.containsKey(str)) {
                    map.put(str, 1);
                } else {
                    int value = map.get(str);
                    map.put(str, value + 1);
                }
            }

            for (int j = 0; j < t.length(); j++) {
                char ch = t.charAt(j);
                String stch = "" + ch;

                if (map.get(stch) != null) {
                    if (map.get(stch) == 1) {
                        map.remove(stch);
                    } else {
                        map.put(stch, map.get(stch) - 1);
                    }
                } else {
                    return false;
                }

            }

        }

        if (s.length() != t.length()) {
            return false;
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {

        String s = "knee";
        String t = "neek";
        boolean ans = isAnagram(s, t);
        System.out.println(ans);

    }

}
