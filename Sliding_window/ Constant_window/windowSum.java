// package Complete_Dsa_Preparation.Sliding_window. Constant_window;

public class windowSum {
    public static void slidingWindowSum(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.println("Window sum 1: " + sum);

        for(int i = k; i < n; i++) {
            sum  = sum - arr[i-k] + arr[i];
            System.out.println("Window sum " + (i - k + 2) + ": " + sum);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 4, 8, 5};
        int k = 3;
        slidingWindowSum(arr, k);
    }
}
