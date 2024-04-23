/*Counting Sort is a sorting algorithm that works well for a range of input values, such as integers within a known range. It doesn't make comparisons between elements like comparison-based sorting algorithms (e.g., QuickSort or MergeSort), making it very efficient in certain situations. Counting Sort works by counting the number of occurrences of each element in the input array and then using this information to reconstruct a sorted output array.

 */


import java.util.*;

public class CountingSort {
    public static void countSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            largest = Math.max(largest , arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;

        }

        //sorting
        int j = 0;

        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }




    public static void main(String[] args) {
     int arr[] = {1,4,1,3,2,4,3,7};
     countSort(arr);
     
     System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
