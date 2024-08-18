public class str_10_insertdeleteCharAt {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");

        str.insert(2, 'y');
        System.out.println(str); // heyllo

        str.deleteCharAt(2);
        System.out.println(str); // hello
    }
    
}
