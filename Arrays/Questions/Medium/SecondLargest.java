
public class SecondLargest{
    public static int secLargest(int[] arr){
        int n = arr.length;
        if(n<2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        
        
        for(int i = 0; i< n; i++){
            if(arr[i] > largest){
                secondLarge = largest;
                largest = arr[i];
            } else if(arr[i]  >secondLarge && arr[i] != largest){
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};

        System.out.println("Second Largest element is : " + secLargest(arr));

    }
}