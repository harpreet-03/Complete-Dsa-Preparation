import java.util.*;


public class reverse_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number for Reversing: ");
        int n = in.nextInt();
        while(n>0){
            int lastdigit =n%10;  // to get lastdigit
            System.out.print(lastdigit);
            n = n / 10; //to remove digit from last
            

            // if we want  a number's last digit so we use [%].
            // if we want to remove a number from the last so we use[/].

        }
    }    
}
