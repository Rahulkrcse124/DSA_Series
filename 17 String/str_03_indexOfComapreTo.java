public class str_03_indexOfComapreTo {
    public static void main(String[] args) {
        String str = "Rahul kumar";

        // .indexOf('character'):     take a char and given the its index 
        // as well this function always gives the first accurance index of given char
        System.out.println(str.indexOf('a'));

        // str.CompareTo(gtr): after comparision if both are same then give the 0(zero)
        //str == gtr : then return 0
        //str>gter : then return +ve
        // str<gtr : then return -ve
        String str1 = "hello";
        String gtr1 = "hello";
        System.out.println(str1.compareTo(gtr1)); // 0

        String str2 = "hello";
        String gtr2 = "dello";
        System.out.println(str2.compareTo(gtr2)); // 4

        System.out.println(gtr2.compareTo(str2)); // -4
    }
    
}
