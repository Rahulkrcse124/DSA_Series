import java.util.*;

public class hm_001_Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // put
        System.out.println("perform the put operation");
        hm.put("delhi", 100);
        hm.put("kolkata", 200);
        hm.put("indonesiya", 300);
        hm.put("indore", 400);
        hm.put("mumbai", 500);
        hm.put("odisha", 600);
        hm.put("karnatka", 700);

        System.out.println(hm);

        // size
        System.out.println();
        System.out.println("size function Perform");
        System.out.println(hm.size());

        // isEmpty()
        System.out.println();
        System.out.println("perform the isEmpty function");
        System.out.println(hm.isEmpty());

        // clear : remove the all key and value and return the true
        // System.out.println();
        // System.out.println("clear function perform");
        // mp.clear();
        // System.out.println(hm);

        // containskey: check the key is available or not
        System.out.println();
        System.out.println("perform contains key operation: ");

        System.out.println(hm.containsKey("delhi")); // false
        System.out.println(hm.containsKey("Rahul")); // true

        // keySet() : iterate through the key set
        // store the all key
        System.out.println();
        System.out.println("perform the keyset operation");
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        // iterate through the keySet()
        System.out.println();
        System.out.println("iterate through the keySet()");
        Set<String> allkey = hm.keySet();
        for (String key : allkey) {
            System.out.print(hm.get(key) + " ");
        }
    }

}
