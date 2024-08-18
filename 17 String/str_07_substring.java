public class str_07_substring {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(str.substring(0,3)); // abc

        System.out.println(str.substring(0,0)); // nothing

        System.out.println(str.substring(2)); // cde

        String name = "developer";
        for(int i=2; i<4; i++) {
            System.out.print(name.substring(i)+","); // veloper,eloper
        }

        System.out.println();

        String word = "abcd";
        for(int i=0; i<word.length(); i++) {
            System.out.print(word.substring(i)+" "); // abcd bcd cd d 
        }

        System.out.println(); 

        String word2 = "ABCD";
        for(int i=0; i<=3; i++) {
            for(int j=i+1; j<=4; j++) {
                System.out.print(word2.substring(i,j)+" "); //A AB ABC ABCD B BC BCD C CD D 
            }
        }
    }
    
}
