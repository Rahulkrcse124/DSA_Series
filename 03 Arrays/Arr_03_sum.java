public class Arr_03_sum {

    int sum(){
        int arr[] = {1,5,3};
        int sumArray = 0;
        for(int i=0; i<arr.length; i++) {
            sumArray = sumArray + arr[i];
        }
        return sumArray;
    }

    public static void main(String[] args) {
        Arr_03_sum obj = new Arr_03_sum();
        System.out.println("sum = " +obj.sum());
        
    }
    
}
