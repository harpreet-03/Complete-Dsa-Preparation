import java.util.*;
public class mergeSort {

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void divide(int arr[], int si, int ei) {
        if(si>=ei){
            return ;
        }
        int mid = si+(ei-si) / 2;
        divide(arr, si, mid);     //Left part
        divide(arr, mid+1, ei);   //Right part
        merge(arr, si, mid, ei);  //Merge
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //Left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        // Right part
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //Copy temp[] array elements into Original array
        for(k = 0, i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {-7 ,-5,-89,99,45, 67, 23, 98, 12, 34, 56, 78, 11, 20,
            5, 88, 42, 71, 92, 10, 38, 64, 30, 84,
            19, 50, 27, 75, 15, 60, 49, 80, 17, 93,
            28, 79, 32, 51, 21, 68, 44, 73, 7, 96,
            33, 55, 25, 65, 13, 87, 39, 85, 18, 70,
            90, 24, 62, 37, 83, 9, 57, 31, 77, 16,
            99, 29, 81, 22, 69, 46, 97, 35, 74, 8,
            91, 40, 86, 26, 61, 47, 94, 36, 82, 14,
            59, 41, 89, 63, 43, 76, 6, 95, 48, 72};

        divide(arr, 0, arr.length-1);
        printArr(arr);


    }
}
