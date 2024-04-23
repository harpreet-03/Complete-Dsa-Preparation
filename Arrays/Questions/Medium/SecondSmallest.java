public class SecondSmallest {

    public static int secondSmallest(int [] arr){
        int n = arr.length;

        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            if(arr[i] <  smallest){
                secSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < secSmallest && arr[i] != smallest){
                secSmallest = arr[i];
            }
        }return secSmallest;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        System.out.println("Second smallest element is " + secondSmallest(arr));
    }
}
