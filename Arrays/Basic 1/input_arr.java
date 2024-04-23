import java.util.*;
public class input_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr size of Array: ");
        int n = sc.nextInt();
    
        int arr[] = new int[n];
        System.out.print("Enter "+ n +" elements ");

        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // for printing our Array
        for(int i = 0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
