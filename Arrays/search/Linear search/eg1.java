import java.util.Scanner;

public class eg1 {

    public static String linearsearch(String s1[], String key) {
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals(key)) {
                return s1[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String s1[] = { "Harpreet", "Yash", "Kashish", "shivam", " harshit", "Ankit", "Jyott" };
        System.out.print("Enter the Key : ");
        Scanner sc = new Scanner(System.in);
    
        String key = sc.next();

        String ans = linearsearch(s1, key);
        if (ans == null) {
            System.out.println("Not Found");
        } else {
          
            System.out.println("Index Found: " + ans);


        }

    }
}
