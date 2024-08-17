import java.util.ArrayList;
public class Arr_02{
  public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    list.add(60);
    Integer sum = 0;
    for(int i=0; i<list.size(); i++) {
      sum = sum + list.get(i);
      System.out.println(list.get(i));
    }
    System.out.println("sum = "+sum);

    // ArrayList<Integer> list2 = new ArrayList<Integer>(); // we can define array lits such as

    ArrayList<String> str = new ArrayList<>();
  }
}