import java.util.Scanner;

public class N_one {
    public static void printDec(int n){
        if(n>0){
            System.out.println(n);
            printDec(n-1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        printDec(n);
    }    
}
