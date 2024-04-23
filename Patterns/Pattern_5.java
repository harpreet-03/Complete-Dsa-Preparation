import java.util.*;

public class Pattern_5 {
    public static void main(String[] args) {

        // print this pattern::}

        /* Half Inverted Pyramid
         ques:         *         
         *            **
         *           ***
         *          ****
        */

        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
     

        for (int i=1; i<=n; i++){
            // inner loop for space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //inner loop for star
            for (int j=1; j<=i; j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
