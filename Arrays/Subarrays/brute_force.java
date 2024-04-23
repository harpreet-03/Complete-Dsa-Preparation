public class brute_force {

    public static void maxSubarraysSum(int arr[]) {
        int cursum = 0;
        int max_sum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                cursum =0;
                for (int k = start; k <= end; k++) {
                   cursum += arr[k];
                    
                }
                System.out.println(cursum);
                if(max_sum < cursum) {
                    max_sum = cursum;
                }
               
            }
           
        }
        System.out.println("\nMax sum of  subarrays: "+max_sum);
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxSubarraysSum(arr);
    }
}
