public class str_11_reverseDelete {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("RAJKUMAR");

        str.reverse();
        System.out.println(str); //RAMUKJAR

        str.delete(2, 4);
        System.out.println(str); //  RAKJAR
    }
    
}
