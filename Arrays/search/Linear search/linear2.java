import java.util.*;
//Time Complexity = O(n)
public class linear2 {

    public static int linear_search(int arr[], int El) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == El) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the Elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i] + " ");
        }

        System.out.print(" Enter the Element to be searched: ");
        int El = sc.nextInt();

        int result = linear_search(arr, El);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}


