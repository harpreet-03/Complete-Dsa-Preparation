public class InsertionSort {
    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int  i=0; i<n; i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                //swap elements if the previous one is greater than the current one
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr [] = {5,4,1,3,2};
        insertionSort(arr);
        
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

