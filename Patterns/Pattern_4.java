import java.util.*;
public class Pattern_4 {
    public static void main(String[] args) {
        
       // print this pattern::}

        /* Half Inverted Pyramid
         ques:      ****         
         *          ***
         *          **
         *          *   
        */

        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
     

        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
            System.out.print("*");
            }
            System.out.println();
        }



}
}
    

