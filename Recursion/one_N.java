import java.util.Scanner;

public class one_N {
    public static void printInc(int n){
        if(n>0){
            printInc(n-1);
            System.out.println(n);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        
        printInc(n);
    }
}
