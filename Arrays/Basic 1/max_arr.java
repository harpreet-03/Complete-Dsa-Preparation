// Max from an element
public class max_arr {
    public static int maxx(int arr[]) {
        int max= arr[0];

        
        for (int i=1; i<arr.length; i++){
            if (arr[i]> max) {
                max = arr[i];
                }
        }
        return max;
        
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 10, 16, 12, 6, 19 };
        int maxval = maxx(arr);
        System.out.println("The maximum value in the array is: " + maxval);

    }
}


