import java.util.*;
public class greatest_of_3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter A: ");
         int a = sc.nextInt();
         System.out.print("Enter B: ");
         int b = sc.nextInt();
         System.out.print("Enter C: ");
         int c = sc.nextInt();

         if(a >= b && a>=c){
            System.out.println("A is greatest.");
         }else if(b>=c){
            System.out.println("B is greatest.");
         }else{
            System.out.println("C is greatest.");
         }
    }
}
