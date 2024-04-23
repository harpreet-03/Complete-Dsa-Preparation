import java.util.*;

public class Pattern_1 {
    public static void main(String[] args) {
        // NESTED FOR LOOPS
        // print this pattern::}

        /*
         ques:   *****
         *       *****
         *       *****
         *       *****
         */
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();


        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}