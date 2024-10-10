public class hm_02_MaximumNumberTimeUsingArray {

    public static void maximumNumberFrequent(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int ans[] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (arr[i] == j) {
                    ans[j]++;
                }
            }
        }

        int prequencyMax = 0;
        int prequencyTime = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] > prequencyMax) {
                prequencyMax = i;
                prequencyTime = ans[i];
            }
        }
        System.out.println(prequencyMax + " more time come in Array");
        System.out.println(prequencyTime + " time come ");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 4, 1 };
        maximumNumberFrequent(arr);
    }
}
