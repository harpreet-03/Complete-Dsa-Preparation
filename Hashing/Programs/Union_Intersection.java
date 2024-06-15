
import java.util.*;
public class Union_Intersection {

    public static void union(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        for (int i : hs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void intersection(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                hs1.add(arr2[i]);
            }
        }
        for (int i : hs1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        int arr2[] = { 8, 4, 2, 9, 10, 5, 3, 11, 12, 13 };
        System.out.println("Union of two arrays is : ");
        union(arr1, arr2);
        System.out.println("Intersection of two arrays is : ");
        intersection(arr1, arr2);
    }
}
