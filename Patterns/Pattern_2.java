import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {

        // print this pattern::}

        /* Hollow Rectangle
         * ques: *****
         *       *   *
         *       *   *
         *       *****
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // outer loop
        for (int i = 1; i <= n; i++) {
            // Inner loop
            for (int j = 1; j <= m; j++) {
                //cell -> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
