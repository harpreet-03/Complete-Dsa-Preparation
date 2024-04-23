
public class missing_number {
    public static int missingNumber(int arr[]) {
        // Finding the sum of all elements in
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        
        int n = arr.length + 1;
        int n_sum = (n* (n + 1))/2;

        return n_sum - sum;
    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,5}; //4
        int arr[] = {2,4,1,8,6,3,7};
        int missing = missingNumber(arr);
        System.out.println("Missing number: " + missing);
    }
}
