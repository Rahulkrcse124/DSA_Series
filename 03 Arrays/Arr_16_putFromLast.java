public class Arr_16_putFromLast {

    public static void reverseArray(int arr[]) {
        for(int i=arr.length-1; i>=0; i--) {
           System.out.println(arr[i]+" ");
        }
    }

    public static void reverse2ndMethod(int arr[]) {
        int ans[] = new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--) {
            ans[j++] = arr[i];
        }

        for(int k=0; k<ans.length; k++) {
            System.out.print(ans[k]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,30,20,50,5};

        System.out.println("original array");
        for(int org:arr){
            System.out.println(org);
        }  
        System.out.println("after reverse: ");
        reverseArray(arr);
        System.out.println(" 2nd method");
        reverse2ndMethod(arr);
    }
}
