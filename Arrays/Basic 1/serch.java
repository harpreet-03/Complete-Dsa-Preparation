/*search the given element x int hte given array.if element is there, print the index value else return -1.*/
// I've used linear search
import java.util.*;

public class serch {
    public static int sech(int arr[], int x) {
        for(int i= 0; i<arr.length; i++){
            if(arr[i]== x){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]=  {1,5,3, 56, 89, 78, 2 ,4 ,6 ,23};
        System.out.print("Enter x:");
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();

        int ans =sech(arr, x);
        System.out.println("Found "+ x+" at Index =  "+ ans);
    }
}
