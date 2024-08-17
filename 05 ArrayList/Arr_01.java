import java.util.ArrayList;
public class Arr_01{
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>();

        ArrayList <Boolean> l2 = new ArrayList<>();

        // add a new value 
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

        for(int i=0; i<l1.size(); i++) {
            System.out.print(l1.get(i)+" ");
        }

        System.out.println(" ");
        // find the value at index through the get method
        System.out.println(l1.get(0));
        

        // adding element at index
        l1.add(1,500);
        System.out.println(l1);


        // modifying element at index
        l1.set(1,600);
        System.out.println(l1);



        // remove the values
        l1.remove(Integer.valueOf(600));
        System.out.println(l1);


        // remove values from index
        l1.remove(1);
        System.out.println(l1);
    }
}