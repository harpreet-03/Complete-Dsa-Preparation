import java.util.*;

public class reverse {
    public static void reverse_arr(int numbers[]) {
        int first = 0;
        int last  = numbers.length - 1;    
        while (first < last) {

            // int temp = numbers[last];
            // numbers[last] = numbers[first];
            // numbers[first] = temp;


            //or without using temp (3rd variable);

            numbers[first] = numbers[first] + numbers[last];
            numbers[last] = numbers[first] - numbers[last];
            numbers[first] = numbers[first] - numbers[last];
            first++;
            last--;

        }

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        reverse_arr(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
