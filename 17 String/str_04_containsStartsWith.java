public class str_04_containsStartsWith {
    public static void main(String[] args) {
        
        String str = "jiet universe";

        // str.conatains("string") : take the string and check  that if taking string is
        // continuous available there in str then return trun otherwise false 

        System.out.println(str.contains("iverse")); // return true

        System.out.println(str.contains("ivese")); // false

        System.out.println(str.contains("tu")); // false
        
        // startsWith("string")
        System.out.println(str.startsWith("jie")); // true
        System.out.println(str.startsWith("iet")); // false

        // endsWith("string")
        System.out.println(str.endsWith("rse")); // true
        System.out.println(str.endsWith("ver")); // false

    }
    
}
