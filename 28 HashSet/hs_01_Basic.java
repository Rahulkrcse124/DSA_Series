import java.util.HashSet;

public class hs_01_Basic {
    public static void main(String[] args) {
        HashSet<String> map = new HashSet<>();
        map.add("rahul");
        map.add("amit");
        map.add("rahul");
        map.add("rahul");

        System.out.println(map); // [rahul, amit]

        // Contains(): check available or not
        // if available then return : true otherwise false
        System.out.println();
        System.out.println("perform Contains ");
        System.out.println(map.contains("rahul"));

        // size()
        System.out.println();
        System.out.println("perform the size");
        System.out.println(map.size());

        // remove()
        // if available then remove and return the true
        System.out.println("perform remove");
        System.out.println(map.remove("amit"));
        System.out.println(map);
    }
}