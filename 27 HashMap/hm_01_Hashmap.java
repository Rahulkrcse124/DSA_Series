import java.util.HashMap;
import java.util.Map;

public class hm_01_Hashmap {
    public static void main(String args[]) {
        Map<String, Integer> mp = new HashMap<>();

        mp.put("Rahul", 95);
        mp.put("rohit", 89);
        mp.put("anmol", 80);
        mp.put("rohan", 100);
        System.out.print(mp + " ");

        // size
        System.out.println();
        System.out.println("size function Perform");
        System.out.println(mp.size());

        // isEmpty()
        System.out.println();
        System.out.println("perform the isEmpty function");
        System.out.println(mp.isEmpty());

        // clear : remove the all key and value and return the true
        // System.out.println();
        // System.out.println("clear function perform");
        // mp.clear();
        // System.out.println(mp);

        // getting value of key from hashmap
        System.out.println();
        System.out.println(mp.get("Rahul"));

        // changing the value and key of hashmap

        System.out.println();
        mp.put("Rahul", 100);
        System.out.print(mp + " ");

        // containskey: check the key is available or not
        System.out.println();
        System.out.println("perform contains key operation: ");

        System.out.println(mp.containsKey("delhi")); // false
        System.out.println(mp.containsKey("Rahul")); // true

        // remove
        System.out.println();
        // remove the key and print the value if key is exist
        // if key is not exist then return the null
        System.out.println("remove Function perform");
        System.out.println(mp.remove("anmol"));
        System.out.println(mp.remove("nisha"));

        System.out.println();
        // i want to add a new value if not exist then add otherwise not exist

        if (!mp.containsKey("Rahul")) {
            mp.put("yash", 200);
        }
        System.out.print(mp + " "); // not add because Rahul is already available here

        System.out.println();
        if (!mp.containsKey("mohan")) {
            mp.put("rajiv", 300);
        }
        System.out.print(mp + " ");

        // 2nd method of adding key if exist
        System.out.println();
        mp.putIfAbsent("Rahul", 500);
        System.out.print(mp + " ");

        System.out.println();
        System.out.println();
        mp.putIfAbsent("karan", 800);
        System.out.print(mp + " ");

        // get the all key
        System.out.println();
        System.out.print(mp.keySet() + " ");

        // get all values
        System.out.println();
        System.out.println(mp.values());

        // get all entries of hashmap
        System.out.println();
        System.out.println(mp.entrySet());

        // traverse
        System.out.println();
        for (String key : mp.keySet()) {
            System.out.printf("marks of %s is\n", key, mp.get(key));
        }

        System.out.println();
        // traverse
        for (HashMap.Entry<String, Integer> e : mp.entrySet()) {
            System.out.printf("marks of %s is %d\n", e.getKey(), e.getValue());
        }

    }
}