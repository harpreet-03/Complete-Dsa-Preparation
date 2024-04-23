import java.util.*;


public class Pattern_3 {
    public static void main(String[] args) {
       
       // print this pattern::}

        /* Half Pyramid
         ques:      *          
         *          **
         *          ***
         *          ****    
        */

        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
     

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
            System.out.print("*");
            }
            System.out.println();
        }



}
}