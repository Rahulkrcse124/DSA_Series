public class str_08_equals {
    public static void main(String[] args) { 

        // when we want to compare to other string then in string used the .equal() method
        // not used == in string because == only allowed for(int char double bool) 
        //str.equals("2nd string")

        String s1 = "hello"; 
        String s2 = "hello";
        String s3 = new String("hello");
        // here s1 and s2 point the same address but s3 point the different adress and create the new string at new address

        System.out.println(s1==s2); // true ->

        System.out.println(s1==s3);// false -> becase different address and == saw the location

        System.out.println(s1.equals(s3)); // true: -> here s1 and s3 compared with string

    }
    
}
