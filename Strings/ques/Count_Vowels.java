import java.util.*;

public class Count_Vowels {

    public static void main(String[] args) {

        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println("Count of vowels: " + count);

        int consonants = s.length()- count;
        System.out.println("Count of consonants: "+consonants);

        // Close the Scanner
        sc.close();
    }
}
