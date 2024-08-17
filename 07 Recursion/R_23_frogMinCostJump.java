/*
int arr[] = {10, 30, 40, 20}
first approach: {0,1,2,3}: 20+10+20 = 50
2nd approach: {0,1,3}: 20+10= 30
3rd approach: {0,2,3} : 30+20 = 50

here approach 2nd is take the min cost
 */

public class R_23_frogMinCostJump {

  public static int best(int h[], int n, int idx) {

    if(idx==n-1){
      return 0;
    }

    int op1 = Math.abs(h [idx] - h [idx+1]) + best(h, n, idx+1);
    if(idx==n-2) return op1;
    int op2 = Math.abs( h[idx] - h[idx+2] ) + best(h, n, idx+2);

    return Math.min(op1, op2);
  }

  public static void main(String[] args) {
    int arr[] = {10,30,40,20};
    System.out.print("best minimun path is : ");
    System.out.print(best(arr, arr.length, 0));
  }
}


