import java.util.Scanner;

public class if_ {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("The Input Number is an Even Number");
        } else {
            System.out.println("The Input Number is an Odd NUmber");
        }
}
}
