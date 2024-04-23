import java.util.*;

public class Split_string {
    public static void main(String[] args) {
        String input = "hello123world";

        // Calculate the midpoint
        int midpoint = input.length() / 2;

        // Split the string into two halves
        String firstHalf = input.substring(0, midpoint);
        String secondHalf = input.substring(midpoint);

        // Convert the second half to uppercase
        secondHalf = secondHalf.toUpperCase();

        // Concatenate the two halves
        String result = firstHalf + secondHalf;

        // Print the result
        System.out.println(result); // Output: helloWORLD
    }
}
