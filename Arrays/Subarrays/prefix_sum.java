public class prefix_sum {
    // NOTE: prefix[end] - prefix[start - 1]

    public static void maxSubarraysSum(int arr[]) {
        int cursum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                cursum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (max_sum < cursum) {
                    max_sum = cursum;
                }

            }

        }
        System.out.println("\nMax sum of subarrays: " + max_sum);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSubarraysSum(arr);
    }
}
