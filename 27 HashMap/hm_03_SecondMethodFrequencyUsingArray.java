public class hm_03_SecondMethodFrequencyUsingArray {

    public static void findMaxFrequency(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (count > maxCount) {
                        maxCount = i;
                    }
                }
            }
        }
        System.out.println(maxCount);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 1, 2, 4, 1 };
        findMaxFrequency(arr);

    }

}
