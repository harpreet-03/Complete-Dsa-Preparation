import java.util.*;

public class Pattern_9 {
    public static void main(String[] args) {

        // 0-1 Triangle
        /*   
         *       1                  
         *       0 1   
         *       1 0 1
         *       0 1 0 1
         *       1 0 1 0 1
         */
        Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt();


        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }       
            }
    System.out.println();
}
}
}