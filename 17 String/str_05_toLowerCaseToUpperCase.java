public class str_05_toLowerCaseToUpperCase {
    public static void main(String[] args) {


        String capital = "RAHUL";
        System.out.println(capital.toLowerCase()); // rahul

        String lower = "rajasthan";
        System.out.println(lower.toUpperCase()); // rajasthan

        // .concate(string) : cobcate 
        String ans = capital.concat(lower);
        System.out.println(ans);        // RAHULrajasthan

    }
    
}
