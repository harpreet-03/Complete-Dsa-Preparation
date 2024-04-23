import java.util.*;
public class largest_of_3 {
    public static void main(String[] args) {
        System.out.print("Enter the Numbers: ");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        if (a >=b && a>=c) {
            System.out.println("Largest is A");
        }
        else if(b>=c){
            System.out.println("Largest is B");
        }else{
            System.out.println("Largest is C");
        }
    }
}
