import java.util.*;


public class print_rev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;
            rev = rev*10 + n%10;
            n = n/10;

        }
        System.out.println(rev);
        
    }
    
}
