package Complete_Dsa_Preparation.Sliding_window.Longest_subarray;

public class longestSubarrayWithSum {
    public static int longestSubarray(int[] nums, int k) {
        int max_length = 0;
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum <= k) {
                    max_length = Math.max(max_length, j-i + 1);
                }else if(sum > k) {
                    break;
                }
            }
        }
        return max_length;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{2, 5, 1, 7, 10};
        int k = 14;
        int res = longestSubarray(arr, k);
        System.out.println("Longest Subarray: " + res);
    }
}
