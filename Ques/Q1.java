// Method 1: Using String builder

// import java.util.*;

// public class Q1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Original Name: ");
//         String name = sc.nextLine();

//         StringBuilder sb = new StringBuilder();

//         for (int i = 0; i < name.length(); i++) {
//             char c = name.charAt(i);
//             if (c != ' ') {
//                 if (i % 2 == 0) {
//                     sb.append(c);
//                 }
//             } else {
//                 sb.append(' ');
//             }
//         }

//         System.out.println(sb.toString());
//     }
// }


// Mthod 2: 
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original Name: ");
        String name = sc.nextLine();
        String result = "";

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c != ' ') {
                if (i % 2 == 0) {
                    result += c;
                }
            } else {
                result += ' ';
            }
        }

        System.out.println(result);
    }
}